/**
 *
 */
package com.twc.cmscomponent.dao;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import org.springframework.stereotype.Component;

import com.twc.cmscomponents.model.NewsletterModel;


/**
 * @author 10561
 *
 */
@Component("newsLetterDao")
public class NewsLetterDaoImpl extends DefaultGenericDao<NewsletterModel> implements NewsLetterDao
{

	/*
	 * (non-Javadoc)
	 *
	 * @see com.twc.cmscomponent.dao.NewsLetterDao#SubscribeToNewsLetter(com.twc.cmscomponents.model.NewsletterModel)
	 */


	/**
	 * @param typecode
	 */
	public NewsLetterDaoImpl(final String typecode)
	{
		super(NewsletterModel._TYPECODE);
		// YTODO Auto-generated constructor stub
	}

	public NewsLetterDaoImpl()
	{
		super(NewsletterModel._TYPECODE);
	}


	@Override
	public void SubscribeToNewsLetter(final NewsletterModel newsletter)
	{
		// YTODO Auto-generated method stub
		/*
		 * super. System.out.println("comming here");
		 *
		 * sup
		 */
	}

}
