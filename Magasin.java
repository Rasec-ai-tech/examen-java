// IMIEN Jean César Le Grand
// MALO Gnimien Somon Donald
import java.util.ArrayList;
import java.util.List;


// Cette classe représente un magasin qui contient plusieurs paniers
public class Magasin {
    private List<Panier> paniers;

    // Constructeur
    public Magasin() {
        this.paniers = new ArrayList<>();
    }

    // Méthode pour ajouter un panier au magasin
    public void ajouterPanier(Panier panier) {
        paniers.add(panier);
    }

    // Méthode pour afficher les détails de tous les paniers dans le magasin
    public void afficherPaniers() {
        int i = 1;
        if (paniers.isEmpty()) {
            System.out.println("Aucun panier dans le magasin.");
        } else {
            System.out.println("Liste des paniers dans le magasin :");
            for (Panier p : paniers) {
                System.out.println("Contenu du panier"+i+ " :");
                p.afficherPanier();
                System.out.println("Prix total : " + p.calculerTotal());
                System.out.print("\n");
                i++;
            }
        }
    }

    // Méthode pour calculer le chiffre d'affaires total du magasin
    public double calculerChiffreAffaires() {
        double total = 0;
        for (Panier p : paniers) {
            total += p.calculerTotal();
        }
        return total;
    }

    public static void main(String[] args) {
        // Création de quelques vêtements
        Vetement v1 = new Vetement("T-shirt", 3500, "M");
        Vetement v2 = new Vetement("Jeans", 10000, "L");
        Vetement v3 = new Vetement("Maillot de Barca", 7000, "S");

        // Création du panier
        Panier panier1 = new Panier();
        Panier panier2 = new Panier();

        // Ajout de vêtements au panier
        panier1.ajouterVetement(v1);
        panier1.ajouterVetement(v2);
        panier2.ajouterVetement(v3);
        System.out.print("\n");

        // Création du magasin
        Magasin magasin = new Magasin();

        // Ajout du panier au magasin
        magasin.ajouterPanier(panier1);
        System.out.println("Panier1 ajouté au magasin.");
        magasin.ajouterPanier(panier2);
        System.out.println("Panier2 ajouté au magasin.");
        System.out.print("\n");

        // Affichage des paniers dans le magasin
        magasin.afficherPaniers();

        // Calcul et affichage du chiffre d'affaires total
        System.out.println("Chiffre d'affaires total : " + magasin.calculerChiffreAffaires());
    }
}