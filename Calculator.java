public class Calculator {
/*
 * ClassName - TheDarkNignt
 * methodName - theDarkNight
 * method having same name like ClassName is called constructor
 */
	public Calculator() {
		System.out.println("calling by default constructor");
	}
	
	public void add() {
		// TODO Auto-generated method stub
		int x=10;
		int y= 20;
		int c=x+y;
		System.out.println("adding 2 numbers" + c);
	}
	public void sub() {
		// TODO Auto-generated method stub
		int x1=10;
		int y1= 20;
		int c1=x1-y1;
		System.out.println("substraction 2 numbers" + c1);
	}
	public void mult() {
		// TODO Auto-generated method stub
		int x2=10;
		int y2= 20;
		int c2=x2*y2;
		System.out.println("multiplication 2 numbers" + c2);
	}
	public void div() {
		// TODO Auto-generated method stub
		int x3=10;
		int y3= 20;
		int c3=x3/y3;
		System.out.println("divison 2 numbers" + c3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator obj = new Calculator();
		obj.add();
		obj.sub();
		obj.mult();
		obj.div();
		// not a good approach as it calls constructor every time ,if we want to call 100 of methods then 100 of constructor will be call 
		/* new Calculator().add();
		 * new Calculator().sub();
		 * new Calculator().mult();
		 * new Calculator().div();
		 */
		
	}

}
