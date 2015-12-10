/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.lostyue.ltcms.common.LtcmsBaseDao;

/**
 * @author ra
 *
 */
@Repository("menuDao")
public class MenuDao extends LtcmsBaseDao {
	
	public List getMenu(){
		return this.getJdbcTemplate().queryForList("SELECT *FROM LT_MENU");
	}
	
	public void newMenu(){
		this.getJdbcTemplate().update("INSERT INTO LT_MENU(LT_MENU_ID, LT_MENU_NAME, CREATE_DATE) VALUES(?, ?, NOW())", new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement arg0) throws SQLException {
				arg0.setString(1, UUID.randomUUID().toString());
				arg0.setString(2, UUID.randomUUID().toString());
			}
		});
	}
}
