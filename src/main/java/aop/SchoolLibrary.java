package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook() {
        System.out.println("Берем книгу из школьной библиотеки");
        System.out.println("-----------------------------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в школьную библиотеку");
        return "Война и мир";
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из школьной библиотеки");
        System.out.println("-----------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем книгу в школьную библиотеку");
        System.out.println("-----------------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Мы добавляем книгу в школьную библиотеку");
        System.out.println("-----------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем книгу в школьную библиотеку");
        System.out.println("-----------------------------------------------");
    }
}
