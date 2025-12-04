package CoreEngine;

import java.util.*;

/**
 * 책에 대한 정보를 TreeSet으로 저장하고 관리하는 클래스
 *
 * @author (2024320009 이나현, 2024320011 김혜린)
 * @version (2025.11.25)
 */
public class BookCollection
{
    public Book book;

    private TreeSet<Book> bookCollection; // bookCollection 말고 그냥 book으로????
    private Iterator<Book> BookIt = bookCollection.iterator();
    
    // private Book book;
    // public --------
    // book = new Book();

    /**
     * BookCollection 클래스의 객체 생성자
     * 
     * @param  bookCollection : TreeSet<Book> 
     */
    public BookCollection(TreeSet<Book> bookCollection)
    {
        bookCollection = new TreeSet<Book>();
    }

    /**
     * UC2 - 이미 등록돼 있는지 book인지 검사하는 메소드
     *
     * @param  bookID : int
     * @return    등록돼 있으면 true, 등록돼 있지 않으면 false
     */
    public boolean checkBook(int bookID){
        Iterator<Book> it = bookCollection.iterator();
        while(it.hasNext()){
            if(it.next().getBookID() == bookID){
                return true;
            }
        }
        return false;
    }

    /**
     * UC2 - book을 Collection에 저장하는 메소드
     *
     * @param  book : Book
     * @return    저장완료 메세지
     */
    public String saveBook(Book book){
        bookCollection.add(book);
        return "BookCollection 저장 완료";
    }

    /**
     * UC3 - Book을 하나 가져오는 메소드
     *
     * @return    book
     */
    public Book getBook(){
        if(BookIt.hasNext()){
            return BookIt.next();
        }
        return null;
    }

    /**
     * UC5 - 책의 고유번호로 Book를 검색하는 메소드
     *
     * @param  bookID : int
     * @return   일치하는 Book, 없으면 null
     */
    public Book searchBook(int bookID){
        Iterator<Book> it = bookCollection.iterator();
        while(it.hasNext()){
            Book b = it.next();
            if(b.getBookID() == bookID){
                return b;
            }
        }
        return null;
    }

}