package com.waszczyk.dobosz;

/**
 * Created by Panta Rhei on 2015-05-04.
 */
public class Resource {

    int number;
    boolean producerDone = false;
    boolean resoureEmpty = true;

    public Resource(){

    }

    void setDone(){
        producerDone = true;
    }

    synchronized void put(int number){
        if(!resoureEmpty){
            try{
                System.out.println("Producer is waiting...");
                wait();
            }catch(InterruptedException e){
            }

            this.number = number;

            System.out.println("The number: " + number + " was produced");
            resoureEmpty = false;

            notify();
        }
    }

    synchronized int get(){
        if(resoureEmpty){
            if(producerDone){
                System.exit(0);
            }
            try{
                System.out.println("Consumer is waiting...");
                wait();
            }catch (InterruptedException e){}
        }
        int number = this.number;

        System.out.println("Liczba " + number + " zostala skonsumowana");
        resoureEmpty = true;
        notify();
        return number;
    }
}
