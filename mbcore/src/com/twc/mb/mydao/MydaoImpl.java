/**
 *
 */
package com.twc.mb.mydao;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import java.util.List;


/**
 * @author 10561
 *
 */

//@Component(value = "mydaoimple")
public class MydaoImpl implements Mydao
{



	//@Autowired
	//private FlexibleSearchService flexibleSearchService;


	private FlexibleSearchService flexibleSearchService;


	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}

	private String queryString;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.mb.mydao.Mydao#getProduct()
	 */
	@Override
	public List<ProductModel> getProduct()
	{
		queryString = "SELECT {p:" + ProductModel.PK + "} "//
				+ "FROM {" + ProductModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);
		final SearchResult<ProductModel> searchresult = getFlexibleSearchService().search(query);
		if (searchresult != null)
		{

			System.out.println("data is comming");
		}


		return null;
	}

}
