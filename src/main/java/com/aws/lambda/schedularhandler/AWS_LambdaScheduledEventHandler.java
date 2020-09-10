package com.aws.lambda.schedularhandler;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;

@Component("AWS_LambdaScheduledEventHandler")
public class AWS_LambdaScheduledEventHandler implements Function<ScheduledEvent, String> {

	@Override
	public String apply(ScheduledEvent event) {
		System.out.println("Received the Scheduled Event " + event);
		String returnValue = "success";
    	return returnValue;
	}
}
