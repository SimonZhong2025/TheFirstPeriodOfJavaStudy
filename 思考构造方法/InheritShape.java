package package2;

class Shape {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// public Shape(){}是不需要的，只需要访问x和y，而不需要调用到方法

	public int getx() {//因为是调用，还需要引用，所以需要返回int整型，还需要return，这和构造方法不同
		return x;
	}

	public int gety() {
		return y;
	}
}

public class InheritShape extends Shape {
	void test() {
		set(10, 20);
		System.out.printf("x=%d y=%d", getx(), gety());
	}

	public static void main(String[] args) {
		InheritShape a = new InheritShape();
		a.test();
	}
}
