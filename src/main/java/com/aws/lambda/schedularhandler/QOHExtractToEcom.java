package com.aws.lambda.schedularhandler;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;

@Component("QOHExtractToEcom")
public class QOHExtractToEcom implements Function<ScheduledEvent, String> {

	@Override
	public String apply(ScheduledEvent event) {
		System.out.println("Received the Scheduled Event " + event);
		String returnValue = "success";
    	return returnValue;
	}
}
