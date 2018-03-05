/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.twc.core.constants;

/**
 * Global class for all MbCore constants. You can add global constants for your extension into this class.
 */
public final class MbCoreConstants extends GeneratedMbCoreConstants
{
	public static final String EXTENSIONNAME = "mbcore";

	private MbCoreConstants()
	{
		//empty
	}

	public static final String BASE_STORE = "mb";

	public class Stock
	{
		public static final String CENTRAL_WAREHOUSE = "mb_warehouse_s";
	}

	// implement here constants used by this extension




	public class Catalog
	{
		public static final String EURONICS_PRODUCT_CATALOG = "mbProductCatalog";

		public static final String EURONICS_CONTENT_CATALOG = "mbContentCatalog";

		public static final String BASE_CATALOG_VERSION = "Base";

		public static final String MAIN_CATALOG_VERSION = "Main";

		public static final String STAGED_CATALOG_VERSION = "Staged";

		public static final String ONLINE_CATALOG_VERSION = "Online";
	}

}
