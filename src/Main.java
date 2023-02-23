public class Main {
    public static void main(String[] args) throws Exception {
        Magazin magasin1 = new Magazin();
        magasin1.ajouter(new Article(456, 12999.2));
        magasin1.ajouter(new Article(44154, 999.0));
        magasin1.ajouter(new ArticleEnSolde(245565, 200.0, 10.0));
        magasin1.ajouter(new ArticleEnSolde(345555, 300.0, 65.0));
        System.out.println(magasin1.nombreArticlesEnSolde());
        System.out.println(magasin1.supprimer(777777));
        System.out.println(magasin1.indiceDe(2));
        magasin1.enregistrer("src\\data.txt");
    }
}
