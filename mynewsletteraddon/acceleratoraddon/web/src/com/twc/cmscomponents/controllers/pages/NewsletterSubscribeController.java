package com.twc.cmscomponents.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.AbstractController;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.twc.cmscomponent.form.NewsletterSubscribeForm;
import com.twc.cmscomponents.Facade.NewsletterFacade;
import com.twc.cmscomponents.controllers.MynewsletteraddonControllerConstants;


/**
 * @author Istvan Gereb
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/newsletterSubscription")
public class NewsletterSubscribeController extends AbstractController
{
	private void syso()
	{
		// TODO Auto-generated method stub

	}

	@Resource(name = "newsletterFacade")
	private NewsletterFacade newsletterFacade;

	private static final String FORM_CODE = "newsletterSubscribeForm";
	private static final String EmailSubscriptionPopup = "/fragments/emailSubscriptionPopup";

	///mynewsletteraddon/acceleratoraddon/web/webroot/WEB-INF/views/desktop/fragments/emailSubscriptionPopup.jsp
	@RequestMapping(value = "/subscribe", method = RequestMethod.POST)
	public String subscribeToNewsletter(final RedirectAttributes redirectModel,
			final NewsletterSubscribeForm newsletterSubscribeForm, final Model model)
	{

		System.out.println("it is working for you ");

		System.out.println("email vlaue-------------" + newsletterSubscribeForm.getEmail());
		System.out.println("lastname----------------" + newsletterSubscribeForm.getFname());
		System.out.println("firstname--------------------" + newsletterSubscribeForm.getLname());

		try
		{ //
		  //newsletterFacade.subscribeToNewsletterUpdate(newsletterSubscribeForm);
			newsletterFacade.subscribeToNewsletterUpdate(newsletterSubscribeForm.getEmail(), newsletterSubscribeForm.getFname(),
					newsletterSubscribeForm.getLname());

		}
		finally
		{
			System.out.println("it''s ok");
		}
		return MynewsletteraddonControllerConstants.popups.newsletterpopup;
	}
}