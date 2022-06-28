package spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import spring.orm.entity.Student;

public class StudentDao {
	
	private HibernateTemplate template;
	
	// inserting row 
	@Transactional
	public int insert(Student student) {
		Integer res = (Integer)this.template.save(student);
		return res;
	}
	
	//get a student
	public Student getStudent(int id) {
		Student student = this.template.get(Student.class, id);
		return student;
	}
	
	// get all students
	public List<Student> getAllStudent(){
		List<Student> students = this.template.loadAll(Student.class);
		return students;
	}
	
	//delete
	@Transactional
	public void delete(int id) {
		Student student = this.template.get(Student.class, id);
		this.template.delete(student);
	}
	
	// updating data 
	@Transactional
	public void update(Student student) {
		this.template.update(student);
	}
	
	
	
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	
	

}
