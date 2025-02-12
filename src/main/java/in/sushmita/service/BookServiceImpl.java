package in.sushmita.service;

import in.sushmita.beans.Book;
import in.sushmita.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SuppressWarnings("ALL")
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public void processBooks() {
    String filepath ="D:\\workspace\\BooksApp\\Books.txt";

    try{
       Stream<String> lines =  Files.lines(Paths.get(filepath));
       lines.forEach(line ->{
           String[] values =line.split(",");
           Book b = new Book();
           b.setBookID(Integer.parseInt(values[0]));
           b.setBookName(values[1]);
           b.setBookPrice(Double.parseDouble(values[2]));

          int cnt =  bookDao.insertBook(b);

          if(cnt>0)
          {
              System.out.println("Record inserted");
          }
       });

    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}
