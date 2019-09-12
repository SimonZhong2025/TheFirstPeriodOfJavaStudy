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
		
		/* 本类引用指向本类无可厚非，引用的属性和方法都是本类的，无论是覆盖还是隐藏。
		 * 对于父类中定义的方法，如果子类中重写了该方法，那么父类类型的引用将会调用子类中的这个方法，这就是动态连接。
		 * 但是父类引用指向子类就不同了。引用的属性和静态方法属于父类，其他属于子类
		 * 用处暂时不清楚，但是知道有这个东西，而且由此还引出了 引用强制转换 的概念
		 */
		
		Circle10 a = new Circle10();// 本类引用指向本类
		Shape1 b = new Circle10();// 父类引用指向子类
		Shape1 f1 = (Shape1)b;
		f1.goString();// 得到结果是This is Shape，其原理和用法还待探究
		
		out.println(a.nameString);
		a.getString();
		a.goString();
		
		out.println(b.nameString);
		b.getString();
		b.goString();
	}
}
