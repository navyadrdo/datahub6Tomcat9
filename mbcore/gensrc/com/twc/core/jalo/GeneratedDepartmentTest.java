/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.EmployeeTest;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem DepartmentTest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDepartmentTest extends GenericItem
{
	/** Qualifier of the <code>DepartmentTest.deptcode</code> attribute **/
	public static final String DEPTCODE = "deptcode";
	/** Qualifier of the <code>DepartmentTest.deptname</code> attribute **/
	public static final String DEPTNAME = "deptname";
	/** Qualifier of the <code>DepartmentTest.remp</code> attribute **/
	public static final String REMP = "remp";
	/**
	* {@link OneToManyHandler} for handling 1:n REMP's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EmployeeTest> REMPHANDLER = new OneToManyHandler<EmployeeTest>(
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
		tmp.put(DEPTCODE, AttributeMode.INITIAL);
		tmp.put(DEPTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.deptcode</code> attribute.
	 * @return the deptcode
	 */
	public String getDeptcode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.deptcode</code> attribute.
	 * @return the deptcode
	 */
	public String getDeptcode()
	{
		return getDeptcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.deptcode</code> attribute. 
	 * @param value the deptcode
	 */
	public void setDeptcode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.deptcode</code> attribute. 
	 * @param value the deptcode
	 */
	public void setDeptcode(final String value)
	{
		setDeptcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.deptname</code> attribute.
	 * @return the deptname - Capacity
	 */
	public String getDeptname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEPTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.deptname</code> attribute.
	 * @return the deptname - Capacity
	 */
	public String getDeptname()
	{
		return getDeptname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.deptname</code> attribute. 
	 * @param value the deptname - Capacity
	 */
	public void setDeptname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEPTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.deptname</code> attribute. 
	 * @param value the deptname - Capacity
	 */
	public void setDeptname(final String value)
	{
		setDeptname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.remp</code> attribute.
	 * @return the remp
	 */
	public Collection<EmployeeTest> getRemp(final SessionContext ctx)
	{
		return REMPHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DepartmentTest.remp</code> attribute.
	 * @return the remp
	 */
	public Collection<EmployeeTest> getRemp()
	{
		return getRemp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.remp</code> attribute. 
	 * @param value the remp
	 */
	public void setRemp(final SessionContext ctx, final Collection<EmployeeTest> value)
	{
		REMPHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DepartmentTest.remp</code> attribute. 
	 * @param value the remp
	 */
	public void setRemp(final Collection<EmployeeTest> value)
	{
		setRemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to remp. 
	 * @param value the item to add to remp
	 */
	public void addToRemp(final SessionContext ctx, final EmployeeTest value)
	{
		REMPHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to remp. 
	 * @param value the item to add to remp
	 */
	public void addToRemp(final EmployeeTest value)
	{
		addToRemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from remp. 
	 * @param value the item to remove from remp
	 */
	public void removeFromRemp(final SessionContext ctx, final EmployeeTest value)
	{
		REMPHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from remp. 
	 * @param value the item to remove from remp
	 */
	public void removeFromRemp(final EmployeeTest value)
	{
		removeFromRemp( getSession().getSessionContext(), value );
	}
	
}
