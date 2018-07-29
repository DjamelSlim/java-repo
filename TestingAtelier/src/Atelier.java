
public class Atelier {
	

		
	private String tata;

	private String localField;
	


	public static void main(String[] args) {
		Atelier atelier = new Atelier();
		final String myStr = atelier.getMyStr("siom", "magi", 20);
		System.out.print("test");
	}

	public String getMyStr(String nom, String prenom, Integer age){
		return nom + prenom + age;

	}

	public void countParPartipant(){
		System.out.println("modification dans la branche distante");
		System.out.println();
		System.out.println("modification en local");
		
	}
	//commentaire
	public void reset1(){
		
	}
	


}
