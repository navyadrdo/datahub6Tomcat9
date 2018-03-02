/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jan 23, 2018 9:22:15 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.cmscomponents.jalo.process;

import com.twc.cmscomponents.jalo.Newsletter;
import com.twc.constants.MynewsletteraddonConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.twc.cmscomponents.jalo.process.NewsLetterSubScripitonProcess NewsLetterSubScripitonProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNewsLetterSubScripitonProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>NewsLetterSubScripitonProcess.newsletterSubscriptionprocess</code> attribute **/
	public static final String NEWSLETTERSUBSCRIPTIONPROCESS = "newsletterSubscriptionprocess";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NEWSLETTERSUBSCRIPTIONPROCESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterSubScripitonProcess.newsletterSubscriptionprocess</code> attribute.
	 * @return the newsletterSubscriptionprocess - Attribute contains token that is used in this process.
	 */
	public Newsletter getNewsletterSubscriptionprocess(final SessionContext ctx)
	{
		return (Newsletter)getProperty( ctx, NEWSLETTERSUBSCRIPTIONPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewsLetterSubScripitonProcess.newsletterSubscriptionprocess</code> attribute.
	 * @return the newsletterSubscriptionprocess - Attribute contains token that is used in this process.
	 */
	public Newsletter getNewsletterSubscriptionprocess()
	{
		return getNewsletterSubscriptionprocess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterSubScripitonProcess.newsletterSubscriptionprocess</code> attribute. 
	 * @param value the newsletterSubscriptionprocess - Attribute contains token that is used in this process.
	 */
	public void setNewsletterSubscriptionprocess(final SessionContext ctx, final Newsletter value)
	{
		setProperty(ctx, NEWSLETTERSUBSCRIPTIONPROCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewsLetterSubScripitonProcess.newsletterSubscriptionprocess</code> attribute. 
	 * @param value the newsletterSubscriptionprocess - Attribute contains token that is used in this process.
	 */
	public void setNewsletterSubscriptionprocess(final Newsletter value)
	{
		setNewsletterSubscriptionprocess( getSession().getSessionContext(), value );
	}
	
}
