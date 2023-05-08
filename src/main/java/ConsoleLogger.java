import java.time.LocalDateTime;

public class ConsoleLogger implements Logger{
    private int num = 1;
    private ConsoleLogger() {};

    private static class LazyHolder {
        static final Logger INSTANCE = new ConsoleLogger();
    }

    public static Logger getInstance() {
        return LazyHolder.INSTANCE;
    }

    @Override
    public void log(String msg) {
        System.out.println("["+ LocalDateTime.now() + " " + num++ + "] " + msg);
    }
}
