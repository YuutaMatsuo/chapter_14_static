package classroom_2nd;

public class Main {
	public static void main(String[] args) {
		Seito_2nd seito01 = new Seito_2nd("山田太郎");
		System.out.println("氏名：" + seito01.name);
		System.out.println("出席番号：" + seito01.number);
		System.out.println("第" + Seito_2nd.classRoom + "教室");
		seito01.seitoTotalPrint();
		System.out.println();

		Seito_2nd seito02 = new Seito_2nd("山田花子");
		System.out.println("氏名：" + seito02.name);
		System.out.println("出席番号：" + seito02.number);
		System.out.println("第" + Seito_2nd.classRoom + "教室");
		seito02.seitoTotalPrint();
		
		System.out.println(Seito_2nd.classRoom);//静的フィールドへのアクセス
//		System.out.println(Seito_2nd.name);//インスタンスフィールドへのアクセス
		System.out.println(seito01.classRoom);//静的フィールドへのアクセス
	}
}
