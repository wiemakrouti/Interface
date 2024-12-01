public class Primeur extends Article implements VendableParKilogramme {
    private double stock;

    public Primeur(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(double quantite) {
        stock += quantite;
        System.out.println("Stock rempli avec " + quantite + " kg.");
    }

    @Override
    public double vendre(double quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant !");
            return 0;
        }
        stock -= quantite;
        double revenu = quantite * prixVente;
        System.out.println("Vente réussie : " + revenu + "€ générés.");
        return revenu;
    }
}
