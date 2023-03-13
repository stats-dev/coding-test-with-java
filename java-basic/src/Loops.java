
public class Loops {

	public static void main(String [] args) {
		
		// 1부터 10까지 합을 구해본다.
		// for loop
		int sum = 0;
		int i;
		
		// for loop는 초기화식 조건식 for문에 대한 증감식으로 구성
		for(i=1;i<=10;i++) {
			
			sum += i;
			System.out.println("i의 값 : " + i);
		}
		
		System.out.println("마지막 i의 값 : " + i);
		System.out.println("1부터 10까지의 합 : " + sum);

//		마지막 i의 값 : 11
//		1부터 10까지의 합 : 55
		
	}
	
	
}
