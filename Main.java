package deplacement_vehicule;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture V1=new Voiture("c3", 180, 10);
		Voiture V2=new Voiture("BMW", 240, 30);
		Voiture V3=new Voiture("mercedes", 240, 30);
        System.out.println(V1);
        System.out.println(V2);
        System.out.println(V3);
        V1.demarrer();
        V1.etatV();
        V2.arreter();
        V2.etatV();
        V3.etatV();
	}

}
