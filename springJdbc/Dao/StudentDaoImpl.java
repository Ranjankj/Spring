package com.ranjan.springJdbc.Dao;


/*this class is implementing the methods of Student Dao
 * and does the operation related to the data base
 * */

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ranjan.springJdbc.model.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate template;

	
	//inserting values into dataBase
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int update = this.template.update(query,student.getId(), student.getName(), student.getCity());
		return update;
	}
	
	
	// updating values
	public int update(Student student) {
		String query = "update student set name=? , city=? where id=?";
		int update = this.template.update(query,student.getName(),student.getCity(), student.getId());
		return update;
	}

	// deleting row from database;
	public int delete(int id) {
		String query = "delete from student where id =?";
		int update = this.template.update(query,id);
		return update;
	}
	
	// get a single row
	public Student getOneRow(int id) {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from student where id=?";
		Student student = this.template.queryForObject(query, rowMapper,id);
		return student;
	}

	// get the whole table
	public List<Student> getAll() {
		RowMapper<Student> rowMapper = new RowMapperImpl();
		String query = "select * from  student";
		List<Student> list = this.template.query(query, rowMapper);
		return list;
	}

	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	

	

	

	
	
	

}
