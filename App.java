
public class App {
	
	public static void main(String []a) {
		Personne per1 = new Personne(1,"Ahmed");
		Personne per2 = new Personne(2,"Youssera");
		Personne per3 = new Personne(3,"Ilhame");
		
		Company cmp1 = new Company("Infoer");
		cmp1.addEmployee(101, per1);
		cmp1.addEmployee(100, per2);
		cmp1.addEmployee(102, per3);
		
		//Before sorting
		System.out.println(cmp1.getListeOfMpl());
		
		//Sort & Printing
		cmp1.trier();
		
	}

}
