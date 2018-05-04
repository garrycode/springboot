package com.qianpen.log.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtil {
	private static Logger logger = LoggerFactory.getLogger(LogUtil.class);
	
	public static void test() {
		logger.debug("调试日志");
		logger.error("错误日志");
	}
}
