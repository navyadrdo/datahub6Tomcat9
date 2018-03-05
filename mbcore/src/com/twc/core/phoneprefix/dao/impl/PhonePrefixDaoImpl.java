/**
 *
 */
package com.twc.core.phoneprefix.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;
import com.twc.core.phoneprefix.dao.PhonePrefixDao;


/**
 * @author 10561
 *
 */
public class PhonePrefixDaoImpl extends DefaultGenericDao<PhonePrefixModel> implements PhonePrefixDao
{

	/**
	 * @param typecode
	 */
	public PhonePrefixDaoImpl(final String PhonePrefix)
	{
		super(PhonePrefixModel._TYPECODE);
		// YTODO Auto-generated constructor stub
	}


	public PhonePrefixDaoImpl()
	{
		super(PhonePrefixModel._TYPECODE);
		// YTODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.core.phoneprefix.dao.PhonePrefixDao#getAllPhonePreFix()
	 */
	@Override
	public List<PhonePrefixModel> getAllPhonePreFix()
	{

		System.out.println("your in dao");
		// YTODO Auto-generated method stub
		return this.find();

	}

}
