/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem mypromotion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMypromotion extends GenericItem
{
	/** Qualifier of the <code>mypromotion.productid</code> attribute **/
	public static final String PRODUCTID = "productid";
	/** Qualifier of the <code>mypromotion.promtionname</code> attribute **/
	public static final String PROMTIONNAME = "promtionname";
	/** Qualifier of the <code>mypromotion.promotionDesc</code> attribute **/
	public static final String PROMOTIONDESC = "promotionDesc";
	/** Qualifier of the <code>mypromotion.promotionLongDes</code> attribute **/
	public static final String PROMOTIONLONGDES = "promotionLongDes";
	/** Qualifier of the <code>mypromotion.isActive</code> attribute **/
	public static final String ISACTIVE = "isActive";
	/** Qualifier of the <code>mypromotion.code</code> attribute **/
	public static final String CODE = "code";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CODE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMypromotion> CODEHANDLER = new BidirectionalOneToManyHandler<GeneratedMypromotion>(
	MbCoreConstants.TC.MYPROMOTION,
	false,
	"code",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTID, AttributeMode.INITIAL);
		tmp.put(PROMTIONNAME, AttributeMode.INITIAL);
		tmp.put(PROMOTIONDESC, AttributeMode.INITIAL);
		tmp.put(PROMOTIONLONGDES, AttributeMode.INITIAL);
		tmp.put(ISACTIVE, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.code</code> attribute.
	 * @return the code
	 */
	public Product getCode(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.code</code> attribute.
	 * @return the code
	 */
	public Product getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final Product value)
	{
		CODEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final Product value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CODEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.isActive</code> attribute.
	 * @return the isActive
	 */
	public Boolean isIsActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.isActive</code> attribute.
	 * @return the isActive
	 */
	public Boolean isIsActive()
	{
		return isIsActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.isActive</code> attribute. 
	 * @return the isActive
	 */
	public boolean isIsActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.isActive</code> attribute. 
	 * @return the isActive
	 */
	public boolean isIsActiveAsPrimitive()
	{
		return isIsActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.isActive</code> attribute. 
	 * @param value the isActive
	 */
	public void setIsActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.isActive</code> attribute. 
	 * @param value the isActive
	 */
	public void setIsActive(final Boolean value)
	{
		setIsActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.isActive</code> attribute. 
	 * @param value the isActive
	 */
	public void setIsActive(final SessionContext ctx, final boolean value)
	{
		setIsActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.isActive</code> attribute. 
	 * @param value the isActive
	 */
	public void setIsActive(final boolean value)
	{
		setIsActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.productid</code> attribute.
	 * @return the productid
	 */
	public String getProductid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.productid</code> attribute.
	 * @return the productid
	 */
	public String getProductid()
	{
		return getProductid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.productid</code> attribute. 
	 * @param value the productid
	 */
	public void setProductid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.productid</code> attribute. 
	 * @param value the productid
	 */
	public void setProductid(final String value)
	{
		setProductid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promotionDesc</code> attribute.
	 * @return the promotionDesc
	 */
	public String getPromotionDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROMOTIONDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promotionDesc</code> attribute.
	 * @return the promotionDesc
	 */
	public String getPromotionDesc()
	{
		return getPromotionDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promotionDesc</code> attribute. 
	 * @param value the promotionDesc
	 */
	public void setPromotionDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROMOTIONDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promotionDesc</code> attribute. 
	 * @param value the promotionDesc
	 */
	public void setPromotionDesc(final String value)
	{
		setPromotionDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promotionLongDes</code> attribute.
	 * @return the promotionLongDes
	 */
	public String getPromotionLongDes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROMOTIONLONGDES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promotionLongDes</code> attribute.
	 * @return the promotionLongDes
	 */
	public String getPromotionLongDes()
	{
		return getPromotionLongDes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promotionLongDes</code> attribute. 
	 * @param value the promotionLongDes
	 */
	public void setPromotionLongDes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROMOTIONLONGDES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promotionLongDes</code> attribute. 
	 * @param value the promotionLongDes
	 */
	public void setPromotionLongDes(final String value)
	{
		setPromotionLongDes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promtionname</code> attribute.
	 * @return the promtionname
	 */
	public String getPromtionname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROMTIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>mypromotion.promtionname</code> attribute.
	 * @return the promtionname
	 */
	public String getPromtionname()
	{
		return getPromtionname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promtionname</code> attribute. 
	 * @param value the promtionname
	 */
	public void setPromtionname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROMTIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>mypromotion.promtionname</code> attribute. 
	 * @param value the promtionname
	 */
	public void setPromtionname(final String value)
	{
		setPromtionname( getSession().getSessionContext(), value );
	}
	
}
