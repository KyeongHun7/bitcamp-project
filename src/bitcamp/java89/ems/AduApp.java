package ems;
import java.util.Scanner;

public class AduApp {

  public static void main(String[] args) {
    System.out.println("비트캐프 관리 시스템에 오신걸 환영합니다.");

    // 사용자로 부터 값을 입력받을 때 사용할 입력 도구 준비
    Scanner keyScan = new Scanner(System.in);

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

    System.out.printf("책 이름 : %s\n", book.name);
    System.out.printf("과목 : %s\n", book.subject);
    System.out.printf("출판사: %s\n", book.publisher);
    System.out.printf("저자 : %s\n", book.author);
    System.out.printf("발간일 : %s\n", book.year);
    System.out.printf("가격 : %s\n", book.price);
    System.out.printf("페이지 : %s\n", book.pages);
    System.out.printf("cd의 유무 : %s\n", book.cd);

  }
}
