package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Yurii", "Aleksin",
//                    "IT", 500);
//            Detail detail = new Detail("Moscow", "89999999999"
//                    , "YryAleksin@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Sergey", "Shustov",
//                    "HR", 1000);
//            Detail detail = new Detail("Krasnogorsk", "899999999998"
//                    , "SergeyShustov@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.persist(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp1 = session.get(Employee.class, 1);
            System.out.println(emp1.getEmpDetail());

            session.getTransaction().commit();
            System.out.println("Done");
        } finally {
            session.close();
            factory.close();
        }
    }
}
