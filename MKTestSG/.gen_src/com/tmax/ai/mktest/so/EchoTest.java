package com.tmax.ai.mktest.so;


import com.tmax.proobject.core.ServiceObject;
import com.tmax.proobject.model.business.BusinessObject;
import com.tmax.proobject.model.dataobject.DataObject;
import com.tmax.proobject.engine.servicemanager.*;
import com.tmax.proobject.logger.ProObjectLogger;
import com.tmax.proobject.logger.application.ServiceLogger;
import com.tmax.proobject.model.dto.*;
import com.tmax.proobject.core.DataSource;
import javax.inject.Inject;
import com.tmax.proobject.engine.waitobject.WaitObject;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.io.File;
import com.tmax.proobject.model.transaction.TransactionType;
import com.tmax.proobject.service.RCallReturn;
import com.tmax.ai.mktest.dto.DOinput;
import com.tmax.ai.mktest.dto.DOoutput;

@ServiceObject
public class EchoTest implements com.tmax.proobject.model.service.ServiceObject<com.tmax.ai.mktest.dto.DOinput, com.tmax.ai.mktest.dto.DOoutput>
{
	
	private ProObjectLogger logger = ServiceLogger.getLogger();
	public com.tmax.ai.mktest.dto.DOinput input = new com.tmax.ai.mktest.dto.DOinput();
	public com.tmax.ai.mktest.dto.DOoutput output = new com.tmax.ai.mktest.dto.DOoutput();
	    	
	
	    	
	@Override
	public com.tmax.ai.mktest.dto.DOoutput service(com.tmax.ai.mktest.dto.DOinput arg0) throws java.lang.Throwable
	{
	//[BEGIN_NODE_BLOCK, , service(DOinput)]
	{
	
	//[BEGIN_NODE_BLOCK, 0, service(DOinput)]
	{
	//EchoTestMethod
	 //[BEGIN_VIRTUAL_CODE_BLOCK, 0, service(DOinput)]
	 {
		 String test = arg0.getEktest();
		 output.setEname(test);
		 
		 logger.info(test);
		 
		 return output;
	 }
	 //[END_VIRTUAL_CODE_BLOCK, 0, service(DOinput)]
	
	}
	//[END_NODE_BLOCK, 0, service(DOinput)]
	}
	//[END_NODE_BLOCK, , service(DOinput)]
	}
	
}

