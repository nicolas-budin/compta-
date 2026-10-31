# 01 — Comptabilité générale (Finanzbuchhaltung, FIBU)

## Définition

La comptabilité générale est la comptabilité de **l'entité dans son ensemble**. Elle enregistre toutes les opérations qui modifient le patrimoine ou le résultat de l'entreprise : encaissements, factures, achats, salaires, emprunts. Elle les range dans un nombre limité de **comptes agrégés** : Banque, Débiteurs, Loyer, Honoraires.

Agrégés signifie que la générale ne connaît pas le détail. Elle sait que les patients doivent 800 CHF au cabinet, mais pas lesquels. Ce détail appartient à la comptabilité auxiliaire (chapitre 20).

## À quoi ça sert

Elle produit les **comptes annuels** :

- le **bilan** (chapitre 02) : ce que l'entreprise possède et ce qu'elle doit, **à une date**. C'est une photo ;
- le **compte de résultat** (chapitre 03) : ce qu'elle a gagné et dépensé **sur une période**. C'est un film.

C'est une comptabilité **tournée vers l'extérieur**. Ses lecteurs sont l'administration fiscale, les associés, les prêteurs et l'organe de révision. Elle est donc encadrée par la loi.

## Exemple

En janvier, le cabinet encaisse ou facture des consultations de quatre façons (chapitre 00, pièces 7 à 10) :

| Origine | Montant |
|---|---:|
| Mme Dupont (F-0001) | 450 |
| M. Rossi (F-0002) | 350 |
| Paiements au guichet | 9'000 |
| Assurance Léman (F-0003, part consultation) | 1'500 |

La générale n'en retient qu'un chiffre : **3400 Honoraires médicaux : 11'300**. Elle ne sait ni qui a consulté ni qui a payé. Elle sait combien le cabinet a gagné en honoraires.

De la même manière, toutes les opérations de janvier se résument en un compte de résultat (bénéfice de 6'300) et un bilan (total 115'500). Les chiffres complets sont au chapitre 00.

## Pièges et cas subtils

- **Générale et auxiliaire** : la générale ne détaille ni par patient ni par fournisseur. Ce détail est tenu dans l'auxiliaire, et les deux doivent concorder (chapitre 21).
- **Générale et analytique** : la comptabilité analytique (Betriebsbuchhaltung, BEBU) répond à « combien rapporte la Dre Martin ? ». Elle est interne, sert à la gestion, et n'est pas exigée par la loi. La générale répond à « combien gagne la Sàrl ? ».

## Loi suisse et pratique Abacus

**Loi (CO)**

- Art. 957 : une Sàrl, comme toute personne morale, doit tenir une comptabilité complète.
- Art. 957a : principes de tenue régulière (exhaustivité, pièces justificatives, vérifiabilité).
- Art. 958 ss : comptes annuels (bilan, compte de résultat, annexe).
- Art. 958f : conservation des livres et des pièces pendant 10 ans. L'Olico (GeBüV) fixe les conditions de cette conservation, y compris sous forme électronique.

**Abacus (pratique, à vérifier)**

La FIBU est un module distinct des modules débiteurs (DEBI) et créanciers (KREDI), qui l'alimentent. C'est une architecture logicielle, pas une exigence légale. Le découpage exact des modules n'est pas vérifié.

## Dans le code

Les itérations 1 à 6 construisent la comptabilité générale : plan, écritures, grand livre, balance, bilan, compte de résultat, périodes. Les auxiliaires arrivent aux itérations 8 et 9, l'analytique à l'itération 12.

## Questions fréquentes

**La générale sait-elle qui doit de l'argent au cabinet ?**
Non. Elle connaît le total (compte 1100 ou 1105). Le détail par tiers est dans l'auxiliaire.
