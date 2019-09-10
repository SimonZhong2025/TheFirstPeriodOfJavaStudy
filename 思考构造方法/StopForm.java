package javaTest1;

import static java.lang.System.out;

class Family { // 创建类
	static private String surname = "王"; // 类静态变量
	private String givename; // 私有变量

	static String getSurname() { // 类静态方法
		return surname;
	}

	static void changeSurname(String surname) { // 类静态方法,因为上面类静态变量已经定义了王，所以要这样做才能改变王
		Family.surname = surname; // 只能使用带类名的限定名
	}

	Family(String givename) { // 带参数的构造方法,而且使用default，会保留封装
		this.givename = givename; // 对象变量，可以使用关键字this
	}

	Family() { // 不带参数的构造方法
		this.givename = "小二";
	}

	public String name() {
		return (surname + givename); // 使用简单名称来引用类变量返回surname和givename还给第三十六行调用
	}
}

public class StopForm {
	public static void main(String[] args) {
		// 1和2是同样的结果而不同的实现语法而已
		out.println("1" + Family.getSurname());// 类方法调用getSurname方法
		Family a = new Family(); // 声明并创建对象
		out.println("2" + a.getSurname()); // 类对象调用
		out.println("3" + a.name()); // 类对象调用name方法
		Family b = new Family("小刚"); // 调用第十三行
		Family.changeSurname("张");
		out.println("4" + b.getSurname());
		out.println("5" + b.name());
	}
}
