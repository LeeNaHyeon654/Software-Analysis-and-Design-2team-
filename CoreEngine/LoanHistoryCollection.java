package CoreEngine;

import java.util.*;

/**
 * LoanHistoryCollection 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class LoanHistoryCollection
{
    public Loan loan;
    
    private ArrayList<Loan> loanHistoryCollection;

    /**
     * LoanHistoryCollection 클래스의 객체 생성자
     */
    public LoanHistoryCollection(ArrayList<Loan> loanHistoryCollection)
    {
        this.loanHistoryCollection = loanHistoryCollection;
    }

    /**
     * UC5 - 대출내역을 LoanCollection으로부터 복사하는 메소드
     */
    public void copyLoan() {
        loanHistoryCollection.add(loan);
    }
}