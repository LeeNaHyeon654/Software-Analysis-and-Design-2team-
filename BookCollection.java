import java.util.*;

/**
 * BookCollection 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class BookCollection
{
    private Book book;
    
    private TreeSet<Book> bookCollection;

    /**
     * BookCollection 클래스의 객체 생성자
     */
    public BookCollection(TreeSet<Book> bookCollection)
    {
        this.bookCollection = bookCollection;
    }

    public boolean cheakBook(String bookID){
        return true;
    }
    
    public String saveBook(Book book){
        return "";
    }
    
    public Book getBook(){
        return book;
    }
    
    public Book searchBook(String bookID){
        return book;
    }
}