package CoreEngine;
import java.util.*;

/**
 * 6개의 UseCase의 작업을 총괄하는 클래스
 *
 * @author (2024320009 이나현, 2024320011 김혜린)
 * @version (2025.11.25)
 */
public class LibraryApplication
{
    public BookCollection bookApp;
    public LoanCollection loanApp;
    public LoanHistoryCollection loanHistoryApp;
    public BorrowerCollection borrowerApp;
    public Book book;

    private String LibraryName;

    /**
     * LibraryApplication 클래스의 객체 생성자
     * 
     * @param  LibraryName : String
     */
    public LibraryApplication(String LibraryName){
        this.LibraryName = LibraryName;
    }

    /**
     * UC1 - 새로운 이용자를 등록하는 메소드
     *
     * @param  name : String, phoneNumber : int
     * @return    이용자 등록 결과 메세지
     */
    public String registerOneBorrower(String name, int phoneNumber){                      
        return "이용자 등록이 완료되었습니다.";
    }

    /**
     * UC2 - 새로운 책을 등록하는 메소드
     *
     * @param  title : String, author : String, bookID : int
     * @return   책 등록 결과 메세지
     */
    public String registerOneBook(String title, String author, int bookID){      
        return "책 등록이 완료되었습니다.";
    }

    /**
     * UC3 - 대출가능한 책들을 화면에 출력하는 메소드
     *
     * @return    대출가능한 책들 출력 결과 메세지
     */
    public String displayBooksForLoan(){
        Book bringBook = bookApp.getBook();
        while(bringBook != null){
            bookApp.getBook();
            boolean result = book.checkBook();
            if(result == true){
                return book.display();
            }
        }
        return "대출 가능한 책이 없습니다.";
    }

    /**
     * UC4 - 대출중인 책들을 화면에 출력하는 메소드
     *
     * @return    대출중인 책들 출력 결과 메세지
     */
    public String displayBooksOnLoan(){
        Book bringBook = bookApp.getBook();
        while(bringBook != null){
            bookApp.getBook();
            boolean result = book.checkBook();
            if(result == false){
                return book.display();
            }
        }
        return "대출 가능한 책이 없습니다.";
    }

    /**
     * UC5 - 책을 대출하는 메소드
     *
     * @param  bookID : int, phoneNumber : int
     * @return    대출 결과 메세지
     */
    public String loanOneBook(int bookID, int phoneNumber){
        return "";
    }

    /**
     * UC6 - 책을 반납하는 메소드
     *
     * @param  bookID : int, phoneNumber : int
     * @return    반납 결과 메세지
     */
    public String returnOneBook(int bookID, int phoneNumber){
        return "";
    }
}