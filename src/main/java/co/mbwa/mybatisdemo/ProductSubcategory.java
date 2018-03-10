	package co.mbwa.mybatisdemo;

import java.util.Date;

public class ProductSubcategory {

	String productCategoryId;
	String productSubcategoryId;
	String rowGuid;
	String name;
	Date modifiedDate;
	
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductSubcategoryId() {
		return productSubcategoryId;
	}
	public void setProductSubcategoryId(String productSubcategoryId) {
		this.productSubcategoryId = productSubcategoryId;
	}
	public String getRowGuid() {
		return rowGuid;
	}
	public void setRowGuid(String rowGuid) {
		this.rowGuid = rowGuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	
}
