/**
 *
 */
package com.twc.wishlist.addon.facades;

import java.util.List;

import com.twc.wishlist.addon.data.Wishlist2EntryData;


/**
 * @author 10561
 *
 */
public interface WishlistFacades
{

	public String addWishlistEntry(String productcode);

	//public Wishlist2Model displayWishList();

	/**
	 * @return
	 */
	public List<Wishlist2EntryData> displayDefaultWishList();

	/**
	 * @param pk
	 */
	public String removeFromWishListEntries(String wishlist, String pk);

	/**
	 * @param wishlistname
	 */
	public boolean createNewWishlist(String wishlistname, String comments);

	/**
	 * @param wishlistname
	 * @param comments
	 * 
	 * 
	 *           /**
	 * @param pk
	 */


}
