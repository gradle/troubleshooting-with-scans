package example;

import com.google.common.base.Joiner;
import org.slf4j.Logger;

public class Example {

    private static Logger logger = CustomLogger.of(Example.class);

    public static String join(String... args) {
        logger.info("running example");
        return Joiner.on(' ').join(args);
    }

}
