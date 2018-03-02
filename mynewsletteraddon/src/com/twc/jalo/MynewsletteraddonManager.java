package com.twc.jalo;

import com.twc.constants.MynewsletteraddonConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class MynewsletteraddonManager extends GeneratedMynewsletteraddonManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( MynewsletteraddonManager.class.getName() );
	
	public static final MynewsletteraddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MynewsletteraddonManager) em.getExtension(MynewsletteraddonConstants.EXTENSIONNAME);
	}
	
}
