# 10 — Plan comptable (Kontenplan / Kontenrahmen)

## Définition

Le plan comptable est la **liste structurée de tous les comptes** que l'entreprise utilise. Chaque compte a un **numéro** et un **libellé**. Le numéro n'est pas arbitraire : sa position dans la structure indique la nature du compte.

L'allemand distingue deux notions :

| | Kontenrahmen | Kontenplan |
|---|---|---|
| Nature | le **modèle** de référence | le plan **propre à une entreprise** |
| Exemple | le plan comptable PME suisse | le plan du Cabinet des Tilleuls |
| Contenu | une structure et des comptes types | les comptes réellement utilisés, y compris ceux ajoutés |

On part du Kontenrahmen : on garde les comptes utiles, on supprime les autres et on subdivise au besoin. Le résultat est le Kontenplan.

## À quoi ça sert

- **Classer** chaque opération dans un compte dont la nature est connue.
- **Structurer** la présentation du bilan et du compte de résultat. Les niveaux du plan (classe, groupe, sous-groupe) servent de rubriques de présentation (chapitre 11).
- **Comparer** les entreprises entre elles, puisque la plupart partent du même modèle.

## Exemple

### La structure décimale

Le numéro se lit de gauche à droite, du général au particulier.

```
1           Classe        Actifs
11          Groupe        Créances
110         Sous-groupe   Créances résultant de livraisons et prestations
1100        Compte        Débiteurs patients
1105        Compte        Débiteurs assureurs   (subdivision propre au cabinet)
```

### Les classes du plan PME

| Classe | Contenu | Document |
|---|---|---|
| 1 | Actifs | Bilan |
| 2 | Passifs (capitaux étrangers et capitaux propres) | Bilan |
| 3 | Produits d'exploitation : ventes et prestations | Compte de résultat |
| 4 | Charges de matériel, de marchandises et de prestations de tiers | Compte de résultat |
| 5 | Charges de personnel | Compte de résultat |
| 6 | Autres charges d'exploitation, amortissements, résultat financier | Compte de résultat |
| 7 | Résultat des activités annexes | Compte de résultat |
| 8 | Résultats hors exploitation, exceptionnels, impôts | Compte de résultat |
| 9 | Clôture | technique |

Ce tableau fait apparaître la grande coupure du plan :

- **les classes 1 et 2 sont des comptes de bilan.** Leur solde est un **stock** à une date. Il est reporté d'un exercice à l'autre ;
- **les classes 3 à 8 sont des comptes de résultat.** Leur solde est un **flux** sur la période. Il repart de zéro à chaque exercice, et le bénéfice qu'ils dégagent est transféré dans les capitaux propres au bouclement.

### Le plan du cabinet

Le plan complet est au chapitre 00. Quelques choix à relever :

- **3200 et 3400** sont des numéros du plan PME (ventes de marchandises, ventes de prestations de services), avec un libellé adapté au cabinet : ventes de médicaments, honoraires médicaux.
- **4200** est le compte PME des charges de marchandises. Il reçoit le coût des médicaments remis.
- **1105** n'existe pas dans le plan PME. C'est une subdivision de 1100, créée pour séparer les créances sur les patients de celles sur les assureurs.

## Pièges et cas subtils

- **Le numéro porte une information.** Un compte 6xxx doit être une charge. Placer un compte d'actif en classe 6 casserait toute présentation fondée sur la structure.
- **Un plan trop détaillé est un piège.** Chaque compte supplémentaire doit être tenu, contrôlé et expliqué. On subdivise quand une information est réellement nécessaire, au bilan ou pour la gestion, pas par principe.
- **Le type du compte se déduit de sa classe.** Actif, passif, charge ou produit : ce type détermine le côté normal du solde, au débit ou au crédit (chapitre 04).

## Loi suisse et pratique Abacus

**Loi**

- Le CO **n'impose aucun plan comptable**, contrairement à la France et à son Plan comptable général. Il impose une structure minimale du bilan (art. 959a) et du compte de résultat (art. 959b).
- Le plan PME est construit pour respecter ces articles, ce qui en a fait la norme de fait.

**Le plan PME**

Rédigé à l'origine par Walter Sterchi, il est publié et maintenu par l'association professionnelle veb.ch. C'est un **standard de la profession**, pas une loi.

D'autres modèles existent pour certains secteurs : REKOLE (H+) pour les hôpitaux, MCH2 pour les collectivités publiques. Il existe peut-être des plans recommandés pour les cabinets médicaux, mais ce point n'est pas vérifié.

**Abacus (pratique, à vérifier)**

Le plan comptable est une donnée, livrée sous forme de modèles fondés sur le plan PME. Chaque compte porte des attributs de paramétrage : type, devise, code TVA par défaut, centre de coûts obligatoire ou non, compte collectif ou non. La liste exacte des attributs n'est pas vérifiée.

## Dans le code

L'itération 1 charge le plan depuis un fichier. Le moteur ne connaît que les **types** de comptes (actif, passif, charge, produit), jamais un numéro ou un libellé particulier : c'est la règle « moteur indépendant du plan ».

## Questions fréquentes

**Peut-on créer ses propres numéros de compte ?**
Oui, à l'intérieur de la structure. 1105 est un exemple : il reste dans la classe 1 et dans le sous-groupe 110, ce qui préserve son sens.

**Que sont les créanciers dans le plan comptable ?**
Le compte 2000, « Dettes résultant d'achats et de prestations de services ». Voir le chapitre 22.
