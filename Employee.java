import java.util.Scanner;
class Employee{
	String Emp_name;
	int Emp_id;
	String Address;
	String Mail_id;
	int Mobile_no;
void display(){
	System.out.println(Emp_name);
	//Syetem.out.println(Address);
	System.out.println(Emp_id);
	System.out.println(Mail_id);
	System.out.println(Mobile_no);
	}
}
class Programmer extends Employee{  
 int BP; 

	/*int  DA= (int) (0.97*BP);
	 HRA=(int) (0.10*BP);
	 PF=(int) (0.12*BP);  */
void display(){
    	System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
	 System.out.println("SATFF CLUD FUND"+0.001*BP);
        
	}
} 
class Assistant_Professor extends Employee{  
 int BP; 

	void display(){
    	System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
   	 System.out.println("PF"+0.12*BP);
	 System.out.println("SATFF CLUD FUND"+0.001*BP);
        
}
} 
class Associate_Professor extends Employee{  
 int BP; 

	void display(){
    	System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
    	System.out.println("PF"+0.12*BP);
 	System.out.println("SATFF CLUD FUND"+0.001*BP);
        
	}
} 
class Professor extends Employee{  
 int BP; 

	void display(){
  	  System.out.println(BP);
	 System.out.println("DA"+0.97*BP);
	 System.out.println("HRA"+0.10*BP);
	    System.out.println("PF"+0.12*BP);
	 System.out.println("SATFF CLUD FUND"+0.001*BP);
        
	}
} 
public class Main{
	public static void main(String args[]){	
	System.out.println("\n1.Programmer\n2.Assistant_Professor\n3.Associate_Professor\n4.Professor");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int ch=input.nextInt();
	 switch (ch) {
       	  case 1:
           	   Employee e1=new Employee();
        	   Programmer p1=new Programmer();
       	  e1.Emp_name="RAVI";
        	  e1.Address="HYDERABAD";
       	  e1.Mail_id="ravi33003@gmail.com";
        	  e1.Emp_id=233;
         	  e1.Mobile_no=9385585;
        	  p1.BP=15000;
           	  p1.display();
            	  e1.display();
            	  break;
         case 2:
           Employee e2=new Employee();
           Assistant_Professor p2=new Assistant_Professor();
           e2.Emp_name="VIKRAM";
           e2.Address="MUMBAI";
           e2.Mail_id="vikram0777@gmail.com";
           e2.Emp_id=555;
           e2.Mobile_no=94488552;
           p2.BP=30000;
           p2.display();
              e2.display();
              break;
         case 3:
           Employee e3=new Employee();
           Associate_Professor p3=new Associate_Professor();
           e3.Emp_name="TEJA";
           e3.Address="KOLKATA";
           e3.Mail_id="tej&$#968@gmail.com";
           e3.Emp_id=498;
           e3.Mobile_no=95433;
           p3.BP=30000;
           p3.display();
              e3.display();
              break;
         case 4:
           Employee e4=new Employee();
           Professor p4=new Professor();
           e4.Emp_name="SUMANTH";
           e4.Address="VIZAG";
           e4.Mail_id="sumanth%*599@gmail.com";
           e4.Emp_id=578;
           e4.Mobile_no=9547851;
           p4.BP=30000;
           p4.display();
              e4.display();
              break;
         case 5:
           //exit(1);
         
         default: 
          System.out.println("enter correct choice");
   
      } 
}
}