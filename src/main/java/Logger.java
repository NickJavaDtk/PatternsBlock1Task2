import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;


    private Logger() {

    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
            return logger;

    }

    public void log(String msg) {
        System.out.println(new Date(System.currentTimeMillis()) + " [" + num++ + "] " + msg);
    }
}
