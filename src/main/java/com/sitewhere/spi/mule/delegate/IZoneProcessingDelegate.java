/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) Reveal Technologies, LLC. All rights reserved. http://www.reveal-tech.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package com.sitewhere.spi.mule.delegate;

import com.sitewhere.spi.ISiteWhereContext;
import com.sitewhere.spi.SiteWhereException;
import com.sitewhere.spi.device.IDeviceLocation;
import com.sitewhere.spi.device.IZone;
import com.sitewhere.spi.device.request.IDeviceAlertCreateRequest;

/**
 * Delegate that receives callbacks for zone processing so that developers can specify
 * responses to locations inside/outside of a given zone.
 * 
 * @author Derek Adams
 */
public interface IZoneProcessingDelegate {

	/**
	 * Called by zone processing to indicate whether a location was found to be inside a
	 * particular zone. The delegate may genereate an alert as a result of zone
	 * processing.
	 * 
	 * @param context
	 * @param zone
	 * @param location
	 * @param inside
	 * @return
	 * @throws SiteWhereException
	 */
	public IDeviceAlertCreateRequest handleZoneResults(ISiteWhereContext context, IZone zone,
			IDeviceLocation location, boolean inside) throws SiteWhereException;
}