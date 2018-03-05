/**
 *
 */
package com.twc.facades.Mobile;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.twc.core.mobile.service.MbMobilePrefixService;
import com.twc.core.model.PhonePrefixModel;
import com.twc.facades.data.Phoneprefixdata;


/**
 * @author 10561
 *
 */
public class MbMobilePrefixFacadesImpl implements MbMobilePrefixFacade
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.facades.Impl.MbMobilePrefixFacade#getAllPhonePrefixes()
	 */


	public MbMobilePrefixService mobilePrefixserviceimpl;

	public Converter<PhonePrefixModel, Phoneprefixdata> mobilePrefixConverter;

	/**
	 * @return the mobilePrefixserviceimpl
	 */
	public MbMobilePrefixService getMobilePrefixserviceimpl()
	{
		return mobilePrefixserviceimpl;
	}


	/**
	 * @return the mobilePrefixConverter
	 */
	public Converter<PhonePrefixModel, Phoneprefixdata> getMobilePrefixConverter()
	{
		return mobilePrefixConverter;
	}


	/**
	 * @param mobilePrefixConverter
	 *           the mobilePrefixConverter to set
	 */
	public void setMobilePrefixConverter(final Converter<PhonePrefixModel, Phoneprefixdata> mobilePrefixConverter)
	{
		this.mobilePrefixConverter = mobilePrefixConverter;
	}


	/**
	 * @param mobilePrefixserviceimpl
	 *           the mobilePrefixserviceimpl to set
	 */
	public void setMobilePrefixserviceimpl(final MbMobilePrefixService mobilePrefixserviceimpl)
	{
		this.mobilePrefixserviceimpl = mobilePrefixserviceimpl;
	}


	@Override
	public List<Phoneprefixdata> getAllPhonePrefixes()
	{

		System.out.println(" your in mobile phone prefixes facades impl");
		// YTODO Auto-generated method stub

		return Converters.convertAll(getMobilePrefixserviceimpl().getAllMobilePrefixes(), mobilePrefixConverter);
	}

}
