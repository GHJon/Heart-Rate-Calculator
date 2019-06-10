import java.util.Scanner;

public class TestHeartRates {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Person's First Name: ");
		String firstName = input.next();
		
		System.out.printf("Person's Last Name: ");
		String lastName = input.next();
		
		System.out.printf("Person's Year of Birth: ");
		int YOB = input.nextInt();
		
		input.close(); //Closes input instance from taking any new input
		
		//HR instance provides access to functions of person
		HeartRates HR = new HeartRates(firstName, lastName, YOB);
		
		System.out.printf("%nFirst Name: %s%n%s%s%n%s%d%n%s%d%n", HR.getFirstName(),"Last Name: ", HR.getLastName(), 
						  "Age: ", HR.getAge(), "Maximum Heart Rate: ", HR.maxHeartRate());
		
		//targetHR function prints HR range 
		HR.targetHR();
		
		HR = null;  //Deletes object instance 
	}

}
