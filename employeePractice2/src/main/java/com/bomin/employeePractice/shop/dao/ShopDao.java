package com.bomin.employeePractice.shop.dao;

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
import com.bomin.employeePractice.shop.ShopVO;
import com.mchange.v2.c3p0.ComboPooledDataSource;


@Repository
public class ShopDao implements IShopDao{
	
	private JdbcTemplate template;
	
	@Autowired
	public ShopDao(ComboPooledDataSource dataSource) {
		this.template = new JdbcTemplate(dataSource);	}
	
	
	
	@Override
	public int shopInsert(ShopVO shop) {
int result=0;
		
		final String sql = "INSERT INTO SHOP(SHOP_ID, SHOP_NAME, SHOP_PW)"
				+ "VALUES(?,?,?)";
		
		result = template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
<<<<<<< HEAD
				ps.setString(1, shop.getShopID());
				ps.setString(2, shop.getShopName());
				ps.setString(3, shop.getShopPw());
				
			}
		});

		
		return result;
	}
	
	@Override
	public List<ShopVO> shopSelectAll() {
		List<ShopVO> shops = null;

		final String sql = "SELECT * FROM SHOP";
		
		shops = template.query(sql, new Object[]{}, new RowMapper<ShopVO>() {

			@Override
			public ShopVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ShopVO shop = new ShopVO();
				shop.setShopID(rs.getString("SHOP_ID"));
				shop.setShopName(rs.getString("SHOP_NAME"));
				shop.setShopPw(rs.getString("SHOP_PW"));
				return shop;
			}
			
		});
		
		if(shops.isEmpty()) 
			return null;
		
		return shops;	
	}
	
	@Override
	public ShopVO shopSelectByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int shopUpdate(ShopVO shop) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public int shopLogIn(String ID, String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int shopLogOut() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ShopVO shopSelect(ShopVO shop) {
		
	List<ShopVO> shops = null;
			
			final String sql = "SELECT * FROM EMPLOYEE WHERE SHOP_ID=?";
			
			shops = template.query(sql, new Object[]{}, new RowMapper<ShopVO>() {

				@Override
				public ShopVO mapRow(ResultSet rs, int rowNum) throws SQLException {
					ShopVO shop = new ShopVO();
					shop.setShopID(rs.getString("SHOP_ID"));
					return shop;
				}
				
			});
			
			if(shops.isEmpty()) 
				return null;
			
			return shops.get(0);
			
		}
=======
				ps.setString(1, shop.getShopId());
				ps.setString(2, shop.getShopName());
				ps.setString(3, shop.getShopPw());
				
			}
		});

		
		return result;
	}
	
	@Override
	public List<ShopVO> shopSelectAll() {
		List<ShopVO> shops = null;

		final String sql = "SELECT * FROM SHOP";
		
		shops = template.query(sql, new Object[]{}, new RowMapper<ShopVO>() {

			@Override
			public ShopVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				ShopVO shop = new ShopVO();
				shop.setShopId(rs.getString("SHOP_ID"));
				shop.setShopName(rs.getString("SHOP_NAME"));
				shop.setShopPw(rs.getString("SHOP_PW"));
				return shop;
			}
			
		});
		
		if(shops.isEmpty()) 
			return null;
		
		return shops;	
	}
	
	@Override
	public ShopVO shopSelectByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int shopUpdate(ShopVO shop) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public int shopLogIn(String ID, String name) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int shopLogOut() {
		// TODO Auto-generated method stub
		return 0;
	}
	
>>>>>>> branch 'master' of https://github.com/90factory/3rd_employee.git
	

}
