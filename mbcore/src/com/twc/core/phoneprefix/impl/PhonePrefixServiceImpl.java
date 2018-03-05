/**
 *
 */
package com.twc.core.phoneprefix.impl;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;
import com.twc.core.phoneprefix.dao.PhonePrefixDao;
import com.twc.core.phoneprefix.service.PhoneprefixService;


/**
 * @author 10561
 *
 */
public class PhonePrefixServiceImpl implements PhoneprefixService
{

	/*
	 * @Autowired PhonePrefixDao phoneprefixdao;
	 */
	public PhonePrefixDao prefixDao;

	/*	*//**
		   * @return the phoneprefixdao
		   */





	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.core.phoneprefix.service.PhoneprefixService#getAllPhonePrefix()
	 */
	@Override
	public List<PhonePrefixModel> getAllPhonePrefix()
	{
		// YTODO Auto-generated method stub

		//return phoneprefixdao.getAllPhonePreFix();

		System.out.println("u r in phoneprefix service");
		return getPrefixDao().getAllPhonePreFix();
	}

	/**
	 * @return the prefixDao
	 */
	public PhonePrefixDao getPrefixDao()
	{
		return prefixDao;
	}

	/**
	 * @param prefixDao
	 *           the prefixDao to set
	 */
	public void setPrefixDao(final PhonePrefixDao prefixDao)
	{
		this.prefixDao = prefixDao;
	}



}
