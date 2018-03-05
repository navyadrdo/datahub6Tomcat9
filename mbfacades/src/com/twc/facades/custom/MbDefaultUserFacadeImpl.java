/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.commercefacades.user.impl.DefaultUserFacade;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.Set;

import com.twc.core.model.PhonePrefixModel;
import com.twc.facades.data.Phoneprefixdata;


/**
 * @author 10561
 *
 */


/*
 * #public class EuronicsCustomerFacadeImpl extends DefaultCustomerFacade implements EuronicsCustomerFacade {
 */

public class MbDefaultUserFacadeImpl extends DefaultUserFacade implements MbDefaultUserFacade
{


	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.facades.custom.MbUserFacade#getAllPhonePrefixes()
	 */

	public MbCustomerAccountService mbcustomerAccountservice;



	/**
	 * @return the mbcustomerAccountservice
	 */
	public MbCustomerAccountService getMbcustomerAccountservice()
	{
		return mbcustomerAccountservice;
	}



	/**
	 * @param mbcustomerAccountservice
	 *           the mbcustomerAccountservice to set
	 */
	public void setMbcustomerAccountservice(final MbCustomerAccountService mbcustomerAccountservice)
	{
		this.mbcustomerAccountservice = mbcustomerAccountservice;
	}



	private Converter<PhonePrefixModel, Phoneprefixdata> phoneprefixConverter;



	@Override
	public Set<PhonePrefixModel> getAllPhonePrefixes()
	{
		// YTODO Auto-generated method stub
		return getMbcustomerAccountservice().getPhonePrefix();
	}


}
