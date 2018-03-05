/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.servicelayer.user.impl.DefaultUserService;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;
import com.twc.core.phoneprefix.dao.PhonePrefixDao;


/**
 * @author 10561
 *
 */
public class MbDefaultUserServiceImpl extends DefaultUserService implements MbDefaultUserService
{

	public PhonePrefixDao phoneprefixdao;

	/**
	 * @return the phoneprefixdao
	 */
	private PhonePrefixDao getPhoneprefixdao()
	{
		return phoneprefixdao;
	}

	/**
	 * @param phoneprefixdao
	 *           the phoneprefixdao to set
	 */
	private void setPhoneprefixdao(final PhonePrefixDao phoneprefixdao)
	{
		this.phoneprefixdao = phoneprefixdao;
	}




	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.facades.custom.MbUserService#getAllPhonePrefixes()
	 */
	@Override
	public List<PhonePrefixModel> getAllPhonePrefixes()
	{
		return getPhoneprefixdao().getAllPhonePreFix();
	}

}
