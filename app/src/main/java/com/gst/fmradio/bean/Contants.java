package com.gst.fmradio.bean;

/**
 * Created by yyshang on 7/9/15.
 */
public class Contants {
    public final static int MEDIA_BASE = 0x00000000;
    public final static int MEDIA_ORIGINAL = MEDIA_BASE+1;
    public final static int MEDIA_PREVIOUS = MEDIA_BASE+2;
    public final static int MEDIA_NEXT = MEDIA_BASE+3;
    public final static int MEDIA_LATTER = MEDIA_BASE+4;

    //用于判断滑动方向的标志位，1代表向左滑，2代表向右滑动；
    public final static int TURNLEFT = 1;
    public final static int TURNRIGHT = 2;

    //FM频道值的上下限
    public final static int MINCHANNELNUM = 875;
    public final static int MAXCHANNELNUM = 1080;
}
