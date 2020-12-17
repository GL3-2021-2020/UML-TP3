package ex2;

public class Client {
    public static void main(String[] args) {
        FabriqueOption optionFactory = new FabriqueOption();
        VehiculeCommande clio = new VehiculeCommande();
        VehiculeCommande bmw = new VehiculeCommande();
        clio.ajouteOptions(optionFactory, 20, "GPS");
        bmw.ajouteOptions(optionFactory, 500, "Airbag");
        System.out.println("Options polo: ");
        clio.affiche();
        System.out.println("Options mercedes: ");
        bmw.affiche();
    }
}
