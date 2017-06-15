package com.sc.rt;

/**
 * Created by admin on 2017/6/15.
 */
public class DigestRunnable implements Runnable {

    private String filename;
    private CallbackDigestUserInterface callbackDigestUserInterface;

    DigestRunnable(String filename,CallbackDigestUserInterface callbackDigestUserInterface){
        this.filename=filename;
        this.callbackDigestUserInterface=callbackDigestUserInterface;
    }

    @Override
    public void run() {
        System.out.println("我是thred:filename="+filename);
        callbackDigestUserInterface.receiveDigest(filename);
    }


}
