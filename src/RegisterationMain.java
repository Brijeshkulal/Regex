import java.util.Scanner;

public class RegisterationMain {
	
	public static void main(String[] args) {
		UserRegisteration ur = new UserRegisteration();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name: ");
		String fName = sc.next();
		ur.firstName(fName);
		
		System.out.println("Enter the Last name: ");
		String lName = sc.next();
		ur.lastName(lName);
		
		System.out.println("Enter the Email: ");
		String mailId = sc.next();
		ur.emailId(mailId);
		
		System.out.println("Enter the Mobile Number: ");
		String mobileNumber = sc.next();
		ur.phoneNumber(mobileNumber);
		
		System.out.println("Enter the Password: ");
		String password = sc.next();
		ur.password(password);
	}

}
