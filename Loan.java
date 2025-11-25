import java.util.*;
/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한
 */
public class Loan
{
    public Book LoanBook;
    public ArrayList<Borrower> LoanBorrower;
    
    private Date loanDate;
    private Date returnDate;

    public Loan(Book book, Borrower borrower)
    {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    
    public void disconnect(){
        
    }
}