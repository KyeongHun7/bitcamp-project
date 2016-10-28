package bitcamp.java89.ems;
import java.util.Scanner;

public class AduApp {

  public static void main(String[] args) {
    System.out.println("비트캐프 관리 시스템에 오신걸 환영합니다.");

    //여러명의 학생 정보를 입력하기 위해 레퍼런ㅅ 배열을 만든다.
    Book[] books = new Book[100];
    int length = 0; // 레퍼런스 배열에 몇명의 학생정보를 저장했는지 개수를 보관한다.
                    // 레퍼런스 배열에 몇개의 Student 인스턴스가 들어있는지 그 개수를 보관한다.
    Scanner keyScan = new Scanner(System.in);



    while (length < books.length) {

      Book book = new Book();
      System.out.print("책 이름?(예 : 엄진영의 백문의 부려실행) ");
      book.name = keyScan.nextLine();

      System.out.print("과목?(예 : 웹프로그래밍) ");
      book.subject = keyScan.nextLine();

      System.out.print("출판사?(예 : 진영 컴퍼니) ");
      book.publisher = keyScan.nextLine();

      System.out.print("저자?(예 : 엄진영) ");
      book.author = keyScan.nextLine();

      System.out.print("발행년도?(예: 2015년 10월 13일) ");
      book.year = keyScan.nextLine();

      System.out.print("가격?(예 : 520,000원) ");
      book.price = Integer.parseInt(keyScan.nextLine());

      System.out.print("페이지수?(예 : 324페이지) ");
      book.pages = Integer.parseInt(keyScan.nextLine());

      System.out.print("cd유무(y/n)? ");
      book.cd = (keyScan.nextLine().equals("y")) ? true : false;

      books[length++] = book;
      System.out.print("계속 입력하시겠습니까(y/n)?");
      if (!keyScan.nextLine().equals("y"))
      break;
   }
   printBookList(books, length);

  }
  static void printBookList(Book[] books, int length) {
      for (int i = 0; i < length; i++) {

      Book book = books[i];
      System.out.printf("%s,%s,%s,%s,%s,%d,%d,%b\n", book.name,
      book.subject,
      book.publisher,
      book.author,
      book.year,
      book.price,
      book.pages,
      ((book.cd)?"yes" : "no"));
     }
   }

}
