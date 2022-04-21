package com.simplilearn.phase3.dao;

/*import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.phase3.model.Products;

@Repository
public class ProductsDAO {
	
	@Autowired
	JdbcTemplate template;
	
	public List<Products> getProducts(){
		
		return template.query("select * from Products", new RowMapper<Products>(){
			
			public Products mapRow(ResultSet rs,int row) throws SQLException{
				Products e = new Products();
				e.setName(rs.getString(1));
				e.setCategory(rs.getString(2));
				e.setSKU(rs.getString(3));
				e.setMRP(rs.getInt(4));
				e.setSP(rs.getInt(5));
				return e;
			}
		});
	}
	
	

}
*/