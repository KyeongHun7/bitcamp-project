package bitcamp.java89.ems;

import java.util.Scanner;

public class BookController {
  static Book[] books = new Book[100];
  static int length = 0;
  static Scanner keyScan;

  static void doAdd() {
    Book book = new Book();
    System.out.println("책 이름?(예 : 엄진영의 백문의 부려실행) ");
    System.out.print("Add> ");
    book.name = keyScan.nextLine();

    System.out.print("과목?(예 : Java, c++) ");
    book.subject = keyScan.nextLine();

    System.out.print("출판사?(예 : (주)진영 컴퍼니) ");
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

    books[length] = book;
    ++length;

  }


  static void doPrint() {
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


  static void doView() {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("무엇을 보시겠습니까?  ");
    String input = keyScan.nextLine();
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < length; i++) {
      Book book = books[i];
      if (input.equals(book.name)) {
        System.out.printf("책 제목 : %s\n", book.name);
        System.out.printf("과목 : %s\n", book.subject);
        System.out.printf("출판사 : %s\n", book.publisher);
        System.out.printf("저자 : %s\n", book.author);
        System.out.printf("발행일 : %s\n", book.year);
        System.out.printf("교제 가격 : %d\n", book.price);
        System.out.printf("교제 페이지수 : %d\n", book.pages);
        System.out.printf("cd유/무 : %b\n", book.cd);
        System.out.println("-----------------------------------------");
      }
    }

  }


}