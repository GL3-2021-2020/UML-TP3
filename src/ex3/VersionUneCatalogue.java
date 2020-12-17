package ex3;

import java.util.List;

public class VersionUneCatalogue extends VersionCatalogue {
    public void dessine(List<VueVehicule> vehicule) {
        System.out.println("Version 1: ");
        for (VueVehicule vueVehicule : vehicule) {
            vueVehicule.dessine();
            System.out.println();
        }
        System.out.println();
    }
}
