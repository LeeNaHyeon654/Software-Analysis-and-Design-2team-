package CoreEngine;

import java.util.*;
import java.util.Calendar;

/**
 * 대출이 진행될 때 저장돼야 하는 정보를 저장하고, 반납이 진행될 때 연결을 해제하는 작업을 진행하는 클래스.
 *
 * @author (2024320011 김혜린)
 * @version (2025.11.25)
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
     * 
     * @ param  book : Book, borrower : Borrower
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
     * Loan과 Book, Borrower 사이의 연결을 해제하는 메소드.
     */
    public void disconnect()
    {
        borrower = null;
        book = null;
    }
}
