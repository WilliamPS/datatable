package com.edupsousa.datatable;

import java.util.LinkedHashMap;

public class ExportHTML implements Export {

	@Override
	public String export(DataTable dt, LinkedHashMap<String, Integer> columnsTypes, int format) {
		DataTableRow row;
		String output = "<table>" + "\n" + "<tr>";
		for (String collumnName : columnsTypes.keySet()) {
			output += "<td>" + collumnName + "</td>";
		}
		output += "</tr>" + "\n";
		for (int i = 0; i < dt.rowsCount(); i++) {
			row = dt.getRow(i);
			for (String collumnName : columnsTypes.keySet()) {
				if (columnsTypes.get(collumnName) == DataTable.TYPE_STRING) {
					output += "<td>" + row.getValue(collumnName) + "</td></tr>";
				}
				else {
					output += "<tr><td>" + row.getValue(collumnName) + "</td>";
				}
			}
			output += "\n";
		}
	output += "</table>" + "\n";
	return output;
	}
}
