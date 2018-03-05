/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 27, 2017 8:08:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.twc.core.jalo;

import com.twc.core.constants.MbCoreConstants;
import com.twc.core.jalo.ExportCronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.CronJob CSVExportCronJob}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCSVExportCronJob extends ExportCronJob
{
	/** Qualifier of the <code>CSVExportCronJob.exportJobName</code> attribute **/
	public static final String EXPORTJOBNAME = "exportJobName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ExportCronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXPORTJOBNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSVExportCronJob.exportJobName</code> attribute.
	 * @return the exportJobName
	 */
	public String getExportJobName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXPORTJOBNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CSVExportCronJob.exportJobName</code> attribute.
	 * @return the exportJobName
	 */
	public String getExportJobName()
	{
		return getExportJobName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSVExportCronJob.exportJobName</code> attribute. 
	 * @param value the exportJobName
	 */
	public void setExportJobName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXPORTJOBNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CSVExportCronJob.exportJobName</code> attribute. 
	 * @param value the exportJobName
	 */
	public void setExportJobName(final String value)
	{
		setExportJobName( getSession().getSessionContext(), value );
	}
	
}
