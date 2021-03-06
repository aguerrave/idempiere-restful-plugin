/**
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Copyright (C) 2019 INGEINT <https://www.ingeint.com> and contributors (see README.md file).
 */

package com.ingeint.ws.base;

import java.util.Properties;

import org.apache.cxf.phase.PhaseInterceptorChain;
import org.compiere.util.Env;

public class RequestEnv {

	public static final String REQUEST_TRX_NAME_KEY = "trx.name";

	public static String getCurrentTrxName() {
		return (String) PhaseInterceptorChain.getCurrentMessage().getExchange().get(REQUEST_TRX_NAME_KEY);
	}

	public static Properties getCtx() {
		return Env.getCtx();
	}

}
