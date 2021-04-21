package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=135;
		int orig=input;
		int sum=0;
		int rem;
		while(input>0)
		{
			rem=input%10;
			System.out.println(rem);
			sum= sum+(rem*rem*rem);
			System.out.println(sum);
			input=input/10;
			System.out.println(input);
			
			
		}
		
if(sum==orig)
{
	System.out.println("Amstrong Number");	
	}
else {
	System.out.println("Not a Amstrong Number");
}
}
}
