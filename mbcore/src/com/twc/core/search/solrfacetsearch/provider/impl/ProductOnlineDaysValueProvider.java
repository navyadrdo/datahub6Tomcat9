/**
 *
 */
package com.twc.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * @author 10561
 *
 */
public class ProductOnlineDaysValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider, Serializable
{

	private FieldNameProvider fieldNameProvider;




	/**
	 * @return the fieldNameProvider
	 */
	public FieldNameProvider getFieldNameProvider()
	{
		return fieldNameProvider;
	}



	/**
	 * @param fieldNameProvider
	 *           the fieldNameProvider to set
	 */
	public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
	{
		this.fieldNameProvider = fieldNameProvider;
	}



	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.solrfacetsearch.provider.FieldValueProvider#getFieldValues(de.hybris.platform.solrfacetsearch.
	 * config.IndexConfig, de.hybris.platform.solrfacetsearch.config.IndexedProperty, java.lang.Object)
	 */
	@SuppressWarnings("deprecation")
	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig indexconfig, final IndexedProperty indexprop,
			final Object model) throws FieldValueProviderException
	{
		// YTODO Auto-generated method stub

		if (model instanceof ProductModel)
		{
			final ProductModel productModel = (ProductModel) model;
			//final List<FieldValue> fieldValues = (List<FieldValue>) createFieldvalue(indexconfig, indexprop, productModel);

			final List<FieldValue> fieldValues = createFieldvalue(indexconfig, indexprop, productModel);

			return fieldValues;
		}
		return null;
	}



	/**
	 * @param productModel
	 * @param indexconfig
	 * @param indexprop
	 * @return
	 */




	protected List<FieldValue> createFieldvalue(final IndexConfig indexconfig, final IndexedProperty indexprop,
			final ProductModel model)
	{
		final List<FieldValue> fieldvalue = new ArrayList<FieldValue>();

		final Date offlineDate = model.getOfflineDate();
		final Date today = new Date();

		if (offlineDate != null)
		{
			final long diff = offlineDate.getTime() - today.getTime();
			final long noOfDaysOnline = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			addFieldValues(fieldvalue, indexprop, null, noOfDaysOnline);

		}

		return fieldvalue;




	}



	protected void addFieldValues(final List<FieldValue> fieldValues, final IndexedProperty indexedProperty,
			final LanguageModel language, final Object value)
	{
		final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty,
				(language == null) ? null : language.getIsocode());
		for (final String fieldName : fieldNames)
		{


			fieldValues.add(new FieldValue(fieldName, value));
		}

	}



	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * de.hybris.platform.solrfacetsearch.provider.FieldValueProvider#getFieldValues(de.hybris.platform.solrfacetsearch.
	 * config.IndexConfig, de.hybris.platform.solrfacetsearch.config.IndexedProperty, java.lang.Object)
	 */
	/*
	 * @SuppressWarnings("deprecation")
	 *
	 * @Override public Collection<FieldValue> getFieldValues(final IndexConfig indconfig, final IndexedProperty indprop,
	 * final Object obj) throws FieldValueProviderException { // YTODO Auto-generated method stub
	 *
	 * if (obj instanceof ProductModel) {
	 *
	 *
	 *
	 * return null; } return null; }
	 */







}
