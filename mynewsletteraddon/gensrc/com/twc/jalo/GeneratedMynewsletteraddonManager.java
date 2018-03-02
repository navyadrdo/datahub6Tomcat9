/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 23, 2018 9:22:15 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.jalo;

import com.twc.cmscomponents.jalo.NewsLetterFormComponent;
import com.twc.cmscomponents.jalo.Newsletter;
import com.twc.cmscomponents.jalo.process.NewsLetterSubScripitonProcess;
import com.twc.constants.MynewsletteraddonConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>MynewsletteraddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMynewsletteraddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("newsletterSubscription", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
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
	
	public Newsletter createNewsletter(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MynewsletteraddonConstants.TC.NEWSLETTER );
			return (Newsletter)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Newsletter : "+e.getMessage(), 0 );
		}
	}
	
	public Newsletter createNewsletter(final Map attributeValues)
	{
		return createNewsletter( getSession().getSessionContext(), attributeValues );
	}
	
	public NewsLetterFormComponent createNewsLetterFormComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MynewsletteraddonConstants.TC.NEWSLETTERFORMCOMPONENT );
			return (NewsLetterFormComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NewsLetterFormComponent : "+e.getMessage(), 0 );
		}
	}
	
	public NewsLetterFormComponent createNewsLetterFormComponent(final Map attributeValues)
	{
		return createNewsLetterFormComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public NewsLetterSubScripitonProcess createNewsLetterSubScripitonProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MynewsletteraddonConstants.TC.NEWSLETTERSUBSCRIPITONPROCESS );
			return (NewsLetterSubScripitonProcess)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating NewsLetterSubScripitonProcess : "+e.getMessage(), 0 );
		}
	}
	
	public NewsLetterSubScripitonProcess createNewsLetterSubScripitonProcess(final Map attributeValues)
	{
		return createNewsLetterSubScripitonProcess( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return MynewsletteraddonConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newsletterSubscription</code> attribute.
	 * @return the newsletterSubscription
	 */
	public Newsletter getNewsletterSubscription(final SessionContext ctx, final Customer item)
	{
		return (Newsletter)item.getProperty( ctx, MynewsletteraddonConstants.Attributes.Customer.NEWSLETTERSUBSCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.newsletterSubscription</code> attribute.
	 * @return the newsletterSubscription
	 */
	public Newsletter getNewsletterSubscription(final Customer item)
	{
		return getNewsletterSubscription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newsletterSubscription</code> attribute. 
	 * @param value the newsletterSubscription
	 */
	public void setNewsletterSubscription(final SessionContext ctx, final Customer item, final Newsletter value)
	{
		item.setProperty(ctx, MynewsletteraddonConstants.Attributes.Customer.NEWSLETTERSUBSCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.newsletterSubscription</code> attribute. 
	 * @param value the newsletterSubscription
	 */
	public void setNewsletterSubscription(final Customer item, final Newsletter value)
	{
		setNewsletterSubscription( getSession().getSessionContext(), item, value );
	}
	
}
