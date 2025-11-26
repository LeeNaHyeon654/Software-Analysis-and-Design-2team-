package CoreEngine;

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

    /**
     * Loan을 collection에 저장하는 메소드
     *
     * @param  loan  저장할 Loan 객체
     * @return   저장 완료 메세지
     */
    public String saveLoan(Loan loan){
        loanCollection.add(loan);
        return "LoanCollection 저장 완료";
    }

    /**
     * UC6 - 해당 Loan 객체를 삭제하는 메소드
     *
     * @param  loan  삭제할 Loan 객체
     * @return   객체 삭제 완료 메세지
     */
    public String deleteLoan(){
        return "반납 완료";
    }
}