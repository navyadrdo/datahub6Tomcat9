/**
 *
 */
package com.twc.facades.custom;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.TitleModel;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.Assert;


/**
 * @author 10561
 *
 */
public class MbCustomerFacadeImpl extends DefaultCustomerFacade
{

	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		//validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");

		System.out.println(" your entering to  MbCustomerFacadeImpl");
		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));

		if (StringUtils.isNotBlank(registerData.getFirstName()) && StringUtils.isNotBlank(registerData.getLastName()))
		{
			newCustomer.setName(getCustomerNameStrategy().getName(registerData.getFirstName(), registerData.getLastName()));
		}
		final TitleModel title = getUserService().getTitleForCode(registerData.getTitleCode());
		newCustomer.setTitle(title);
		setUidForRegister(registerData, newCustomer);
		newCustomer.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		newCustomer.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		newCustomer.setPhoneNo(registerData.getMobileNumber());
		newCustomer.setZipCode(registerData.getZipcode());

		System.out.println("Customer phone no :--" + newCustomer.getPhoneNo());
		getCustomerAccountService().register(newCustomer, registerData.getPassword());
	}





}
