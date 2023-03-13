import java.io.IOException;
import java.util.Scanner;


public class ifelse_condition {

	public static void main(String[] args) throws IOException {
	
		System.out.println("성적을 입력해주세요: ");
		Scanner in = new Scanner(System.in);
		
		int score = in.nextInt();
		
		if(score >= 90)
			System.out.println(score + " A학점입니다.");
		else if(score >=80)
			System.out.println(score + " B학점입니다.");
		else if(score >= 70)
			System.out.println(score + " C학점입니다.");
		else
			System.out.println(score + " D학점입니다.");
		
		
		
	}
	
	
}
