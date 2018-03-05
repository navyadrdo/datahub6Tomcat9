/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem PhonePrefix}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPhonePrefix extends GenericItem
{
	/** Qualifier of the <code>PhonePrefix.PrefixCode</code> attribute **/
	public static final String PREFIXCODE = "PrefixCode";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PREFIXCODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhonePrefix.PrefixCode</code> attribute.
	 * @return the PrefixCode
	 */
	public String getPrefixCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFIXCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PhonePrefix.PrefixCode</code> attribute.
	 * @return the PrefixCode
	 */
	public String getPrefixCode()
	{
		return getPrefixCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PhonePrefix.PrefixCode</code> attribute. 
	 * @param value the PrefixCode
	 */
	public void setPrefixCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFIXCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PhonePrefix.PrefixCode</code> attribute. 
	 * @param value the PrefixCode
	 */
	public void setPrefixCode(final String value)
	{
		setPrefixCode( getSession().getSessionContext(), value );
	}
	
}
