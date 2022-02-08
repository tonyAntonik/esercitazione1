import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professore prof1 = new Professore();
		prof1.cognome="Antonicelli";
		prof1.nome="Tony";
		prof1.materia="Lab.Informatica";
		prof1.ore=20;
		
		Professore prof2 = new Professore();
		prof2.cognome="Mallardi";
		prof2.nome="Giulio";
		prof2.materia="Informatica";
		prof2.ore=21;
		
		//commento
		ArrayList<Professore>Professori= new ArrayList<Professore>();
		
		Professori.add(prof1);
		Professori.add(prof2);
		
		for (Professore professore : Professori) {
			System.out.println(professore.cognome);
		}
	
		
	}

}
