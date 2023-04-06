package pack05;

public class AutoBoxingUnboxingEx {
	public static void main(String args[]) {
		int n = 10; // 기본형 정수
		Integer inObject = n; // inObject 객체 변수에 n값을 저장하면 ---자동 박싱이 됨
		System.out.println("intObject = " + inObject);

		int m = inObject + 10; // 객체변수 + 기본정수값 ---> 기본형
		System.out.println("m = " + m);
	}
}
