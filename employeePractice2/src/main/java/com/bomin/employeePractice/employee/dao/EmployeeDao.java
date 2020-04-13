package com.bomin.employeePractice.employee.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bomin.employeePractice.employee.EmployeeVO;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Repository
public class EmployeeDao implements IEmployeeDao{
	
	private JdbcTemplate template;
	
	
	@Autowired
	public EmployeeDao(ComboPooledDataSource dataSource) {
		
		this.template = new JdbcTemplate(dataSource);
	}


	
	
	
	
	@Override
	public int employeeInsert(EmployeeVO employee) {
		int result=0;
		
		final String sql = "INSERT INTO EMPLOYEE(NAME, POSITION, SECURITY_NUM,"
				+ " OPEN_TIME, CLOSE_TIME, START_DATE, END_DATE, STATUS, TEAM, PHONE) "
				+ "VALUES(?,?,?,?,?,?,?,?,?,?)";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, employee.getEmName());
				ps.setString(2, employee.getEmPosition());
				ps.setString(3, employee.getEmSecurityNum());
				ps.setString(4, employee.getEmOpenTime());
				ps.setString(5, employee.getEmCloseTime());
				ps.setString(6, employee.getEmStartDate());
				ps.setString(7, employee.getEmEndDate());
				ps.setInt(8, employee.getEmStatus());
				ps.setString(9, employee.getEmTeam());
				ps.setString(10, employee.getEmPhone());

			}
		});

		
		return result;
	}
	
	@Override
	public EmployeeVO employeeSelectByID(int ID) {
List<EmployeeVO> employees = null;
		
		final String sql = "SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID=?";
		
		employees = template.query(sql, new Object[]{ID}, new RowMapper<EmployeeVO>() {

			@Override
			public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeVO employee = new EmployeeVO();
				employee.setEmId(rs.getInt("EMPLOYEE_ID"));
				employee.setEmName(rs.getString("NAME"));
				employee.setEmPosition(rs.getString("POSITION"));
				employee.setEmSecurityNum(rs.getString("SECURITY_NUM"));
				employee.setEmOpenTime(rs.getString("OPEN_TIME"));
				employee.setEmCloseTime(rs.getString("CLOSE_TIME"));
				employee.setEmStartDate(rs.getString("START_DATE"));
				employee.setEmEndDate(rs.getString("END_DATE"));
				employee.setEmStatus(rs.getInt("STATUS"));
				employee.setEmTeam(rs.getString("TEAM"));
				employee.setEmPhone(rs.getString("PHONE"));
				return employee;
			}
			
		});
		
		if(employees.isEmpty()) 
			return null;
		
		return employees.get(0);
		
	}
	
	@Override
	public List<EmployeeVO> employeeSelectByName(String name) {
		List<EmployeeVO> employees = null;

		final String sql = "SELECT * FROM EMPLOYEE WHERE NAME=?";
		
		employees = template.query(sql, new Object[]{name}, new RowMapper<EmployeeVO>() {

			@Override
			public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeVO employee = new EmployeeVO();
				employee.setEmId(rs.getInt("EMPLOYEE_ID"));
				employee.setEmName(rs.getString("NAME"));
				employee.setEmPosition(rs.getString("POSITION"));
				employee.setEmSecurityNum(rs.getString("SECURITY_NUM"));
				employee.setEmOpenTime(rs.getString("OPEN_TIME"));
				employee.setEmCloseTime(rs.getString("CLOSE_TIME"));
				employee.setEmStartDate(rs.getString("START_DATE"));
				employee.setEmEndDate(rs.getString("END_DATE"));
				employee.setEmStatus(rs.getInt("STATUS"));
				employee.setEmTeam(rs.getString("TEAM"));
				employee.setEmPhone(rs.getString("PHONE"));
				return employee;
			}
			
		});
		
		if(employees.isEmpty()) 
			return null;
		
		return employees;
	}
	
	
	@Override
	public List<EmployeeVO> employeeSelectAll() {
		List<EmployeeVO> employees = null;

		final String sql = "SELECT * FROM EMPLOYEE";
		
		employees = template.query(sql, new Object[]{}, new RowMapper<EmployeeVO>() {

			@Override
			public EmployeeVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeVO employee = new EmployeeVO();
				employee.setEmId(rs.getInt("EMPLOYEE_ID"));
				employee.setEmName(rs.getString("NAME"));
				employee.setEmPosition(rs.getString("POSITION"));
				employee.setEmSecurityNum(rs.getString("SECURITY_NUM"));
				employee.setEmOpenTime(rs.getString("OPEN_TIME"));
				employee.setEmCloseTime(rs.getString("CLOSE_TIME"));
				employee.setEmStartDate(rs.getString("START_DATE"));
				employee.setEmEndDate(rs.getString("END_DATE"));
				employee.setEmStatus(rs.getInt("STATUS"));
				employee.setEmTeam(rs.getString("TEAM"));
				employee.setEmPhone(rs.getString("PHONE"));
				return employee;
			}
			
		});
		
		if(employees.isEmpty()) 
			return null;
		
		return employees;		
	}
	
	
	
	
	@Override
	public int employeeUpdate(EmployeeVO employee) {
		int result=0;
		
		final String sql = "UPDATE EMPLOYEE SET NAME=?, POSITION=?, SECURITY_NUM=?,"
				+ "OPEN_TIME=?, CLOSE_TIME=?, START_DATE=?, END_DATE=?, STATUS=?, TEAM=?, PHONE=? "
				+ "WHERE EMPLOYEE_ID=?";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, employee.getEmName());
				ps.setString(2, employee.getEmPosition());
				ps.setString(3, employee.getEmSecurityNum());
				ps.setString(4, employee.getEmOpenTime());
				ps.setString(5, employee.getEmCloseTime());
				ps.setString(6, employee.getEmStartDate());
				ps.setString(7, employee.getEmEndDate());
				ps.setInt(8, employee.getEmStatus());
				ps.setString(9, employee.getEmTeam());
				ps.setString(10, employee.getEmPhone());
				ps.setInt(11, employee.getEmId());
				
			}
		});

		
		return result;
	}
	
	
	
	
	@Override
	public int employyDelete(EmployeeVO employee) {
		int result = 0;
		
		final String sql = "DELETE member WHERE EMPLOYEE_ID = ?";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, employee.getEmId());
			}
		});
		return 0;
	}






	
	
}
