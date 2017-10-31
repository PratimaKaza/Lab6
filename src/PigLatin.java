import java.util.Scanner;

/***** authored by Pratima Kaza *******/
public class PigLatin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1.Prompt user for word
		System.out.println("Please enter the word you want translated into piglatin: ");
		String word = scan.nextLine();
		System.out.println(word);

		// 2.convert each word to lower case.

		System.out.println(word.toLowerCase());

		// 3. if word starts with vowel, then add "way", else move consonants to end and
		// then add "ay"
		int numLetters = 0;
		int place = -1;
		char letter;
		String vowel;
		String consonant;

		numLetters = word.length();
		for (int i = 0; i < numLetters; i++) {
			letter = word.charAt(i);
			if ((letter == 'a') || (letter == 'e') || (letter == 'i') || (letter == 'o') || (letter == 'u')) {
				System.out.println(word.substring(i) + "ay");
				
//				place = i;
//				System.out.println(place);
//				break;
			} else {
				System.out.println(word.substring(i) + word.substring(0,i) + "way");
			}
			
		}
		
//		switch (place) {
//		case 0: 
//			vowel = word.substring(place);
//			System.out.println(vowel + "ay");
//			break;
//		case 1:
//			vowel = word.substring(place);
//			consonant = word.substring(0, place);
//			System.out.println(vowel + consonant + "way");
//			break;
//		case 2:
//			vowel = word.substring(place);
//			consonant = word.substring(0, place);
//			System.out.println(vowel + consonant + "way");
//			break;
//		case 3:
//			vowel = word.substring(place);
//			consonant = word.substring(0, place);
//			System.out.println(vowel + consonant + "way");
//			break;
//		case 4:
//			vowel = word.substring(place);
//			consonant = word.substring(0, place);
//			System.out.println(vowel + consonant + "way");
//			break;
//		default:
//			System.out.println("there is no vowel");
//			break;
//		
//		}
		
//		if (place == 0) {
//			vowel = word.substring(place);
//			System.out.println(vowel + "ay");
//		} else if ((place != 0) || (place != -1)) {
//			vowel = word.substring(place);
//			consonant = word.substring(0, place);
//			System.out.println(vowel + consonant + "way");
//		} else {
//			System.out.println("There are no vowels in the word you have chosen.");
//		}

		// 4. ask user if wants to translate another word

		scan.close();
	}

}
