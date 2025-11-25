
# Gestion de Magasin de Vêtements en Java

Ce projet est une application Java simple conçue (lors d'un examen pratique sur la Programmation Orientée Objet - POO ), pour simuler la gestion d'un magasin de vêtements. 
Il utilise une structure orientée objet pour représenter les vêtements, les paniers d'achat, et le magasin lui-même.

## Structure du Projet (Classes)

Le projet est composé de trois classes principales : `Vetement.java`, `Panier.java`, et `Magasin.java`.

### 1\. Vetement.java

Cette classe représente un article vestimentaire de base.

  * Attributs : `nom` (String), `prix` (double), et `taille` (String).
  * Fonctionnalités :
      * Constructeur pour initialiser les attributs.
      * Getters (accesseurs) et Setters (mutateurs) pour tous les attributs.
      * `afficherDetail()` : Affiche le nom, le prix et la taille du vêtement.

### 2\. `Panier.java`

Cette classe représente un panier d'achat qui peut contenir une collection de `Vetement`.

  * Attribut : `vetements` (une `List<Vetement>`).
  * Fonctionnalités :
      * `ajouterVetement(Vetement v)` : Ajoute un vêtement au panier.
      * `calculerTotal()` : Calcule la somme des prix de tous les vêtements dans le panier.
      * `afficherPanier()` : Affiche les détails de chaque vêtement dans le panier.

### 3\. `Magasin.java`

Cette classe représente le magasin et gère une collection de `Panier`. Elle contient la logique principale (méthode `main`).

  * Attribut : `paniers` (une `List<Panier>`).
  * Fonctionnalités :
      * `ajouterPanier(Panier panier)` : Ajoute un panier (une transaction client) au magasin.
      * `afficherPaniers()` : Parcourt et affiche le contenu et le prix total de chaque panier enregistré.
      * `calculerChiffreAffaires()` : Calcule le chiffre d'affaires total en additionnant les totaux de tous les paniers.
      * `main(String[] args)` : Contient le scénario de test pour :
        1.  Créer des vêtements.
        2.  Créer et remplir des paniers.
        3.  Créer le magasin.
        4.  Ajouter les paniers au magasin.
        5.  Afficher l'état du magasin (paniers et leurs totaux).
        6.  Afficher le chiffre d'affaires total.


## Comment Exécuter le Projet

Le point d'entrée du programme se trouve dans la classe `Magasin.java`.

### Prérequis

  * Java Development Kit (JDK) installé (version 8 ou supérieure recommandée).

### Étapes d'exécution (en ligne de commande)

1.  Compiler les fichiers :
    Ouvrez votre terminal ou invite de commande et naviguez jusqu'au répertoire contenant les fichiers `.java`.

    ```bash
    javac Vetement.java Panier.java Magasin.java
    ```

2.  Exécuter le programme :
    Lancez la méthode `main` de la classe `Magasin`.

    ```bash
    java Magasin
    ```

### Résultat Attendu

Le programme affichera les étapes d'ajout des vêtements et des paniers, suivi de la liste détaillée de tous les paniers et, enfin, du chiffre d'affaires total du magasin.

```
Vêtement ajouté : T-shirt
Vêtement ajouté : Jeans
Vêtement ajouté : Maillot de Barca

Panier1 ajouté au magasin.
Panier2 ajouté au magasin.

Liste des paniers dans le magasin :
Contenu du panier1 :
Nom : T-shirt, Prix : 3500.0, Taille : M
Nom : Jeans, Prix : 10000.0, Taille : L
Prix total : 13500.0

Contenu du panier2 :
Nom : Maillot de Barca, Prix : 7000.0, Taille : S
Prix total : 7000.0

Chiffre d'affaires total : 20500.0
```
