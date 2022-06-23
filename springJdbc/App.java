package com.ranjan.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ranjan.springJdbc.Dao.StudentDaoImpl;
import com.ranjan.springJdbc.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started...." );
        ApplicationContext context = 
        		new ClassPathXmlApplicationContext("com/ranjan/springJdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        StudentDaoImpl sDao = context.getBean("studentDao",StudentDaoImpl.class);
        // inserting values
        /**
        int result = sDao.insert(new Student(225,"Anil Jha","Madhubani"));
        System.out.println("Updated "+ result);
        **/
        
        
        //updating values
        /**
        int update = sDao.update(new Student(225,"john sharma","Banglore"));
        System.out.println("Updated row "+update);
        */
        
        // deleting row
        /**
        int delete = sDao.delete(225);
        System.out.println("Deleted value row affected "+delete);
        **/
        
        // getting row from student
        /**
        Student student = sDao.getOneRow(121);
        System.out.println(student);
        **/
        
        // getting the whole table
        
        /**
        List<Student> all = sDao.getAll();
        for(Student s: all) {
        	System.out.println(s);
        }
        **/
    }
    
    
}
