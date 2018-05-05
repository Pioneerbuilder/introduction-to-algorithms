package com.pioneer.algorithm.singleton;

import java.io.Serializable;

/**
 * Created by daydayup on 2018/5/5.
 */
public class SerSingleton implements Serializable {
    String name;
    private SerSingleton(){
        System.out.println("Singleton is creating");
    }

    private static SerSingleton instance = new SerSingleton();

    public static SerSingleton getInstance(){
        return instance;
    }

    private Object readResolve(){
        System.out.println("read resolve");
        return instance;
    }
}
