package CoreEngine;

import java.util.*;

/**
 * Loan 정보를 백업해, 추후에 대출 내역을 확인할 수 있도록 저장해 두는 클래스.
 *
 * @author (2024320009 이나현, 2024320011 김혜린)
 * @version (2025.11.25)
 */
public class LoanHistoryCollection
{
    private Loan loan;
    
    private ArrayList<Loan> loanHistoryCollection;

    /**
     * LoanHistoryCollection 클래스의 객체 생성자
     * 
     * @param   loanHistoryCollection : ArrayList<Loan>
     */
    public LoanHistoryCollection(){
        loanHistoryCollection = new ArrayList<Loan>();           
    }

    /**
     * UC5 - 대출내역을 Loan으로부터 Loan 정보를 백업하는 메소드.
     * 
     * @return  백업 완료 메세지
     */
    public String copyLoan(Loan loan){
        loanHistoryCollection.add(loan);
        return "LoanHistoryCollection 백업 완료";
    }

    /**
     * 대출 내역들을 출력하는 메소드
     * 
     * @param   phoneNumber : int
     * @return  대출 내역 결과 메세지
     */
    public String display(int phoneNumber) {
        String result = "";

        Iterator<Loan> it = loanHistoryCollection.iterator();
        while (it.hasNext()){
            Loan loan = it.next();
            Borrower br = loan.getBorrower();
            if (br != null && br.getPhoneNumber() == phoneNumber){
                Book book = loan.getBook();
                result += book.display();
            }
        }
        if (result.equals("")){
            return "이용자의 대출 내역이 없습니다.";
        }
        return result;
    }
}