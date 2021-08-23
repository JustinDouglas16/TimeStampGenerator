package com.project.timestampgenerator;


import java.util.Date;

public class TimeStampGenerator {
	public static void  main(String[] args) {
		while (true) {
			Date date = new Date();
			
			long time = date.getTime();
			System.out.println("Time in milliseconds: " + time);
			
//			Timestamp ts = new Timestamp(time)
//			System.out.println("Current Time Stamp: " + ts);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
