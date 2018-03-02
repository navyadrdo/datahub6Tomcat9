/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 23, 2018 9:22:15 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.wishlist.addon.jalo;

import com.twc.wishlist.addon.constants.Wishlistaddon3Constants;
import com.twc.wishlist.addon.jalo.ProductAddToWishlistComponent;
import com.twc.wishlist.addon.jalo.actions.AddToWishListAction;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>Wishlistaddon3Manager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedWishlistaddon3Manager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public AddToWishListAction createAddToWishListAction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Wishlistaddon3Constants.TC.ADDTOWISHLISTACTION );
			return (AddToWishListAction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AddToWishListAction : "+e.getMessage(), 0 );
		}
	}
	
	public AddToWishListAction createAddToWishListAction(final Map attributeValues)
	{
		return createAddToWishListAction( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductAddToWishlistComponent createProductAddToWishlistComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Wishlistaddon3Constants.TC.PRODUCTADDTOWISHLISTCOMPONENT );
			return (ProductAddToWishlistComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductAddToWishlistComponent : "+e.getMessage(), 0 );
		}
	}
	
	public ProductAddToWishlistComponent createProductAddToWishlistComponent(final Map attributeValues)
	{
		return createProductAddToWishlistComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Wishlistaddon3Constants.EXTENSIONNAME;
	}
	
}
