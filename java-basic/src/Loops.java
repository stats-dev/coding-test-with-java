
public class Loops {

	public static void main(String [] args) {
		
		// 1부터 10까지 합을 구해본다.
		// for loop
		int sum1 = 0; int sum2 = 0;
		int i; 
		int j=1;
		
		// for loop는 초기화식 조건식 for문에 대한 증감식으로 구성
		for(i=1;i<=10;i++) {
			
			sum1 += i;
//			System.out.println("i의 값 : " + i);
		}
		
		System.out.println("마지막 i의 값 : " + i);
		System.out.println("1부터 10까지의 합 : " + sum1);

//		마지막 i의 값 : 11
//		1부터 10까지의 합 : 55
		
		// while loop로도 가능할까?
		
		while (j<=10) {
			
			sum2 += j;
			j++; // ++j, j++ 여기선 차이가 없다.
		}
		
		System.out.println("마지막 j의 값 : " + j);
		System.out.println("1부터 10까지의 합 : " + sum2);

		
		// switch 이거는 조금 비효율적으로 생각되어 제작하지 않는다.
		
	}
	
	
	
	
}
