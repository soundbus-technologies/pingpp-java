package com.pingplusplus;

public abstract class AppContextHolder {
    private static ThreadLocal<String> appIdLocal = new ThreadLocal<String>();
    private static ThreadLocal<PingLogger> PingLogger = new ThreadLocal<PingLogger>();
    private static boolean singleAppIdMode = false;
    private static String singleAppId = null;

    public static void enableSingleAppIdMode(String appId) {
        singleAppIdMode = true;
        singleAppId = appId;
    }

    public static void disableSingleAppIdMode() {
        singleAppIdMode = false;
        singleAppId = null;
    }

    public static void setAppId(String appId) {
        appIdLocal.set(appId);
    }

    public static String getAppId() {
        if (singleAppIdMode) {
            return singleAppId;
        }
        return appIdLocal.get();
    }

    public static void setLogger(PingLogger pingLogger) {
        PingLogger.set(pingLogger);
    }

    public static PingLogger getLogger() {
        return PingLogger.get();
    }

    public static void remove() {
        appIdLocal.remove();
        PingLogger.remove();
    }
}
