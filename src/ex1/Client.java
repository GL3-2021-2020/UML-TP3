package ex1;

public class Client {
    public static void main(String[] args) {
        Societe societe1 = new SocieteSansFiliale();
        societe1.ajouteVehicule();

        Societe societe2 = new SocieteSansFiliale();
        societe2.ajouteVehicule();

        Societe societe3 = new SocieteSansFiliale();
        societe3.ajouteVehicule();

        Societe boss = new SocieteMere();
        boss.ajouteFiliale(societe1);
        boss.ajouteFiliale(societe2);
        boss.ajouteFiliale(societe3);
        boss.ajouteVehicule();
        boss.ajouteVehicule();

        System.out.println("cout du la societe mere est " + boss.calculeCoutEntretien());
        System.out.println("cout total d'une societe sans filiale  \"societe3\" est " + societe3.calculeCoutEntretien());
    }
}
 