/**
 *
 */
package com.twc.facades.storefinder.populators;

import de.hybris.platform.converters.impl.AbstractPopulatingConverter;

import org.springframework.util.Assert;

import com.twc.core.model.PhonePrefixModel;
import com.twc.facades.data.Phoneprefixdata;


/**
 * @author 10561
 *
 */
public class PhonePrefixPopulator extends AbstractPopulatingConverter<PhonePrefixModel, Phoneprefixdata>
{

	@Override
	protected Phoneprefixdata createTarget()
	{
		return new Phoneprefixdata();
	}

	@Override
	public void populate(final PhonePrefixModel source, final Phoneprefixdata target)
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");

		target.setPrefixcode(source.getPrefixCode());

		//target.setName(source.getName());

		super.populate(source, target);
	}

}
