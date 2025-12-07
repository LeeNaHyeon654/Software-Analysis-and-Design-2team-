package CoreEngine;

import java.util.*;

/**
 * 이용자에 대한 정보를 담은 클래스
 *
 * @author (2024320009 이나현, 2024320011 김혜린)
 * @version (2025.11.25)
 */
public class Borrower
{
    public ArrayList<Loan> LoanDetail;

    private String name;
    private int phoneNumber;

    /**
     * Borrower 클래스의 객체 생성자
     * 
     * @param  name : String, phoneNumber : int
     */
    public Borrower(String name, int phoneNumber)
    {
        this.name = name; //미대출 상태로 설정해야 함.
        this.phoneNumber = phoneNumber;

        LoanDetail = new ArrayList<Loan>();
    }

    /**
     * UC6 - 현재 Borrower와 연결된 Loan을 검색하는 메소드
     *
     * @return   연결된 Loan, 없으면 null
     */
    public Loan searchLoan(){
        Iterator<Loan> it = LoanDetail.iterator();
        if (it.hasNext()){
            return it.next();
        }
        return null;
    }

    /**
     * UC6 - Borrower와 Loan의 연결을 해제하는 메소드
     */
    public void disconnect(){
        LoanDetail = null;
    }

    /**
     * 이용자의 전화번호를 가져오는 메소드
     */
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    /**
     * Borrower과 Loan의 연결하는 메소드
     */
    public void connect(Loan loan){
        LoanDetail.add(loan);
    }

    /**
     * 현재 Borrower가 대출 중인 책 권수를 알려주는 메소드
     * 
     * @return 대출 중인 권 수
     */
    public int getLoanCount(){
        return LoanDetail.size();
    }
}