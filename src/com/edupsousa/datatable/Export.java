package com.edupsousa.datatable;

import java.util.LinkedHashMap;

public interface Export {
	public String export(DataTable dt, LinkedHashMap<String, Integer> columnsTypes, int format);
}
