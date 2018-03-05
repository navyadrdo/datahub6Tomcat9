/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
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
 * Generated class for type {@link de.hybris.platform.jalo.product.Product MyWarranty}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMyWarranty extends Product
{
	/** Qualifier of the <code>MyWarranty.warrantyCode</code> attribute **/
	public static final String WARRANTYCODE = "warrantyCode";
	/** Qualifier of the <code>MyWarranty.warrantyMonths</code> attribute **/
	public static final String WARRANTYMONTHS = "warrantyMonths";
	/** Qualifier of the <code>MyWarranty.warrantyPrice</code> attribute **/
	public static final String WARRANTYPRICE = "warrantyPrice";
	/** Qualifier of the <code>MyWarranty.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMyWarranty> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedMyWarranty>(
	MbCoreConstants.TC.MYWARRANTY,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WARRANTYCODE, AttributeMode.INITIAL);
		tmp.put(WARRANTYMONTHS, AttributeMode.INITIAL);
		tmp.put(WARRANTYPRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyCode</code> attribute.
	 * @return the warrantyCode
	 */
	public String getWarrantyCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WARRANTYCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyCode</code> attribute.
	 * @return the warrantyCode
	 */
	public String getWarrantyCode()
	{
		return getWarrantyCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyCode</code> attribute. 
	 * @param value the warrantyCode
	 */
	public void setWarrantyCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WARRANTYCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyCode</code> attribute. 
	 * @param value the warrantyCode
	 */
	public void setWarrantyCode(final String value)
	{
		setWarrantyCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyMonths</code> attribute.
	 * @return the warrantyMonths
	 */
	public String getWarrantyMonths(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WARRANTYMONTHS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyMonths</code> attribute.
	 * @return the warrantyMonths
	 */
	public String getWarrantyMonths()
	{
		return getWarrantyMonths( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyMonths</code> attribute. 
	 * @param value the warrantyMonths
	 */
	public void setWarrantyMonths(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WARRANTYMONTHS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyMonths</code> attribute. 
	 * @param value the warrantyMonths
	 */
	public void setWarrantyMonths(final String value)
	{
		setWarrantyMonths( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyPrice</code> attribute.
	 * @return the warrantyPrice
	 */
	public Double getWarrantyPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WARRANTYPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyPrice</code> attribute.
	 * @return the warrantyPrice
	 */
	public Double getWarrantyPrice()
	{
		return getWarrantyPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @return the warrantyPrice
	 */
	public double getWarrantyPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getWarrantyPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @return the warrantyPrice
	 */
	public double getWarrantyPriceAsPrimitive()
	{
		return getWarrantyPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @param value the warrantyPrice
	 */
	public void setWarrantyPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, WARRANTYPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @param value the warrantyPrice
	 */
	public void setWarrantyPrice(final Double value)
	{
		setWarrantyPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @param value the warrantyPrice
	 */
	public void setWarrantyPrice(final SessionContext ctx, final double value)
	{
		setWarrantyPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyWarranty.warrantyPrice</code> attribute. 
	 * @param value the warrantyPrice
	 */
	public void setWarrantyPrice(final double value)
	{
		setWarrantyPrice( getSession().getSessionContext(), value );
	}
	
}
