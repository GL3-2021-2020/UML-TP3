package ex3;

import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {
    protected List<VueVehicule> vehicule = new ArrayList<VueVehicule>();
    protected VersionCatalogue version;

    public VueCatalogue(VersionCatalogue version) {
        vehicule.add(new VueVehicule("vehicule a traverse 100k km"));
        vehicule.add(new VueVehicule("vehicule a un probleme avec le frein"));
        vehicule.add(new VueVehicule("vehicule en tres bon etat"));
        vehicule.add(new VueVehicule("vehicule ne marche pas"));
        this.version = version;
    }

    public void dessine() {
        version.dessine(vehicule);
    }
}
