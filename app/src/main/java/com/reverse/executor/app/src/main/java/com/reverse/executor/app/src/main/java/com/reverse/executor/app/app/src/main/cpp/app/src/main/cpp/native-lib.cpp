#include <jni.h>
#include <string>

extern "C" JNIEXPORT jboolean JNICALL
Java_com_reverse_executor_NativeExecutor_injectAndExecute(JNIEnv* env, jclass clazz, jstring script) {
    return JNI_TRUE; 
}
