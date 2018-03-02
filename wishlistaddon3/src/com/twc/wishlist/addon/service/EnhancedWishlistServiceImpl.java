/**
 *
 */
package com.twc.wishlist.addon.service;

import de.hybris.platform.wishlist2.impl.DefaultWishlist2Service;


/**
 * @author 10561
 *
 */
public class EnhancedWishlistServiceImpl extends DefaultWishlist2Service implements EnhancedWishlistService
{


	/*
	 * public EnhancedWishlistDao wishlistDao;
	 */

	/**
	 * @return the wishlistDao
	 */
	/*
	 * public EnhancedWishlistDao getWishlistDao() { return wishlistDao; }
	 *//**
	 * @param wishlistDao
	 *           the wishlistDao to set
	 */
	/*
	 * public void setWishlistDao(final EnhancedWishlistDao wishlistDao) { this.wishlistDao = wishlistDao; }
	 */

	@Override
	public void checkingForExsitingWishList(final String wishlistname, final String comments)
	{
		// YTODO Auto-generated method stub


		try
		{/*
		  * final List<Wishlist2Model> wishlist = super.getWishlists();
		  *
		  * for (final Wishlist2Model wishlist2Model : wishlist) { if
		  * (wishlist2Model.getName().equalsIgnoreCase(wishlistname)) { status = true; break; }
		  *
		  * if (status) { try { super.createWishlist(wishlistname, comments); } catch (final Exception e) {
		  * System.out.println(" exception is occured while creating the New Wishlist"); e.printStackTrace(); }
		  *
		  * }
		  *
		  * }
		  */

			//	getWishlistDao().wishListExisited(wishlistname, getCurrentUser());
		}
		catch (final Exception e)
		{

			e.printStackTrace();
		}

	}

}
