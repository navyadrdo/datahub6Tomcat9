/**
 *
 */
package com.twc.wishlist.addon.service;

import de.hybris.platform.wishlist2.Wishlist2Service;


/**
 * @author 10561
 *
 */
public interface EnhancedWishlistService extends Wishlist2Service
{




	void checkingForExsitingWishList(String wishlistname, String comments);
}
