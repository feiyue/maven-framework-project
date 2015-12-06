/**
 * 
 */
package com.lostyue.ltcms.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lostyue.ltcms.common.LtcmsBaseDao;

/**
 * @author ra
 *
 */
@Repository("ltMenuDao")
public class LtMenuDao extends LtcmsBaseDao {
	
	public List getMenu(){
		return this.getJdbcTemplate().queryForList("SELECT *FROM LT_MENU");
	}
}
