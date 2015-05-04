package com.waszczyk.dobosz;

/**
 * Created by Panta Rhei on 2015-05-04.
 */
public class PCProblem {

    static Resource resource = new Resource();

    public static void main(String args[]){

        new Producer(resource);
        new Consumer(resource);
    }
}
