/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
package com.lostyue.ltcms.admin.tlddef;

/**
 * 2015年12月20日
 * @author 许彬
 * @Description 
 */
public class DataTableColumnDef implements Comparable<DataTableColumnDef>{

	private String headerName;
	
	private String columnName;
	
	private double columnIndex;

	public String getHeaderName() {
		return headerName;
	}

	public void setHeaderName(String headerName) {
		this.headerName = headerName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public double getColumnIndex() {
		return columnIndex;
	}

	public void setColumnIndex(double columnIndex) {
		this.columnIndex = columnIndex;
	}

	@Override
	public int compareTo(DataTableColumnDef o) {
		return o.getColumnIndex() > this.getColumnIndex()?-1:1;
	}
}
