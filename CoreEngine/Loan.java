package CoreEngine;

import java.util.*;
import java.util.Calendar;

/**
 * Loan 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
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
    }

    /**
     * UC6 - 연결을 해제하는 메소드
     */
    public void disconnect()
    {
        borrower = null;
        book = null;
    }
}
