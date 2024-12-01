public class ArticleElectromenager extends Article implements VendableParPiece, SusceptibleSolde {
    private int stock;

    public ArticleElectromenager(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    public void remplirStock(int quantite) {
        stock += quantite;
        System.out.println("Stock rempli avec " + quantite + " pièces.");
    }

    @Override
    public double vendre(int quantite) {
        if (quantite > stock) {
            System.out.println("Stock insuffisant !");
            return 0;
        }
        stock -= quantite;
        double revenu = quantite * prixVente;
        System.out.println("Vente réussie : " + revenu + "€ générés.");
        return revenu;
    }

    @Override
    public void lancerSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void terminerSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }
}
