package org.tact.base.scheduler;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@EnableAsync
public class GeneralScheduler {

	@Scheduled(cron = "*/50 * * * * ?") //Every 50 seconds
	public void runFiveSecondsScheduler() throws Exception
	{
		long views = ViewCounter.getViewCount("https://www.youtube.com/watch?v=x6Q7c9RyMzk");
		System.out.println("Running every 50 seconds ["+views+"]");			
	}
}