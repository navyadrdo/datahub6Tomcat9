/**
 *
 */
package com.twc.facades.custom;

import com.twc.mb.mydao.Myservice;


/**
 * @author 10561
 *
 */

//@Component(value = "myfacadeimple")
public class MyfacadeImpl implements Myfacade
{


	/*
	 * @Autowired public Myservice myserviceimple = null;
	 */

	public Myservice myservicealias = null;




	/**
	 * @return the myservicealias
	 */
	public Myservice getMyservicealias()
	{
		return myservicealias;
	}




	/**
	 * @param myservicealias
	 *           the myservicealias to set
	 */
	public void setMyservicealias(final Myservice myservicealias)
	{
		this.myservicealias = myservicealias;
	}




	/**
	 * @return the myservice
	 */


	public void getProducts()
	{

		getMyservicealias().getProducts();
		System.out.println("im in products");
	}
}
