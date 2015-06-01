package io.github.fergoman123.fergoutil.log;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerFergo
{
    private String loggerName;
    private Logger logger;

    public LoggerFergo(String loggerName)
    {
        this.loggerName = loggerName;
        this.logger = LogManager.getLogger(loggerName);
    }

    public Logger getLogger() {
        return logger;
    }

    public void all(String message)
    {
        logger.log(Level.ALL, message);
    }

    public void dubug(String message)
    {
        logger.log(Level.DEBUG, message);
    }

    public void error(String message)
    {
        logger.log(Level.ERROR, message);
    }

    public void fatal(String message)
    {
        logger.log(Level.FATAL, message);
    }

    public void info(String message)
    {
        logger.log(Level.INFO, message);
    }

    public void off(String message)
    {
        logger.log(Level.OFF, message);
    }

    public void warn(String message)
    {
        logger.log(Level.WARN, message);
    }
}
