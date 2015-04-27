#include "MyActivityCPP.h"
#include <opencv2/core/core.hpp>
#include <iostream>
#include <opencv2/highgui/highgui.hpp>
#include <opencv2/imgproc/imgproc.hpp>
#include <fstream>
using namespace std;
using namespace cv;

int helloimage(){

        cv::Mat image;
     char* imageName ;
    /* ofstream myfile;
     myfile.open("/storage/emulated/0/other.jpg");
    if(myfile.is_open())
    {
    return 3;
    }
    else{
    return 4;
    }*/
    //erc
    image = cvLoadImage(("/storage/emulated/0/other.jpg").c_str());
  //  image = ("/storage/emulated/0/other.jpg");
   if(!image.data )
     {
       std::cout << " No image data ";
       return 1;
     }
     cv::Mat gray_image;
    // cvtColor(image,gray_image, CV_RGB2GRAY, 0 );
    cvtColor( image, gray_image, CV_RGB2GRAY );
     imwrite( "/storage/emulated/0/Gray_Image.jpg", gray_image );
    return 2;
}