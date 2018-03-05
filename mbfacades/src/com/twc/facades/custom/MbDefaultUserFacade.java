/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.commercefacades.user.UserFacade;

import java.util.Set;

import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public interface MbDefaultUserFacade extends UserFacade
{
	//public interface EuronicsUserFacade extends UserFacade {

	public Set<PhonePrefixModel> getAllPhonePrefixes();


}
