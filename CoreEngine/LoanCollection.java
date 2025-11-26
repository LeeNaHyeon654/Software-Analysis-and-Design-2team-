package CoreEngine;

import java.util.ArrayList;

/**
 * Loan 클래스에서 생성된 대출 정보를 저장하는 클래스.
 *
 * @author (2024320011 김혜린)
 * @version (2025.11.25)
 */
public class LoanCollection
{
    public Loan loan;

    private ArrayList<Loan> loanCollection;

    public LoanCollection(ArrayList<Loan> loanCollection){
        this.loanCollection = loanCollection;
    }

    /**
     * Loan을 Collection에 저장하는 메소드.
     *
     * @param  loan : Loan
     * @return  저장 완료 메세지
     */
    public String saveLoan(Loan loan){
        loanCollection.add(loan);
        return "LoanCollection 저장 완료";
    }

    /**
     * UC6 - Loan 객체를 Collection 내부에서 삭제하는 메소드.
     *
     * @return  반납 완료 메세지
     */
    public String deleteLoan(){
        return "반납 완료";
    }
}