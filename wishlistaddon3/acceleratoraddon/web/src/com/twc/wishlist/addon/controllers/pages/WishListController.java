/**
 *
 */
package com.twc.wishlist.addon.controllers.pages;

import de.hybris.platform.addonsupport.controllers.page.AbstractAddOnPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.twc.wishlist.addon.facades.WishlistFacades;
import com.twc.wishlist.addon.forms.WishListForm;


/**
 * @author 10561
 *
 */




@Controller
@Scope("tenant")
@RequestMapping(value = "/Wishlist")
public class WishListController extends AbstractAddOnPageController
{

	@Autowired
	WishlistFacades wishlistfacedimp;



	@RequestMapping(value = "/addToWishList/{productcode}", method = RequestMethod.GET)
	public String addToWishList(@PathVariable("productcode") final String productcode, final Model model)
			throws CMSItemNotFoundException

	{

		System.out.println("product is going to  added to wishlist" + productcode);
		wishlistfacedimp.addWishlistEntry(productcode);


		return REDIRECT_PREFIX + "/" + "Wishlist/displayWishlist";






	}

	@RequestMapping(value = "/displayWishlist")
	public String displayWishList(final Model model)
	{

		final String WISH_LIST_CMS_PAGE = "wish-list";

		try
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(WISH_LIST_CMS_PAGE));
		}
		catch (final CMSItemNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			setUpMetaDataForContentPage(model, getContentPageForLabelOrId(WISH_LIST_CMS_PAGE));
		}
		catch (final CMSItemNotFoundException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}

		//	model.addAttribute("breadcrumbs", accountBreadcrumbBuilder.getBreadcrumbs("text.account.profile.newsletter"));
		model.addAttribute("metaRobots", "noindex,nofollow");
		//model.addAttribute("wishlist",

		model.addAttribute("wishlist2entries", wishlistfacedimp.displayDefaultWishList());
		model.addAttribute("wishlistform", new WishListForm());
		return getViewForPage(model);


	}

	@RequestMapping(value = "/PRFW")
	public String productRemoveFromWishlist(@RequestParam("productCode") final String productCode,
			@RequestParam("wishlist") final String wishlist, final Model model)
	{

		System.out.println("product is going to  added to wishlist" + productCode);
		wishlistfacedimp.removeFromWishListEntries(wishlist, productCode);


		return REDIRECT_PREFIX + "/" + "Wishlist/displayWishlist";

	}

	@RequestMapping(value = "/newWishlist", method = RequestMethod.POST)
	public String newWishlist(@RequestParam("wishlistname") final String wishlistname, final Model mo)
	{

		wishlistfacedimp.createNewWishlist(wishlistname, null);
		return wishlistname;
	}

}
