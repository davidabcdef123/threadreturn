package com.sc.rt;

/**
 * Created by admin on 2017/6/15.
 */
public class Test {

    public static void main(String[] args) {
        DigestRunnable digestRunnable = new DigestRunnable("三毛流浪记",new CallbackDigestUserInterface());
        Thread thread = new Thread(digestRunnable);
        thread.start();
    }
}
