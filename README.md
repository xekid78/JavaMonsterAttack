# JavaMonsterAttack
クラスを使ってのモンスター攻撃表現

## 処理
Enemyクラスを作って攻撃してきたと表示する。

## コード
```
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
```

## 出力結果  
```
モンスターが攻撃してきた。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
