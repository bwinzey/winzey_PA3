package winzey_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

import javax.swing.Spring;

public class CAI4 {
	public static void main(String[] args) {
		
		
		boolean agree=true;
		while (agree) {
			System.out.println("Enter a difficulty level bewteen 1-4");
		String difficulty=readResponse();
		while(!difficulty.equals("1")&&!difficulty.equals("2")&&!difficulty.equals("3")&&!difficulty.equals("4")) {
			System.out.println("Enter a difficulty level bewteen 1-4");
			difficulty=readResponse();
		}
		int sum=0;
		for(int i=0;i<10;i++) sum=sum+quiz(difficulty);
		System.out.println("You scored a "+(sum*10)+"%");
		if(sum<8) System.out.println("Please ask your teacher for extra help.");
		else System.out.println("Congratulations, you are ready to go to the next level!");
		System.out.println("Do you want to solve a new problem set? Y/N");
		String r=readResponse();
		while(!r.equals("Y")&&!r.equals("N")) {
			System.out.println("Please enter a valid response (Y/N)");
			r=readResponse();
		}
		if (r.equals("Y")) agree=true;
		else agree=false;
		}
		System.exit(0);
		}
	public static int quiz(String diff) {
		Random rand = new SecureRandom();
		int n1 = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		switch(diff) {
		case "1":
			n1 = rand.nextInt(10);
			n2 = rand.nextInt(10);
			break;
		case "2":
			n1 = rand.nextInt(100);
			n2 = rand.nextInt(100);
			break;
		case "3":
			n1 = rand.nextInt(1000);
			n2 = rand.nextInt(1000);
			break;
		case "4":
			n1 = rand.nextInt(10000);
			n2 = rand.nextInt(10000);
			break;
		}
		
		int randomN=rand.nextInt(4);
		String realAnswer=""+n1*n2;
		String question="How much is "+n1+" times "+n2+"?";
		askQuestion(question);
		String response=readResponse();
		boolean correct=isAnswerCorrect(realAnswer,response);
		if(!correct) {
			switch(randomN) {
			case 0:
				System.out.println("No. Please try again");
				break;
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
			case 2:
				System.out.println("Don't give up!");
				break;
			case 3:
				System.out.println("No. Keep trying.");
				break;
			}
			return 0;
		}
		switch(randomN) {
		case 0:
			System.out.println("Very good!");
			break;
		case 1:
			System.out.println("Excellent!");
			break;
		case 2:
			System.out.println("Nice work!");
			break;
		case 3:
			System.out.println("Keep up the good work!");
			break;
		}
			displayCorrectResponse(realAnswer);
			return 1;
		
	}
	public static void askQuestion(String s) {
		System.out.println(s);
		
	}
	public static String readResponse() {
		Scanner in=new Scanner(System.in);
		return in.nextLine();
	}
	public static boolean isAnswerCorrect(String real,String ans) {
		if(ans.equals(real))return true;
		return false;
	}
	public static void displayCorrectResponse(String real) {
		System.out.println("The correct answer is "+real);
	}
	public void displayIncorrectResponse(String answer) {
		System.out.println("You incorrectly answered "+answer);
	}

}
