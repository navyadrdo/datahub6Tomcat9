/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.DepartmentTest;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EmployeeTest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmployeeTest extends GenericItem
{
	/** Qualifier of the <code>EmployeeTest.Empid</code> attribute **/
	public static final String EMPID = "Empid";
	/** Qualifier of the <code>EmployeeTest.empname</code> attribute **/
	public static final String EMPNAME = "empname";
	/** Qualifier of the <code>EmployeeTest.deptcode</code> attribute **/
	public static final String DEPTCODE = "deptcode";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEPTCODE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEmployeeTest> DEPTCODEHANDLER = new BidirectionalOneToManyHandler<GeneratedEmployeeTest>(
	MbCoreConstants.TC.EMPLOYEETEST,
	false,
	"deptcode",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EMPID, AttributeMode.INITIAL);
		tmp.put(EMPNAME, AttributeMode.INITIAL);
		tmp.put(DEPTCODE, AttributeMode.INITIAL);
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
		DEPTCODEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.deptcode</code> attribute.
	 * @return the deptcode
	 */
	public DepartmentTest getDeptcode(final SessionContext ctx)
	{
		return (DepartmentTest)getProperty( ctx, DEPTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.deptcode</code> attribute.
	 * @return the deptcode
	 */
	public DepartmentTest getDeptcode()
	{
		return getDeptcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.deptcode</code> attribute. 
	 * @param value the deptcode
	 */
	public void setDeptcode(final SessionContext ctx, final DepartmentTest value)
	{
		DEPTCODEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.deptcode</code> attribute. 
	 * @param value the deptcode
	 */
	public void setDeptcode(final DepartmentTest value)
	{
		setDeptcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.Empid</code> attribute.
	 * @return the Empid
	 */
	public String getEmpid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.Empid</code> attribute.
	 * @return the Empid
	 */
	public String getEmpid()
	{
		return getEmpid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.Empid</code> attribute. 
	 * @param value the Empid
	 */
	public void setEmpid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.Empid</code> attribute. 
	 * @param value the Empid
	 */
	public void setEmpid(final String value)
	{
		setEmpid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.empname</code> attribute.
	 * @return the empname - Capacity
	 */
	public String getEmpname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeTest.empname</code> attribute.
	 * @return the empname - Capacity
	 */
	public String getEmpname()
	{
		return getEmpname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.empname</code> attribute. 
	 * @param value the empname - Capacity
	 */
	public void setEmpname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeTest.empname</code> attribute. 
	 * @param value the empname - Capacity
	 */
	public void setEmpname(final String value)
	{
		setEmpname( getSession().getSessionContext(), value );
	}
	
}
