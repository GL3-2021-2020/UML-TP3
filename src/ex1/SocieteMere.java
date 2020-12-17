package ex1;

import java.util.ArrayList;

public class SocieteMere extends Societe {
    protected ArrayList<Societe> filiales = new ArrayList<>();

    public boolean ajouteFiliale(Societe filiale) {
        filiales.add(filiale);
        return true;
    }

    public double calculeCoutEntretien() {
        double cout = 0;

        for (Societe filiale : filiales) {
            cout = cout + filiale.calculeCoutEntretien();
        }
        return cout + nbrVehicules * coutUnitVehicule;
    }

}
