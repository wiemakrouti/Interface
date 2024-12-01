public abstract class Article {
    protected double prixAchat;
    protected double prixVente;
    protected String nom;
    protected String fournisseur;

    public Article(double prixAchat, double prixVente, String nom, String fournisseur) {
        this.prixAchat = prixAchat;
        this.prixVente = prixVente;
        this.nom = nom;
        this.fournisseur = fournisseur;
    }

    public double calculerTauxRendement() {
        return ((prixVente - prixAchat) / prixAchat) * 100;
    }

    public void afficherCaracteristiques() {
        System.out.println("Nom: " + nom);
        System.out.println("Fournisseur: " + fournisseur);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix de vente: " + prixVente);
        System.out.println("Taux de rendement: " + calculerTauxRendement() + "%");
    }
}
