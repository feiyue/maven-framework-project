/**
 * 
 */
package com.lostyue.ltcms.admin.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ra
 *
 */
@Entity(name="LT_MENU")
public class Menu implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String lt_menu_id;
	
	private String lt_menu_name;
	
	private String lt_menu_code;
	
	private Date create_date;

	public String getLt_menu_id() {
		return lt_menu_id;
	}

	public void setLt_menu_id(String lt_menu_id) {
		this.lt_menu_id = lt_menu_id;
	}

	public String getLt_menu_name() {
		return lt_menu_name;
	}

	public void setLt_menu_name(String lt_menu_name) {
		this.lt_menu_name = lt_menu_name;
	}

	public String getLt_menu_code() {
		return lt_menu_code;
	}

	public void setLt_menu_code(String lt_menu_code) {
		this.lt_menu_code = lt_menu_code;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
}
