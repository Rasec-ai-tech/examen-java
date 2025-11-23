// IMIEN Jean César Le Grand
// MALO Gnimien Somon Donald

// Cette classe représente un vêtement avec un nom, un prix et une taille
public class Vetement{
    private String nom;
    private double prix;
    private String taille;

    // Constructeur
    public Vetement(String nom, double prix, String taille){
        this.nom = nom;
        this.prix = prix;
        this.taille = taille;
    }

    // Getteurs ou accesseurs
    public String getNom(){return this.nom;}
    public double getPrix(){return this.prix;}
    public String getTaille(){return this.taille;}

    // Setteurs ou mutateurs
    public void setNom(String nom){this.nom = nom;}
    public void setPrix(double prix){this.prix = prix;}
    public void setTaille(String taille){this.taille = taille;}

    // Méthode pour afficher les détails d'un vetement
    public void afficherDetail(){
        System.out.println("Nom : "+this.nom+", Prix : "+this.prix+", Taille : "+this.taille);

    }
}