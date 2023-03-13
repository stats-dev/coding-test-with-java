import java.io.IOException;


public class switch_case_condition {

	public static void main(String[] args) throws IOException {

		System.out.print("A,B,C 중 하나를 입력하세요.: ");
		
		char inputCh = (char)System.in.read();
		
		int inputNum;
		
		switch(inputCh) {

//		A,B,C 중 하나를 입력하세요.: D
//		D
//		4
//		
		case 'A':
			inputNum = 1;
			System.out.println(inputCh);
			System.out.println(inputNum);
			break;
			
		case 'B':
			inputNum = 2;
			System.out.println(inputCh);
			System.out.println(inputNum);
			break;
			
		case 'C':
			inputNum = 3;
			System.out.println(inputCh);
			System.out.println(inputNum);
			break;
			
		case 'D':
			inputNum = 4;
			System.out.println(inputCh);
			System.out.println(inputNum);
			break;
			

		default:
			System.out.println("잘못된 입력입니다. 다시 확인 부탁드립니다.");
			System.out.println(inputCh);
			break;
			
			
		}
		
		
		
	}

}
