
/**
 * Library_Application 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LibraryApplication
{
    private BookCollection bookApp;
    private LoanCollection loanApp;
    //private LoanHistoryCollection loanHistoryApp;
    private BorrowerCollection borrowerApp;
    
    private String LibraryName;
    
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