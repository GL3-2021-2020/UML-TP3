package ex3;

public class Client {
    public static void main(String[] args) {
        VersionUneCatalogue versionA = new VersionUneCatalogue();
        VersionDeuxCatalogue versionB = new VersionDeuxCatalogue();
        VueCatalogue vue1 = new VueCatalogue(versionA);
        VueCatalogue vue2 = new VueCatalogue(versionB);
        vue1.dessine();
        vue2.dessine();
    }
}
