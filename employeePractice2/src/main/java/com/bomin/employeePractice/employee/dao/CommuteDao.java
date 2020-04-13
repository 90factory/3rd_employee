package com.bomin.employeePractice.employee.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.mchange.v2.c3p0.ComboPooledDataSource;


@Repository
public class CommuteDao implements ICommuteDao{
	
	private JdbcTemplate template;
	
	@Autowired
	public CommuteDao(ComboPooledDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);
		
	}
	
	
	
	
	@Override
	public int checkIn(String phoneN) {
		String checkIn = new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date());
		int employeeId = this.template.queryForObject("select EMPLOYEE_ID from EMPLOYEE where PHONE = ?", new Object[]{phoneN}, Integer.class);
		int result=0;
		
		final String sql = "INSERT INTO COMMUTE(CHECK_IN, EMPLOYEE_ID)"
				+ "VALUES(?,?)";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, checkIn);
				ps.setInt(2, employeeId);
				

			}
		});

		
		return result;	
	}
	@Override
	public int checkOut(String phoneN) {
			String checkOut = new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date());
			int employeeId = this.template.queryForObject("select EMPLOYEE_ID from EMPLOYEE where PHONE = ?", new Object[]{phoneN}, Integer.class);
			int result=0;
			
			final String sql = "UPDATE COMMUTE SET(CHECK_OUT)=(?) WHERE EMPLOYEE_ID=? AND CHECK_OUT IS NULL";
			
			result = template.update(sql, new PreparedStatementSetter() {
				
				@Override
				public void setValues(PreparedStatement ps) throws SQLException {
					ps.setString(1, checkOut);
					ps.setInt(2, employeeId);

				}
			});

			
			return result;	
	}
	

	@Override
	public int idSelect(String phoneN) {
		final String sql = "SELECT ";
		
		
		
		return 0;
	}
}
