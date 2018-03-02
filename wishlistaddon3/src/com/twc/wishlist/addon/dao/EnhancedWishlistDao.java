/**
 *
 */
package com.twc.wishlist.addon.dao;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.wishlist2.impl.daos.Wishlist2Dao;


/**
 * @author 10561
 *
 */
public interface EnhancedWishlistDao extends Wishlist2Dao
{

	public boolean wishListExisited(String name, UserModel user);
}
