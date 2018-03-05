/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob ExportCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedExportCronJob extends CronJob
{
	/** Qualifier of the <code>ExportCronJob.exportHookBeanName</code> attribute **/
	public static final String EXPORTHOOKBEANNAME = "exportHookBeanName";
	/** Qualifier of the <code>ExportCronJob.timestampFormatConfigKey</code> attribute **/
	public static final String TIMESTAMPFORMATCONFIGKEY = "timestampFormatConfigKey";
	/** Qualifier of the <code>ExportCronJob.outputFilePatternConfigKey</code> attribute **/
	public static final String OUTPUTFILEPATTERNCONFIGKEY = "outputFilePatternConfigKey";
	/** Qualifier of the <code>ExportCronJob.outputFolderPathConfigKey</code> attribute **/
	public static final String OUTPUTFOLDERPATHCONFIGKEY = "outputFolderPathConfigKey";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXPORTHOOKBEANNAME, AttributeMode.INITIAL);
		tmp.put(TIMESTAMPFORMATCONFIGKEY, AttributeMode.INITIAL);
		tmp.put(OUTPUTFILEPATTERNCONFIGKEY, AttributeMode.INITIAL);
		tmp.put(OUTPUTFOLDERPATHCONFIGKEY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.exportHookBeanName</code> attribute.
	 * @return the exportHookBeanName
	 */
	public String getExportHookBeanName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXPORTHOOKBEANNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.exportHookBeanName</code> attribute.
	 * @return the exportHookBeanName
	 */
	public String getExportHookBeanName()
	{
		return getExportHookBeanName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.exportHookBeanName</code> attribute. 
	 * @param value the exportHookBeanName
	 */
	public void setExportHookBeanName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXPORTHOOKBEANNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.exportHookBeanName</code> attribute. 
	 * @param value the exportHookBeanName
	 */
	public void setExportHookBeanName(final String value)
	{
		setExportHookBeanName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.outputFilePatternConfigKey</code> attribute.
	 * @return the outputFilePatternConfigKey
	 */
	public String getOutputFilePatternConfigKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OUTPUTFILEPATTERNCONFIGKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.outputFilePatternConfigKey</code> attribute.
	 * @return the outputFilePatternConfigKey
	 */
	public String getOutputFilePatternConfigKey()
	{
		return getOutputFilePatternConfigKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.outputFilePatternConfigKey</code> attribute. 
	 * @param value the outputFilePatternConfigKey
	 */
	public void setOutputFilePatternConfigKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OUTPUTFILEPATTERNCONFIGKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.outputFilePatternConfigKey</code> attribute. 
	 * @param value the outputFilePatternConfigKey
	 */
	public void setOutputFilePatternConfigKey(final String value)
	{
		setOutputFilePatternConfigKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.outputFolderPathConfigKey</code> attribute.
	 * @return the outputFolderPathConfigKey
	 */
	public String getOutputFolderPathConfigKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OUTPUTFOLDERPATHCONFIGKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.outputFolderPathConfigKey</code> attribute.
	 * @return the outputFolderPathConfigKey
	 */
	public String getOutputFolderPathConfigKey()
	{
		return getOutputFolderPathConfigKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.outputFolderPathConfigKey</code> attribute. 
	 * @param value the outputFolderPathConfigKey
	 */
	public void setOutputFolderPathConfigKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OUTPUTFOLDERPATHCONFIGKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.outputFolderPathConfigKey</code> attribute. 
	 * @param value the outputFolderPathConfigKey
	 */
	public void setOutputFolderPathConfigKey(final String value)
	{
		setOutputFolderPathConfigKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.timestampFormatConfigKey</code> attribute.
	 * @return the timestampFormatConfigKey
	 */
	public String getTimestampFormatConfigKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMESTAMPFORMATCONFIGKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ExportCronJob.timestampFormatConfigKey</code> attribute.
	 * @return the timestampFormatConfigKey
	 */
	public String getTimestampFormatConfigKey()
	{
		return getTimestampFormatConfigKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.timestampFormatConfigKey</code> attribute. 
	 * @param value the timestampFormatConfigKey
	 */
	public void setTimestampFormatConfigKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMESTAMPFORMATCONFIGKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ExportCronJob.timestampFormatConfigKey</code> attribute. 
	 * @param value the timestampFormatConfigKey
	 */
	public void setTimestampFormatConfigKey(final String value)
	{
		setTimestampFormatConfigKey( getSession().getSessionContext(), value );
	}
	
}
