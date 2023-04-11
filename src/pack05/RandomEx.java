package pack05;

// 주사위는 눈의 수(1~6)는 이것이다. 10번던져서
/*
 * 1의 눈이 나오면 500원
 * 2의 눈이 나오면 1000원
 * 3의 눈이 나오면 1500원
 * 4의 눈이 나오면 2000원
 * 5의 눈이 나오면 2500원
 * 6의 눈이 나오면 3000원
 * 전체 금액은 얼마인가?
 */
public class RandomEx {

	public static void main(String[] args) {
		int balance = 0;
		int rn; // random number
		for (int i = 0; i < 10; i++) {
			rn = (int) (Math.random() * 6 + 1);
			System.out.print(rn + " ");
			balance += rn * 500;
		}
		System.out.println();
		System.out.println("you get " + balance);

//		내가 짠 코드
//		int total = 0;
//		for (int i = 0; i < 10; i++) {
//			int a = (int) (Math.random() * 6 + 1);
//			System.out.print(a + " ");
//			switch (a) {
//			case 1:
//				total += 500;
//			case 2:
//				total += 1000;
//			case 3:
//				total += 1500;
//			case 4:
//				total += 2000;
//			case 5:
//				total += 2500;
//			case 6:
//				total += 3000;
//			}
//		}
//		System.out.println();
//		System.out.println("you get " + total + " coin!!");
	}

}
