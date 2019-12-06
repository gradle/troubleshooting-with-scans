package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Pretend this does something useful
 */
public class CustomLogger {
    private CustomLogger() {}

    public static Logger of(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
