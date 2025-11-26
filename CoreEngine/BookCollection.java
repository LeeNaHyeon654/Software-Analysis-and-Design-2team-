package CoreEngine;

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

    /**
     * UC2 - 이미 등록돼 있는지 book인지 검사하는 메소드
     *
     * @param  bookID   book의 고유번호
     * @return    등록돼 있으면 true, 등록돼 있지 않으면 false
     */
    public boolean checkBook(int bookID){
        for(Book b : bookCollection){
            if(b.getBookID() == bookID){
                return true;
            }
        }
        return false;
    }

    /**
     * UC2 - book을 collection에 저장하는 메소드
     *
     * @param  book  
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
        return book;
    }

    /**
     * UC5 - 책의 고유번호로 Book를 검색하는 메소드
     *
     * @param  bookID   책의 고유번호
     * @return   일치하는 Book, 없으면 null
     */
    public Book searchBook(int bookID){
        for(Book b : bookCollection){
            if(b.getBookID()== bookID){
                return b;
            }
        }
        return null;
    }

}