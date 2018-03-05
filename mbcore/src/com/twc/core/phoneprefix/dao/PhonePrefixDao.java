/**
 *
 */
package com.twc.core.phoneprefix.dao;

import de.hybris.platform.servicelayer.internal.dao.GenericDao;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public interface PhonePrefixDao extends GenericDao<PhonePrefixModel>
{

	public List<PhonePrefixModel> getAllPhonePreFix();

	/**
	 * @return
	 */

}
