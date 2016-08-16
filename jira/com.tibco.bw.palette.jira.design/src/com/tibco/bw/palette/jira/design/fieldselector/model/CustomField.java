package com.tibco.bw.palette.jira.design.fieldselector.model;

import java.util.ArrayList;

public class CustomField {

	public String id;
	public String name;
	public boolean custom;
	public boolean orderable;
	public boolean navigable;
	public boolean searchable;
	public ArrayList<String> clauseNames = new ArrayList<String>();
	public Schema schema;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCustom() {
		return custom;
	}
	public void setCustom(boolean custom) {
		this.custom = custom;
	}
	public boolean isOrderable() {
		return orderable;
	}
	public void setOrderable(boolean orderable) {
		this.orderable = orderable;
	}
	public boolean isNavigable() {
		return navigable;
	}
	public void setNavigable(boolean navigable) {
		this.navigable = navigable;
	}
	public boolean isSearchable() {
		return searchable;
	}
	public void setSearchable(boolean searchable) {
		this.searchable = searchable;
	}
	public ArrayList<String> getClauseNames() {
		return clauseNames;
	}
	public void setClauseNames(ArrayList<String> clauseNames) {
		this.clauseNames = clauseNames;
	}
	public Schema getSchema() {
		return schema;
	}
	public void setSchema(Schema schema) {
		this.schema = schema;
	}


}
