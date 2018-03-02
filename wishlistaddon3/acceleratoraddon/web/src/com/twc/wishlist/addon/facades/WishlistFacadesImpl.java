/**
 *
 */
package com.twc.wishlist.addon.facades;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.wishlist2.Wishlist2Service;
import de.hybris.platform.wishlist2.enums.Wishlist2EntryPriority;
import de.hybris.platform.wishlist2.model.Wishlist2EntryModel;
import de.hybris.platform.wishlist2.model.Wishlist2Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twc.wishlist.addon.data.Wishlist2EntryData;



/**
 * @author 10561
 *
 */
@Service(value = "wishlistfacedimple")
public class WishlistFacadesImpl implements WishlistFacades
{

	@Resource
	private ProductService productService;

	@Resource
	private UserService userService;

	@Resource
	private Wishlist2Service wishlistService;

	@Resource
	private Converter<Wishlist2EntryModel, Wishlist2EntryData> wishlist2EntryDataConverter;

	private boolean status;






	@Override
	public String addWishlistEntry(final String productcode)
	{

		Wishlist2Model defaultwishlist = null;
		// default wishlist is not there it will crate a new defalut wishlist by default when ever we create a
		//	new wishlist it become a default one
		if (!wishlistService.hasDefaultWishlist())
		{
			defaultwishlist = wishlistService.createDefaultWishlist("MyWishlist", "My wishlist Description");

		}
		/*
		 * public void addWishlistEntry(Wishlist2Model wishlist, ProductModel product, Integer desired,
		 * Wishlist2EntryPriority priority, String comment)
		 */
		if (null == defaultwishlist)
		{
			defaultwishlist = wishlistService.getDefaultWishlist();
		}
		/* wishlistService.addWishlistEntry(defaultWishlist, this.productService.getProduct(productcode), 1, "high"); */
		final ProductModel code = productService.getProduct(productcode);
		if (code != null && defaultwishlist != null)
		{
			wishlistService.addWishlistEntry(defaultwishlist, code, Integer.valueOf(1), Wishlist2EntryPriority.HIGH, "welcome");
		}

		return null;

	}

	public List<Wishlist2Model> getwishlist()
	{

		return wishlistService.getWishlists();
	}


	public Wishlist2Model defaultwishlist()
	{

		Wishlist2Model defalutwishlist = null;
		final Collection<Wishlist2EntryData> wishlist2EntryDatas = new ArrayList<>();
		defalutwishlist = wishlistService.getDefaultWishlist();
		if (defalutwishlist != null)
		{
			wishlist2EntryDatas.addAll(Converters.convertAll(defalutwishlist.getEntries(), wishlist2EntryDataConverter));

		}
		return defalutwishlist;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.twc.wishlist.addon.facades.WishlistFacades#displayWishList()
	 */
	@Override
	public List<Wishlist2EntryData> displayDefaultWishList()
	{

		Wishlist2Model defalutwishlist = null;
		final List<Wishlist2EntryData> wishlist2EntryDatas = new ArrayList<>();
		defalutwishlist = wishlistService.getDefaultWishlist();
		wishlist2EntryDatas.addAll(Converters.convertAll(defalutwishlist.getEntries(), wishlist2EntryDataConverter));



		// YTODO Auto-generated method stub
		return wishlist2EntryDatas;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.twc.wishlist.addon.facades.WishlistFacades#removeFromWishListEntries(java.lang.String, java.lang.String)
	 */
	@Override
	public String removeFromWishListEntries(final String wishlist, final String pk)
	{
		// YTODO Auto-generated method stub

		//wishlistService.removeWishlistEntry(wishlist, pk);
		//	wishlistService.removeWishlistEntryForProduct();

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.twc.wishlist.addon.facades.WishlistFacades#createNewWishlist(java.lang.String)
	 */


	@Override
	public boolean createNewWishlist(final String wishlistname, final String comments)
	{
		status = false;
		try
		{
			//wishlistService.checkingForExsitingWishList(wishlistname, comments);

		}
		catch (final Exception e)
		{
			System.out.println("Checking for exsiting wishlist .");
			e.printStackTrace();
			// YTODO: handle exception
		}
		return status;
	}



}
