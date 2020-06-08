	
package com.tmax.ai.mktest.dto;

import java.io.IOException;
import java.util.List;

import java.util.ArrayList;

import java.util.Map;

import com.tmax.promapper.engine.dto.record.common.FieldProperty;
import com.tmax.proobject.model.exception.FieldNotFoundException;

import com.tmax.proobject.model.dataobject.DataObject;






@com.tmax.proobject.core.DataObject
public class DOoutput extends DataObject {
	private static final String DTO_LOGICAL_NAME = "DOoutput";
	
	public String getDtoLogicalName() {
		return DTO_LOGICAL_NAME;
	}
	
	private static final long serialVersionUID= 1L;
	
	public DOoutput() {
			super();
			
	}
	
	transient private boolean isModified = false;

	/**
	 * LogicalName : ename
	 * Comments    : ename
	 */		

	private String ename = null;
	
	transient private boolean ename_nullable = true;
	
	public boolean isNullableEname() {
		return this.ename_nullable;
	}
	
	transient private boolean ename_invalidation = false;
	
	public void setInvalidationEname(boolean invalidation) { 
		this.ename_invalidation = invalidation;
	}
	
	public boolean isInvalidationEname() {
		return this.ename_invalidation;
	}
	
	transient private boolean ename_modified = false;
	

	public boolean isModifiedEname() {
		return this.ename_modified;
	}
	
	public void unModifiedEname() {
		this.ename_modified = false;
	}

	public String getEname() {
		return ename;
	}
	public String getNvlEname() {
		if(getEname() == null) {
			return EMPTY_STRING;
		} else {
			return getEname();
		}
	}
	
	public void setEname(String ename) {
		if(ename == null) {
			this.ename = null;
		} else {
			this.ename = ename;
		}
		this.ename_modified = true;
		this.isModified = true;
	}		


	@Override
	public void clearAllIsModified() {
		this.ename_modified = false;
		this.isModified = false;
	}
	
	@Override
	public List<String> getIsModifiedField() {
		List<String> modifiedFields = new ArrayList<>();
		if(this.ename_modified == true)
			modifiedFields.add("ename");
		return modifiedFields;
	}
	
	@Override
	public boolean isModified() {
	    return isModified;
	}
	 
	public Object clone() {
		DOoutput copyObj = new DOoutput();	
		copyObj.clone(this);
		return copyObj;
	}
	
	public void clone(DataObject _dOoutput) {
		if(this == _dOoutput) return;
		DOoutput __dOoutput = (DOoutput) _dOoutput;
		
		this.setEname(__dOoutput.getEname());
		
	}

	public String toString() {
		StringBuilder buffer = new StringBuilder();
				
		buffer.append("ename : ").append(ename).append("\n");		
		return buffer.toString();
	}
	
	private static final Map<String,FieldProperty> fieldPropertyMap;
	
	static {
		fieldPropertyMap = new java.util.LinkedHashMap<String,FieldProperty>(1);
		fieldPropertyMap.put("ename", FieldProperty.builder()
              .setPhysicalName("ename")
              .setLogicalName("ename")
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
			case "ename" : return getEname();
			default : throw new FieldNotFoundException(fieldName);		
		}
	}

	public void set(String fieldName, Object arg) throws FieldNotFoundException {
		switch(fieldName) {
			case "ename" : setEname((String)arg);break;
			default : throw new FieldNotFoundException(fieldName);		
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		DOoutput _DOoutput = (DOoutput) obj;
		if(this.ename == null) {
			if(_DOoutput.getEname() != null)
				return false;
		} else if(!this.ename.equals(_DOoutput.getEname()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int prime  = 31;
		int result = 1;					
		result     = prime * result + ((this.ename == null) ? 0 : this.ename.hashCode());
		return result;
	}
	
	@Override
	public void clear() {
		ename = null;	
		clearAllIsModified();
	}

	private void writeObject(java.io.ObjectOutputStream stream)throws IOException {
		stream.defaultWriteObject();
	}
	
	
}
