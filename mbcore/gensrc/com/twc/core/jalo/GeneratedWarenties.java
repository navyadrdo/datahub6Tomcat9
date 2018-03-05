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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Warenties}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedWarenties extends GenericItem
{
	/** Qualifier of the <code>Warenties.Wno</code> attribute **/
	public static final String WNO = "Wno";
	/** Qualifier of the <code>Warenties.Wname</code> attribute **/
	public static final String WNAME = "Wname";
	/** Qualifier of the <code>Warenties.Status</code> attribute **/
	public static final String STATUS = "Status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(WNO, AttributeMode.INITIAL);
		tmp.put(WNAME, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Status</code> attribute.
	 * @return the Status
	 */
	public String getStatus(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Status</code> attribute.
	 * @return the Status
	 */
	public String getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Status</code> attribute. 
	 * @param value the Status
	 */
	public void setStatus(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Status</code> attribute. 
	 * @param value the Status
	 */
	public void setStatus(final String value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Wname</code> attribute.
	 * @return the Wname
	 */
	public String getWname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Wname</code> attribute.
	 * @return the Wname
	 */
	public String getWname()
	{
		return getWname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Wname</code> attribute. 
	 * @param value the Wname
	 */
	public void setWname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Wname</code> attribute. 
	 * @param value the Wname
	 */
	public void setWname(final String value)
	{
		setWname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Wno</code> attribute.
	 * @return the Wno
	 */
	public String getWno(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Warenties.Wno</code> attribute.
	 * @return the Wno
	 */
	public String getWno()
	{
		return getWno( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Wno</code> attribute. 
	 * @param value the Wno
	 */
	public void setWno(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Warenties.Wno</code> attribute. 
	 * @param value the Wno
	 */
	public void setWno(final String value)
	{
		setWno( getSession().getSessionContext(), value );
	}
	
}
