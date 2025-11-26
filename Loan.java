import java.util.*;
import java.util.Calendar;

/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한
 */
public class Loan
{
    public Book book;
    public Borrower borrower;

    private Date loanDate;
    private Date returnDate;

    private static final int dueDate = 15;

    /**
     * Loan 클래스의 객체 생성자
     */
    public Loan(Book book, Borrower borrower)
    {
        this.book = book;
        this.borrower = borrower;

        this.loanDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(loanDate);
        cal.add(Calendar.DATE, 15);
        this.returnDate = cal.getTime();

        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public void disconnect()
    {
        borrower = null;
        book = null;
    }
}