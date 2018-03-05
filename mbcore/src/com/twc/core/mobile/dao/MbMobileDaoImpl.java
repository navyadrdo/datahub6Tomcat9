/**
 *
 */
package com.twc.core.mobile.dao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.twc.core.model.PhonePrefixModel;



/**
 * @author 10561
 *
 */
public class MbMobileDaoImpl extends DefaultGenericDao<PhonePrefixModel> implements MbMobileDao
{



	@Autowired
	private FlexibleSearchService flexibleSearchService;




	/**
	 * @param typecode
	 */
	public MbMobileDaoImpl(final String typecode)
	{
		super(typecode);
		// YTODO Auto-generated constructor stub
	}

	public MbMobileDaoImpl()
	{
		super(PhonePrefixModel._TYPECODE);
		// YTODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.core.mobile.dao.MbMobileDao#getAllMobilePrefixes()
	 */
	@Override
	public List getAllMobilePrefixes()
	{

		System.out.println("U r in Dao 's ");


		/*
		 * final List ll = new ArrayList(); ll.add(12); ll.add(13); ll.add(14);
		 */


		// YTODO Auto-generated method stub
		this.getprduct_starColoumns();
		this.getselectiveColoumns();
		this.getprduct_specific_coloumns1();
		this.getprduct_specific_coloumns();
		this.getproucts();
		return find();





	}



	/**
	 *
	 */
	private void getselectiveColoumns()
	{
		// YTODO Auto-generated method stub


		/*
		 * String queryStr = "SELECT {vin} FROM {Car}" + " WHERE {Car.warrantyExpiry} < '2015-12-01 0:00:00.0'";
		 */

		final String queryStr = " select {code}  from {Product} order by {name} ";
		final FlexibleSearchQuery fsq = new FlexibleSearchQuery(queryStr);
		final Class[] resultTypesArray =
		{ String.class };
		fsq.setResultClassList(Arrays.asList(resultTypesArray));
		final SearchResult<String> result = getFlexibleSearchService().search(fsq);
		final List<String> vinList = result.getResult();
		for (final String carVin : vinList)
		{
			System.out.println("VIN: " + carVin);
		}

	}

	public List<ProductModel> getproucts()
	{
		// YTODO Auto-generated method stub

		final String queryString = //
				"SELECT {p:" + ProductModel.PK + "} "//
						+ "FROM {" + ProductModel._TYPECODE + " AS p} ";
		System.out.println(" From table ...." + ProductModel._TYPECODE);



		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		//System.out.println("passing query is " + query);

		final SearchResult<ProductModel> search = flexibleSearchService.search(query);
		final List<ProductModel> result = search.getResult();
		if (result != null)
		{
			for (final ProductModel item : result)
			{
				System.out.println(item.getCode());
				System.out.println(item.getName());
			}

		}

		result.forEach(item -> System.out.println(item.getCode()));

		return result;


		//return flexibleSearchService.<ProductModel> search(query).getResult();
	}




	@Override
	public List<ProductModel> getprduct_specific_coloumns()
	{
		// YTODO Auto-generated method stub

		final String queryString = //
				"SELECT {p:" + ProductModel.ERPNAME + "} " + ", {p:" + ProductModel.NAME + "} ,{p:" + ProductModel.APPROVALSTATUS
						+ "} ,{p:" + ProductModel.PRICEQUANTITY + "} " + "FROM {" + ProductModel._TYPECODE + " AS p} ";

		System.out.println(" Specific Products  ...." + ProductModel._TYPECODE);

		System.out.println(" From table ...." + ProductModel._TYPECODE);



		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		//System.out.println("passing query is " + query);



		final SearchResult<ProductModel> search = flexibleSearchService.search(query);
		final List<ProductModel> result = search.getResult();
		if (result != null)
		{
			for (final ProductModel item : result)
			{
				/*
				 * System.out.println(item.getCode()); System.out.println(item.getName());
				 */
			}

		}

		result.forEach(item -> System.out.println(item.getCode()));

		return result;


		//return flexibleSearchService.<ProductModel> search(query).getResult();
	}


	@Override
	public List<ProductModel> getprduct_specific_coloumns1()
	{


		final String queryStr = "select {code}  from {Product} order by {name}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryStr);
		//query.addQueryParameter("language", currentLanguageModel);
		query.setResultClassList(Arrays.asList(String.class));

		// SearchResult&lt;List&gt; searchResults =	 flexibleSearchService.search(query);
		final SearchResult<String> searchResult = flexibleSearchService.search(query);
		final List<String> result12 = searchResult.getResult();
		if (!result12.isEmpty())
		{
			result12.forEach(item -> System.out.println("values" + item.toString()));
		}
		return null;


	}




	@Override
	public List<ProductModel> getprduct_starColoumns()
	{


		final String queryStr = "select {pk}  from {Product}";
		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryStr);
		//query.addQueryParameter("language", currentLanguageModel);
		//query.setResultClassList(Arrays.asList(String.class));
		//query.setResultClassList(Arrays.asList(ProductModel.class));

		// SearchResult&lt;List&gt; searchResults =	 flexibleSearchService.search(query);
		final SearchResult<ProductModel> searchResult = flexibleSearchService.search(query);
		final List<ProductModel> result12 = searchResult.getResult();
		if (!result12.isEmpty())
		{
			result12.forEach(item -> System.out.println("values" + item.toString()));
		}
		return null;


	}

}
