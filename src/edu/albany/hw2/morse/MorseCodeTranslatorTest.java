package edu.albany.hw2.morse;

import java.util.Scanner;

/*
 * Test class for MorseCodeTranslator. Accepts user input through command line argument or through prompts.
 * Then translates the input to morse code
 */
public class MorseCodeTranslatorTest {

	public static void main(String[] args) {
		
		MorseCodeTranslator translator = new MorseCodeTranslator();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		String input;
		
		//if there are command line arguments then take care of those first
		if(args.length != 0) {
			for(String string: args) {
				printArgMorseCode(translator.translate(string));
				printArgMorseCode(translator.translate(" "));
			}
			System.out.println();
		}
		
		//until user types /exit contiune to prompt and translate
		while(!exit) {
			System.out.print("Type in a String or type \"/exit\" to exit: ");
			input = scanner.nextLine();
			if(input.equalsIgnoreCase("/exit")) {
				exit = true;
				scanner.close();
			} else {
				printMorseCode(translator.translate(input));
			}
		}
	}
	
	public static void printArgMorseCode(String morseCode) {
		System.out.print(morseCode);
	}
	
	public static void printMorseCode(String morseCode) {
		System.out.println(morseCode);
	}

}
