package com.waszczyk.dobosz;

/**
 * Created by Panta Rhei on 2015-05-04.
 */
public class Producer implements Runnable{

    Resource resource;

    Producer(Resource resource){
        this.resource = resource;

        new Thread(this).start();
    }

    public void run() {
        for (int i=1; i <= 5; i++){
            resource.put(i);
        }

        resource.setDone();
        System.out.println("Producer finished job.");
    }
}
