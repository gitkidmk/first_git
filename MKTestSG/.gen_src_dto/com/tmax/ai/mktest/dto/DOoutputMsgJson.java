	
package com.tmax.ai.mktest.dto;

import com.tmax.promapper.engine.base.Message;


import com.tmax.proobject.model.dataobject.DataObject;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.w3c.dom.Node;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.JsonToken;






public class DOoutputMsgJson extends Message {	
	public byte[] marshal(DataObject obj) throws Exception {
		com.tmax.ai.mktest.dto.DOoutput _DOoutput = (com.tmax.ai.mktest.dto.DOoutput)obj;
		
		if(_DOoutput == null)
			return null;
		
		BufferedWriter bw = null;
		JsonWriter jw = null;
		
		try{
		    
    		ByteArrayOutputStream out = new ByteArrayOutputStream(); 
    		bw = new BufferedWriter( new OutputStreamWriter( out , this.encoding ) );        
    		jw = new JsonWriter( bw );
           	jw.beginObject();

    		marshal( _DOoutput, jw);
			
    		jw.endObject();
    		jw.close();
    		return out.toByteArray();
    		    	    		
		} finally{
		    if( jw != null ) jw.close();
		    if( bw != null ) bw.close();
		}								
	}
	
	
	public void marshal(com.tmax.ai.mktest.dto.DOoutput _DOoutput, JsonWriter writer )throws Exception{	
	
		writer.name("ename"); 
		if (_DOoutput.getEname() != null) {
			writer.value(_DOoutput.getEname());
		} else {
			writer.nullValue();
		}
	
								  					
	}

	/**
     * do not use
     */
	public void marshal(DataObject dataobject, Node node) throws Exception { 
  	}

  	public String removeNullChar(String charString) {
    		if( charString == null )
    			return "";
    		
			StringBuffer sb = new StringBuffer();
			for (int i = 0 ; i<charString.length(); i++) {
				if(charString.charAt(i) == (char)0) {
					sb.append("");
				} else {
					sb.append(charString.charAt(i));
				}
			}
			return sb.toString();
  	}
	
	
	public DataObject unmarshal(byte[] bytes, int i) throws Exception {		
		com.tmax.ai.mktest.dto.DOoutput _DOoutput = new com.tmax.ai.mktest.dto.DOoutput();
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.ai.mktest.dto.DOoutput();
		
		try{
		reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
		jr = new JsonReader( reader );                
		jr.beginObject();
             


				_DOoutput = (com.tmax.ai.mktest.dto.DOoutput)unmarshal( jr,  _DOoutput);
     
             
		jr.endObject();
		jr.close();
			
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
        return _DOoutput;
	}
	
	
	// For PO7
	public DataObject unmarshal(byte[] bytes, DataObject dto) throws Exception {		
		
		com.tmax.ai.mktest.dto.DOoutput _DOoutput = (com.tmax.ai.mktest.dto.DOoutput) dto;
		BufferedReader reader = null;
		JsonReader jr = null;
		
		if( bytes.length <= 0)
			return new com.tmax.ai.mktest.dto.DOoutput();
		
		try{
			reader = new BufferedReader( new InputStreamReader( new ByteArrayInputStream(bytes), this.encoding));		       
			jr = new JsonReader( reader );                
			jr.beginObject();


					_DOoutput = (com.tmax.ai.mktest.dto.DOoutput)unmarshal( jr,  _DOoutput);
         
		         
			jr.endObject();
			jr.close();
				
		}finally{
		   	if( jr != null ) jr.close();
		    if( reader != null ) reader.close();
		}
		                       
	    return _DOoutput;
	}
		
		
	public DataObject unmarshal(JsonReader reader, com.tmax.ai.mktest.dto.DOoutput dto) throws Exception{		 

		while( reader.hasNext() ){
			String name = reader.nextName();			
			setField(dto, reader, name);
       	 }
		 
		 dto.clearAllIsModified();
		 
       	 return dto;
	}
		 
	protected void setField(com.tmax.ai.mktest.dto.DOoutput dto, JsonReader reader, String name) throws Exception{				
		
		switch(name) {		
	
		case "ename" :
		{	
			if(reader.peek() != JsonToken.NULL)
				dto.setEname( reader.nextString());
			else
				reader.nextNull();
			break;
		}	
	
		
		default :
			reader.skipValue();
			break;
		}
	}
		 
    /**
     * do not use
     */
	public int unmarshal(byte[] bytes, int i, DataObject dataobject){		
		return -1;
	}
	
	/**
     * do not use
     */
	public DataObject unmarshal(Node node) throws Exception {	
		return null;
	}
    
 	
}
