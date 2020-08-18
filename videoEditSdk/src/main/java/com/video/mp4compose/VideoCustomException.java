package com.video.mp4compose;

public class VideoCustomException extends Exception {

    public static final int CLIP_VIDEO_TIMERANGE_ERROR = 1;
    public static final int CLIP_VIDEO_OUT_OF_RANGE = 2;
    public static final int MEDIA_EXTRACTOR_DATASOURCE_FAILED = 3;
    public static final int MEDIA_MUXER_INSTANCE_FAILED = 4;
    public static final int MEDIA_HAS_NO_VIDEO = 5;

    private int mErr;
    private Throwable mException;

    public VideoCustomException(int err, Throwable e) {
        mErr = err;
        mException = e;
    }

    public String toString() {
        return "VideoCustomException[ErrCode=" + mErr+", ErrMsg="+mException.getMessage()+"]";
    }
}
