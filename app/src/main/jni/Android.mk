LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

#opencv
OPENCVROOT:= D:/Android/OpenCV/CV_sdk
OPENCV_CAMERA_MODULES:=off
OPENCV_INSTALL_MODULES:=on
OPENCV_LIB_TYPE:=SHARED
include ${OPENCVROOT}/sdk/native/jni/OpenCV.mk

LOCAL_SRC_FILES := main.c , MyActivityCPP.cpp
LOCAL_LDLIBS += -llog
LOCAL_MODULE := hello

include $(BUILD_SHARED_LIBRARY)