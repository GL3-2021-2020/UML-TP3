package ex2;

public class OptionVehicule {
    protected String nom;
    protected String description;

    public OptionVehicule(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public OptionVehicule(String nom) {
        this.nom = nom;
        this.description = "description de " + nom + ": bla bla bla";
    }

    public void affiche() {
        System.out.println("option: " + nom);
        System.out.println("description: " + description);
    }
}
