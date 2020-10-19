import java.util.Scanner;
public class UserValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scan=new Scanner(System.in);
		String input =scan.next();
		String regex="[a-zA-Z]+[0-9]";
		if(input.length()>9 && input.length()<=15) 
		
			if(input.matches(regex)) 
				System.out.println("Valid Username");
			
			else 
				System.out.println("Invalid Username");
			
		else 
			System.out.println("USERNAME MUST BE MIN 8  AND MAX 15");
		
		
	}

}
