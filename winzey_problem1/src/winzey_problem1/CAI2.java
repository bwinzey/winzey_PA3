package winzey_problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

import javax.swing.Spring;

public class CAI2 {
	public static void main(String[] args) {quiz();}
	public static void quiz() {
		Random rand = new SecureRandom();
		
		int n1 = rand.nextInt(10);
		int n2 = rand.nextInt(10);
		int randomN=rand.nextInt(4);
		String realAnswer=""+n1*n2;
		String question="How much is "+n1+" times "+n2+"?";
		askQuestion(question);
		String response=readResponse();
		boolean correct=isAnswerCorrect(realAnswer,response);
		while(!correct) {
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
			randomN=rand.nextInt(4);
			response=readResponse();
			correct=isAnswerCorrect(realAnswer,response);
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
			System.exit(1);
		
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
