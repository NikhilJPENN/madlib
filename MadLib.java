// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package madlib;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MadLib {

	List<String> contents;

	public MadLib() {
		contents = new ArrayList<String>();
	}

	void add(String thing) {
		contents.add(thing);
	}

	String get(int index) {
		return contents.get(index);
	}

	
	void readFile(String Text) {

		try {

			FileReader filereader1 = new FileReader(Text);
			BufferedReader bufferedReader1 = new BufferedReader(filereader1);
			String line = bufferedReader1.readLine();
			while (line != null) {
				add(line);
				line = bufferedReader1.readLine();
			}
			bufferedReader1.close();

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void play() {

		StringBuilder sb = new StringBuilder();
		String arrayLine;
		// String modifiedLine = null;
		String newWord = null;

		int startPosition = 0;
		int endPosition = 0;
		int j = 0;
		boolean flag = false;
		int length = 0;

		System.out.println("Fill in the blanks to get an exciting story!");

		for (int i = 0; i < contents.size(); i++) {
			arrayLine = contents.get(i);
			j = 0;

			length = arrayLine.length();

			while (j < arrayLine.length()) {

				char charInline = arrayLine.charAt(j);
				if (charInline == '[') {
					startPosition = j;
				} else if (charInline == ']') {
					endPosition = j;
					String word = arrayLine.substring(startPosition + 1, endPosition);
					newWord = ask(word);
					arrayLine = arrayLine.substring(0, startPosition) + newWord
							+ arrayLine.substring(endPosition + 1, length);
				}

				j = j + 1;
			}

			contents.set(i, arrayLine);
		}

		/*
		 * System.out.println("\n\n" + "**Your Story!!**\n"); for (int i = 0; i <
		 * contents.size(); i++) { System.out.println(get(i)); }
		 */

	}

	void printMystory() {

		System.out.println("\n\n" + "**Your Story!!**\n");
		for (int i = 0; i < contents.size(); i++) {
			System.out.println(get(i));
		}

	}

	String ask(String typeOfword) {

		Scanner sc = new Scanner(System.in);
		String vowel = "aeiouAEIOU";
		char ch = typeOfword.charAt(0);
		if ((vowel.indexOf(ch) == -1)) {

			System.out.println("Enter" + " " + "a" + " " + typeOfword);

		} else {

			System.out.println("Enter" + " " + "an" + " " + typeOfword);
		}

		String userWord = (sc.nextLine());

		return userWord;
	}
	
	
}
