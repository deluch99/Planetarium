import it.unibs.fp.mylib.InputDati;

public class ProvaMain {
	
public static CorpoCeleste corpo(String desc){
		
			 String nome = InputDati.leggiStringa(desc + ", inserisci nome: ");
			 String codice = InputDati.leggiStringa(desc + ", inserisci codice: ");
			 double massa = InputDati.leggiDouble(desc + ", inserisci massa(in kg): ");
			 double posizionex = InputDati.leggiDouble(desc + ", inserisci posizione x: ");
			 double posizioney = InputDati.leggiDouble(desc + ", inserisci posizione y: ");
			 
		return new CorpoCeleste(nome, codice, massa, posizionex, posizioney); 
	}
	
	public static void main(String[] args) {
		
		CorpoCeleste tipo1= corpo("astro");
		
		System.out.println(tipo1);
		
	}

}
