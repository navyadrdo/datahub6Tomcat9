/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.ExtendedWarrantyGroup;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.product.Product ExtendedWarranty}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExtendedWarranty extends Product
{
	/** Qualifier of the <code>ExtendedWarranty.extendedWarrantyType</code> attribute **/
	public static final String EXTENDEDWARRANTYTYPE = "extendedWarrantyType";
	/** Qualifier of the <code>ExtendedWarranty.numberOfMonths</code> attribute **/
	public static final String NUMBEROFMONTHS = "numberOfMonths";
	/** Qualifier of the <code>ExtendedWarranty.fromPrice</code> attribute **/
	public static final String FROMPRICE = "fromPrice";
	/** Qualifier of the <code>ExtendedWarranty.toPrice</code> attribute **/
	public static final String TOPRICE = "toPrice";
	/** Qualifier of the <code>ExtendedWarranty.netWeight</code> attribute **/
	public static final String NETWEIGHT = "netWeight";
	/** Qualifier of the <code>ExtendedWarranty.grossWeight</code> attribute **/
	public static final String GROSSWEIGHT = "grossWeight";
	/** Qualifier of the <code>ExtendedWarranty.volume</code> attribute **/
	public static final String VOLUME = "volume";
	/** Qualifier of the <code>ExtendedWarranty.length</code> attribute **/
	public static final String LENGTH = "length";
	/** Qualifier of the <code>ExtendedWarranty.width</code> attribute **/
	public static final String WIDTH = "width";
	/** Qualifier of the <code>ExtendedWarranty.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>ExtendedWarranty.extendedWarrantyGroup</code> attribute **/
	public static final String EXTENDEDWARRANTYGROUP = "extendedWarrantyGroup";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n EXTENDEDWARRANTYGROUP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedExtendedWarranty> EXTENDEDWARRANTYGROUPHANDLER = new BidirectionalOneToManyHandler<GeneratedExtendedWarranty>(
	MbCoreConstants.TC.EXTENDEDWARRANTY,
	false,
	"extendedWarrantyGroup",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXTENDEDWARRANTYTYPE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFMONTHS, AttributeMode.INITIAL);
		tmp.put(FROMPRICE, AttributeMode.INITIAL);
		tmp.put(TOPRICE, AttributeMode.INITIAL);
		tmp.put(NETWEIGHT, AttributeMode.INITIAL);
		tmp.put(GROSSWEIGHT, AttributeMode.INITIAL);
		tmp.put(VOLUME, AttributeMode.INITIAL);
		tmp.put(LENGTH, AttributeMode.INITIAL);
		tmp.put(WIDTH, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(EXTENDEDWARRANTYGROUP, AttributeMode.INITIAL);
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
		EXTENDEDWARRANTYGROUPHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.extendedWarrantyGroup</code> attribute.
	 * @return the extendedWarrantyGroup
	 */
	public ExtendedWarrantyGroup getExtendedWarrantyGroup(final SessionContext ctx)
	{
		return (ExtendedWarrantyGroup)getProperty( ctx, EXTENDEDWARRANTYGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.extendedWarrantyGroup</code> attribute.
	 * @return the extendedWarrantyGroup
	 */
	public ExtendedWarrantyGroup getExtendedWarrantyGroup()
	{
		return getExtendedWarrantyGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.extendedWarrantyGroup</code> attribute. 
	 * @param value the extendedWarrantyGroup
	 */
	public void setExtendedWarrantyGroup(final SessionContext ctx, final ExtendedWarrantyGroup value)
	{
		EXTENDEDWARRANTYGROUPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.extendedWarrantyGroup</code> attribute. 
	 * @param value the extendedWarrantyGroup
	 */
	public void setExtendedWarrantyGroup(final ExtendedWarrantyGroup value)
	{
		setExtendedWarrantyGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.extendedWarrantyType</code> attribute.
	 * @return the extendedWarrantyType
	 */
	public EnumerationValue getExtendedWarrantyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EXTENDEDWARRANTYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.extendedWarrantyType</code> attribute.
	 * @return the extendedWarrantyType
	 */
	public EnumerationValue getExtendedWarrantyType()
	{
		return getExtendedWarrantyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.extendedWarrantyType</code> attribute. 
	 * @param value the extendedWarrantyType
	 */
	public void setExtendedWarrantyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EXTENDEDWARRANTYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.extendedWarrantyType</code> attribute. 
	 * @param value the extendedWarrantyType
	 */
	public void setExtendedWarrantyType(final EnumerationValue value)
	{
		setExtendedWarrantyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.fromPrice</code> attribute.
	 * @return the fromPrice
	 */
	public Double getFromPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, FROMPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.fromPrice</code> attribute.
	 * @return the fromPrice
	 */
	public Double getFromPrice()
	{
		return getFromPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @return the fromPrice
	 */
	public double getFromPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getFromPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @return the fromPrice
	 */
	public double getFromPriceAsPrimitive()
	{
		return getFromPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @param value the fromPrice
	 */
	public void setFromPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, FROMPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @param value the fromPrice
	 */
	public void setFromPrice(final Double value)
	{
		setFromPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @param value the fromPrice
	 */
	public void setFromPrice(final SessionContext ctx, final double value)
	{
		setFromPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.fromPrice</code> attribute. 
	 * @param value the fromPrice
	 */
	public void setFromPrice(final double value)
	{
		setFromPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.grossWeight</code> attribute.
	 * @return the grossWeight
	 */
	public Double getGrossWeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, GROSSWEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.grossWeight</code> attribute.
	 * @return the grossWeight
	 */
	public Double getGrossWeight()
	{
		return getGrossWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @return the grossWeight
	 */
	public double getGrossWeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getGrossWeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @return the grossWeight
	 */
	public double getGrossWeightAsPrimitive()
	{
		return getGrossWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @param value the grossWeight
	 */
	protected void setGrossWeight(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+GROSSWEIGHT+"' is not changeable", 0 );
		}
		setProperty(ctx, GROSSWEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @param value the grossWeight
	 */
	protected void setGrossWeight(final Double value)
	{
		setGrossWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @param value the grossWeight
	 */
	protected void setGrossWeight(final SessionContext ctx, final double value)
	{
		setGrossWeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.grossWeight</code> attribute. 
	 * @param value the grossWeight
	 */
	protected void setGrossWeight(final double value)
	{
		setGrossWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.height</code> attribute.
	 * @return the height
	 */
	public Double getHeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.height</code> attribute.
	 * @return the height
	 */
	public Double getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @return the height
	 */
	public double getHeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getHeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @return the height
	 */
	public double getHeightAsPrimitive()
	{
		return getHeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @param value the height
	 */
	protected void setHeight(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+HEIGHT+"' is not changeable", 0 );
		}
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @param value the height
	 */
	protected void setHeight(final Double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @param value the height
	 */
	protected void setHeight(final SessionContext ctx, final double value)
	{
		setHeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.height</code> attribute. 
	 * @param value the height
	 */
	protected void setHeight(final double value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.length</code> attribute.
	 * @return the length
	 */
	public Double getLength(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.length</code> attribute.
	 * @return the length
	 */
	public Double getLength()
	{
		return getLength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @return the length
	 */
	public double getLengthAsPrimitive(final SessionContext ctx)
	{
		Double value = getLength( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @return the length
	 */
	public double getLengthAsPrimitive()
	{
		return getLengthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @param value the length
	 */
	protected void setLength(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+LENGTH+"' is not changeable", 0 );
		}
		setProperty(ctx, LENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @param value the length
	 */
	protected void setLength(final Double value)
	{
		setLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @param value the length
	 */
	protected void setLength(final SessionContext ctx, final double value)
	{
		setLength( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.length</code> attribute. 
	 * @param value the length
	 */
	protected void setLength(final double value)
	{
		setLength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.netWeight</code> attribute.
	 * @return the netWeight
	 */
	public Double getNetWeight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETWEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.netWeight</code> attribute.
	 * @return the netWeight
	 */
	public Double getNetWeight()
	{
		return getNetWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @return the netWeight
	 */
	public double getNetWeightAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetWeight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @return the netWeight
	 */
	public double getNetWeightAsPrimitive()
	{
		return getNetWeightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @param value the netWeight
	 */
	protected void setNetWeight(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+NETWEIGHT+"' is not changeable", 0 );
		}
		setProperty(ctx, NETWEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @param value the netWeight
	 */
	protected void setNetWeight(final Double value)
	{
		setNetWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @param value the netWeight
	 */
	protected void setNetWeight(final SessionContext ctx, final double value)
	{
		setNetWeight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.netWeight</code> attribute. 
	 * @param value the netWeight
	 */
	protected void setNetWeight(final double value)
	{
		setNetWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.numberOfMonths</code> attribute.
	 * @return the numberOfMonths
	 */
	public Integer getNumberOfMonths(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFMONTHS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.numberOfMonths</code> attribute.
	 * @return the numberOfMonths
	 */
	public Integer getNumberOfMonths()
	{
		return getNumberOfMonths( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @return the numberOfMonths
	 */
	public int getNumberOfMonthsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfMonths( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @return the numberOfMonths
	 */
	public int getNumberOfMonthsAsPrimitive()
	{
		return getNumberOfMonthsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @param value the numberOfMonths
	 */
	public void setNumberOfMonths(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFMONTHS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @param value the numberOfMonths
	 */
	public void setNumberOfMonths(final Integer value)
	{
		setNumberOfMonths( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @param value the numberOfMonths
	 */
	public void setNumberOfMonths(final SessionContext ctx, final int value)
	{
		setNumberOfMonths( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.numberOfMonths</code> attribute. 
	 * @param value the numberOfMonths
	 */
	public void setNumberOfMonths(final int value)
	{
		setNumberOfMonths( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.toPrice</code> attribute.
	 * @return the toPrice
	 */
	public Double getToPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.toPrice</code> attribute.
	 * @return the toPrice
	 */
	public Double getToPrice()
	{
		return getToPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @return the toPrice
	 */
	public double getToPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getToPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @return the toPrice
	 */
	public double getToPriceAsPrimitive()
	{
		return getToPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @param value the toPrice
	 */
	public void setToPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @param value the toPrice
	 */
	public void setToPrice(final Double value)
	{
		setToPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @param value the toPrice
	 */
	public void setToPrice(final SessionContext ctx, final double value)
	{
		setToPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.toPrice</code> attribute. 
	 * @param value the toPrice
	 */
	public void setToPrice(final double value)
	{
		setToPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.volume</code> attribute.
	 * @return the volume
	 */
	public Double getVolume(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VOLUME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.volume</code> attribute.
	 * @return the volume
	 */
	public Double getVolume()
	{
		return getVolume( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @return the volume
	 */
	public double getVolumeAsPrimitive(final SessionContext ctx)
	{
		Double value = getVolume( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @return the volume
	 */
	public double getVolumeAsPrimitive()
	{
		return getVolumeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @param value the volume
	 */
	protected void setVolume(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+VOLUME+"' is not changeable", 0 );
		}
		setProperty(ctx, VOLUME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @param value the volume
	 */
	protected void setVolume(final Double value)
	{
		setVolume( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @param value the volume
	 */
	protected void setVolume(final SessionContext ctx, final double value)
	{
		setVolume( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.volume</code> attribute. 
	 * @param value the volume
	 */
	protected void setVolume(final double value)
	{
		setVolume( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.width</code> attribute.
	 * @return the width
	 */
	public Double getWidth(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, WIDTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.width</code> attribute.
	 * @return the width
	 */
	public Double getWidth()
	{
		return getWidth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @return the width
	 */
	public double getWidthAsPrimitive(final SessionContext ctx)
	{
		Double value = getWidth( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @return the width
	 */
	public double getWidthAsPrimitive()
	{
		return getWidthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @param value the width
	 */
	protected void setWidth(final SessionContext ctx, final Double value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+WIDTH+"' is not changeable", 0 );
		}
		setProperty(ctx, WIDTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @param value the width
	 */
	protected void setWidth(final Double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @param value the width
	 */
	protected void setWidth(final SessionContext ctx, final double value)
	{
		setWidth( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarranty.width</code> attribute. 
	 * @param value the width
	 */
	protected void setWidth(final double value)
	{
		setWidth( getSession().getSessionContext(), value );
	}
	
}
