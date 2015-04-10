import java.util.Scanner;
public class MyStackTest {

	public static void main(String[] args) {
		MyStack<String> myStrings = new MyStack<String>(); 
		Scanner input = new Scanner(System.in);
		System.out.println("Please input five Strings: ");
		//Push five Strings
		for(int element=0; element<5; element++){
			String member = input.nextLine();
			myStrings.push(member);
		}
		
		System.out.println(myStrings.reverse(myStrings).toString());
		input.close(); // Close input
	}

}
