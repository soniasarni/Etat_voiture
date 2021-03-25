package deplacement_vehicule;

public class Voiture {
int code;
String marque;
int vitesse;
int prix;
boolean etat;
public Voiture(String marque, int vitesse, int prix) {
	super();
	
	this.marque = marque;
	this.vitesse = vitesse;
	this.prix = prix;
	code++;
	
}
@Override
public String toString() {
	return "Voiture [code=" + code + ", marque=" + marque + ", vitesse=" + vitesse + ", prix=" + prix + "]";
}
//methode qui demarre la voiture ON  cree une variable type boolean
public void demarrer() {
	etat =true;
		

}
public void arreter() {
	etat =false;
	
}
//methode qui envoie l'etat de la voiture marche ou arretee
public void etatV() {
	if (etat ==true) {
		System.out.println("la voiture "+this.marque+"  est en marche");
	}else {
		System.out.println("la voiture "+this.marque+" est arretée");
	}
		
	
}
}
