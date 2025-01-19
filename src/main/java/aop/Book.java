package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Вегетарианка")
    private String bookName;

    @Value("Хан Ган")
    private String author;

    @Value("2007")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getBookName() {
        return bookName;
    }

}
