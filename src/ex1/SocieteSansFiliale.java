package ex1;

public class SocieteSansFiliale extends Societe {

    public boolean ajouteFiliale(Societe filiale) {
        return false;
    }

    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule;
    }

}