public class Main {
    public static void main(String args[]) {
        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObj.log(LogProcessor.ERROR, "Exception happens");
        logObj.log(LogProcessor.DEBUG, "Need to debug this");
        logObj.log(LogProcessor.INFO, "JUST FOR INFO");
    }
}
