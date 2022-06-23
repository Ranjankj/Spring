package com.ranjan.springJdbc.Dao;

/*This is a interface it has methods that we require to query the database*/

import java.util.List;

import com.ranjan.springJdbc.model.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student getOneRow(int id);
	
	public List<Student> getAll();
}
