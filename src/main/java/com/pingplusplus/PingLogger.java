package com.pingplusplus;

/**
 * 日志
 * 
 * @author miles.wang
 *
 */
public class PingLogger {

    public void logRsp(String url, int statusCode, long time) {
        PingLogger logger = AppContextHolder.getLogger();
        if (logger != null) {
            logger.logRsp(url, statusCode, time);
        }
    }
}
