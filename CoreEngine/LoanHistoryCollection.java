package CoreEngine;

import java.util.*;

/**
 * Loan 정보를 백업해, 추후에 대출 내역을 확인할 수 있도록 저장해 두는 클래스.
 *
 * @author (2024320011 김혜린)
 * @version (2025.11.25)
 */
public class LoanHistoryCollection
{
    public Loan loan;
    
    private ArrayList<Loan> loanHistoryCollection;

    /**
     * LoanHistoryCollection 클래스의 객체 생성자
     * 
     * @param   loanHistoryCollection : ArrayList<Loan>
     */
    public LoanHistoryCollection(ArrayList<Loan> loanHistoryCollection)
    {
        this.loanHistoryCollection = loanHistoryCollection;
    }

    /**
     * UC5 - 대출내역을 Loan으로부터 Loan 정보를 백업하는 메소드.
     */
    public void copyLoan() {
        loanHistoryCollection.add(loan);
    }
}