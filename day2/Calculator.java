package week1.day2;

public class Calculator{
	public int add(int n1,int n2)
	{
	
	int result =n1+n2;
	return result;
	}
	public double sub(double n1,double n2)
	{
	
		double result =n1-n2;
	return result;
	}
	
	public double mul(double n1,double n2)
	{
	
		double result =n1*n2;
	return result;
	}
	public int div(int n1,int n2)
	{
	
		int result =n1/n2;
	return result;
	}
	
     
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		int add=cal.add(10,20);
		System.out.println(add);
		double sub=cal.sub(30.20, 20.10);
		System.out.println(sub);
		double mul=cal.mul(25, 25);
		System.out.println(mul);
		int div=cal.div(25,5);
		System.out.println(div);
	}
		

	}


