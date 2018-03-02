/**
 *
 */
package com.twc.wishlist.addon.populator;

import de.hybris.platform.commercefacades.converter.ConfigurablePopulator;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.product.data.StockData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.wishlist2.model.Wishlist2EntryModel;

import java.util.Arrays;

import com.twc.wishlist.addon.data.Wishlist2EntryData;


/**
 * @author 10561
 * @param <Wishlist2EntryData>
 *
 */

//com.twc.wishlist.addon.populator.Wishlist2EntryDataPopulator
//@Component
//@Qualifier("wishlist2entryDataPopulatorbean")
public class Wishlist2EntryDataPopulator implements Populator<Wishlist2EntryModel, Wishlist2EntryData>
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */


	private Converter<ProductModel, ProductData> productConverter;
	private ConfigurablePopulator<ProductModel, ProductData, ProductOption> productConfiguredPopulator;
	private Converter<ProductModel, StockData> stockConverter;



	/**
	 * @return the productConverter
	 */
	public Converter<ProductModel, ProductData> getProductConverter()
	{
		return productConverter;
	}



	/**
	 * @param productConverter
	 *           the productConverter to set
	 */
	public void setProductConverter(final Converter<ProductModel, ProductData> productConverter)
	{
		this.productConverter = productConverter;
	}



	/**
	 * @return the productConfiguredPopulator
	 */
	public ConfigurablePopulator<ProductModel, ProductData, ProductOption> getProductConfiguredPopulator()
	{
		return productConfiguredPopulator;
	}



	/**
	 * @param productConfiguredPopulator
	 *           the productConfiguredPopulator to set
	 */
	public void setProductConfiguredPopulator(
			final ConfigurablePopulator<ProductModel, ProductData, ProductOption> productConfiguredPopulator)
	{
		this.productConfiguredPopulator = productConfiguredPopulator;
	}



	/**
	 * @return the stockConverter
	 */
	public Converter<ProductModel, StockData> getStockConverter()
	{
		return stockConverter;
	}



	/**
	 * @param stockConverter
	 *           the stockConverter to set
	 */
	public void setStockConverter(final Converter<ProductModel, StockData> stockConverter)
	{
		this.stockConverter = stockConverter;
	}



	@Override
	public void populate(final Wishlist2EntryModel wishlistentrymodel, final Wishlist2EntryData wishlist2entrydata)
			throws ConversionException
	{
		// YTODO Auto-generated method stub

		ProductData productData = null;

		if (wishlistentrymodel.getProduct() != null)
		{

			//getProductConverter().convert(arg0, arg1)
			//productData = getProductConverter().convert(wishlistentrymodel.getProduct(), productData);
			productData = getProductConverter().convert(wishlistentrymodel.getProduct());
			System.out.println("product code" + productData.getCode());
			System.out.println("procut description" + productData.getDescription());


			getProductConfiguredPopulator().populate(
					wishlistentrymodel.getProduct(),
					productData,
					Arrays.asList(ProductOption.BASIC, ProductOption.PRICE, ProductOption.SUMMARY, ProductOption.DESCRIPTION,
							ProductOption.GALLERY, ProductOption.CATEGORIES, ProductOption.REVIEW, ProductOption.PROMOTIONS,
							ProductOption.CLASSIFICATION, ProductOption.VARIANT_FULL, ProductOption.STOCK));

			productData.setStock(getStockConverter().convert(wishlistentrymodel.getProduct()));
			wishlist2entrydata.setProduct(productData);
			System.out.println("Produt Name " + productData.getName());
			System.out.println("Produt Name " + productData.getStock().getStockLevel());
			wishlist2entrydata.setDesired(wishlistentrymodel.getDesired());
			wishlist2entrydata.setPriority(wishlistentrymodel.getPriority().name());
		}





	}

}
