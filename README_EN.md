
# 1\. Garment Store Management in Java (Translation of the first README)

This project is a simple Java application designed to simulate the management of a clothing store. It uses an object-oriented structure to represent **garments**, purchase **baskets (carts)**, and the **store** itself.

-----

##  Project Structure (Classes)

The project consists of three main classes: `Vetement.java`, `Panier.java`, and `Magasin.java`.

### 1\. `Vetement.java` (`Garment.java`)

This class represents a basic clothing item.

  * **Attributes:** `nom` (String - name), `prix` (double - price), and `taille` (String - size).
  * **Features:**
      * Constructor to initialize attributes.
      * **Getters** and **Setters** for all attributes.
      * `afficherDetail()`: Displays the name, price, and size of the garment.

### 2\. `Panier.java` (`Basket/Cart.java`)

This class represents a shopping basket that can contain a collection of `Vetement`.

  * **Attribute:** `vetements` (a `List<Vetement>`).
  * **Features:**
      * `ajouterVetement(Vetement v)`: Adds a garment to the basket.
      * `calculerTotal()`: Calculates the sum of the prices of all garments in the basket.
      * `afficherPanier()`: Displays the details of every garment in the basket.

### 3\. `Magasin.java` (`Store.java`)

This class represents the store and manages a collection of `Panier`. It contains the main application logic (the `main` method).

  * **Attribute:** `paniers` (a `List<Panier>`).
  * **Features:**
      * `ajouterPanier(Panier panier)`: Adds a basket (customer transaction) to the store.
      * `afficherPaniers()`: Iterates through and displays the contents and total price of each registered basket.
      * `calculerChiffreAffaires()`: Calculates the total turnover (sales revenue) by summing the totals of all baskets.
      * **`main(String[] args)`:** Contains the test scenario for: creating garments, filling baskets, creating the store, adding baskets, displaying the store's status, and showing the total turnover.

-----

## How to Run the Project

The entry point of the program is located in the `Magasin.java` class.

### Prerequisites

  * Java Development Kit (JDK) installed (version 8 or higher recommended).

### Execution Steps (Command Line)

1.  **Compile the files:**
    Open your terminal or command prompt and navigate to the directory containing the `.java` files.

    ```bash
    javac Vetement.java Panier.java Magasin.java
    ```

2.  **Run the program:**
    Execute the `main` method of the `Magasin` class.

    ```bash
    java Magasin
    ```
