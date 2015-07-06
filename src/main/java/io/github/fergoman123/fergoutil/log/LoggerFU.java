package io.github.fergoman123.fergoutil.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.fergoman123.fergoutil.reference.ModInfo;

public class LoggerFU{
	private static Logger log = null;
	
	private static void configureLogging(){
		log = LogManager.getLogger(ModInfo.modid);
	}
	
	public static void log(Level level, String message, Object... params){
		if(log == null) configureLogging();
		if(message == null){
			log.log(level, "Attempted to log null message.");
		}
		else{
			try{
				message = String.format(message, params);
			} catch (Exception e){
				log.log(Level.ERROR, "Failed to format log message. Caused by: %s", e.getMessage());
			}
			log.log(level, message);
		}
	}
	
	public static void info(String message, Object... params){
		log(Level.INFO, message, params);
	}
	
	public static void warn(String message, Object... params){
		log(Level.WARN, message, params);
	}
	
	public static void error(String message, Object... params){
		log(Level.ERROR, message, params);
	}
}
