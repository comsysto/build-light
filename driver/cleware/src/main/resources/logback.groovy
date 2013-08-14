import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.ERROR
import static ch.qos.logback.classic.Level.INFO

def defaultPattern = "%msg%n"

appender("stdout", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = defaultPattern
    }
}

logger("org.springframework", ERROR, ["stdout"])
root(INFO, ["stdout"])

