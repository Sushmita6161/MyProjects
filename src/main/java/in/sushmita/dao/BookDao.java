package in.sushmita.dao;

import in.sushmita.beans.Book;
import org.springframework.stereotype.Repository;

public interface BookDao {

    public int insertBook(Book book);

}
