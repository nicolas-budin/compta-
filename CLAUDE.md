# CLAUDE.md — Compta (projet d'apprentissage)

Ce fichier guide Claude Code et toute personne qui travaille dans ce dépôt.

## Le projet

Un projet personnel pour **comprendre la comptabilité générale** telle que la pratique un ERP suisse comme Abacus, en la codant.

- Ce n'est **pas un produit**. Le but est de comprendre, pas de livrer.
- **Une seule personne**, qui avance à son rythme.
- **Aucun lien avec la GED** : dépôt, code et décisions indépendants.
- La référence est la comptabilité suisse : Code des obligations (CO, art. 957 ss), Olico (GeBüV), plan comptable PME, TVA (LTVA).

## Le fil rouge

Une seule entité fictive : le **Cabinet médical des Tilleuls Sàrl**, un cabinet de groupe avec trois médecins et une propharmacie.

- Plan comptable PME réduit.
- Débiteurs : patients et assureurs (tiers garant, tiers payant).
- Créanciers : laboratoires, fournisseurs de matériel et de médicaments.
- TVA : soins exonérés, médicaments remis imposables.
- Analytique : un centre de coûts par médecin.

## Rituel de chaque itération

1. **Annonce** : notion comptable visée, ce qu'on code, fichiers touchés.
2. **Exercice à la main** : un petit scénario de l'entité fictive, passé sur papier avant le code.
3. **Code** : 200 à 300 lignes au maximum, **une seule notion comptable** à la fois.
4. **Démo** : `./mvnw test`, plus un petit programme qui affiche le résultat (journal, balance…).
5. **Explication** : la règle comptable d'abord, puis le code, les choix faits et les alternatives écartées.
6. **Arrêt** : attendre la validation avant l'itération suivante. Ne jamais enchaîner deux itérations.
7. **Commit** : après validation, un commit par itération. Message : `Itération N : <titre>`.

Le backlog et l'état d'avancement sont dans [docs/backlog.md](docs/backlog.md). Le glossaire est dans [docs/glossaire.md](docs/glossaire.md).

## Règles comptables que le code doit garantir

- **Partie double** : une écriture est refusée si le total des débits diffère du total des crédits.
- **Immuabilité** : une écriture validée ne se modifie ni ne se supprime. On la **contre-passe** (extourne).
- **Périodes** : aucune écriture dans une période verrouillée ou un exercice clôturé.
- **Traçabilité** : chaque écriture porte une date, un numéro de pièce et un libellé. La numérotation des pièces est continue.
- **Auxiliaire et générale** : le solde d'un compte collectif est égal à la somme des comptes auxiliaires qui l'alimentent.
- **Moteur indépendant du plan** : le code ne connaît que des **types de comptes** et des règles. Le plan comptable est une donnée chargée, jamais codé en dur, comme dans un ERP.

## Règles de code

- **Java 21** (cible de compilation), Maven, JUnit (Jupiter). Le package est `ch.louhan.compta`.
- **Java pur au départ** : pas de Spring ni de base de données avant que la comptabilité ne l'exige (vers l'itération 6). La plomberie technique ne doit pas masquer la comptabilité.
- **Montants** : toujours `BigDecimal`, jamais `double`. Le montant et la devise sont regroupés dans un type dédié. Les arrondis sont explicites, y compris l'arrondi au 5 centimes du franc suisse.
- **Types immuables** (`record`) pour les écritures et les montants.
- **Tests** : chaque exercice fait à la main devient un test, avec les chiffres de l'exercice.
- Noms du domaine en français (`Compte`, `Ecriture`, `Journal`, `Balance`), pour coller au vocabulaire comptable.

## Commandes

```bash
./mvnw test    # compilation + tests
```

- **Toujours `./mvnw`**, jamais `mvn` : le wrapper fixe la version de Maven (3.9.16).
- **Pourquoi Java 21** : les sessions cloud n'ont qu'un JDK 21, et le téléchargement d'un JDK plus récent y est bloqué. La cible est donc Java 21 partout, pour que le build soit vérifié de la même façon en local et dans le cloud. Un JDK 25 installé en local compile cette cible sans problème.

## Collaboration

- **Ton** : tutoyer le product owner, ton détendu dans les échanges. Les documents du dépôt restent neutres.
- **Profil** : environ 30 ans de Java, à l'aise avec le métier et l'architecture. Il découvre la comptabilité générale en détail.
  - Expliquer la **comptabilité** sans raccourci.
  - Ne pas réexpliquer Java.
  - Signaler les nouveautés Java au format « avant on faisait X, maintenant on fait Y, et voilà pourquoi ».
- **Justifier** chaque choix et citer les alternatives.
- **Honnêteté sur les sources** : distinguer ce qui relève de la comptabilité suisse générale (CO, Olico, LTVA) et ce qui relève de la pratique d'Abacus, à signaler comme incertain quand c'est le cas.
- **Git** : commit seulement après validation, push seulement sur demande, jamais de `push --force` sur `main`.
