#include <jni.h>
#include <string>
//openGL导包
#include <GLES2/gl2.h>
#include <GLES2/gl2ext.h>
//定义一个宏函数 用于字符串拼接 ##
#define OPENGLFUN(arg) Java_com_study_opengl_OpenGlManager_##arg

extern "C" JNIEXPORT void JNICALL
OPENGLFUN(onSurfaceCreated)(
        JNIEnv *env,
        jobject /* this */) {
    glClearColor(0.0f,0.0f,1.0f,1.0f);
}


//extern "C" JNIEXPORT void JNICALL
//Java_com_study_opengl_OpenGlManager_onSurfaceCreated(
//        JNIEnv *env,
//        jobject /* this */) {
//}


extern "C" JNIEXPORT void JNICALL
OPENGLFUN(onSurfaceChanged)(
        JNIEnv *env,
        jobject /* this */,
        jint width,
        jint height) {
    glViewport(0,0,width,height);
}


extern "C" JNIEXPORT void JNICALL
OPENGLFUN(onDrawFrame)(
        JNIEnv *env,
        jobject /* this */) {
    glClear(GL_COLOR_BUFFER_BIT);
}