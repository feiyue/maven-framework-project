/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

/**
 * @author ra
 *
 */
@Repository("menuDao")
public class MenuDao{
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List getMenu(){
		return jdbcTemplate.queryForList("SELECT *FROM LT_MENU");
	}
	
	public void newMenu(){
		jdbcTemplate.update("INSERT INTO LT_MENU(LT_MENU_ID, LT_MENU_NAME, CREATE_DATE) VALUES(?, ?, NOW())", new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement arg0) throws SQLException {
				arg0.setString(1, UUID.randomUUID().toString());
				arg0.setString(2, UUID.randomUUID().toString());
			}
		});
	}
	
	public void newMenuError(){
		jdbcTemplate.update("INSERT INTO LT_MENU(LT_MENU_ID1, LT_MENU_NAME, CREATE_DATE) VALUES(?, ?, NOW())", new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement arg0) throws SQLException {
				arg0.setString(1, UUID.randomUUID().toString());
				arg0.setString(2, UUID.randomUUID().toString());
			}
		});
	}
}
