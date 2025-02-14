public abstract class LogProcessor {
    public static int ERROR = 1;
    public static int DEBUG = 2;
    public static int INFO = 3;

    private LogProcessor nextProcessor;

    public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextProcessor != null) {
            nextProcessor.log(logLevel, message);
        }
    }
}
