package package2;

import static java.lang.System.*;

class Shape1{
	public String nameString = "Shape";
	
	public void getString() {
		out.println("This is Shape1");
	}
	
	public static void goString() {
		out.println("This is Shape2");
	}
}

class Circle10 extends Shape1{
	public String nameString = "Circle";
	
	public void getString() {//¸²¸Ç
		out.println("This is Circle1");
	}
	
	public static void goString() {//Òþ²Ø
		out.println("This is Circle2");
	}
}

public class FieldHiding {
	public static void main(String[] args) {
		
		Circle10 a = new Circle10();
		Shape1 b = new Circle10();
		
		out.println(a.nameString);
		a.getString();
		a.goString();
		
		out.println(b.nameString);
		b.getString();
		b.goString();
	}
}
