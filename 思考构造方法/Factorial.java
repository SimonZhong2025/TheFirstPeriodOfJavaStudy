package package2;

public class Factorial {

	static int factorial(int a) { // 类方法可以直接调用，本句中省略了修饰符，以及第一个int代表返回值类型是整型
		if (a == 1) {
			return a = 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <= 8; i++) {
			result = factorial(i);

			System.out.printf("%2d!=%1d\n", i, result);
		}
	}
}
