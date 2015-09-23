package com.redhat;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class MyProcessor implements Processor {
	
@Override
	public void process(Exchange exchange) throws Exception {
	
	 	String body = exchange.getIn().getBody(String.class);
	 	exchange.getOut().setBody(body);
	}
}