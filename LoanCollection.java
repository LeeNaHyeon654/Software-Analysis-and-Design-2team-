import java.util.ArrayList;

/**
 * LoanColletion 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LoanCollection
{
    private Loan loan;
    
    private ArrayList<Loan> loanCollection;
    
    public LoanCollection(ArrayList<Loan> loanCollection){
        this.loanCollection = loanCollection;
    }
    
    public String saveLoan(Loan loan){
        return "";
    }
    
    public String deleteLoan(){
        return "";
    }
}