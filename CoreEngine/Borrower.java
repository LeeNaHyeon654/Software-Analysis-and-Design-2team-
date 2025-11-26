package CoreEngine;

import java.util.*;

/**
 * 대출자에 대한 정보를 담은 클래스
 *
 * @author (2024320009 이나현)
 * @version (2025.11.25)
 */
public class Borrower
{
    public Loan LoanDetail;

    private String name;
    private int phoneNumber;
    
    /**
     * Borrower 클래스의 객체 생성자
     * 
     * @param  name : String, phoneNumber : int
     */
    public Borrower(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Borrower 정보 출력 메소드
     *
     * @return   대출자 이름과 전화번호 정보
     */
    public String display()
    {
        return "대출자 이름 : " + name + ", 대출자 전화번호 : " + phoneNumber;
    }

    /**
     * 현재 Borrower와 연결된 Loan을 검색하는 메소드
     *
     * @return   연결된 Loan, 없으면 null
     */
    public Loan searchLoan(){
        return LoanDetail;
    }

    /**
     * Borrower와 Loan의 연결을 해제하는 메소드
     */
    public void disconnect(){
        LoanDetail = null;
    }

    /**
     * 대출자의 전화번호를 가져오는 메소드
     */
    public int getPhoneNumber(){
        return phoneNumber;
    }
}