/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product offerproducts}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfferproducts extends Product
{
	/** Qualifier of the <code>offerproducts.productNo</code> attribute **/
	public static final String PRODUCTNO = "productNo";
	/** Qualifier of the <code>offerproducts.offerDesc</code> attribute **/
	public static final String OFFERDESC = "offerDesc";
	/** Qualifier of the <code>offerproducts.offerLongDesc</code> attribute **/
	public static final String OFFERLONGDESC = "offerLongDesc";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTNO, AttributeMode.INITIAL);
		tmp.put(OFFERDESC, AttributeMode.INITIAL);
		tmp.put(OFFERLONGDESC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.offerDesc</code> attribute.
	 * @return the offerDesc
	 */
	public String getOfferDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.offerDesc</code> attribute.
	 * @return the offerDesc
	 */
	public String getOfferDesc()
	{
		return getOfferDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.offerDesc</code> attribute. 
	 * @param value the offerDesc
	 */
	public void setOfferDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.offerDesc</code> attribute. 
	 * @param value the offerDesc
	 */
	public void setOfferDesc(final String value)
	{
		setOfferDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.offerLongDesc</code> attribute.
	 * @return the offerLongDesc
	 */
	public String getOfferLongDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERLONGDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.offerLongDesc</code> attribute.
	 * @return the offerLongDesc
	 */
	public String getOfferLongDesc()
	{
		return getOfferLongDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.offerLongDesc</code> attribute. 
	 * @param value the offerLongDesc
	 */
	public void setOfferLongDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERLONGDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.offerLongDesc</code> attribute. 
	 * @param value the offerLongDesc
	 */
	public void setOfferLongDesc(final String value)
	{
		setOfferLongDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.productNo</code> attribute.
	 * @return the productNo
	 */
	public String getProductNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>offerproducts.productNo</code> attribute.
	 * @return the productNo
	 */
	public String getProductNo()
	{
		return getProductNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.productNo</code> attribute. 
	 * @param value the productNo
	 */
	public void setProductNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>offerproducts.productNo</code> attribute. 
	 * @param value the productNo
	 */
	public void setProductNo(final String value)
	{
		setProductNo( getSession().getSessionContext(), value );
	}
	
}
