package com.pingplusplus;

public abstract class AppContextHolder {

    private static ThreadLocal<String> appIdLocal = new ThreadLocal<String>();
    private static ThreadLocal<PingLogger> PingLogger = new ThreadLocal<PingLogger>();

    public static void setAppId(String appId) {
        appIdLocal.set(appId);
    }

    public static String getAppId() {
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
