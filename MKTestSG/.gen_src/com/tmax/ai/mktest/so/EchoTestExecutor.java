package com.tmax.ai.mktest.so;

import com.tmax.proobject.engine.service.executor.ServiceExecutor;

public class EchoTestExecutor extends ServiceExecutor
{
	public EchoTestExecutor() {
		serviceObject = new EchoTest();
	}
	
	public Object execute(Object serviceInput, String serviceExecutionMethod) throws Throwable {
		return serviceObject.service(serviceInput);
	}
	
	public String getRendezvousMethodName(String service){
		return null;
	}
	
}

