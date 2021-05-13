package primerEjercicio;

public class FPDual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variablesChallenge();
	}
	
	private static void variablesChallenge() {
		//Create employers
		Developer dev1 = new Developer("Juan", 18, 618924872);
		Developer dev2 = new Developer("Mario", 24, 628954872);
		Developer dev3 = new Developer("Maria", 38, 698925832);
		Developer dev4 = new Developer("Manola", 22, 658322812);
		//Show Employer 1 and 4
		System.out.println(dev1);
		System.out.println(dev4);
		//Show every employer
		System.out.println("\nEl id de empleado es de dev1= "+dev1.getIdEmployer());
		System.out.println("El id de empleado es de dev2= "+dev2.getIdEmployer());
		System.out.println("El id de empleado es de dev3= "+dev3.getIdEmployer());
		System.out.println("El id de empleado es de dev4= "+dev4.getIdEmployer());
		//Substac 2 VacationDays to Employer2
		dev2.substrac(2);
		System.out.println("\n"+dev2);
		//Show every VacationDays 
		System.out.println("\nLas vacaciones del empleado dev1 son de= "+dev1.getVacationDays()+ " dias");
		System.out.println("Las vacaciones del empleado dev2 son de= "+dev2.getVacationDays()+ " dias");
		System.out.println("Las vacaciones del empleado dev3 son de= "+dev3.getVacationDays()+ " dias");
		System.out.println("Las vacaciones del empleado dev4 son de= "+dev4.getVacationDays()+ " dias");

	}
}
