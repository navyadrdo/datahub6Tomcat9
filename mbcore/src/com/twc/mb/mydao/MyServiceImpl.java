/**
 *
 */
package com.twc.mb.mydao;

/**
 * @author 10561
 *
 */
//@Component(value = "myserviceimple")
public class MyServiceImpl implements Myservice
{



	//@Autowired
	//public Mydao mydaoimple;

	public Mydao myDaoalias;


	/**
	 * @return the myDaoalias
	 */
	public Mydao getMyDaoalias()
	{
		return myDaoalias;
	}


	/**
	 * @param myDaoalias
	 *           the myDaoalias to set
	 */
	public void setMyDaoalias(final Mydao myDaoalias)
	{
		this.myDaoalias = myDaoalias;
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see com.mb.mydao.Myservice#getProducts()
	 */
	@Override
	public void getProducts()
	{
		getMyDaoalias().getProduct();
		// YTODO Auto-generated method stub

	}

}
