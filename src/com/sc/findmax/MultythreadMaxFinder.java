package com.sc.findmax;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by admin on 2017/6/15.
 */
public class MultythreadMaxFinder {

    public static int max(int[] data)throws Exception{
        if(data.length==1){
            return data[0];
        }else if(data.length==0){
            throw new Exception();
        }
        //任务分解两部
        FindMaxTask task1=new FindMaxTask(data,0,data.length/2);
        FindMaxTask task2 = new FindMaxTask(data,data.length/2,data.length);
        //创建2个线程
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Integer> future1 = service.submit(task1);
        Future<Integer> future2 = service.submit(task2);
        //future1.get()阻塞
        return Math.max(future1.get(),future2.get());
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3,45};
        try {
            int result=max(data);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
