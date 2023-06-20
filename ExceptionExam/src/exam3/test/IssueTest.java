package exam3.test;
import java.util.Scanner;

public class IssueTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);

      int inputNum = 0;
      
      do {
    	  
    	  System.out.println("음 일단 숫자만 입력 해 볼래?");
    	  
    	  inputNum = sc.nextInt();
    	  
    	  if(inputNum < 100) {
    		  System.out.println("100보다 작으면 계속 입력해보자.");
    		  continue;
    	  }
    	  if(inputNum == -999) {
    		  System.out.println("치트키 활성");
    		  break;
    	  }
         
      } while (true); // 무한반복문
      System.out.println("게임 종료");
   }

}