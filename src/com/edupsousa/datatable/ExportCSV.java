package com.edupsousa.datatable;

import java.util.LinkedHashMap;

public class ExportCSV implements Export{

	@Override
	public String export(DataTable dt, LinkedHashMap<String, Integer> columnsTypes, int format) {
		DataTableRow row;
		String output = "";
			for (String collumnName : columnsTypes.keySet()) {
				output += collumnName + ";";
			}
			output += "\n";
			for (int i = 0; i < dt.rowsCount(); i++) {
				row = dt.getRow(i);
				for (String collumnName : columnsTypes.keySet()) {
					if (columnsTypes.get(collumnName) == DataTable.TYPE_STRING) {
						output += "\"" + row.getValue(collumnName) + "\";";
					}
					else {
						output += row.getValue(collumnName) + ";";
					}
				}
				output += "\n";
			}
		return output;
	}
}