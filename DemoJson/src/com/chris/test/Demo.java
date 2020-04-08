package com.chris.test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cedarsoftware.util.io.JsonWriter;



public class Demo {

	public static void main(String[] args) {
		
		ArrayList<cicsstats> myarraylist = new ArrayList<cicsstats>();
		
		for (int i = 0; i < 200; i++) {
			
			cicsstats mycicsstats = new cicsstats();
			Random myrand = new Random();

			Instant myinstant = Instant.now();

			
			
			long[] stats;
			stats = new long[2];
			stats[0] = Long.valueOf(myrand.nextInt(1000));
			stats[1] = myinstant.toEpochMilli();
			
			mycicsstats.setNumOfTransactions(stats);
			mycicsstats.setTarget("sample target");
		
			
			myarraylist.add(mycicsstats);
			
			
		}
		
		Map options = new HashMap<String, Object>();
		
		options.put(JsonWriter.PRETTY_PRINT,true);
		options.put(JsonWriter.TYPE, false);
		
		String json = JsonWriter.objectToJson(myarraylist,options);
		System.out.println(json);
		
		

	}

}
