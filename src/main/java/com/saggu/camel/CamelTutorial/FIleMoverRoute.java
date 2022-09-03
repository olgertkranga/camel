package com.saggu.camel.CamelTutorial;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FIleMoverRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C://temp/camel")
			.log("${headers}")
			.log("${body}")
			.to("file:C://temp/processed")
			;
	}
	
}
