package ex2;

import java.util.ArrayList;

public class VehiculeCommande {
    protected ArrayList<OptionVehicule> options = new ArrayList<>();
    protected ArrayList<Integer> prixOptions = new ArrayList<>();

    public void ajouteOptions(FabriqueOption fabrique, int prix, String nom) {
        options.add(fabrique.getOption(nom));
        prixOptions.add(prix);
    }

    public void affiche() {
        int longueur = options.size();
        for (int i = 0; i < longueur; i++) {
            options.get(i).affiche();
            System.out.println("et le prix de vente est : " + prixOptions.get(i));
        }

    }
}