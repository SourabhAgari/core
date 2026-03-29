package com.sra.core.interfaces;

import java.time.LocalDateTime;

public interface CustomLogger {
    String formattedMsg = LocalDateTime.now() + "test";

    default void logError(String msg) {
        System.out.println(formattedMsg);
    }

    default void logWarn(String msg) {
        String formattedMsg = LocalDateTime.now() + "test";
    }
}
