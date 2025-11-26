
/**
 * Book 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class Book
{
    public Loan LoanList;
    
    private String title;
    private String author;
    private String bookID;
    
    public Book(String title, String author, String bookID)
    {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 더하기 y의 결과값을 반환
     */
    public boolean checkBook()
    {
        return true;
    }
    
    public Loan searchLoan(){
        return LoanList;
    }
    
    public void disconnect(){
        LoanList = null;
    }
}