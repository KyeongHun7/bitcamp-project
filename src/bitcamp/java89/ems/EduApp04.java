package bitcamp.java89.ems;
import java.util.Scanner;

public class EduApp04 {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    BookController bookController = new BookController(keyScan);
    System.out.println("비트캠프 관리 시스템에 오신걸 환영합니다.");

    loop :
    while (true) {
      System.out.println("무엇을 선택하시겠습니까 : 예) add, list, view, delete, update");
      String input = keyScan.nextLine().toLowerCase();
 

      switch (input) {
        case "add" :
          bookController.doAdd();
           break;
        case "list" :
          bookController.doPrint();
            break;
        case "view" :
          bookController.doView();
              break;
        case "delete" :
          bookController.doDelete();
              break;
        case "update" :
          bookController.doUpdate();
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
