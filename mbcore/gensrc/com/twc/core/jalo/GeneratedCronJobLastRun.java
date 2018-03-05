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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CronJobLastRun}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCronJobLastRun extends GenericItem
{
	/** Qualifier of the <code>CronJobLastRun.jobname</code> attribute **/
	public static final String JOBNAME = "jobname";
	/** Qualifier of the <code>CronJobLastRun.lastRunDate</code> attribute **/
	public static final String LASTRUNDATE = "lastRunDate";
	/** Qualifier of the <code>CronJobLastRun.lastSuccessRunDate</code> attribute **/
	public static final String LASTSUCCESSRUNDATE = "lastSuccessRunDate";
	/** Qualifier of the <code>CronJobLastRun.lastFailedRunDate</code> attribute **/
	public static final String LASTFAILEDRUNDATE = "lastFailedRunDate";
	/** Qualifier of the <code>CronJobLastRun.result</code> attribute **/
	public static final String RESULT = "result";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(JOBNAME, AttributeMode.INITIAL);
		tmp.put(LASTRUNDATE, AttributeMode.INITIAL);
		tmp.put(LASTSUCCESSRUNDATE, AttributeMode.INITIAL);
		tmp.put(LASTFAILEDRUNDATE, AttributeMode.INITIAL);
		tmp.put(RESULT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.jobname</code> attribute.
	 * @return the jobname
	 */
	public String getJobname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, JOBNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.jobname</code> attribute.
	 * @return the jobname
	 */
	public String getJobname()
	{
		return getJobname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.jobname</code> attribute. 
	 * @param value the jobname
	 */
	public void setJobname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, JOBNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.jobname</code> attribute. 
	 * @param value the jobname
	 */
	public void setJobname(final String value)
	{
		setJobname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastFailedRunDate</code> attribute.
	 * @return the lastFailedRunDate
	 */
	public Date getLastFailedRunDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTFAILEDRUNDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastFailedRunDate</code> attribute.
	 * @return the lastFailedRunDate
	 */
	public Date getLastFailedRunDate()
	{
		return getLastFailedRunDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastFailedRunDate</code> attribute. 
	 * @param value the lastFailedRunDate
	 */
	public void setLastFailedRunDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTFAILEDRUNDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastFailedRunDate</code> attribute. 
	 * @param value the lastFailedRunDate
	 */
	public void setLastFailedRunDate(final Date value)
	{
		setLastFailedRunDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastRunDate</code> attribute.
	 * @return the lastRunDate
	 */
	public Date getLastRunDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTRUNDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastRunDate</code> attribute.
	 * @return the lastRunDate
	 */
	public Date getLastRunDate()
	{
		return getLastRunDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastRunDate</code> attribute. 
	 * @param value the lastRunDate
	 */
	public void setLastRunDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTRUNDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastRunDate</code> attribute. 
	 * @param value the lastRunDate
	 */
	public void setLastRunDate(final Date value)
	{
		setLastRunDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastSuccessRunDate</code> attribute.
	 * @return the lastSuccessRunDate
	 */
	public Date getLastSuccessRunDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTSUCCESSRUNDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.lastSuccessRunDate</code> attribute.
	 * @return the lastSuccessRunDate
	 */
	public Date getLastSuccessRunDate()
	{
		return getLastSuccessRunDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastSuccessRunDate</code> attribute. 
	 * @param value the lastSuccessRunDate
	 */
	public void setLastSuccessRunDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTSUCCESSRUNDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.lastSuccessRunDate</code> attribute. 
	 * @param value the lastSuccessRunDate
	 */
	public void setLastSuccessRunDate(final Date value)
	{
		setLastSuccessRunDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.result</code> attribute.
	 * @return the result
	 */
	public String getResult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CronJobLastRun.result</code> attribute.
	 * @return the result
	 */
	public String getResult()
	{
		return getResult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CronJobLastRun.result</code> attribute. 
	 * @param value the result
	 */
	public void setResult(final String value)
	{
		setResult( getSession().getSessionContext(), value );
	}
	
}
