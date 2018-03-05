/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.servicelayer.user.UserService;

import java.util.List;

import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public interface MbDefaultUserService extends UserService
{

	public List<PhonePrefixModel> getAllPhonePrefixes();

}
