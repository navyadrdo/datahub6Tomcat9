/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.ExtendedWarranty;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ExtendedWarrantyGroup}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExtendedWarrantyGroup extends GenericItem
{
	/** Qualifier of the <code>ExtendedWarrantyGroup.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ExtendedWarrantyGroup.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ExtendedWarrantyGroup.extendedWarranties</code> attribute **/
	public static final String EXTENDEDWARRANTIES = "extendedWarranties";
	/**
	* {@link OneToManyHandler} for handling 1:n EXTENDEDWARRANTIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ExtendedWarranty> EXTENDEDWARRANTIESHANDLER = new OneToManyHandler<ExtendedWarranty>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.extendedWarranties</code> attribute.
	 * @return the extendedWarranties
	 */
	public Collection<ExtendedWarranty> getExtendedWarranties(final SessionContext ctx)
	{
		return EXTENDEDWARRANTIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExtendedWarrantyGroup.extendedWarranties</code> attribute.
	 * @return the extendedWarranties
	 */
	public Collection<ExtendedWarranty> getExtendedWarranties()
	{
		return getExtendedWarranties( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.extendedWarranties</code> attribute. 
	 * @param value the extendedWarranties
	 */
	public void setExtendedWarranties(final SessionContext ctx, final Collection<ExtendedWarranty> value)
	{
		EXTENDEDWARRANTIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExtendedWarrantyGroup.extendedWarranties</code> attribute. 
	 * @param value the extendedWarranties
	 */
	public void setExtendedWarranties(final Collection<ExtendedWarranty> value)
	{
		setExtendedWarranties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to extendedWarranties. 
	 * @param value the item to add to extendedWarranties
	 */
	public void addToExtendedWarranties(final SessionContext ctx, final ExtendedWarranty value)
	{
		EXTENDEDWARRANTIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to extendedWarranties. 
	 * @param value the item to add to extendedWarranties
	 */
	public void addToExtendedWarranties(final ExtendedWarranty value)
	{
		addToExtendedWarranties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from extendedWarranties. 
	 * @param value the item to remove from extendedWarranties
	 */
	public void removeFromExtendedWarranties(final SessionContext ctx, final ExtendedWarranty value)
	{
		EXTENDEDWARRANTIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from extendedWarranties. 
	 * @param value the item to remove from extendedWarranties
	 */
	public void removeFromExtendedWarranties(final ExtendedWarranty value)
	{
		removeFromExtendedWarranties( getSession().getSessionContext(), value );
	}
	
}
