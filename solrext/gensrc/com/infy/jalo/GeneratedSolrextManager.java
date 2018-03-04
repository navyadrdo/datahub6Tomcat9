/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Mar 3, 2018 1:15:43 PM                      ---
 * ----------------------------------------------------------------
 */
package com.infy.jalo;

import com.infy.constants.SolrextConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SolrextManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSolrextManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cattribute", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cattribute</code> attribute.
	 * @return the cattribute
	 */
	public String getCattribute(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, SolrextConstants.Attributes.Product.CATTRIBUTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cattribute</code> attribute.
	 * @return the cattribute
	 */
	public String getCattribute(final Product item)
	{
		return getCattribute( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cattribute</code> attribute. 
	 * @param value the cattribute
	 */
	public void setCattribute(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, SolrextConstants.Attributes.Product.CATTRIBUTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cattribute</code> attribute. 
	 * @param value the cattribute
	 */
	public void setCattribute(final Product item, final String value)
	{
		setCattribute( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SolrextConstants.EXTENSIONNAME;
	}
	
}
