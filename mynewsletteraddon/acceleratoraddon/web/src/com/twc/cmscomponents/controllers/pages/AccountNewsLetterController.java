/**
 *
 */
package com.twc.cmscomponents.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.annotations.RequireHardLogIn;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractSearchPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author 10561
 *
 */

@Controller
@RequestMapping(value = "/my-account")
public class AccountNewsLetterController extends AbstractSearchPageController
{


	//news letter
	private static final String NEWS_LETTER_CMS_PAGE = "news-letter";

	@Resource(name = "accountBreadcrumbBuilder")
	private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;



	@RequestMapping(value = "/newsLetterSubInfo", method = RequestMethod.GET)
	@RequireHardLogIn
	public String newsletterSubscription(final Model model) throws CMSItemNotFoundException
	{

		storeCmsPageInModel(model, getContentPageForLabelOrId(NEWS_LETTER_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(NEWS_LETTER_CMS_PAGE));

		model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.account.profile.newsletter"));
		model.addAttribute("metaRobots", "noindex,nofollow");
		return getViewForPage(model);
	}


}
