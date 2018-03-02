/**
 *
 */

/**
 * @author 10561
 *
 */
package com.twc.cmscomponents.Facade;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twc.cmscomponents.service.NewsletterSevice;


@Service(value = "newsletterFacade")
public class NewsLettersFacadeImpl implements NewsletterFacade
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.cmscomponents.Facade.NewsletterFacade#subscribeToNewsletterUpdate(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */

	@Resource(name = "newsletterSevice")
	NewsletterSevice newsletterSevice;


	// YTODO Auto-generated method stub


	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.cmscomponents.Facade.NewsletterFacade#subscribeToNewsletterUpdate(com.twc.cmscomponent.form.
	 * NewsletterSubscribeForm)
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.twc.cmscomponents.Facade.NewsletterFacade#subscribeToNewsletterUpdate(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void subscribeToNewsletterUpdate(final String email, final String fname, final String lname)
	{
		// YTODO Auto-generated method stub
		System.out.println("testingg one two");
		newsletterSevice.subscribeToNewsLetter(fname, lname, email);

	}


}
