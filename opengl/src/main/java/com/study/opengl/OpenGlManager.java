package com.study.opengl;

/**
 * @authour lxw
 * @function
 * @date 2019/12/5
 */
public class OpenGlManager {
    static {
        System.loadLibrary("opengl-lib");
    }

    public static native void onSurfaceCreated();

    public static native void onSurfaceChanged(int width,int height);

    public static native void onDrawFrame();
}
