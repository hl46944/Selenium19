package week1.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		for(int i=0;i<test.length();i++) {
			if(test % 2 != 0){
		         return ch.toUpperCase();
		      }
			else{
		         return ch.toLowerCase();
	}

		}
		

	}

}
