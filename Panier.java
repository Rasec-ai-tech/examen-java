// IMIEN Jean César Le Grand
// MALO Gnimien Somon Donald
import java.util.ArrayList;
import java.util.List;

// Cette classe représente un panier qui peut contenir plusieurs vêtements
public class Panier {
    private List<Vetement> vetements;

    // Constructeur
    public Panier() {
        this.vetements = new ArrayList<>();
    }

    // Méthode pour ajouter un vêtement au panier
    public void ajouterVetement(Vetement v) {
        this.vetements.add(v);
        System.out.println("Vêtement ajouté : " + v.getNom());
    }

     // Méthode pour calculer le prix total des vêtements dans le panier
    public double calculerTotal() {
        double total = 0;
        for (Vetement v : this.vetements) {
            total += v.getPrix();
        }
        return total;
    }

    // Méthode pour afficher les détails de tous les vêtements dans le panier
    public void afficherPanier() {
        if (this.vetements.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            for (Vetement v : this.vetements) {
                v.afficherDetail();
            }
        }
    }

}