/**
 * 
 */
package com.lostyue.ltcms.common;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author ra
 */
@Repository("ltcmsBaseDao")
public class LtcmsBaseDao extends JdbcDaoSupport{
	/**
	 * 注入数据源
	 * @param dataSource
	 */
	@Resource(name="dataSource")
	public void setDatasource(DataSource dataSource) {
		setDataSource(dataSource);
	}
}
