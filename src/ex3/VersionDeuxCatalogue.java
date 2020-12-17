package ex3;

import java.util.List;

public class VersionDeuxCatalogue extends VersionCatalogue {
    public void dessine(List<VueVehicule> vehicule) {
        System.out.println("Version 2:");
        int compteur = 0;
        for (VueVehicule vueVehicule : vehicule) {
            vueVehicule.dessine();
            compteur++;
            if (compteur == 3) {
                compteur = 0;
                System.out.println();
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
