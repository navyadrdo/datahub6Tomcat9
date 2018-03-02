/**
 *
 */
package com.twc.cmscomponent.listener;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.commerceservices.event.AbstractSiteEventListener;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.util.ServicesUtil;

import com.twc.cmscomponent.event.NewsLetterSubscriptionEvent;
import com.twc.cmscomponents.model.process.NewsLetterSubScripitonProcessModel;


/**
 * @author 10561
 *
 */
//public class NewsletterSubscriptionListener extends  AbstractEventListener<NewsLetterSubscriptionEvent>
public class NewsletterSubscriptionListener extends AbstractSiteEventListener<NewsLetterSubscriptionEvent>
{

	/**
	 * @return the modelService
	 */
	public ModelService getModelService()
	{
		return modelService;
	}

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	/**
	 * @return the businessProcessService
	 */
	public BusinessProcessService getBusinessProcessService()
	{
		return businessProcessService;
	}

	/**
	 * @param businessProcessService
	 *           the businessProcessService to set
	 */
	public void setBusinessProcessService(final BusinessProcessService businessProcessService)
	{
		this.businessProcessService = businessProcessService;
	}

	private ModelService modelService;

	private BusinessProcessService businessProcessService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commerceservices.event.AbstractSiteEventListener#onSiteEvent(de.hybris.platform.servicelayer
	 * .event.events.AbstractEvent)
	 */
	@Override
	protected void onSiteEvent(final NewsLetterSubscriptionEvent event)
	{
		// YTODO Auto-generated method stub

		final NewsLetterSubScripitonProcessModel newsletterprocess = (NewsLetterSubScripitonProcessModel) getBusinessProcessService()
				.createProcess("Newsletter Subscribed by-" + event.getNewsletter().getEmail() + "-" + System.currentTimeMillis(),
						"newsLetterSubScripitonProcess");
		//newsletterprocess.setSite(event.get);
		//newsletterprocess.setCustomer(event.getCustomer());
		//	newsletterprocess.setToken(event.getToken());
		//	newsletterprocess.setLanguage(event.getLanguage());
		//	newsletterprocess.setCurrency(event.getCurrency());
		newsletterprocess.setStore(event.getBaseStore());
		newsletterprocess.setSite(event.getSite());
		newsletterprocess.setNewsletterSubscriptionprocess(event.getNewsletter());
		getModelService().save(newsletterprocess);
		getBusinessProcessService().startProcess(newsletterprocess);


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commerceservices.event.AbstractSiteEventListener#shouldHandleEvent(de.hybris.platform.servicelayer
	 * .event.events.AbstractEvent)
	 */
	@Override
	protected boolean shouldHandleEvent(final NewsLetterSubscriptionEvent event)
	{
		// YTODO Auto-generated method stub


		final BaseSiteModel site = event.getSite();
		ServicesUtil.validateParameterNotNullStandardMessage("event.site", site);
		return SiteChannel.B2C.equals(site.getChannel());

	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.servicelayer.event.impl.AbstractEventListener#onEvent(de.hybris.platform.servicelayer.event
	 * .events.AbstractEvent)
	 */



}
