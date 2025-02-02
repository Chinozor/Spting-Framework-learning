package hibernate_test2;

import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();

            Employee employee = new Employee("Misha", "Sidorov",
                    "HR", 500);
            Detail detail = new Detail("Moscow", "89999999999"
                    , "MS@gmail.com");

            detail.setEmployee(employee);


            session.beginTransaction();

            session.persist(employee);

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
