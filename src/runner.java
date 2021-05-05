import java.util.*;
public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello adventurer may i ask your name ?");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		var new_name = input.next();
		System.out.println("hello " + new_name + " you have embarked on a new adventure good luck!");
		adventure adventure = new adventure();
		adventure.adventures();
		//adventure done
		System.out.println("well done " + new_name + " I do hope you learnt of heroics and what people are capable of");
	}
	
	}
	
