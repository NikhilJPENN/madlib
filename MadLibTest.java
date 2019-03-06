//Name: JAMDADE NIKHIL KAILAS    PENN ID: 56849791
package madlib;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;



class MadLibTest {
    
	MadLib obj= new MadLib();
	ArrayList<String> Values1 =
		    new ArrayList<String>(Arrays.asList("I am [name]","I am very [adjective] Person","I study at Upenn in [name of program] program","I have [number] jackets and [large number] shoes"));
	ArrayList<String> Values2 =
		    	    new ArrayList<String>(Arrays.asList("First thing [first]"));
	MadLib obj2= new MadLib();
	
	
	
	@Test
	void testGet() {
		String test;
		obj2.add("First thing [first]");
		test=obj2.get(0);
		assertEquals(test,"First thing [first]");
		
	}

	@Test
	void testReadFile() {
		obj.readFile("testfile.txt");
		assertArrayEquals(obj,Values1);
		}

	@Test
	void testPlay() {
		
		
	}


	private void assertArrayEquals(MadLib obj3, ArrayList<String> values12) {
		
		
	}

	
}
