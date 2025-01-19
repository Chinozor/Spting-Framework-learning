package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibrary library = context.getBean("schoolLibraryBean", SchoolLibrary.class);
        String bookName = library.returnBook();

        System.out.println(bookName);

        context.close();

    }
}
