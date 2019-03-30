
public class CorpoCeleste {
	
	private String nome;
	private String codice;
	private double massa;
	private double posizionex;
	private double posizioney;
	
	public CorpoCeleste(String nome, String codice, double massa, double posizionex, double posizioney) {
		
		this.nome= nome;
		this.codice= codice;
		this.massa= massa;
		this.posizionex= posizionex;
		this.posizioney= posizioney;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCode() {
		return codice;
	}
	public double getMassa() {
		return massa;
	}
	public double getPosizioneX() {
		return posizionex;
	}
	public double getPosizioneY() {
		return posizioney;
	}
	
	public String toString() {
		
		return "\n" + "NOME: " + nome + "\n" + "CODICE: " + codice + "\n" + "MASSA: "+ massa +"kg" + "\n"+ "POSIZIONE: (" +  posizionex +  "," +  posizioney +")";
		
	}

}
