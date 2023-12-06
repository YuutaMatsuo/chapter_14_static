package classroom_2nd;

public class Seito_2nd {
	String name; // 名前
	int number; // 出席番号
	static int classRoom = 2; // 教室名（第2教室）
	static int seitoTotal = 0; // 生徒の人数

	// コンストラクタ
	public Seito_2nd(String name) {
		this.name = name;
		this.number = this.numbering();
	}

	// 出席番号を決めるメソッド
	public int numbering() {
		return ++seitoTotal;
	}
	
	// static メソッドに対してインスタンス変数を引数に渡す
	public void seitoTotalPrint() {
		seitoTotalPrint(this.name);
	}
	// 生徒数を出力するメソッド
	public static void seitoTotalPrint(String name) {
		System.out.println("名前：" + name);
		System.out.println("現在の生徒の数は" + Seito_2nd.seitoTotal + "人");
		System.out.println(Seito_2nd.classRoom);
	}
	
	public static void test(String name) {
		System.out.println(name);
	}
	
}
