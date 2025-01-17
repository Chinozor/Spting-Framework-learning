package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Берем книгу из школьной библиотеки");
    }

    String returnBook(){
        System.out.println("Мы возвращаем книгу в школьную библиотеку");
        return "OK";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из школьной библиотеки");
    }
}
