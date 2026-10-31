# 21 — Compte collectif (Sammelkonto)

## Définition

Un compte collectif est un **vrai compte de la générale**, avec un numéro, un solde et des écritures. Par définition, son solde est la **somme des comptes de tiers** d'une auxiliaire. C'est le résumé de l'auxiliaire dans la générale.

## À quoi ça sert

Il relie les deux niveaux. Il a trois caractéristiques :

1. **Il n'est alimenté que par l'auxiliaire.** Aucune saisie manuelle directe : chaque mouvement provient d'une facture, d'un paiement ou d'un avoir enregistré sur un tiers.
2. **Son solde est contrôlable.** À tout moment, le solde du collectif est égal à la somme des soldes des tiers. C'est le **rapprochement** entre l'auxiliaire et la générale (Abstimmung), effectué au moins à chaque fin de période.
3. **Il ne connaît pas les tiers.** Son grand livre montre des montants et des numéros de pièce. La question « qui doit quoi ? » se pose à l'auxiliaire.

## Exemple

### Le compte 1105 en janvier et février

Mouvements de l'auxiliaire des débiteurs assureurs (chapitre 00) :

| Pièce | Date | Tiers | Facture | Opération | Débit | Crédit |
|---:|---|---|---|---|---:|---:|
| 10 | 31.01 | Assurance Léman | F-0003 | facture | 2'200 | |
| 14 | 10.02 | Assurance Léman | F-0004 | facture | 900 | |
| 16 | 14.02 | Caisse-maladie Jura | F-0005 | facture | 1'300 | |
| 17 | 20.02 | Assurance Léman | F-0003 | paiement | | 2'200 |

Au 28 février :

| Niveau | Calcul | Solde |
|---|---|---:|
| Auxiliaire | Léman 900 + Jura 1'300 | **2'200** |
| Générale, compte 1105 | 2'200 + 900 + 1'300 − 2'200 | **2'200** |

Le rapprochement est correct.

### Plusieurs collectifs pour une même auxiliaire

Une auxiliaire peut alimenter plusieurs collectifs lorsque des totaux distincts sont utiles :

- par **type de tiers** : 1100 patients et 1105 assureurs, comme au cabinet ;
- par **devise** : débiteurs en CHF et débiteurs en EUR ;
- par **relation** : par exemple les créances envers des sociétés liées, que la loi demande de présenter séparément (CO 959a).

Chaque tiers, ou chaque rubrique de paramétrage (chapitre 11), est rattaché à **un** collectif.

## Pièges et cas subtils

- **Le solde à l'envers.** Un patient paie deux fois la même facture de 450. Dans l'auxiliaire, son compte devient créditeur de 450 : le cabinet lui doit de l'argent. Dans la générale, ces 450 sont noyés dans le compte 1100, qui reste globalement débiteur.
  - Au quotidien, ce n'est pas un problème.
  - Au bouclement, si ces soldes créditeurs deviennent significatifs, ils sont **reclassés au passif**. La loi interdit en effet de compenser créances et dettes (CO 958c) : le bilan doit montrer « on nous doit X » et « nous devons Y », pas X − Y.
- **Une saisie directe crée un écart.** Voir le chapitre 20.

## Loi suisse et pratique Abacus

**Loi**

La notion de compte collectif n'apparaît pas dans le CO. La loi exige cependant que les soldes du bilan soient justifiés (art. 957a) et non compensés (art. 958c). Le collectif relié à son auxiliaire est la technique standard pour satisfaire ces deux exigences.

**Abacus (pratique, à vérifier)**

Le compte collectif se définit dans le paramétrage de DEBI et de KREDI. La saisie directe en FIBU peut être bloquée. Un rapport de rapprochement compare les soldes de l'auxiliaire et de la FIBU.

## Dans le code

- **Itération 1** : un compte peut porter l'attribut « collectif ».
- **Itération 8a** : le moteur refuse toute écriture manuelle sur un compte collectif, et un test vérifie que l'auxiliaire est égale au collectif.

## Questions fréquentes

**Un compte collectif est-il une rubrique ?**
Non. Voir le chapitre 11.
