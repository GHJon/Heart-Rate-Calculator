import java.util.GregorianCalendar;

public class HeartRates {
	private String firstName;
	private String lastName;
	private int YOB; // Year of Birth
	
	public HeartRates(String firstName, String lastName, int YOB) { //Constructor
		this.firstName = firstName;
		this.lastName = lastName;
		this.YOB = YOB;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLirstName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setYOB(int YOB) {
		this.YOB = YOB;
	}
	public int getYOB() {
		return YOB;
	}
	
	public int getAge() {
		int currYear = new GregorianCalendar().get(GregorianCalendar.YEAR);
		int age = currYear - YOB; 
		return age;
	}
	
	public int maxHeartRate() {
		int maxHR = 220 - getAge();
		return maxHR;
	}
	
	public void targetHR() {
		int maxHR = maxHeartRate();
		double lowHR = 0.5 * maxHR;
		double highHR = 0.85 * maxHR;
		System.out.printf("Target heart rate range: %.0f%s%.0f", lowHR, " - ", highHR);
	}
}
