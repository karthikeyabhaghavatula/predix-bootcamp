/*
 * Copyright (c) 2014 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.dspmicro.sample.basicmachineadapter;

import java.util.Map;
import java.util.UUID;

/**
 * 
 * @author Predix Machine Sample
 */
public interface ICallable 
{
	/**
	 * @param data Map<UUID, Float>
	 */
	public void onPushData(Map<UUID, Float> data);
}
