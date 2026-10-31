# 20 — Comptabilité auxiliaire (Nebenbuchhaltung)

## Définition

La comptabilité auxiliaire est une comptabilité **de détail**. Pour une catégorie donnée, elle tient un compte **par tiers** ou **par objet**. Ses totaux alimentent un compte unique de la générale : le **compte collectif** (chapitre 21).

La générale dit « les patients doivent 800 ». L'auxiliaire dit **qui** doit, **combien**, **depuis quand** et pour **quelle facture**.

## À quoi ça sert

- **Garder la générale lisible.** Un cabinet a des milliers de patients. Le bilan en montre une seule ligne.
- **Répondre aux questions opérationnelles**, que la générale ignore : à qui envoyer un rappel ? quelles factures ont plus de 60 jours ? quels fournisseurs payer cette semaine ?
- **Justifier les soldes du bilan.** Le solde d'un compte collectif doit pouvoir être expliqué ligne par ligne.

Les auxiliaires courantes :

| Auxiliaire | Détail par | Compte collectif (plan PME) |
|---|---|---|
| Débiteurs | client (patient, assureur) | 1100 Créances résultant de livraisons et prestations |
| Créanciers | fournisseur | 2000 Dettes résultant d'achats et prestations |
| Immobilisations | bien (échographe, mobilier) | 15xx Immobilisations corporelles |
| Salaires | employé | charges de personnel 5xxx, dettes sociales |

## Exemple

### Les débiteurs au 31 janvier

| Débiteur | Type | Facture | Date | Montant ouvert | Collectif |
|---|---|---|---|---:|---|
| Mme Dupont | patiente, tiers garant | F-0001 | 15.01 | 450 | 1100 |
| M. Rossi | patient, tiers garant | F-0002 | 22.01 | 350 | 1100 |
| Assurance Léman | assureur, tiers payant | F-0003 | 31.01 | 2'200 | 1105 |

Contrôle : patients 450 + 350 = 800 = solde de 1100 ; assureurs 2'200 = solde de 1105.

Chaque ligne de ce tableau est un **poste ouvert** : une facture non encore réglée.

### Un paiement

Le 5 février, Mme Dupont paie sa facture de 450 (chapitre 00, pièce 13).

| Niveau | Effet |
|---|---|
| Auxiliaire | La facture F-0001 de Mme Dupont est soldée. Elle quitte les postes ouverts. |
| Générale | Banque +450, Débiteurs patients (1100) −450 |

Après le paiement, l'auxiliaire patients vaut 350, et le compte 1100 vaut 800 − 450 = 350.

Le paiement est **saisi une seule fois**, sur le tiers, dans l'auxiliaire. L'écriture de la générale en découle automatiquement. Une double saisie manuelle finirait par faire diverger les deux niveaux.

## Pièges et cas subtils

- **Contourner l'auxiliaire crée un écart.** Une écriture passée directement sur le compte 1100 dans la générale, par exemple « 1100 / 3400 500 », augmente le collectif sans qu'aucun patient ne doive ces 500 dans l'auxiliaire. Résultat : un écart inexpliqué à la clôture. La parade consiste à **interdire la saisie manuelle sur un compte collectif**.
- **L'auxiliaire ne dispense pas de la générale.** Le bilan est établi à partir de la générale. L'auxiliaire justifie le détail, elle ne le remplace pas.

## Loi suisse et pratique Abacus

**Loi**

Le CO n'impose pas de comptabilité auxiliaire en tant que telle. Il exige une comptabilité **complète, vérifiable et fondée sur des pièces** (art. 957a). Il faut donc pouvoir prouver la composition de chaque solde du bilan. Sans liste détaillée par tiers, un solde de débiteurs n'est pas défendable devant un réviseur.

**Abacus (pratique, à vérifier)**

Les auxiliaires sont des modules séparés : Debitorenbuchhaltung, Kreditorenbuchhaltung, Anlagenbuchhaltung, Lohnbuchhaltung. Ils comptabilisent automatiquement dans la FIBU, sur les comptes collectifs. Un compte collectif peut être paramétré pour refuser la saisie directe en FIBU. Le détail de ce paramétrage n'est pas vérifié.

## Dans le code

- **Itération 8a** : comptes de tiers, postes ouverts, génération de l'écriture de la générale, refus de la saisie manuelle sur un collectif.
- **Itération 8b** : paiements et lettrage.
- **Itération 9** : créanciers.

## Questions fréquentes

**Faut-il saisir le paiement deux fois, dans l'auxiliaire et dans la générale ?**
Non. Il est saisi dans l'auxiliaire, et l'écriture de la générale en découle.
