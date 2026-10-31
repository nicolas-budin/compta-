# 02 — Bilan (Bilanz)

## Définition

Le bilan est une **photo du patrimoine de l'entreprise à une date précise**. D'un côté, ce qu'elle possède. De l'autre, d'où vient l'argent qui a permis de le posséder.

| Actif | Passif |
|---|---|
| Ce que l'entreprise **possède** ou ce qu'on lui **doit** | **D'où vient** l'argent |
| L'**emploi** des ressources | L'**origine** des ressources |
| Banque, créances, stock, équipement | Dettes envers des tiers, apports des propriétaires, bénéfices |

Le passif ne se limite pas aux dettes. Il comprend :

- les **capitaux étrangers** (Fremdkapital) : ce qui est dû à des tiers (fournisseurs, banque) ;
- les **capitaux propres** (Eigenkapital) : ce qui revient aux propriétaires (capital apporté et bénéfices accumulés).

D'où l'équation fondamentale :

> **Actif = Capitaux étrangers + Capitaux propres**

Lue autrement : **Capitaux propres = Actif − Dettes**. C'est ce qui resterait aux associés si tous les actifs étaient vendus à leur valeur comptable et toutes les dettes payées.

## À quoi ça sert

Le bilan répond à trois questions :

- **Que possède l'entreprise ?**
- **Que doit-elle ?**
- **Quelle part lui appartient en propre ?**

Les prêteurs y lisent la solidité financière, les associés la valeur comptable de leur part.

L'équilibre n'est pas une coïncidence, il est **garanti par construction**. Chaque franc présent dans l'entreprise provient de quelque part : un apport, un emprunt, une dette fournisseur, un bénéfice. Le passif liste ces origines, l'actif l'endroit où se trouve ce franc maintenant.

## Exemple

Les opérations de janvier (chapitre 00) et leur effet sur le bilan :

| Pièce | Opération | Effet sur le bilan |
|---:|---|---|
| 1 | Apport des associés | Banque +60'000 / Capital +60'000 |
| 2 | Emprunt bancaire | Banque +40'000 / Emprunt +40'000 |
| 3 | Achat de l'échographe | Équipement +50'000 / Banque −50'000 |
| 4 | Loyer | Banque −4'000 / Résultat −4'000 |
| 5 | Médicaments en stock, à crédit | Stock +8'000 / Créanciers +8'000 |
| 6 | Facture Biolab | Créanciers +1'200 / Résultat −1'200 |
| 7, 8 | Consultations facturées aux patients | Débiteurs patients +800 / Résultat +800 |
| 9 | Consultations au guichet | Banque +9'000 / Résultat +9'000 |
| 10 | Facture Assurance Léman | Débiteurs assureurs +2'200 / Résultat +2'200 |
| 11 | Médicaments remis | Stock −500 / Résultat −500 |

**Bilan au 31 janvier**

| Actif | | Passif | |
|---|---:|---|---:|
| *Actifs circulants* | | *Capitaux étrangers à court terme* | |
| Banque | 55'000 | Créanciers | 9'200 |
| Débiteurs patients | 800 | *Capitaux étrangers à long terme* | |
| Débiteurs assureurs | 2'200 | Emprunt bancaire | 40'000 |
| Stock de médicaments | 7'500 | *Capitaux propres* | |
| *Actifs immobilisés* | | Capital social | 60'000 |
| Équipement médical | 50'000 | Bénéfice de la période | 6'300 |
| **Total** | **115'500** | **Total** | **115'500** |

### Les quatre effets possibles d'une opération

| Cas | Effet | Exemples |
|---|---|---|
| 1 | Actif et passif **augmentent** | pièces 1, 2, 5 |
| 2 | Actif et passif **diminuent** | pièce 15 : paiement de Biolab |
| 3 | **Échange** entre deux actifs, total inchangé | pièce 3 ; pièce 13 : paiement de Mme Dupont |
| 4 | Un actif ou un passif bouge avec le **résultat** | pièces 4, 6 à 11 |

Le cas 4 fait le lien avec le compte de résultat (chapitre 03). Le compte de résultat explique **pourquoi** la ligne « Bénéfice de la période » a bougé.

## Pièges et cas subtils

- **Les capitaux propres ne sont pas de l'argent en banque.** Les capitaux propres valent 66'300, la banque 55'000. Les capitaux propres sont une origine, pas un avoir. Une partie a servi à acheter l'échographe.
- **Le bénéfice n'est pas de la trésorerie.** Le bénéfice est de 6'300, mais les opérations de résultat n'ont fait entrer que 5'000 en banque (9'000 encaissés au guichet, moins 4'000 de loyer). L'écart s'explique ainsi : 3'000 facturés mais pas encaissés, 1'200 dus à Biolab mais pas payés, et 500 de médicaments consommés sur un stock acheté à crédit. On a bien 5'000 + 3'000 − 1'200 − 500 = 6'300.
- **Le bilan ne donne pas la valeur de l'entreprise.** La patientèle et la réputation des médecins n'y figurent pas. Les actifs sont portés au plus à leur coût d'acquisition, diminué des amortissements, et non à leur valeur de marché (CO 960 ss, principe de prudence).
- **L'ordre des postes.** En Suisse, l'actif est présenté par liquidité décroissante (la banque en haut) et le passif par exigibilité décroissante (les dettes à court terme en haut). La présentation française fait l'inverse.

## Loi suisse et pratique Abacus

**Loi (CO)**

- Art. 959 : définit ce qui peut figurer à l'actif. L'entreprise doit pouvoir disposer de l'élément du fait d'un événement passé, en attendre un avantage économique, et sa valeur doit pouvoir être estimée de façon fiable. Les dettes au passif obéissent à la même logique.
- Art. 959a : structure minimale du bilan et ordre des postes.
- Art. 960 ss : règles d'évaluation.

**Abacus (pratique)**

Le bilan n'est pas une saisie. C'est un **rapport** produit à partir des soldes des comptes et de la hiérarchie du plan comptable. La structure est paramétrée une fois, puis réutilisée.

## Dans le code

L'itération 4 calcule le bilan à partir des soldes, et vérifie que le bénéfice du compte de résultat égale l'écart du bilan.

## Questions fréquentes

**Le passif, ce sont les dettes ?**
En partie seulement. Le passif contient aussi les capitaux propres, qui ne sont dus à aucun tiers.

**Pourquoi le bilan est-il toujours équilibré ?**
Parce que chaque opération touche toujours deux côtés à la fois : deux postes du bilan, ou un poste du bilan et le résultat, qui fait partie des capitaux propres.
