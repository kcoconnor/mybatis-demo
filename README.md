# mybatis-demo

a sample spring boot project using mybatis, sql server, and adventureworks using multiple result sets and the jtds driver

Purpose
-------
A SQL Server stored procedure can return multiple result sets.  The result sets do not have to relate to each other.  Based on the MyBatis documentation (http://www.mybatis.org/mybatis-3/sqlmap-xml.html#Result_Maps) it was not clear how to reference each result set.

The project was an attempt to illustrate how to return multiple unrelated results.

    <resultMap id="ProductionDataHolderResultMap" type="co.mbwa.mybatisdemo.ProductionDataHolder">
		  <id column="id" property="id" />	
		  <result column="id" property="id" />
		  <collection  property="productCategories" resultMap="ProductCategoryResultMap" resultSet="2" />
		  <collection  property="productSubcategories" resultMap="ProductSubcategoryResultMap" resultSet="3" />
		  <collection  property="unitMeasures" resultMap="UnitMeasureResultMap" resultSet="4"/>		
    </resultMap>
  
  	<select id="getProductionLookupData" resultMap="ProductionDataHolderResultMap" statementType="CALLABLE" resultSets="1,2,3,4">
  		{call [dbo].[GetProductionLookupData]}
    </select>

The key was in how the result sets are named.  The examples showed table names.  For SQL Server and the jTDS driver, integer ordinal values need to be used.


Setup
-----
SQL Server Express 2014 & SQL Server Management Studio Express 2014
https://www.microsoft.com/en-us/download/details.aspx?id=42299

AdventureWorks
https://github.com/Microsoft/sql-server-samples/releases/tag/adventureworks

Java JDK
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Apache Maven Download
https://maven.apache.org/download.cgi

Spring Tool Suite
https://spring.io/tools/sts/all

Spring Boot
https://projects.spring.io/spring-boot/

Mybatis
http://www.mybatis.org/mybatis-3/

Mybatis Spring
http://www.mybatis.org/spring/

Mybatis Spring Boot Starter
http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/

jTDS JDBC SQL Server Driver
http://jtds.sourceforge.net/

