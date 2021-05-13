package primerEjercicio;
/**
 * 
 * @author elias
 *
 */
public class FPDual {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		variablesChallenge();
	}
	/**
	 * Metod to do everything
	 */
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
		System.out.println("\nThe id of dev1= "+dev1.getIdEmployer());
		System.out.println("The id of dev2= "+dev2.getIdEmployer());
		System.out.println("The id of dev3= "+dev3.getIdEmployer());
		System.out.println("The id of dev4= "+dev4.getIdEmployer());
		//Substac 2 VacationDays to Employer2
		dev2.substrac(2);
		System.out.println("\n"+dev2);
		//Show every VacationDays 
		System.out.println("\nThe vacations of dev1 are= "+dev1.getVacationDays()+ " days");
		System.out.println("The vacations of dev2 are= "+dev2.getVacationDays()+ " days");
		System.out.println("The vacations of dev3 are= "+dev3.getVacationDays()+ " days");
		System.out.println("The vacations of dev4 are= "+dev4.getVacationDays()+ " days");
	}
}
