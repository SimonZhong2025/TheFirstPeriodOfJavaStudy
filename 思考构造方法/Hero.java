package package2;

class Heroric {
	String name;

	void name() {
	}
}

public class Hero extends Heroric {
//有void和无void区别
	public void attack() {
		System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
	}

//为什么这里是Hero 而不是String，为什么下面是name而不是bh.name???
	
	public void attack(Hero h1) {
		System.out.println(name + "对" + h1.name + "进行了一次攻击 ");
	}

	public void attack(Hero h1, Hero h2) {
		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
	}

	public static void main(String[] args) {
		Hero bh = new Hero();
		bh.name = "赏金猎人";

		Hero h1 = new Hero();
		h1.name = "盖伦";
		Hero h2 = new Hero();
		h2.name = "提莫";

		bh.attack(h1);
		bh.attack(h1, h2);
	}

}

/*这里用到的是引用传递的方法，记住这个格式。引用传递可以引用到实例中的全部属性。这个比单纯的值传递的作用大一些，但各有好处，值得注意的是bh.attack。
 *也就是L18和L22的name是this.Hero.name也就是bh的name。所以输出结果就是“赏金猎人”
 *这里name传递过去是引用，而（String name）的值传递传递的是基本类型的值，性质是不一样的
 */

/*
