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
    HashMap<String, Integer> LoanDetail = new HashMap<String, Integer>();
    
    /**
     * Borrower 클래스의 객체 생성자
     */
    public Borrower(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public boolean checkBorrower()
    {
        return true;
    }
}