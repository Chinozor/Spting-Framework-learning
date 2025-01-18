package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    //@Override
    public void getBook() {
        System.out.println("Берем книгу из школьной библиотеки");
    }

    public void returnBook(){
        System.out.println("Мы возвращаем книгу в школьную библиотеку");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из школьной библиотеки");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем книгу в школьную библиотеку");
    }

    public void addBook(){
        System.out.println("Мы добавляем книгу в школьную библиотеку");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем книгу в школьную библиотеку");
    }
}
