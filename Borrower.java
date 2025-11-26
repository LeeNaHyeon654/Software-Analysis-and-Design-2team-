import java.util.*;

/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
    public Loan LoanDetail;

    private String name;
    private int phoneNumber;

    public Borrower(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String display()
    {
        return "";
    }

    public Loan searchLoan(){
        return LoanDetail;
    }

    public void disconnect(){
        LoanDetail = null;
    }
}