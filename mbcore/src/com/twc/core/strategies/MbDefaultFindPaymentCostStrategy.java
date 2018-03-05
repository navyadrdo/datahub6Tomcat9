/**
 *
 */
package com.twc.core.strategies;

import de.hybris.platform.core.model.order.AbstractOrderModel;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.order.strategies.calculation.impl.DefaultFindPaymentCostStrategy;
import de.hybris.platform.util.PriceValue;

import org.apache.log4j.Logger;


/**
 * @author 10561DefaultFindPaymentCostStrategy
 *
 */
public class MbDefaultFindPaymentCostStrategy extends DefaultFindPaymentCostStrategy
{

	private final static Logger LOG = Logger.getLogger(MbDefaultFindPaymentCostStrategy.class);

	@Override
	public PriceValue getPaymentCost(final AbstractOrderModel order)
	{
		try
		{
			final AbstractOrder orderItem = getModelService().getSource(order);
			final PaymentMode pMode = orderItem.getPaymentMode();
			return pMode.getCost(orderItem);


			//System.out.println("it is working for you");


		}
		catch (final Exception e)
		{
			//LOG.warn("Could not find paymentCost for order [" + order.getCode() + "] due to : " + e.getMessage() + "... skipping!");

			System.out.println(" youare in exception ");
			return new PriceValue(order.getCurrency().getIsocode(), 0.0, order.getNet().booleanValue());
		}
	}

}
