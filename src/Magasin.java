import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private double depenses;
    private double revenus;
    private List<Article> articles;

    public Magasin() {
        this.depenses = 0;
        this.revenus = 0;
        this.articles = new ArrayList<>();
    }

    public void ajouterArticle(Article article) {
        articles.add(article);
    }

    public void enregistrerDepense(double montant) {
        depenses += montant;
    }

    public void enregistrerRevenu(double montant) {
        revenus += montant;
    }

    public double calculerTauxRendement() {
        return (revenus - depenses) / depenses * 100;
    }

    public void decrireEtat() {
        System.out.println("Dépenses totales: " + depenses);
        System.out.println("Revenus totaux: " + revenus);
        System.out.println("Taux de rendement global: " + calculerTauxRendement() + "%");
    }
}
