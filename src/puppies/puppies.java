package puppies;

import java.util.Scanner;

public class puppies {
	
	int puppyAge;
	String puppySize;
		
	public puppies(String name) {
	}	
	public void setAge (int age) {
		puppyAge = age;
	}
	public int getAge() {
		return puppyAge;
	}
	public void setSize (String size) {
		puppySize = size;
	}
	public String getSize() {
		return puppySize;
	}
	
	public static void main(String[] args) {
		
		puppies myPuppy = new puppies ( "Sigma" );
		puppies myPuppy1 = new puppies ( "Luna" );
		puppies myPuppy2 = new puppies ( "Max" );
		
		myPuppy.setAge(4);
		myPuppy1.setAge(2);
		myPuppy2.setAge(1);
		
		myPuppy.setSize("small");
		myPuppy1.setSize("medium");
		myPuppy2.setSize("large");
				
		Scanner scanner = new Scanner(System.in);
		
		// question
				System.out.print("Tell me your dog's name.");
				System.out.print("\n");
				
		// answer
				String name= scanner.next();
					if (name.equals("Sigma")) {
						System.out.print("Your dog is: " + myPuppy.getAge() + " years old and its size is " + myPuppy.getSize() );
						System.out.print("\n"); 
						
					} else if (name.equals("Luna")) {
							System.out.print("Your dog is: " + myPuppy1.getAge() + " years old and its size is " + myPuppy1.getSize() );
							System.out.print("\n");				
							
					} else if (name.equals("Max")) {
						System.out.print("Your dog is: " + myPuppy2.getAge() + " years old and its size is " + myPuppy2.getSize() );
						System.out.print("\n");		
						
					} else {System.out.print("Your dog is not in our database");
						
						System.out.print("\n");
					}
		
		scanner.close();
					
		
	}

}
