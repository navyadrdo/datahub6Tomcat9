/**
 *
 */
package com.twc.cmscomponent.event;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;
/*import org.apache.poi.hssf.record.formula.functions.T;
 */
import de.hybris.platform.store.BaseStoreModel;

import com.twc.cmscomponents.model.NewsletterModel;


/**
 * @author 10561
 *
 */
public class NewsLetterSubscriptionEvent extends AbstractEvent
{
	//private String token;
	private NewsletterModel newsletter;
	private BaseStoreModel baseStore;
	private BaseSiteModel site;
	//private CustomerModel customer;
	private LanguageModel language;

	/**
	 * @return the token
	 */




	/**
	 * @param token
	 * @param newsletter
	 * @param baseStore
	 * @param site
	 * @param customer
	 * @param language
	 */
	public NewsLetterSubscriptionEvent(final NewsletterModel newsletter, final BaseStoreModel baseStore, final BaseSiteModel site,
			final LanguageModel language)
	{
		super();
		this.newsletter = newsletter;
		this.baseStore = baseStore;
		this.site = site;
		//this.customer = customer;
		this.language = language;
	}

	/**
	 * @param token
	 *           the token to set
	 */


	/**
	 *
	 */
	public NewsLetterSubscriptionEvent()
	{
		// YTODO Auto-generated constructor stub
		super();
	}

	/**
	 * @return the newsletter
	 */
	public NewsletterModel getNewsletter()
	{
		return newsletter;
	}

	/**
	 * @param newsletter
	 *           the newsletter to set
	 */
	public void setNewsletter(final NewsletterModel newsletter)
	{
		this.newsletter = newsletter;
	}

	/**
	 * @return the baseStore
	 */
	public BaseStoreModel getBaseStore()
	{
		return baseStore;
	}

	/**
	 * @param baseStore
	 *           the baseStore to set
	 */
	public void setBaseStore(final BaseStoreModel baseStore)
	{
		this.baseStore = baseStore;
	}

	/**
	 * @return the site
	 */
	public BaseSiteModel getSite()
	{
		return site;
	}

	/**
	 * @param site
	 *           the site to set
	 */
	public void setSite(final BaseSiteModel site)
	{
		this.site = site;
	}

	/**
	 * @return the customer
	 */
	/**
	 * @return the language
	 */
	public LanguageModel getLanguage()
	{
		return language;
	}

	/**
	 * @param language
	 *           the language to set
	 */
	public void setLanguage(final LanguageModel language)
	{
		this.language = language;
	}



}
