# 00 — Le Cabinet médical des Tilleuls Sàrl

Ce chapitre décrit l'entité fictive et le **scénario chiffré de référence**. Tous les exemples du livre et tous les tests du code en tirent leurs chiffres. Si un chiffre change ici, il change partout.

## L'entité

| | |
|---|---|
| Raison sociale | Cabinet médical des Tilleuls Sàrl |
| Forme juridique | Société à responsabilité limitée (CO art. 772 ss) |
| Activité | Cabinet de groupe de médecine générale, avec propharmacie |
| Associés | Dre Anne Martin, Dr Luc Favre, Dre Claire Berset |
| Capital social | 60'000 CHF, soit 20'000 par associé (le minimum légal d'une Sàrl est de 20'000) |
| Début d'activité | 3 janvier |
| Exercice | année civile |
| Monnaie | CHF |

Une **propharmacie** est la vente de médicaments directement par le médecin. Sa possibilité dépend du droit cantonal : certains cantons l'autorisent, d'autres la réservent aux pharmacies. Le canton du cabinet n'est donc pas précisé.

## Les simplifications du scénario

Elles sont levées au fil des chapitres.

| Simplification | Levée au chapitre ou à l'itération |
|---|---|
| Pas de TVA. Les médicaments remis y sont pourtant soumis, au taux réduit. | TVA (itération 7) |
| Pas d'amortissement de l'échographe | Bouclement (itération 11) |
| Pas de salaires | à préciser |
| Les encaissements au guichet du mois sont regroupés en une seule opération | Écritures et pièces (itération 5) |
| Pas de répartition par médecin | Analytique (itération 12) |

## Le plan comptable

Il est tiré du plan comptable PME. Le chapitre 10 en explique la structure.

| N° | Compte | Type | Remarque |
|---|---|---|---|
| 1000 | Caisse | Actif | |
| 1020 | Banque | Actif | |
| 1100 | Débiteurs patients | Actif | compte collectif, tiers garant |
| 1105 | Débiteurs assureurs | Actif | compte collectif, tiers payant. Subdivision propre au cabinet |
| 1170 | Impôt préalable TVA | Actif | |
| 1200 | Stock de médicaments | Actif | |
| 1500 | Équipement médical | Actif | |
| 1510 | Mobilier | Actif | |
| 2000 | Créanciers | Passif | compte collectif fournisseurs |
| 2200 | TVA due | Passif | |
| 2400 | Emprunt bancaire | Passif | long terme |
| 2800 | Capital social | Passif | capitaux propres |
| 2970 | Bénéfice reporté | Passif | capitaux propres |
| 3200 | Ventes de médicaments | Produit | plan PME : ventes de marchandises |
| 3400 | Honoraires médicaux | Produit | plan PME : ventes de prestations de services |
| 4200 | Coût des médicaments remis | Charge | plan PME : charges de marchandises |
| 4400 | Analyses de laboratoire | Charge | prestations de tiers |
| 5000 | Salaires | Charge | |
| 5700 | Charges sociales | Charge | |
| 6000 | Loyer | Charge | |
| 6300 | Assurances | Charge | |
| 6500 | Frais administratifs | Charge | |
| 6800 | Amortissements | Charge | |
| 6900 | Charges financières | Charge | |

## Les tiers

Tous fictifs.

| Tiers | Rôle | Compte collectif |
|---|---|---|
| Mme Dupont | patiente, tiers garant | 1100 |
| M. Rossi | patient, tiers garant | 1100 |
| Assurance Léman | assureur, tiers payant | 1105 |
| Caisse-maladie Jura | assureur, tiers payant | 1105 |
| Pharmagros SA | grossiste en médicaments | 2000 |
| Laboratoire Biolab SA | laboratoire d'analyses | 2000 |

## Janvier

Le numéro de pièce est **continu**. La référence est le numéro de la facture, émise ou reçue. Les notions de débit et de crédit sont expliquées au chapitre 04. On peut lire ici « débit » comme « le compte qui reçoit » et « crédit » comme « le compte qui fournit ».

| Pièce | Date | Opération | Réf. | Débit | Crédit | Montant |
|---:|---|---|---|---|---|---:|
| 1 | 03.01 | Apport des trois associés | | 1020 | 2800 | 60'000 |
| 2 | 04.01 | Emprunt bancaire sur 5 ans | | 1020 | 2400 | 40'000 |
| 3 | 05.01 | Achat d'un échographe, payé | | 1500 | 1020 | 50'000 |
| 4 | 05.01 | Loyer de janvier | | 6000 | 1020 | 4'000 |
| 5 | 08.01 | Médicaments mis en stock, facture Pharmagros | | 1200 | 2000 | 8'000 |
| 6 | 12.01 | Analyses, facture Biolab | | 4400 | 2000 | 1'200 |
| 7 | 15.01 | Consultation Mme Dupont | F-0001 | 1100 | 3400 | 450 |
| 8 | 22.01 | Consultation M. Rossi | F-0002 | 1100 | 3400 | 350 |
| 9 | 31.01 | Consultations payées au guichet en janvier | | 1020 | 3400 | 9'000 |
| 10 | 31.01 | Facture à l'Assurance Léman : consultation 1'500 + médicaments 700 | F-0003 | 1105 | 3400 / 3200 | 2'200 |
| 11 | 31.01 | Coût des médicaments remis, sortis du stock | | 4200 | 1200 | 500 |

La pièce 10 est une **écriture collective** : 1105 au débit pour 2'200, 3400 au crédit pour 1'500 et 3200 au crédit pour 700.

La pièce 11 illustre l'**inventaire permanent** : les médicaments achetés entrent au stock, un actif, et ne deviennent une charge qu'au moment où ils sont remis. L'alternative, fréquente dans les PME, consiste à passer les achats directement en charge et à corriger le stock au bouclement.

### Chiffres de contrôle au 31 janvier

**Balance de vérification**

| Compte | Débit | Crédit |
|---|---:|---:|
| 1020 Banque | 55'000 | |
| 1100 Débiteurs patients | 800 | |
| 1105 Débiteurs assureurs | 2'200 | |
| 1200 Stock de médicaments | 7'500 | |
| 1500 Équipement médical | 50'000 | |
| 2000 Créanciers | | 9'200 |
| 2400 Emprunt bancaire | | 40'000 |
| 2800 Capital social | | 60'000 |
| 3200 Ventes de médicaments | | 700 |
| 3400 Honoraires médicaux | | 11'300 |
| 4200 Coût des médicaments remis | 500 | |
| 4400 Analyses de laboratoire | 1'200 | |
| 6000 Loyer | 4'000 | |
| **Total** | **121'200** | **121'200** |

**Compte de résultat de janvier**

| Charges | | Produits | |
|---|---:|---|---:|
| Loyer | 4'000 | Honoraires médicaux | 11'300 |
| Analyses de laboratoire | 1'200 | Ventes de médicaments | 700 |
| Coût des médicaments remis | 500 | | |
| **Bénéfice** | **6'300** | | |
| **Total** | **12'000** | **Total** | **12'000** |

**Bilan au 31 janvier**

| Actif | | Passif | |
|---|---:|---|---:|
| Banque | 55'000 | Créanciers | 9'200 |
| Débiteurs patients | 800 | Emprunt bancaire | 40'000 |
| Débiteurs assureurs | 2'200 | Capital social | 60'000 |
| Stock de médicaments | 7'500 | Bénéfice de la période | 6'300 |
| Équipement médical | 50'000 | | |
| **Total** | **115'500** | **Total** | **115'500** |

**Postes ouverts au 31 janvier**

| Tiers | Facture | Montant | Collectif |
|---|---|---:|---|
| Mme Dupont | F-0001 | 450 | 1100 |
| M. Rossi | F-0002 | 350 | 1100 |
| Assurance Léman | F-0003 | 2'200 | 1105 |
| Pharmagros SA | facture du 08.01 | 8'000 | 2000 |
| Laboratoire Biolab SA | facture du 12.01 | 1'200 | 2000 |

Contrôle : 1100 = 450 + 350 = 800 ; 1105 = 2'200 ; 2000 = 8'000 + 1'200 = 9'200.

## Février (partiel)

Seules les opérations utilisées dans le livre sont listées. Février n'est pas une période complète.

| Pièce | Date | Opération | Réf. | Débit | Crédit | Montant |
|---:|---|---|---|---|---|---:|
| 12 | 03.02 | Loyer de février | | 6000 | 1020 | 4'000 |
| 13 | 05.02 | Paiement de Mme Dupont | F-0001 | 1020 | 1100 | 450 |
| 14 | 10.02 | Consultations, Assurance Léman | F-0004 | 1105 | 3400 | 900 |
| 15 | 11.02 | Paiement de Biolab | facture du 12.01 | 2000 | 1020 | 1'200 |
| 16 | 14.02 | Consultations, Caisse-maladie Jura | F-0005 | 1105 | 3400 | 1'300 |
| 17 | 20.02 | Paiement de l'Assurance Léman | F-0003 | 1020 | 1105 | 2'200 |

**Postes ouverts au 28 février**

| Tiers | Facture | Montant | Collectif |
|---|---|---:|---|
| M. Rossi | F-0002 | 350 | 1100 |
| Assurance Léman | F-0004 | 900 | 1105 |
| Caisse-maladie Jura | F-0005 | 1'300 | 1105 |
| Pharmagros SA | facture du 08.01 | 8'000 | 2000 |

Contrôle : 1100 = 350 ; 1105 = 900 + 1'300 = 2'200 ; 2000 = 8'000 ; Banque = 55'000 − 4'000 + 450 − 1'200 + 2'200 = 52'450.
