/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lostyue.ltcms.admin.model.LtMenu;

/**
 * @author ra
 *
 */
@Repository("menuDao")
public class MenuDao{
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
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
	
	public void insertLtMenu(final LtMenu menu){
		/*jdbcTemplate.update("INSERT INTO LT_MENU(LT_MENU_ID, LT_MENU_NAME, LT_MENU_CODE, CREATE_DATE) VALUES(?, ?, ?, NOW())", new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement arg0) throws SQLException {
				arg0.setString(1, menu.getMenuId());
				arg0.setString(2, menu.getMenuName());
				arg0.setString(3, menu.getMenuCode());
			}
		});*/
		sessionFactory.getCurrentSession().save(menu);
	}
	
	public LtMenu queryLtMenu(String menuId){
		return jdbcTemplate.queryForObject("SELECT *FROM LT_MENU T WHERE T.LT_MENU_ID = ?", new Object[]{menuId}, new RowMapper<LtMenu>(){
			public LtMenu mapRow(ResultSet rs, int rowNum) throws SQLException {
				LtMenu m = new LtMenu();
				m.setMenuCode(rs.getString("LT_MENU_CODE"));
				m.setMenuName(rs.getString("LT_MENU_NAME"));
				m.setMenuId(rs.getString("LT_MENU_ID"));
				m.setCreateDate(rs.getDate("CREATE_DATE"));
				return m;
			}});
	}
}
