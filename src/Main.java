public class Main {
    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        // Création des articles
        ArticleElectromenager laveLinge = new ArticleElectromenager(300, 500, "Lave-linge", "ElectroCo");
        Primeur pomme = new Primeur(1, 2, "Pomme", "BioPrimeur");

        // Ajout des articles au magasin
        magasin.ajouterArticle(laveLinge);
        magasin.ajouterArticle(pomme);

        // Remplissage des stocks
        laveLinge.remplirStock(10);
        pomme.remplirStock(50);

        // Ventes
        magasin.enregistrerRevenu(laveLinge.vendre(2));
        magasin.enregistrerRevenu(pomme.vendre(10));

        // Décrire l'état du magasin
        magasin.decrireEtat();
    }
}
