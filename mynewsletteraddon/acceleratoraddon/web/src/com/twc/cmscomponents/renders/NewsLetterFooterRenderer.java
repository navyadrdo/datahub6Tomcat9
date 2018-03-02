/**
 *
 */
package com.twc.cmscomponents.renders;

import de.hybris.platform.addonsupport.renderer.impl.DefaultAddOnCMSComponentRenderer;

import java.util.Map;
import java.util.TreeMap;

import javax.servlet.jsp.PageContext;

import com.twc.cmscomponent.form.NewsletterSubscribeForm;
import com.twc.cmscomponents.model.NewsLetterFormComponentModel;


/**
 * @author 10561
 * @param <NewsletterSubscriptionModel>
 *
 */


public class NewsLetterFooterRenderer extends DefaultAddOnCMSComponentRenderer<NewsLetterFormComponentModel>
{



	@Override
	protected Map<String, Object> getVariablesToExpose(final PageContext pageContext, final NewsLetterFormComponentModel component)
	{
	    NewsletterSubscribeForm form = new NewsletterSubscribeForm();
	    
	    
		final Map<String, Object> variables = new TreeMap<String, Object>();
		variables.put("newsletterSubscribeForm", form);
		variables.put("component", component);
	    
		return variables;
	}



}
