# Backlog

Chaque itération vise **une notion comptable**. Pour chaque itération, on suit les étapes du rituel :

1. un **exercice à la main**, avec le scénario de l'entité fictive ;
2. le **code** ;
3. un **test** qui retrouve les chiffres de l'exercice ;
4. une **démo**.

Légende : `[ ]` à faire, `[~]` en cours, `[x]` validée.

## État

- **Dernière itération validée** : 0 bis, squelette Maven (sur la branche `wip/iteration-0bis`, pas encore sur `main`).
- **Itération suivante** : 1, plan comptable.

## Itération 0 — Cadrage

- [x] `CLAUDE.md` : but, fil rouge, rituel, règles comptables et de code.
- [x] `docs/backlog.md` : ce fichier.
- [x] `docs/glossaire.md` : vocabulaire français / allemand.
- [x] 0 bis : `pom.xml` Java 21 + JUnit, Maven Wrapper, un test vide qui passe.

## Itérations — Cabinet médical des Tilleuls Sàrl

| # | Notion | Exercice à la main | Terminé quand |
|---|---|---|---|
| [ ] 1 | **Plan comptable** : types de comptes (actif, passif, charge, produit), sens normal du solde, classes du plan PME | classer une vingtaine de comptes du cabinet et donner leur sens normal | le plan du cabinet se charge depuis un fichier, et chaque compte a un type et un sens |
| [ ] 2 | **Écriture en partie double** : débit, crédit, équilibre, journal | passer dix opérations du mois de janvier (apport des associés, loyer, achat de matériel, honoraires encaissés…) | une écriture déséquilibrée est refusée, et le journal liste les écritures dans l'ordre |
| [ ] 3 | **Grand livre et balance** : solde par compte, balance de vérification | calculer les soldes de janvier et la balance | la balance calculée est égale à celle de l'exercice, et le total des débits égale celui des crédits |
| [ ] 4 | **Bilan et compte de résultat** : d'où vient le bénéfice, et pourquoi le bilan s'équilibre | établir bilan et compte de résultat au 31 janvier | le bénéfice du compte de résultat est égal à l'écart du bilan |
| [ ] 5 | **Écritures composées et pièces** : écriture collective, numéro de pièce, libellé | une facture fournisseur répartie sur plusieurs charges | une écriture à N lignes est acceptée si elle est équilibrée, et la numérotation est continue |
| [ ] 6 | **Périodes et immuabilité** : verrouillage, contre-passation | corriger une erreur de janvier après le verrouillage du mois | aucune écriture n'est modifiée, et la correction passe par une extourne en février. Persistance PostgreSQL introduite ici |
| [ ] 7 | **TVA** : codes TVA, part exonérée et part imposable, calcul automatique, décompte | une facture mixte (consultation exonérée + médicaments remis imposables) | l'écriture de TVA est générée automatiquement, et le décompte trimestriel est correct |
| [ ] 8 | **Débiteurs (comptabilité auxiliaire)** : compte collectif, postes ouverts, lettrage, tiers garant et tiers payant | des factures patients et assureurs, des paiements partiels, un rappel | le solde du compte collectif est égal à la somme des postes ouverts |
| [ ] 9 | **Créanciers** : factures fournisseurs, échéances, paiements | des factures de laboratoire et de fournisseur de matériel, avec escompte | les postes ouverts créanciers sont rapprochés avec le grand livre |
| [ ] 10 | **Banque** : QR-facture, import `camt.053`, rapprochement bancaire | un relevé bancaire de février | les paiements reçus sont lettrés automatiquement avec les postes ouverts |
| [ ] 11 | **Bouclement** : amortissements, transitoires, report du résultat, ouverture de l'exercice suivant | le bouclement au 31 décembre | les comptes de résultat sont soldés, et le bilan d'ouverture N+1 est égal au bilan de clôture N |
| [ ] 12 | **Analytique** : centres de coûts (par médecin) | répartir charges et honoraires par médecin | le résultat par centre de coûts est égal au résultat global |
| [ ] 13 | **Devises** : cours, différence de change, réévaluation | un achat d'équipement en euros | la différence de change est comptabilisée au paiement et à la réévaluation |

