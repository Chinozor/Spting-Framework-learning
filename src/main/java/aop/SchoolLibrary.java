package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook(Book book) {
        System.out.println("Берем книгу из школьной библиотеки: " + book.getBookName());
    }

//    String returnBook(){
//        System.out.println("Мы возвращаем книгу в школьную библиотеку");
//        return "OK";
//    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из школьной библиотеки");
    }
}
