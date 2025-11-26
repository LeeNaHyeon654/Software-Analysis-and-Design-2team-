package CoreEngine;

import java.util.*;

/**
 * BorrowerColletion 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BorrowerCollection
{
    private Borrower borrower;

    private ArrayList<Borrower> borrowerCollection;

    public BorrowerCollection(ArrayList<Borrower> borrowerCollection){
        this.borrowerCollection = borrowerCollection;
    }

    /**
     * UC1 - 이미 등록돼 있는지 borrower인지 검사하는 메소드
     *
     * @param  phoneNumber   borrower의 전화번호
     * @return    등록돼 있으면 true, 등록돼있지 않으면 false
     */
    public boolean checkBorrower(int phoneNumber){
        for (Borrower b : borrowerCollection){
            if (b.getPhoneNumber() == phoneNumber){
                return true;   
            }
        }
        return false;
    }

    /**
     * UC1 - borrower를 collection에 저장하는 메소드
     *
     * @param  borrower   저장할 Borrower객체
     * @return    저장완료 메세지
     */
    public String saveBorrower(Borrower borrower){
        borrowerCollection.add(borrower);
        return "BorrowerCollection 저장 완료";
    }

    /**
     * UC5 - 전화번호로 Borrower를 검색하는 메소드
     *
     * @param  phoneNumber   borrower의 전화번호
     * @return   일치하는 Borrower, 없으면 null
     */
    public Borrower searchBorrower(int phoneNumber)
    {
        for (Borrower b : borrowerCollection){
            if (b.getPhoneNumber() == phoneNumber){
                return b;
            }
        }
        return null;
    }
}