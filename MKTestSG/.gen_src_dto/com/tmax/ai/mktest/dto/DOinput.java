	
package com.tmax.ai.mktest.dto;

import java.io.IOException;
import java.util.List;

import java.util.ArrayList;

import java.util.Map;

import com.tmax.promapper.engine.dto.record.common.FieldProperty;
import com.tmax.proobject.model.exception.FieldNotFoundException;

import com.tmax.proobject.model.dataobject.DataObject;






@com.tmax.proobject.core.DataObject
public class DOinput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "DOinput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public DOinput() {
			super();
			
	}
	
	transient private boolean isModified = false;

	/**
	 * LogicalName : ektest
	 * Comments    : meta data for test
	 */		

	private String ektest = "default";
	
	transient private boolean ektest_nullable = true;
	
	public boolean isNullableEktest() {
		return this.ektest_nullable;
	}
	
	transient private boolean ektest_invalidation = false;
	
	public void setInvalidationEktest(boolean invalidation) { 
		this.ektest_invalidation = invalidation;
	}
	
	public boolean isInvalidationEktest() {
		return this.ektest_invalidation;
	}
	
	transient private boolean ektest_modified = false;
	

	public boolean isModifiedEktest() {
		return this.ektest_modified;
	}
	
	public void unModifiedEktest() {
		this.ektest_modified = false;
	}

	public String getEktest() {
		return ektest;
	}
	public String getNvlEktest() {
		if(getEktest() == null) {
			return EMPTY_STRING;
		} else {
			return getEktest();
		}
	}
	
	public void setEktest(String ektest) {
		if(ektest == null) {
			this.ektest = "default";
		} else {
			this.ektest = ektest;
		}
		this.ektest_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.ektest_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ektest_modified == true)
			modifiedFields.add("ektest");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		DOinput copyObj = new DOinput();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _dOinput) {
		if(this == _dOinput) return;
		DOinput __dOinput = (DOinput) _dOinput;
		
		this.setEktest(__dOinput.getEktest());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ektest : ").append(ektest).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("ektest", FieldProperty.builder()
              .setPhysicalName("ektest")
              .setLogicalName("ektest")
              .setType(FieldProperty.TYPE_OBJECT_STRING)
              .setLength(36)
              .setDecimal(-1)
              .build());
	}

	public Map<String,FieldProperty> getFieldPropertyMap() {
		return fieldPropertyMap;
	}
	
	public static Map<String,FieldProperty> getFieldPropertyMapByStatic() {
		return fieldPropertyMap;
	}	

	@SuppressWarnings("unchecked")
	public Object get(String fieldName) throws FieldNotFoundException {
		switch(fieldName) {
			case "ektest" : return getEktest();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ektest" : setEktest((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		DOinput _DOinput = (DOinput) obj;
		if(this.ektest == null) {
			if(_DOinput.getEktest() != null)
				return false;
		} else if(!this.ektest.equals(_DOinput.getEktest()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;					
		result     = prime * result + ((this.ektest == null) ? 0 : this.ektest.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		ektest = "default";	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
