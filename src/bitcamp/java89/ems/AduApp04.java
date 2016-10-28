package bitcamp.java89.ems;
import java.util.Scanner;

public class AduApp04 {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    BookController.keyScan = keyScan;
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");

    loop :
    while (true) {
      System.out.println("무엇을 선택하시겠습니까 : 예) add, list, view");
      String input = keyScan.nextLine().toLowerCase();


      switch (input) {
        case "add" :
          BookController.doAdd();
           break;
        case "list" :
          BookController.doPrint();
            break;
        case "view" :
          BookController.doView();
              break;

        case "quit" :
         System.out.println("잘가용");
         break loop;
         default :
         System.out.println("지원하지 않는 명령어 입니다.");

      }
    }


  }


}
