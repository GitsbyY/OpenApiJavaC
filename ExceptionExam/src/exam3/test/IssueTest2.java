package exam3.test;
<<<<<<< HEAD
import java.util.Scanner;

public class IssueTest2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);

      String inputStr = "";
      
      do {
    	  
    	  System.out.println("음 일단 숫자만 입력 해 볼래?");
    	  
    	  inputStr = sc.nextLine();
    	  
    	  if(inputStr.equals("100")) {
    		  System.out.println("100이라는 글자면 다시");
    		  continue;
    	  }
    	  if(inputStr.equals("-999")) {
    		  System.out.println("치트키 활성");
    		  break;
    	  }
         
      } while (true); // 무한반복문
      System.out.println("게임 종료");
   }

}
=======

import java.util.Scanner;

public class IssueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String inputStr = "";
		
		do {

			System.out.println("음 일단 글자만 입력해볼래?");
			
			inputStr = sc.nextLine();
			
			
			
		} while (true); // 무한반복문
		
	}

}
>>>>>>> branch 'main' of https://github.com/GitsbyY/OpenApiJavaC.git
