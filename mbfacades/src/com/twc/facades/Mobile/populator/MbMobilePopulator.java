/**
 *
 */
package com.twc.facades.Mobile.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.twc.core.model.PhonePrefixModel;
import com.twc.facades.data.Phoneprefixdata;


/**
 * @author 10561
 *
 */
public class MbMobilePopulator implements Populator<PhonePrefixModel, Phoneprefixdata>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final PhonePrefixModel source, final Phoneprefixdata target) throws ConversionException
	{
		// YTODO Auto-generated method stub
		target.setPrefixcode(source.getPrefixCode());
		System.out.println("populator being used now");

	}

}
