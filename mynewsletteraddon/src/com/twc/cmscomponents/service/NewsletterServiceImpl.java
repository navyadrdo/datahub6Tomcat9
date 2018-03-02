/**
 *
 */
package com.twc.cmscomponents.service;

import de.hybris.platform.commerceservices.security.SecureTokenService;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twc.cmscomponent.event.NewsLetterSubscriptionEvent;
import com.twc.cmscomponents.model.NewsletterModel;


/*import com/twccmscomponents/model/process/NewsLetterSubScripitonProcessModel
 */

/**
 * @author 10561
 *
 */
@Service(value = "newsletterSevice")
public class NewsletterServiceImpl implements NewsletterSevice
{

	@Autowired
	private ModelService modelService;
	private NewsletterModel nlmodel;
	@Resource
	private SecureTokenService secureTokenService;
	@Resource
	private BaseStoreService baseStoreService;
	@Resource
	private EventService eventService;
	@Resource
	private BusinessProcessService businessProcessService;
	@Resource
	private BaseSiteService baseSiteService;
	@Resource
	private CommonI18NService commonI18NService;




	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.cmscomponents.service.NewsletterSevice#subscribeToNewsLetter(java.lang.String, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void subscribeToNewsLetter(final String fname, final String lname, final String email)
	{
		// YTODO Auto-generated method stub

		System.out.println("welcome ");


		//	final NewsletterModel newslettermodel = new NewsletterModel();
		/*
		 * newslettermodel.setFirstName(fname); newslettermodel.setLastName(lname); newslettermodel.setEmail(email);
		 * newslettermodel.setActive(Boolean.TRUE); newslettermodel.setToken("abc"); System.out.println("tesing");
		 * getModelService().save(newslettermodel);
		 */

		nlmodel = modelService.create(NewsletterModel.class);
		nlmodel.setEmail(email);
		nlmodel.setFirstName(fname);
		nlmodel.setLastName(lname);
		//nlmodel.set
		modelService.save(nlmodel);
		System.out.println("adjfljasld;fjaldfjlasd");
		eventService.publishEvent(initializeEvent(new NewsLetterSubscriptionEvent(), nlmodel));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.twc.cmscomponents.service.NewsletterSevice#subscribeToNewsLetter(com.twc.cmscomponents.model.NewsletterModel)
	 */





	protected NewsLetterSubscriptionEvent initializeEvent(final NewsLetterSubscriptionEvent event,
			final NewsletterModel subscription)
	{
		event.setBaseStore(baseStoreService.getCurrentBaseStore());
		event.setSite(baseSiteService.getCurrentBaseSite());
		event.setBaseStore(baseStoreService.getCurrentBaseStore());
		//event.setCustomer(subscription.getCustomer());
		event.setNewsletter(subscription);
		event.setLanguage(commonI18NService.getCurrentLanguage());

		return event;
	}

}
