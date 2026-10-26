package com.reverse.executor;

public class NativeExecutor {
    static {
        System.loadLibrary("reverse");
    }

    public static native boolean injectAndExecute(String script);
}
