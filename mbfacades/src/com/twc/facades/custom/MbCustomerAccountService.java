/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.commerceservices.customer.CustomerAccountService;

import java.util.Set;

import com.twc.core.model.PhonePrefixModel;


/**
 * @author 10561
 *
 */
public interface MbCustomerAccountService extends CustomerAccountService
{

	public Set<PhonePrefixModel> getPhonePrefix();

}
