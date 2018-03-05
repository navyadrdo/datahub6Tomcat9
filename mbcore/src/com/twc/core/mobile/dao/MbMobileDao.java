/**
 *
 */
package com.twc.core.mobile.dao;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public interface MbMobileDao
{

	public List<PhonePrefixModel> getAllMobilePrefixes();

	public List<ProductModel> getproucts();

	public List<ProductModel> getprduct_specific_coloumns();

	/**
	 * @return
	 */
	List<ProductModel> getprduct_specific_coloumns1();

	public List<ProductModel> getprduct_starColoumns();


}
