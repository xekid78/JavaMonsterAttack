/**
 *
 * @author xekid78
 *
 */
public class Attack {

	public static void main(String[] args) {
		Enemy enemy = new Enemy("モンスター");
		enemy.Attack();

	}

}

class Enemy {
	private String MyName;

	public Enemy(String name) {
		MyName = name;
	}

	public void Attack() {
		System.out.println(MyName + "が攻撃してきた。");
	}

}
