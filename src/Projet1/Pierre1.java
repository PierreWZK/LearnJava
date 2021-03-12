package Projet1;
public class Pierre1 {

	public static void main(String[] args) {
		int maVar = 8;
		int maVar2 = 12;
		String maChaine = "Bondour !";
		System.out.println(maChaine + " Moi j'ai " + (maVar + maVar2) + "ans");
		System.out.println("Pssst ! C'est faux");
		
		NewClass monObj = new NewClass(8);
		System.out.println(monObj);
		
		System.out.println(monObj.maProp);
	}

}
