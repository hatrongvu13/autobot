package org.jax.data.common.impl;

import org.jax.data.common.LogUtils;
import org.jax.data.constant;

import java.time.LocalDateTime;

public class LogUtilsImpl implements LogUtils {
    @Override
    public void info(String content) {
        System.out.println(String.format(constant.LOG, LocalDateTime.now(), constant.INFO, content));
    }

    @Override
    public void warn(String content) {
        System.out.println(String.format(constant.LOG, LocalDateTime.now(), constant.WARN, content));
    }

    @Override
    public void error(String content) {
        System.out.println(String.format(constant.LOG, LocalDateTime.now(), constant.ERROR, content));
    }

    @Override
    public void debug(String content) {
        System.out.println(String.format(constant.LOG, LocalDateTime.now(), constant.DEBUG, content));
    }
}
