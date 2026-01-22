package com.ahmeterdogdu.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
	//cron * * * * * * 
	//her 5 sn de bir yazdır
	//@Scheduled(cron = "*/5 * * * * *")
	//@Scheduled(cron = "00 31 15 * * *")
	public void write1to10() {
		
		for (int i=0;i<=10;i+=1) {
			System.out.print(i + " ");
		}
	}

}
