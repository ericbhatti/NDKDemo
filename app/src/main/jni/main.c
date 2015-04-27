#include <jni.h>
#include "com_bezyapps_ndkdemo_MyActivity.h"
#include "MyActivityCPP.h"
//using namespace cv;

JNIEXPORT jstring JNICALL Java_com_bezyapps_ndkdemo_MyActivity_hello
  (JNIEnv * env, jobject obj)
  {
  //char* image;
        //      cv::Mat image1;

int a =  5;a =  helloimage();
    return (*env) -> NewStringUTF(env, "Hello REA from C++!" );
  //  return (*env) -> NewStringUTF(env, (char) a);
  }

  JNIEXPORT jint JNICALL Java_com_bezyapps_ndkdemo_MyActivity_image(JNIEnv * env, jobject obj)
  {
  return  helloimage();
  }