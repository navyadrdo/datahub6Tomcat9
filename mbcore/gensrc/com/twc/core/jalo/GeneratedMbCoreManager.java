/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.ApparelProduct;
import com.twc.core.jalo.ApparelSizeVariantProduct;
import com.twc.core.jalo.ApparelStyleVariantProduct;
import com.twc.core.jalo.CSVExportCronJob;
import com.twc.core.jalo.CronJobLastRun;
import com.twc.core.jalo.CustomOffersComponent;
import com.twc.core.jalo.DepartmentTest;
import com.twc.core.jalo.ElectronicsColorVariantProduct;
import com.twc.core.jalo.EmployeeTest;
import com.twc.core.jalo.ExtendedWarranty;
import com.twc.core.jalo.ExtendedWarrantyGroup;
import com.twc.core.jalo.MyWarranty;
import com.twc.core.jalo.Mypromotion;
import com.twc.core.jalo.Offerproducts;
import com.twc.core.jalo.PhonePrefix;
import com.twc.core.jalo.Stadium;
import com.twc.core.jalo.Warenties;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>MbCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMbCoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTID's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Mypromotion> PRODUCT2PROMOTIONPRODUCTIDHANDLER = new OneToManyHandler<Mypromotion>(
	MbCoreConstants.TC.MYPROMOTION,
	false,
	"code",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MYWARRANTY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MyWarranty> PRODUCT2WARRANTYMYWARRANTYHANDLER = new OneToManyHandler<MyWarranty>(
	MbCoreConstants.TC.MYWARRANTY,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("internalOnly", AttributeMode.INITIAL);
		tmp.put("erpOriginalId", AttributeMode.INITIAL);
		tmp.put("erpName", AttributeMode.INITIAL);
		tmp.put("myalias", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("phoneNo", AttributeMode.INITIAL);
		tmp.put("zipCode", AttributeMode.INITIAL);
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
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CronJobLastRun createCronJobLastRun(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.CRONJOBLASTRUN );
			return (CronJobLastRun)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CronJobLastRun : "+e.getMessage(), 0 );
		}
	}
	
	public CronJobLastRun createCronJobLastRun(final Map attributeValues)
	{
		return createCronJobLastRun( getSession().getSessionContext(), attributeValues );
	}
	
	public CSVExportCronJob createCSVExportCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.CSVEXPORTCRONJOB );
			return (CSVExportCronJob)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CSVExportCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public CSVExportCronJob createCSVExportCronJob(final Map attributeValues)
	{
		return createCSVExportCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomOffersComponent createCustomOffersComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.CUSTOMOFFERSCOMPONENT );
			return (CustomOffersComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CustomOffersComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomOffersComponent createCustomOffersComponent(final Map attributeValues)
	{
		return createCustomOffersComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public DepartmentTest createDepartmentTest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.DEPARTMENTTEST );
			return (DepartmentTest)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DepartmentTest : "+e.getMessage(), 0 );
		}
	}
	
	public DepartmentTest createDepartmentTest(final Map attributeValues)
	{
		return createDepartmentTest( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public EmployeeTest createEmployeeTest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.EMPLOYEETEST );
			return (EmployeeTest)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating EmployeeTest : "+e.getMessage(), 0 );
		}
	}
	
	public EmployeeTest createEmployeeTest(final Map attributeValues)
	{
		return createEmployeeTest( getSession().getSessionContext(), attributeValues );
	}
	
	public ExtendedWarranty createExtendedWarranty(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.EXTENDEDWARRANTY );
			return (ExtendedWarranty)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ExtendedWarranty : "+e.getMessage(), 0 );
		}
	}
	
	public ExtendedWarranty createExtendedWarranty(final Map attributeValues)
	{
		return createExtendedWarranty( getSession().getSessionContext(), attributeValues );
	}
	
	public ExtendedWarrantyGroup createExtendedWarrantyGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.EXTENDEDWARRANTYGROUP );
			return (ExtendedWarrantyGroup)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ExtendedWarrantyGroup : "+e.getMessage(), 0 );
		}
	}
	
	public ExtendedWarrantyGroup createExtendedWarrantyGroup(final Map attributeValues)
	{
		return createExtendedWarrantyGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public Mypromotion createMypromotion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.MYPROMOTION );
			return (Mypromotion)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating mypromotion : "+e.getMessage(), 0 );
		}
	}
	
	public Mypromotion createMypromotion(final Map attributeValues)
	{
		return createMypromotion( getSession().getSessionContext(), attributeValues );
	}
	
	public MyWarranty createMyWarranty(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.MYWARRANTY );
			return (MyWarranty)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MyWarranty : "+e.getMessage(), 0 );
		}
	}
	
	public MyWarranty createMyWarranty(final Map attributeValues)
	{
		return createMyWarranty( getSession().getSessionContext(), attributeValues );
	}
	
	public Offerproducts createOfferproducts(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.OFFERPRODUCTS );
			return (Offerproducts)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating offerproducts : "+e.getMessage(), 0 );
		}
	}
	
	public Offerproducts createOfferproducts(final Map attributeValues)
	{
		return createOfferproducts( getSession().getSessionContext(), attributeValues );
	}
	
	public PhonePrefix createPhonePrefix(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.PHONEPREFIX );
			return (PhonePrefix)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PhonePrefix : "+e.getMessage(), 0 );
		}
	}
	
	public PhonePrefix createPhonePrefix(final Map attributeValues)
	{
		return createPhonePrefix( getSession().getSessionContext(), attributeValues );
	}
	
	public Stadium createStadium(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.STADIUM );
			return (Stadium)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Stadium : "+e.getMessage(), 0 );
		}
	}
	
	public Stadium createStadium(final Map attributeValues)
	{
		return createStadium( getSession().getSessionContext(), attributeValues );
	}
	
	public Warenties createWarenties(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MbCoreConstants.TC.WARENTIES );
			return (Warenties)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Warenties : "+e.getMessage(), 0 );
		}
	}
	
	public Warenties createWarenties(final Map attributeValues)
	{
		return createWarenties( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.erpName</code> attribute.
	 * @return the erpName
	 */
	public String getErpName(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MbCoreConstants.Attributes.Product.ERPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.erpName</code> attribute.
	 * @return the erpName
	 */
	public String getErpName(final Product item)
	{
		return getErpName( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.erpName</code> attribute. 
	 * @param value the erpName
	 */
	public void setErpName(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Product.ERPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.erpName</code> attribute. 
	 * @param value the erpName
	 */
	public void setErpName(final Product item, final String value)
	{
		setErpName( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.erpOriginalId</code> attribute.
	 * @return the erpOriginalId
	 */
	public String getErpOriginalId(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MbCoreConstants.Attributes.Product.ERPORIGINALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.erpOriginalId</code> attribute.
	 * @return the erpOriginalId
	 */
	public String getErpOriginalId(final Product item)
	{
		return getErpOriginalId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.erpOriginalId</code> attribute. 
	 * @param value the erpOriginalId
	 */
	public void setErpOriginalId(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Product.ERPORIGINALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.erpOriginalId</code> attribute. 
	 * @param value the erpOriginalId
	 */
	public void setErpOriginalId(final Product item, final String value)
	{
		setErpOriginalId( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return MbCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.internalOnly</code> attribute.
	 * @return the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public Boolean isInternalOnly(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, MbCoreConstants.Attributes.Product.INTERNALONLY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.internalOnly</code> attribute.
	 * @return the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public Boolean isInternalOnly(final Product item)
	{
		return isInternalOnly( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.internalOnly</code> attribute. 
	 * @return the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public boolean isInternalOnlyAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isInternalOnly( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.internalOnly</code> attribute. 
	 * @return the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public boolean isInternalOnlyAsPrimitive(final Product item)
	{
		return isInternalOnlyAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.internalOnly</code> attribute. 
	 * @param value the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public void setInternalOnly(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Product.INTERNALONLY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.internalOnly</code> attribute. 
	 * @param value the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public void setInternalOnly(final Product item, final Boolean value)
	{
		setInternalOnly( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.internalOnly</code> attribute. 
	 * @param value the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public void setInternalOnly(final SessionContext ctx, final Product item, final boolean value)
	{
		setInternalOnly( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.internalOnly</code> attribute. 
	 * @param value the internalOnly - Defines if the product should be sold to hybris employees only.
	 */
	public void setInternalOnly(final Product item, final boolean value)
	{
		setInternalOnly( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.myalias</code> attribute.
	 * @return the myalias
	 */
	public String getMyalias(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, MbCoreConstants.Attributes.Product.MYALIAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.myalias</code> attribute.
	 * @return the myalias
	 */
	public String getMyalias(final Product item)
	{
		return getMyalias( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.myalias</code> attribute. 
	 * @param value the myalias
	 */
	public void setMyalias(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Product.MYALIAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.myalias</code> attribute. 
	 * @param value the myalias
	 */
	public void setMyalias(final Product item, final String value)
	{
		setMyalias( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.MyWarranty</code> attribute.
	 * @return the MyWarranty
	 */
	public Set<MyWarranty> getMyWarranty(final SessionContext ctx, final Product item)
	{
		return (Set<MyWarranty>)PRODUCT2WARRANTYMYWARRANTYHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.MyWarranty</code> attribute.
	 * @return the MyWarranty
	 */
	public Set<MyWarranty> getMyWarranty(final Product item)
	{
		return getMyWarranty( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.MyWarranty</code> attribute. 
	 * @param value the MyWarranty
	 */
	public void setMyWarranty(final SessionContext ctx, final Product item, final Set<MyWarranty> value)
	{
		PRODUCT2WARRANTYMYWARRANTYHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.MyWarranty</code> attribute. 
	 * @param value the MyWarranty
	 */
	public void setMyWarranty(final Product item, final Set<MyWarranty> value)
	{
		setMyWarranty( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to MyWarranty. 
	 * @param value the item to add to MyWarranty
	 */
	public void addToMyWarranty(final SessionContext ctx, final Product item, final MyWarranty value)
	{
		PRODUCT2WARRANTYMYWARRANTYHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to MyWarranty. 
	 * @param value the item to add to MyWarranty
	 */
	public void addToMyWarranty(final Product item, final MyWarranty value)
	{
		addToMyWarranty( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from MyWarranty. 
	 * @param value the item to remove from MyWarranty
	 */
	public void removeFromMyWarranty(final SessionContext ctx, final Product item, final MyWarranty value)
	{
		PRODUCT2WARRANTYMYWARRANTYHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from MyWarranty. 
	 * @param value the item to remove from MyWarranty
	 */
	public void removeFromMyWarranty(final Product item, final MyWarranty value)
	{
		removeFromMyWarranty( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNo</code> attribute.
	 * @return the phoneNo - phone no for the user while registration
	 */
	public String getPhoneNo(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, MbCoreConstants.Attributes.Customer.PHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phoneNo</code> attribute.
	 * @return the phoneNo - phone no for the user while registration
	 */
	public String getPhoneNo(final Customer item)
	{
		return getPhoneNo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNo</code> attribute. 
	 * @param value the phoneNo - phone no for the user while registration
	 */
	public void setPhoneNo(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Customer.PHONENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phoneNo</code> attribute. 
	 * @param value the phoneNo - phone no for the user while registration
	 */
	public void setPhoneNo(final Customer item, final String value)
	{
		setPhoneNo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productid</code> attribute.
	 * @return the productid
	 */
	public Set<Mypromotion> getProductid(final SessionContext ctx, final Product item)
	{
		return (Set<Mypromotion>)PRODUCT2PROMOTIONPRODUCTIDHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productid</code> attribute.
	 * @return the productid
	 */
	public Set<Mypromotion> getProductid(final Product item)
	{
		return getProductid( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productid</code> attribute. 
	 * @param value the productid
	 */
	public void setProductid(final SessionContext ctx, final Product item, final Set<Mypromotion> value)
	{
		PRODUCT2PROMOTIONPRODUCTIDHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productid</code> attribute. 
	 * @param value the productid
	 */
	public void setProductid(final Product item, final Set<Mypromotion> value)
	{
		setProductid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productid. 
	 * @param value the item to add to productid
	 */
	public void addToProductid(final SessionContext ctx, final Product item, final Mypromotion value)
	{
		PRODUCT2PROMOTIONPRODUCTIDHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productid. 
	 * @param value the item to add to productid
	 */
	public void addToProductid(final Product item, final Mypromotion value)
	{
		addToProductid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productid. 
	 * @param value the item to remove from productid
	 */
	public void removeFromProductid(final SessionContext ctx, final Product item, final Mypromotion value)
	{
		PRODUCT2PROMOTIONPRODUCTIDHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productid. 
	 * @param value the item to remove from productid
	 */
	public void removeFromProductid(final Product item, final Mypromotion value)
	{
		removeFromProductid( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.zipCode</code> attribute.
	 * @return the zipCode - Zip code for customer
	 */
	public String getZipCode(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, MbCoreConstants.Attributes.Customer.ZIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.zipCode</code> attribute.
	 * @return the zipCode - Zip code for customer
	 */
	public String getZipCode(final Customer item)
	{
		return getZipCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.zipCode</code> attribute. 
	 * @param value the zipCode - Zip code for customer
	 */
	public void setZipCode(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, MbCoreConstants.Attributes.Customer.ZIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.zipCode</code> attribute. 
	 * @param value the zipCode - Zip code for customer
	 */
	public void setZipCode(final Customer item, final String value)
	{
		setZipCode( getSession().getSessionContext(), item, value );
	}
	
}
