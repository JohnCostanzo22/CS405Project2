package edu.albany.hw2.morse;

import java.util.HashMap;

public class MorseCodeTranslator {

	//I choose to use a hashmap to store the morse code encoding table because a hashmap
	//is very fast for searching and works very well using the characters as keys and
	//the morse code for each character as the values.
	
	private HashMap<String, String> morseCodeHashMap = new HashMap<String, String>();
	
	public MorseCodeTranslator() {
		//now add all values to the hashmap
		morseCodeHashMap.put(" ", " ");
		morseCodeHashMap.put(",","--..--");
		morseCodeHashMap.put(".", ".-.-.-");
		morseCodeHashMap.put("?", "..--..");
		//numbers
		morseCodeHashMap.put("0", "-----");
		morseCodeHashMap.put("1", ".----");
		morseCodeHashMap.put("2", "..---");
		morseCodeHashMap.put("3", "...--");
		morseCodeHashMap.put("4", "....-");
		morseCodeHashMap.put("5", ".....");
		morseCodeHashMap.put("6", "-....");
		morseCodeHashMap.put("7", "--...");
		morseCodeHashMap.put("8", "---..");
		morseCodeHashMap.put("9", "----.");
		//letters
		morseCodeHashMap.put("A", ".-");
		morseCodeHashMap.put("B", "-...");
		morseCodeHashMap.put("C", "-.-.");
		morseCodeHashMap.put("D", "-..");
		morseCodeHashMap.put("E", ".");
		morseCodeHashMap.put("F", "..-.");
		morseCodeHashMap.put("G", "--.");
		morseCodeHashMap.put("H", "....");
		morseCodeHashMap.put("I", "..");
		morseCodeHashMap.put("J", ".---");
		morseCodeHashMap.put("K", "-.-");
		morseCodeHashMap.put("L", ".-..");
		morseCodeHashMap.put("M", "--");
		morseCodeHashMap.put("N", "-.");
		morseCodeHashMap.put("O", "---");
		morseCodeHashMap.put("P", ".--.");
		morseCodeHashMap.put("Q", "--.-");
		morseCodeHashMap.put("R", ".-.");
		morseCodeHashMap.put("S", "...");
		morseCodeHashMap.put("T", "-");
		morseCodeHashMap.put("U", "..-");
		morseCodeHashMap.put("V", "...-");
		morseCodeHashMap.put("W", ".--");
		morseCodeHashMap.put("X", "-..-");
		morseCodeHashMap.put("Y", "-.--");
		morseCodeHashMap.put("Z", "--..");
	}
	
	
	//use.toUpperCase() when converting
	//remeber to check for null
	public String translate(String input){
		if(input != null) {
			StringBuffer outputStringBuffer = new StringBuffer();
	
			//get each character and convert it to morse code then add to buffer
			for(int i = 0; i < input.length(); i++) {
				if(morseCodeHashMap.get(Character.toString(input.charAt(i)).toUpperCase()) == null) {
					System.out.println("Invalid input char: " + input.charAt(i));
				} else {
					outputStringBuffer.append(morseCodeHashMap.get(Character.toString(input.charAt(i)).toUpperCase()));
				}
			}
			return outputStringBuffer.toString();
		} else {
			return "Cannot Translate null String";
		}
	}
}