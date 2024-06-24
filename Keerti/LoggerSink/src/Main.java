//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Date;

enum LogLevel{
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARNING(4),
    ERROR(5);

    final int level;

    LogLevel(int level){
        this.level = level;
    }
}

class Logger{
    private static volatile Logger instance;
    private LogLevel logLevel;
    private LogSink logSink;

    private Logger(){
        this.logLevel = LogLevel.INFO;
        this.logSink = new ConsoleLogger();
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized (Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel logLevel){
        this.logLevel = logLevel;
    }

    public void setLogSink(LogSink logSink){
        this.logSink = logSink;
    }

    public void log(LogLevel logLevel, String message){
        if(this.logLevel.ordinal() <= logLevel.ordinal()){
            String logMessage = "[" + new Date() + "] [" + logLevel + "] " + message;
            this.logSink.log(logMessage);
        }
    }
}

interface LogSink{
    void log(String message);
}
class ConsoleLogger implements LogSink{

    @Override
    public void log(String message) {
        System.out.println("Console : " + message);
    }
}

class FileLogger implements  LogSink{

    @Override
    public void log(String message) {
        System.out.println("File : " + message);
    }
}

interface LoggerFactory{
    Logger createLogger();
}

class ConsoleLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger = Logger.getInstance();
        logger.setLogLevel(LogLevel.INFO);
        logger.setLogSink(new ConsoleLogger());
        return logger;
    }
}

class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger = Logger.getInstance();
        logger.setLogSink(new FileLogger());
        logger.setLogLevel(LogLevel.INFO);
        return logger;
    }
}

public class Main {
    public static void main(String[] args) {
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();

        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.log(LogLevel.WARNING, "This is warning");

        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.log(LogLevel.ERROR, "This is Debug");
    }
}