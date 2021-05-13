package primerEjercicio;
/**
 * 
 * @author elias
 *
 */
public class Developer {
	private static final byte NORMALVACATIONDAYS=21;
	private static final int MAXIMUNEMPLOYERNUMBERS=127;
	private  String name;
	private int age;
	private long telfNumber; 
	private static final String ENTERPRISENAME="Everis";
	private static short numEmployers;
	private short idEmployer;
	private int vacationDays=NORMALVACATIONDAYS;
	/**
	 * Constructor metod
	 * @param name
	 * @param age
	 * @param telfNumber
	 */
	public Developer(String name,int age,long telfNumber) {
		this.name=name;
		this.age=age;
		this.telfNumber=telfNumber;
		if(numEmployers<MAXIMUNEMPLOYERNUMBERS) {
			Developer.numEmployers++;
			idEmployer=numEmployers;
		}else {
			System.out.println("You reach the Employer limits");
		}
	}
	/**
	 * Metod to substrac vacationDays
	 * @param vacationDays
	 */
	public void substrac(int vacationDays) {
		if(this.vacationDays-vacationDays>=0) {
			this.vacationDays= this.vacationDays-vacationDays;
		}else {
			System.out.println("You can't take more vacationDays from this employer");
		}
	}
	//Metod toString to show Employers
	@Override
	public String toString() {
		return "Developer [name= " + name + ", age= "+age +", telfNumber= "+telfNumber+", Employer ID= "+idEmployer+", Enterprise name= "+ENTERPRISENAME+", numEmp= "+numEmployers+", VacationDays= "+vacationDays +"]";
	}
	
	//Metods Getters and Setters
	
	/**
	 * @return the vacationDays
	 */
	public int getVacationDays() {
		return vacationDays;
	}

	/**
	 * @param vacationDays the vacationDays to set
	 */
	public void setVacationDays(int vacationDays) {
		this.vacationDays = vacationDays;
	}

	/**
	 * @return the normalvacationdays
	 */
	public static byte getNormalvacationdays() {
		return NORMALVACATIONDAYS;
	}

	/**
	 * @return the idEmployer
	 */
	public short getIdEmployer() {
		return idEmployer;
	}
	/**
	 * @param idEmployer the idEmployer to set
	 */
	public void setIdEmployer(short idEmployer) {
		this.idEmployer = idEmployer;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the telfNumber
	 */
	

	/**
	 * @return the ENTERPRISENAME
	 */
	public static String getENTERPRISENAME() {
		return ENTERPRISENAME;
	}
	/**
	 * @return the telfNumber
	 */
	public long getTelfNumber() {
		return telfNumber;
	}
	/**
	 * @param telfNumber the telfNumber to set
	 */
	public void setTelfNumber(long telfNumber) {
		this.telfNumber = telfNumber;
	}
	/**
	 * @return the numEmployers
	 */
	public static short getNumEmployers() {
		return numEmployers;
	}
	/**
	 * @param numEmployers the numEmployers to set
	 */
	public static void setNumEmployers(short numEmployers) {
		Developer.numEmployers = numEmployers;
	}
	
}
