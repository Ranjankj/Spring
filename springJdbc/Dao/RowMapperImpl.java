package com.ranjan.springJdbc.Dao;

/*this is the implementation of rowMapper interface 
 * in this we are rowMapper the result set to the student object*/

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ranjan.springJdbc.model.Student;

public class RowMapperImpl implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString("name"));
		student.setCity(rs.getString("city"));
		return student;
	}

}
