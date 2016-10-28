package bitcamp.java89.ems;

import java.util.Scanner;

public class BookController {
  Book[] books = new Book[100];
  int length = 0;
  Scanner keyScan;

  // 기본생성자가 없다
  public BookController(Scanner keyScan) {
    this.keyScan = keyScan;
  }

  public void doAdd() {
    Book book = new Book();
    System.out.println("교제 제목?(예 : 엄진영의 백문의 부려실행) ");
    System.out.print("Add> ");
    book.name = this.keyScan.nextLine();

    System.out.println("과정?(예 : Java, c++) ");
    System.out.print("Add> ");
    book.subject = this.keyScan.nextLine();

    System.out.println("출판사?(예 : (주)진영 컴퍼니) ");
    System.out.print("Add> ");
    book.publisher = this.keyScan.nextLine();

    System.out.println("저자?(예 : 엄진영) ");
    System.out.print("Add> ");
    book.author = this.keyScan.nextLine();

    System.out.println("발행년도?(예: 2015년 10월 13일) ");
    System.out.print("Add> ");
    book.year = this.keyScan.nextLine();

    System.out.println("교제 가격?(예 : 520,000원) ");
    System.out.print("Add> ");
    book.price = Integer.parseInt(this.keyScan.nextLine());

    System.out.println("교재 페이지수?(예 : 324페이지) ");
    System.out.print("Add> ");
    book.pages = Integer.parseInt(this.keyScan.nextLine());

    System.out.println("cd유무(y/n)? ");
    System.out.print("Add> ");
    book.cd = (this.keyScan.nextLine().equals("y")) ? true : false;

    books[length] = book;
    ++length;

  }


  public void doPrint() {
    for (int i = 0; i < this.length; i++) {
      Book book = this.books[i];
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


  public void doView() {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("무엇을 보시겠습니까?  ");
    String input = this.keyScan.nextLine();
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < this.length; i++) {
      Book book = books[i];
      if (input.equals(book.name)) {
        System.out.printf("교재 제목 : %s\n", book.name);
        System.out.printf("과정 : %s\n", book.subject);
        System.out.printf("출판사 : %s\n", book.publisher);
        System.out.printf("저자 : %s\n", book.author);
        System.out.printf("발행일 : %s\n", book.year);
        System.out.printf("교재 가격 : %d\n", book.price);
        System.out.printf("교재 페이지수 : %d\n", book.pages);
        System.out.printf("cd유/무 : %b\n", book.cd);
        System.out.println("-----------------------------------------");
      }
    }

  }

  public void doDelete() {
    Scanner keyScan = new Scanner(System.in);
    System.out.println("삭제할 교제의 이름은?  ");
    String input = this.keyScan.nextLine();
    System.out.println("-------------------------------------------------");
    for (int i = 0; i < this.length; i++) {
      Book book = books[i];
      if (input.equals(book.name)) {
        for (int x = i + 1; x < this.length; x++, i++) {
          this.books[i++] = this.books[x];
        }
        this.books[--length] = null;
        System.out.printf("%s 교재 정보를 삭제하였습니다.\n", book.name);
        return;
      }
    }

  }

  public void doUpdate() {
    System.out.println("변경할 교제 제목은?");

    String input = this.keyScan.nextLine();
    for (int i = 0; i < this.length; i++) {
    if (this.books[i].name.toLowerCase().equals(input)) {
      Book book = new Book();
    book.name = input;
    System.out.printf("변경할 교재 제목은 ? > %s\n", book.name );

    System.out.print("과목?(예 : Java, c++) ");
    book.subject = this.keyScan.nextLine();

    System.out.print("출판사?(예 : (주)진영 컴퍼니) ");
    book.publisher = this.keyScan.nextLine();

    System.out.print("저자?(예 : 엄진영) ");
    book.author = this.keyScan.nextLine();

    System.out.print("발행년도?(예: 2015년 10월 13일) ");
    book.year = this.keyScan.nextLine();

    System.out.print("가격?(예 : 520,000원) ");
    book.price = Integer.parseInt(this.keyScan.nextLine());

    System.out.print("페이지수?(예 : 324페이지) ");
    book.pages = Integer.parseInt(this.keyScan.nextLine());

    System.out.print("cd유무(y/n)? ");
    book.cd = (this.keyScan.nextLine().equals("y")) ? true : false;

    System.out.println("변경 하시겠습니까? (y/n)");
    if (this.keyScan.nextLine().equals("y")) {

      System.out.printf("%s 교재 정보를 변경하였습니다.\n", book.name);
      books[i] = book;
      return;
    } else {
    System.out.println("교재 정보를 변경하지 않았습니다.");

    return;
  }


    }
  }
  System.out.println("해당 교제 정보가 없당");
}

}
