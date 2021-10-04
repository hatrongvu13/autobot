package org.jax;

import org.jax.data.common.LogUtils;
import org.jax.data.common.impl.LogUtilsImpl;

public class Main {
    private static final LogUtils logs = new LogUtilsImpl();
    public static void main(String[] args) {
        logs.info("htv");
        logs.error("ascasc");
    }
}
