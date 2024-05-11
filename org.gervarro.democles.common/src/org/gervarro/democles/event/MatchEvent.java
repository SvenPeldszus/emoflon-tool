/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.event;

import java.util.EventObject;

import org.gervarro.democles.common.DataFrame;

public class MatchEvent extends EventObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1452495147391570770L;
	public static final String INSERT = "insert";
	public static final String DELETE = "delete";
	
	private final DataFrame data;
	private final String eventType;
	
	public MatchEvent(MatchEventSource source, DataFrame data, String eventType) {
		super(source);
		this.data = data;
		this.eventType = eventType;
	}

	public MatchEventSource getSource() {
		return (MatchEventSource) source;
	}
	
	public DataFrame getMatching() {
		return data;
	}
	
	public String getEventType() {
		return eventType;
	}
}
