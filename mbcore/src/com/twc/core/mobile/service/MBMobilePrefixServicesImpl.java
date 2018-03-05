/**
 *
 */
package com.twc.core.mobile.service;

import java.util.List;

import com.twc.core.mobile.dao.MbMobileDao;
import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public class MBMobilePrefixServicesImpl implements MbMobilePrefixService
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.core.mobile.service.MobilePrefixService#getAllMobilePrefixes()
	 */

	public MbMobileDao mobilePrefixDao;




	/**
	 * @return the mobilePrefixDao
	 */
	public MbMobileDao getMobilePrefixDao()
	{
		return mobilePrefixDao;
	}




	/**
	 * @param mobilePrefixDao
	 *           the mobilePrefixDao to set
	 */
	public void setMobilePrefixDao(final MbMobileDao mobilePrefixDao)
	{
		this.mobilePrefixDao = mobilePrefixDao;
	}




	@Override
	public List<PhonePrefixModel> getAllMobilePrefixes()
	{

		System.out.println("your in services");
		// YTODO Auto-generated method stub
		List<PhonePrefixModel> ph = null;
		ph = getMobilePrefixDao().getAllMobilePrefixes();
		System.out.println("size of the prefixes are" + ph.size());

		return ph;
		//return null;
	}

}
