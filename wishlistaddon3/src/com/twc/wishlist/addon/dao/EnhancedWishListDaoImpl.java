/**
 *
 */
package com.twc.wishlist.addon.dao;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import de.hybris.platform.wishlist2.impl.daos.impl.DefaultWishlist2Dao;

import org.apache.log4j.Logger;


/**
 * @author 10561
 *
 */
public class EnhancedWishListDaoImpl extends DefaultWishlist2Dao implements EnhancedWishlistDao
{

	private static final Logger LOG = Logger.getLogger(EnhancedWishListDaoImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.twc.wishlist.addon.dao.EnhancedWishlistDao#wishListExisited(java.lang.String)
	 */
	@Override
	public boolean wishListExisited(final String name, final UserModel user)
	{
		boolean wishlistexsited = false;
		// YTODO Auto-generated method stub
		final FlexibleSearchQuery fQuery = new FlexibleSearchQuery(
				"SELECT {pk} FROM {Wishlist2} WHERE {user} = ?user AND {name} = ?name");// 51
		fQuery.addQueryParameter("user", user);// 52
		fQuery.addQueryParameter("name", name);// 53
		final SearchResult result = this.search(fQuery);// 55
		if (result.getCount() > 0)
		{// 56
			wishlistexsited = true;
			LOG.debug("More than one default wishlist defined for user " + user.getName() + ". Returning first!");// 58
		}

		return wishlistexsited;
	}
	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.wishlist.addon.dao.EnhancedWishlistDao#wishListExisited(java.lang.String)
	 */

}
