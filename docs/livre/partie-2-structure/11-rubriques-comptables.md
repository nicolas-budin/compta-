# 11 — Rubriques comptables

## Définition

« Rubrique » est un terme **ambigu**. Il recouvre trois notions distinctes.

| Sens | Ce que c'est | Exemple |
|---|---|---|
| 1. Rubrique de présentation | Regroupement de comptes de la générale dans le bilan ou le compte de résultat | « Actifs circulants », « Trésorerie » |
| 2. Rubrique de paramétrage | Règle qui traduit une opération de l'auxiliaire ou d'un module métier en comptes de la générale | « Consultation, tiers payant » → 1105 / 3400 |
| 3. Rubrique de salaire (Lohnart) | Élément de la fiche de paie | salaire de base, cotisation AVS |

Le troisième sens est étranger à ce livre. Ce chapitre traite des deux premiers.

## À quoi ça sert

### Rubrique de présentation

Elle structure les états financiers. Ce n'est **pas un compte** : elle ne reçoit aucune écriture, et son montant est la somme des comptes qu'elle regroupe. Dans le plan PME, les niveaux classe, groupe et sous-groupe jouent ce rôle (chapitre 10).

```
Rubrique « Actifs circulants »                 présentation
 ├─ Rubrique « Trésorerie »
 │    ├─ 1000 Caisse                           comptes de la générale
 │    └─ 1020 Banque
 └─ Rubrique « Créances »
      └─ 1100 Débiteurs patients (collectif)
            ├─ Mme Dupont      450             comptes de l'auxiliaire
            └─ M. Rossi        350
```

### Rubrique de paramétrage

L'auxiliaire raisonne en **tiers** et en **types d'opération**. La générale ne connaît que des **numéros de compte**. La rubrique de paramétrage fait la traduction entre les deux. Ce n'est pas un terme de la loi ni du plan PME, mais un terme d'outil, et chaque logiciel le nomme différemment.

Elle apporte :

- **une indirection** : si le plan comptable change, seule la table des rubriques est modifiée. Ni les factures ni les utilisateurs ne sont touchés ;
- **une cohérence** : toutes les opérations d'un même type aboutissent sur le même compte collectif, ce qui maintient l'égalité entre l'auxiliaire et le collectif ;
- **un point d'ancrage** pour la TVA et l'analytique.

## Exemple

### La table des rubriques du cabinet

| Rubrique | Compte collectif (débit) | Compte de produit (crédit) | TVA |
|---|---|---|---|
| CONS-TG : consultation, tiers garant | 1100 Débiteurs patients | 3400 Honoraires médicaux | exonérée |
| CONS-TP : consultation, tiers payant | 1105 Débiteurs assureurs | 3400 Honoraires médicaux | exonérée |
| MED-TG : médicaments, tiers garant | 1100 Débiteurs patients | 3200 Ventes de médicaments | imposable |
| MED-TP : médicaments, tiers payant | 1105 Débiteurs assureurs | 3200 Ventes de médicaments | imposable |

### Le circuit d'une facture

Facture F-0003 à l'Assurance Léman, le 31 janvier (chapitre 00, pièce 10).

**① Auxiliaire : le compte du tiers**

Débiteur : Assurance Léman (tiers payant)

| Date | Facture | Ligne | Rubrique | Débit | Crédit | Solde |
|---|---|---|---|---:|---:|---:|
| 31.01 | F-0003 | Consultation | CONS-TP | 1'500 | | |
| 31.01 | F-0003 | Médicaments | MED-TP | 700 | | |
| | | | | | | **2'200** |

**② Rubriques : la traduction**

| Rubrique | Débit | Crédit |
|---|---|---|
| CONS-TP | 1105 | 3400 |
| MED-TP | 1105 | 3200 |

**③ Générale : l'écriture générée**

| Pièce | Compte | Débit | Crédit |
|---:|---|---:|---:|
| 10 | 1105 Débiteurs assureurs | 2'200 | |
| 10 | 3400 Honoraires médicaux | | 1'500 |
| 10 | 3200 Ventes de médicaments | | 700 |

Personne ne saisit cette écriture : elle est **produite** à partir de ① via ②.

```
 ① AUXILIAIRE               ② RUBRIQUES             ③ GÉNÉRALE
 (par tiers)                (correspondance)        (par compte)

 Assurance Léman            CONS-TP → 1105 / 3400   1105  D 2'200
   F-0003  consult. 1'500 ─────────────────────────►3400  C 1'500
   F-0003  médic.     700 ─────────────────────────►3200  C   700
                            MED-TP  → 1105 / 3200
```

## Pièges et cas subtils

- **Vérifier le sens employé.** Dans une discussion, « rubrique » peut désigner un regroupement de présentation, une règle de paramétrage, une rubrique de salaire, ou même un simple compte.
- **Une rubrique de présentation n'est jamais mouvementée.** Si un logiciel permet de passer une écriture sur une rubrique, c'est qu'il s'agit en réalité d'un compte.
- **La rubrique de paramétrage ne remplace pas le compte collectif.** Elle désigne vers **quel** collectif une ligne est dirigée. Le collectif reste un compte de la générale (chapitre 21).

## Loi suisse et pratique Abacus

**Loi**

Ni la loi ni le plan PME ne définissent la rubrique de paramétrage. Il s'agit d'une technique de logiciel.

**Abacus (pratique, incertain)**

Les rubriques de présentation correspondent aux groupes de comptes (Kontengruppen) et à la structure du bilan paramétrée dans le plan.

Pour la rubrique de paramétrage, l'équivalent exact n'est pas vérifié. Le compte collectif semble défini au niveau du débiteur ou d'un groupe de débiteurs, et le compte de produit au niveau de l'article ou de la prestation. Le mécanisme serait donc réparti entre plusieurs paramètres plutôt que réuni dans un seul objet.

## Dans le code

- **Itérations 1 et 4** : les rubriques de présentation, sous forme de hiérarchie du plan et de structure du bilan.
- **Itération 7 (TVA)** : le code TVA est porté par défaut par le compte.
- **Itération 8a** : les rubriques de paramétrage génèrent l'écriture de la générale à partir de la facture, et le code TVA passe sur la rubrique.

## Questions fréquentes

**Une rubrique comptable, est-ce la même chose qu'un compte collectif ?**
Non. La rubrique de présentation regroupe des comptes de la générale et se situe au-dessus d'eux. Le compte collectif est un compte de la générale, qui résume des comptes de tiers situés en dessous de lui. La rubrique de paramétrage indique vers quel collectif une ligne de facture est dirigée.

**Dans l'exemple de la table des rubriques, où est la comptabilité auxiliaire ?**
La table n'est que le pont. L'auxiliaire est le compte du tiers (étape ①), avec ses factures et ses paiements. La générale est l'écriture produite (étape ③).
