
public class java_type_castings {

	public static void main(String[] args) {

		long longVal = 327701L;
		int intVal = (int)longVal;
		
		System.out.println("명시적인 형변환: ");
		System.out.println(intVal);
		System.out.println(longVal);
		
//		명시적인 형변환: 
//			327701
//			327701
		
		System.out.println("묵시적인 형변환: ");
		char chVal = 'A';
		int intVal2 = chVal;
		
		double dPie = 3.1415;
		int iNum = 13;
		
		System.out.println("묵시적인 형변환 chVal = " + chVal);
		System.out.println("명시적인 형변환 (int)chVal = " + (int)chVal);
		System.out.println("묵시적인 형변환 dPie+iNum = " + (dPie+iNum));

//		묵시적인 형변환: 
//			묵시적인 형변환 chVal = A
//			명시적인 형변환 (int)chVal = 65
//			묵시적인 형변환 dPie+iNum = 16.1415


		System.out.println("문자열 결합시 형변환: ");
		int dates = 20230313;
		String str = "java";
		System.out.println("dates = " + dates);
		System.out.println("str = " + str);
		System.out.println("str + dates=" + str + dates);
		
//		문자열 결합시 형변환: 
//			dates = 20230313
//			str = java
//			str + dates=java20230313

		
	}

}
