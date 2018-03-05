/**
 *
 */
package com.twc.facades.populators;


import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;

/*import de.hybris.platform.commercefacades.product.converters.populator.pr
*/

//import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;


/**
 * @author 10561
 *
 */



public class MbProductBasicPopulators extends ProductBasicPopulator<ProductModel, ProductData>
{

	private CommonI18NService commonI18NService;

	@Override
	public void populate(final ProductModel productModel, final ProductData productData) throws ConversionException
	{
		{
			super.populate(productModel, productData);
			System.out.println("");
			productData.setMyalias(productModel.getMyalias());
			//productData.setStock(productModel.getStockLevels());


		}

	}

	/**
	 * @return the commonI18NService
	 */
	public CommonI18NService getCommonI18NService()
	{
		return commonI18NService;
	}

	/**
	 * @param commonI18NService
	 *           the commonI18NService to set
	 */
	public void setCommonI18NService(final CommonI18NService commonI18NService)
	{
		this.commonI18NService = commonI18NService;
	}


}