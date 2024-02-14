import java.util.Scanner;

public class Optimitzacio {

	private final int PREUCREDIT = 134;
	private String nom;
	private String cognom1;
	private String cognom2;
	private int dni;
	private String nif="";
	private String[] assignatures= {"M1","M2","M3"};
	private int numAssignatures=0;
	private int totalMatricula=0;
	
	
	public static void main(String[] args) {
		
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("introdueix el nom: "); 
		nom= sc.nextLine(); //aquest error es dona perquè s'han de declarar totes les variables com estàtiques. Una altra solució és crear i instanciar una classe nova
		
		System.out.println ("introdueix el 1r cognom: "); 
		cognom1= sc.nextLine();
		
		System.out.println ("introdueix el 2n cognom: "); 
		cognom2= sc.nextLine();
		
		System.out.println ("introdueix el dni: "); 
		dni= sc.nextInt();
		
		System.out.println ("En quantes assignatures et vols matricular (1-3): "); 
		numAssignatures= sc.nextInt();
		
		System.out.println("hola "+nom);
		
		//calcul nif
		nif = calculNif(dni);
		System.out.println("el teu nif és: "+dni+nif);
		
		System.out.println("el cost total de la matricula és: "+ 
		numAssignatures*PREUCREDIT+"€");
	}

	private static String calculNif(int dni) {
		String nif;
		String[] taulaNIF= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J",
				"Z","S","Q","V","H","L","C","K","E"};
		String tNIF ="TRWAGMYFPDXBNJZSQVHLCKE";
		
		nif=taulaNIF[dni%23];
		return nif;
	}

}
