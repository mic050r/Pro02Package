package pack05;

public class MathEx {

	public static void main(String[] args) {
		double a = 34.567;
		System.out.println(Math.PI);
		System.out.println(Math.ceil(a)); // 올림
		System.out.println(Math.floor(a)); // 내림
		System.out.println(Math.sqrt(9)); // 루트(제곱급)
		System.out.println(Math.exp(2)); // e(자연대수라고 하는데 2.718282)의 2승
		System.out.println(Math.round(3.14));

		// [1,45] 사이의 정수형 난수 발생
		System.out.println("today lucky numbers : ");
		for (int i = 0; i < 5; i++) {
			System.out.print((int) (Math.random() * 45 + 1) + " ");
		}
	}

}
