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
        boolean result = borrowerApp.checkBorrower(phoneNumber);
        if(result != true){
            Borrower borrower = new Borrower(name, phoneNumber);
            return borrowerApp.saveBorrower(borrower);
        }
        else{
            return "이미 등록된 이용자입니다.";
        }
    }

    /**
     * UC2 - 새로운 책을 등록하는 메소드
     *
     * @param  title : String, author : String, bookID : int
     * @return   책 등록 결과 메세지
     */
    public String registerOneBook(String title, String author, int bookID){
        boolean result = bookApp.checkBook(bookID);
        if(result != true){
            Book book= new Book(title,author,bookID);
            return bookApp.saveBook(book);
        }
        else{
            return "이미 등록된 책입니다.";
        }
    }

    /**
     * UC3 - 대출가능한 책들을 화면에 출력하는 메소드
     *
     * @return    대출가능한 책들 출력 결과 메세지
     */
    public String displayBooksForLoan(){
        String result = "";

        Book bringBook = bookApp.getBook();
        while(bringBook != null){
            if(bringBook.checkBook() == true){
                result += bringBook.display() + "\n";
            }
            else{
                result = "대출 가능한 책이 없습니다.";
            }
            bringBook = bookApp.getBook();
        }
        if(result.equals("")){
            result =  "대출 가능한 책의 정보가 없습니다";
        }
        return result;
    }

    /**
     * UC4 - 대출 중인 책들을 화면에 출력하는 메소드
     *
     * @return    대출중인 책들 출력 결과 메세지
     */
    public String displayBooksOnLoan(){
        String result = "";

        Book bringBook = bookApp.getBook();
        while(bringBook != null){
            if(bringBook.checkBook() != true){
                result += bringBook.display() + "\n";
            }
            else{
                return "대출 가능한 책이 없습니다.";
            }
        }
        if(result.equals("")){
            result =  "대출 중인 책의 정보가 없습니다";
        }
        return result;
    }

    /**
     * UC5 - 책을 대출하는 메소드
     *
     * @param  bookID : int, phoneNumber : int
     * @return    대출 결과 메세지
     */
    public String loanOneBook(int bookID, int phoneNumber){
        Book bookResult = bookApp.searchBook(bookID);
        if (bookResult == null){
            return "등록되지 않은 책 입니다.";
        }

        Borrower borrowerResult = borrowerApp.searchBorrower(phoneNumber);
        if (borrowerResult == null){
            return "등록되지 않은 이용자 입니다.";
        }

        if (bookResult.checkBook() != true){
            return "이미 대출중인 책 입니다.";
        }

        if (borrowerResult.searchLoan() != null){
            return "이용자는 이미 다른 책을 대출 중입니다.";
        }

        ArrayList<Borrower> borrowerList = new ArrayList<Borrower>();
        borrowerList.add(borrowerResult);

        Loan newLoan = new Loan(bookResult, borrowerList);
        loanApp.saveLoan(newLoan);

        loanHistoryApp.copyLoan(newLoan);

        return "대출이 완료되었습니다.";
    }

    /**
     * UC6 - 책을 반납하는 메소드
     *
     * @param  bookID : int, phoneNumber : int
     * @return    반납 결과 메세지
     */
    public String returnOneBook(int bookID, int phoneNumber){
        Book bookResult = bookApp.searchBook(bookID);
        if (bookResult == null){
            return "등록되지 않은 책 입니다.";
        }

        Borrower borrowerResult = borrowerApp.searchBorrower(phoneNumber);
        if (borrowerResult == null){
            return "등록되지 않은 이용자 입니다.";
        }

        Loan loanFromBook = bookResult.searchLoan();
        Loan loanFromBorrower = borrowerResult.searchLoan();

        if (loanFromBook == null || loanFromBorrower == null){
            return "대출 정보가 없습니다.";
        }

        if (loanFromBook != loanFromBorrower){
            return "대출 정보가 일치하지 않습니다.";
        }

        Loan targetLoan = loanFromBook;

        targetLoan.disconnect();
        loanApp.deleteLoan(targetLoan);

        return "반납이 완료되었습니다.";
    }
}