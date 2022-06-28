package spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.orm.dao.StudentDao;
import spring.orm.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "started!!!" );
        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = applicationContext.getBean("studentDao", StudentDao.class);
//        int insert = studentDao.insert(new Student(122,"Ravi", "Noida"));
//        System.out.println("Inserted "+insert);
        
        studentDao.update(new Student(121,"Ranjan", "noida"));
        List<Student> allStudent = studentDao.getAllStudent();
        System.out.println(allStudent);
    }
}
