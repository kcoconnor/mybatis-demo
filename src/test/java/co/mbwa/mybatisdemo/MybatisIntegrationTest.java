package co.mbwa.mybatisdemo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisIntegrationTest {
	
	@Autowired
	private ProductionLookupDataMapper mapper;
	
	public ProductionLookupDataMapper getMapper() {
		return mapper;
	}

	public void setMapper(ProductionLookupDataMapper mapper) {
		this.mapper = mapper;
	}

	@Test
	public void testCats() {

		List<ProductCategory> catResults = mapper.getProductCategories();
		assertNotNull(catResults);
		assertEquals(4, catResults.size());
		
	}

	
	@Test
	public void testSubs() {

		List<ProductSubcategory> subcatResults = mapper.getProductSubcategories();
		assertNotNull(subcatResults);
		assertEquals(37, subcatResults.size());
		
	}
	
	@Test
	public void testUnitMeasures() {

		List<UnitMeasure> unitMeasureResults = mapper.getUnitMeasures();
		assertNotNull(unitMeasureResults);
		assertEquals(38, unitMeasureResults.size());

	}
	
	@Test
	public void testProdLookupData() {
	
		ProductionDataHolder results = mapper.getProductionLookupData();
			assertNotNull(results);
			assertNotNull(results.getProductCategories());
			assertEquals(4, results.getProductCategories().size());

			assertNotNull(results.getProductSubcategories());
			assertEquals(37, results.getProductSubcategories().size());

			assertNotNull(results.getUnitMeasures());
			assertEquals(38, results.getUnitMeasures().size());
			
	}
	
}
