package de.metas.materialtracking;

import java.util.Iterator;

import org.adempiere.util.ISingletonService;

import de.metas.inout.model.I_M_InOutLine;
import de.metas.materialtracking.ch.lagerkonf.model.I_M_Material_Tracking_Report;
import de.metas.materialtracking.ch.lagerkonf.model.I_M_Material_Tracking_Report_Line;
import de.metas.materialtracking.model.I_M_Material_Tracking;
import de.metas.materialtracking.model.I_M_Material_Tracking_Ref;
import de.metas.materialtracking.model.I_PP_Order;

/*
 * #%L
 * de.metas.materialtracking
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public interface IMaterialTrackingReportDAO extends ISingletonService
{

	/**
	 * Retrieve the material tracking refs for the given material tracking and for the tables {@link I_M_InOutLine} and {@link I_PP_Order}
	 * 
	 * @param materialTracking
	 * @return an iterator of the found refs
	 */
	Iterator<I_M_Material_Tracking_Ref> retrieveMaterialTrackingRefsForMaterialTracking(I_M_Material_Tracking materialTracking);

	/**
	 * Search for a material tracking report line with the given report and aggregation key.
	 * 
	 * @param report
	 * @param aggregationKey
	 * @return the report line if found, null otherwise
	 */
	I_M_Material_Tracking_Report_Line retrieveMaterialTrackingReportLineOrNull(I_M_Material_Tracking_Report report, String aggregationKey);

}
