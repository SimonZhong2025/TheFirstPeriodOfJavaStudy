package package2;

import static java.lang.System.out;

interface Circle1 {
	public static final double radius = 5.0;

	public double area();
}

interface Circle2 extends Circle1 {
	public double height = 10.0;

	public double volume();

	public double faceArea();
}

class Circle {
	// 用static void 和不用static的区别，调用static会造成空间浪费？
	/* 暂时觉得，应该是show方法不涉及这个实例的状态，所以要用static，又因为下面已经是继承关系，所以调用Show类的时候只需要用Show()
	 * 就可以了。
	 * 然后的话有static就可以子类隐藏而不是子类覆盖。
	 */
	
 	public static void Show() {
		out.print("欢迎宁");
	}
}

public class Cylinder extends Circle implements Circle2 {
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double faceArea() {
		// 直接用area()是因为上面有return值，所以才用area()?
		// 就是直接调用area方法，那你不用()干嘛
		
		return Math.PI * 2 * radius * height + area() * 2;
	}

	public double volume() {
		return height * Math.PI * Math.pow(radius, 5);
	}

	public static void main(String[] args) {
		Cylinder aCylinder = new Cylinder();
		out.printf("底面面积是%1.5f\n", aCylinder.area());
		out.printf("表面积是%1.5f\n", aCylinder.faceArea());
		out.printf("体积是%1.5f\n", aCylinder.volume());
		Show();
	}
}
