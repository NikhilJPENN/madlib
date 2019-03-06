// Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package madlib;

import java.io.*;

public class mainMadlib {

	public static void main(String[] args) {

		MadLib obj = new MadLib();

		obj.readFile("story.txt");
		obj.play();
		obj.printMystory();
	}

}
