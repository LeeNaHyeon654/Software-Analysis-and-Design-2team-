package CoreEngine;

import java.util.*;

/**
 * Borrower 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Borrower
{
    private Loan LoanDetail;

    private String name;
    private int phoneNumber;

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