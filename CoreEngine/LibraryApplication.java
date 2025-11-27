package CoreEngine;

/**
 * 6개의 UseCase의 작업을 총괄하는 클래스
 *
 * @author (2024320009 이나현)
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

    public String registerOneBorrower(String name, int phoneNumber){
        return "";
    }

    public String registerOneBook(String title, String author, String bookID){
        return "";
    }

    public String displayBooksForLoan(){
        return "";
    }

    public String displayBooksOnLoan(){
        return "";
    }

    public String loanOneBook(String bookID, int phoneNumber){
        return "";
    }

    public String returnOneBook(String bookID, int phoneNumber){
        return "";
    }
}