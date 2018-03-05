/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;
import com.twc.core.phoneprefix.service.PhoneprefixService;
import com.twc.facades.data.Phoneprefixdata;


/**
 * @author 10561
 *
 */
public class MbPhonePrefixFacadeImpl implements MbPhonePrefix
{

	private Converter<PhonePrefixModel, Phoneprefixdata> phoneprefixconverter;
	private PhoneprefixService phonePrefixService;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.facades.custom.MbPhonePrefix#getAllPrefixes()
	 */
	@Override
	public List<Phoneprefixdata> getAllPrefixes()
	{
		// YTODO Auto-generated method stub

		System.out.println("it's a another method");
		return Converters.convertAll(getPhonePrefixService().getAllPhonePrefix(), phoneprefixconverter);
	}


	/**
	 * @return the phoneprefixconverter
	 */
	public Converter<PhonePrefixModel, Phoneprefixdata> getPhoneprefixconverter()
	{
		return phoneprefixconverter;
	}

	/**
	 * @param phoneprefixconverter
	 *           the phoneprefixconverter to set
	 */
	public void setPhoneprefixconverter(final Converter<PhonePrefixModel, Phoneprefixdata> phoneprefixconverter)
	{
		this.phoneprefixconverter = phoneprefixconverter;
	}


	/**
	 * @return the phonePrefixService
	 */
	public PhoneprefixService getPhonePrefixService()
	{
		return phonePrefixService;
	}


	/**
	 * @param phonePrefixService
	 *           the phonePrefixService to set
	 */
	public void setPhonePrefixService(final PhoneprefixService phonePrefixService)
	{
		this.phonePrefixService = phonePrefixService;
	}







}
