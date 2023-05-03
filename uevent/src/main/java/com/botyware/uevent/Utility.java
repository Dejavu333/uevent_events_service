package com.botyware.uevent;

import java.util.UUID;

public class Utility {
    public static String getEnvOrDefault(String p_environmentVariableName, String p_defaultValue) {
        String env = System.getenv(p_environmentVariableName);
        if (env != null) return env;
        return p_defaultValue;
    }

//    public static String generateUniqueIdentifier() {
//        UUID.randomUUID().toString();
//    }
}

