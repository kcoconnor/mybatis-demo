package co.mbwa.mybatisdemo;



import java.util.List;

public class ProductionDataHolder {
	
	private String id;
	private List<ProductCategory> productCategories;
	private List<ProductSubcategory> productSubcategories;
	private List<UnitMeasure> unitMeasures;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ProductCategory> getProductCategories() {
		return productCategories;
	}
	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}
	public List<ProductSubcategory> getProductSubcategories() {
		return productSubcategories;
	}
	public void setProductSubcategories(List<ProductSubcategory> productSubcategories) {
		this.productSubcategories = productSubcategories;
	}
	public List<UnitMeasure> getUnitMeasures() {
		return unitMeasures;
	}
	public void setUnitMeasures(List<UnitMeasure> unitMeasures) {
		this.unitMeasures = unitMeasures;
	}

	
	
}
