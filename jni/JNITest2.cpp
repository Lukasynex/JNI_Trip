
#include <string.h>
#include <jni.h>
extern "C" {
      JNIEXPORT jstring JNICALL
      Java_com_luk_jnitest2_MainActivity_stringFromJNI
      (JNIEnv *env, jobject obj)
      {
            return env->NewStringUTF("Hello from C++ over JNI!");
      }
}
