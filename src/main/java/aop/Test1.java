package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        //Book book = context.getBean("book", Book.class);
        UniLibrary library = context.getBean("unilibraryBean", UniLibrary.class);
        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);

//        library.getBook();
        schoolLibrary.getBook();
//        schoolLibrary.returnBook();
//        schoolLibrary.returnMagazine();
        schoolLibrary.getMagazine();

        context.close();

    }
}
