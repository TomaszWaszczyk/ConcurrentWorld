package com.waszczyk.dobosz;

/**
 * Created by Panta Rhei on 2015-05-04.
 */
public class Consumer implements Runnable{

    Resource resource;

    Consumer(Resource resource){
        this.resource = resource;
        new Thread(this).start();
    }

    public void run() {
        int number;
        for(;;){
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){

            }

            number = resource.get();
        }
    }
}
