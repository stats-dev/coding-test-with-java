import java.io.IOException;




public class condition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("영문자 대소문자 판단 프로그램입니다.");
		System.out.print("영문자 하나 입력 : ");
		int asciiCode = System.in.read(); // 괄호 안에 값을 입력받는 메서드
		
		
		System.out.println(
		
				(asciiCode >= 65 && asciiCode < 65+26 )? (asciiCode + " 대문자입니다.") :
					(asciiCode >= 97 && asciiCode < 97+26)? (asciiCode + " 소문자입니다.") :
						"옳바르게 다시 입력해주세요!"
					
				);
		
//		영문자 대소문자 판단 프로그램입니다.
//		영문자 하나 입력 : F
//		70 대문자입니다.
	}

}
