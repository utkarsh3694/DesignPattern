package org.uv.design.DesignPattern.Singleton;

public class SingletonImpl {

    public static void singleimpl(){

        Singleton u = Singleton.getInstance();

        System.out.println(u.getNumber());
        u.setNumber(10);
        System.out.println(u.getNumber());



    }

}
