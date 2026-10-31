# 22 — Débiteurs et créanciers (Debitoren / Kreditoren)

## Définition

| | Débiteurs | Créanciers |
|---|---|---|
| Qui | les tiers qui **doivent** de l'argent à l'entreprise | les tiers à qui l'entreprise **doit** de l'argent |
| Origine | ventes et prestations facturées, non encore encaissées | achats et prestations reçus, non encore payés |
| Plan PME | 1100 Créances résultant de livraisons et prestations | 2000 Dettes résultant d'achats et de prestations de services |
| Bilan | actif, actifs circulants | passif, capitaux étrangers à court terme |
| Au cabinet | patients, assureurs | grossiste en médicaments, laboratoire, fournisseurs de matériel |

Les deux comptes sont des **comptes collectifs**, chacun alimenté par son auxiliaire (chapitres 20 et 21). Ils sont symétriques : la créance du cabinet sur un patient est, chez le patient, une dette envers le cabinet.

## À quoi ça sert

Ils mesurent le décalage entre le moment où une prestation est rendue ou reçue et le moment où elle est payée.

- **Côté débiteurs** : ce décalage est de l'argent gagné mais pas encore encaissé. Il faut le suivre, relancer et parfois l'abandonner.
- **Côté créanciers** : c'est de l'argent dû mais pas encore payé. Il faut respecter les échéances et profiter des escomptes.

## Exemple

### Créanciers

| Pièce | Date | Opération | Créanciers (2000) |
|---:|---|---|---:|
| 5 | 08.01 | Facture Pharmagros, médicaments mis en stock | +8'000 |
| 6 | 12.01 | Facture Biolab, analyses | +1'200 |
| | 31.01 | **Solde** | **9'200** |
| 15 | 11.02 | Paiement de Biolab | −1'200 |
| | 28.02 | **Solde** | **8'000** |

Au 28 février, seule la facture de Pharmagros reste ouverte.

### Débiteurs

Le cabinet en tient deux, distingués par le mode de facturation :

- **1100, débiteurs patients** : facturation en **tiers garant**. Le patient reçoit la facture, la paie, puis se fait rembourser par son assureur.
- **1105, débiteurs assureurs** : facturation en **tiers payant**. L'assureur paie directement le cabinet.

Au 31 janvier : 1100 = 800 (Mme Dupont 450, M. Rossi 350) ; 1105 = 2'200 (Assurance Léman).

## Pièges et cas subtils

- **Un même tiers peut être à la fois débiteur et créancier**, par exemple un fournisseur qui consulte au cabinet. Les deux soldes ne se compensent pas au bilan (CO 958c). Une compensation n'est possible que par un accord explicite et une écriture documentée.
- **Facture reçue n'est pas facture payée.** La charge naît à la réception de la prestation, la sortie de banque au paiement. Entre les deux, c'est le compte Créanciers qui porte la dette.
- **Tiers garant et tiers payant** changent le débiteur, pas la prestation. Une consultation reste un honoraire en 3400. Seul le collectif change.

## Loi suisse et pratique Abacus

**Loi**

- CO 959a : les créances et les dettes résultant de livraisons et prestations sont des postes minimaux du bilan.
- CO 958c : interdiction de compenser actifs et passifs.
- LAMal art. 42 : le tiers garant est la règle, sauf si l'assureur et le fournisseur de prestations conviennent du tiers payant. Les modalités détaillées seront vérifiées à l'itération 8b.

**Abacus (pratique)**

Débiteurs et créanciers sont tenus dans des modules séparés (DEBI, KREDI), qui comptabilisent dans la FIBU sur les collectifs. Voir le chapitre 20.

## Dans le code

- **Itérations 8a et 8b** : débiteurs.
- **Itération 9** : créanciers, avec les échéances et l'escompte.

## Questions fréquentes

**Que sont les créanciers dans le plan comptable ?**
Le compte 2000 : les tiers à qui l'entreprise doit de l'argent pour des achats ou des prestations reçus et non payés. C'est un compte de passif, collectif, détaillé par fournisseur dans l'auxiliaire des créanciers.
