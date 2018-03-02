package com.twc.cmscomponents.facades.email.context.test;

/*package com.twc.cmscomponents.facades.email.context.test;


 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *


 import de.hybris.platform.acceleratorservices.model.cms2.pages.EmailPageModel;
 import de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext;
 import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
 import de.hybris.platform.core.model.c2l.LanguageModel;
 import de.hybris.platform.core.model.user.CustomerModel;

 import com.twc.cmscomponents.model.NewsletterModel;
 import com.twc.cmscomponents.model.process.NewsLetterSubScripitonProcessModel;


 *//**
 * Velocity context for email about partially order modification.
 */
/*
 public class NewsLetterSubscriptionEmailContextokkok extends AbstractEmailContext<NewsLetterSubScripitonProcessModel>
 {


 public String fname;
 public String lname;
 public String email;

 private NewsletterModel newsletter;


 * (non-Javadoc)
 *
 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getSite(de.hybris.platform.
 * processengine.model.BusinessProcessModel)


 @Override
 protected BaseSiteModel getSite(final NewsLetterSubScripitonProcessModel businessProcessModel)
 {
 // YTODO Auto-generated method stub
 return businessProcessModel.getSite();
 }

 *//**
 * @return the fname
 */
/*
 public String getFname()
 {
 return fname;
 }

 *//**
 * @param fname
 *           the fname to set
 */
/*
 public void setFname(final String fname)
 {
 this.fname = fname;
 }

 *//**
 * @return the lname
 */
/*
 public String getLname()
 {
 return lname;
 }

 *//**
 * @param lname
 *           the lname to set
 */
/*
 public void setLname(final String lname)
 {
 this.lname = lname;
 }

 *//**
 * @return the email
 */
/*
 @Override
 public String getEmail()
 {
 return email;
 }

 *//**
 * @param email
 *           the email to set
 */
/*
 * public void setEmail(final String email) { this.email = email; }
 *
 *
 * (non-Javadoc)
 *
 * @see de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getCustomer(de.hybris.platform
 * .processengine.model.BusinessProcessModel)
 *
 * @Override protected CustomerModel getCustomer(final NewsLetterSubScripitonProcessModel businessProcessModel) { //
 * YTODO Auto-generated method stub
 *
 * return null; }
 *
 *
 * (non-Javadoc)
 *
 * @see
 * de.hybris.platform.acceleratorservices.process.email.context.AbstractEmailContext#getEmailLanguage(de.hybris.platform
 * .processengine.model.BusinessProcessModel)
 *
 * @Override protected LanguageModel getEmailLanguage(final NewsLetterSubScripitonProcessModel businessProcessModel) {
 * // YTODO Auto-generated method stub return businessProcessModel.getSite().getDefaultLanguage(); }
 *
 *
 *
 * @Override public void init(final NewsLetterSubScripitonProcessModel storeFrontProcessModel, final EmailPageModel
 * emailPageModel) { super.init(storeFrontProcessModel, emailPageModel);
 * newsletter.setFirstName(storeFrontProcessModel.getNewsletterSubscriptionprocess().getFirstName());
 * newsletter.setLastName(storeFrontProcessModel.getNewsletterSubscriptionprocess().getLastName());
 * newsletter.setEmail(storeFrontProcessModel.getNewsletterSubscriptionprocess().getEmail());
 *
 *
 *
 * }
 *
 *
 * }
 */