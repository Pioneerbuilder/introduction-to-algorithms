package com.pioneer.algorithm;

import com.pioneer.algorithm.singleton.SerSingleton;

import java.io.*;

/**
 * Created by daydayup on 2018/5/5.
 */
public class SingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerSingleton s1 = null;
        SerSingleton s = SerSingleton.getInstance();

        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.flush();
        oos.close();

        FileInputStream fis = new FileInputStream("a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        s1 = (SerSingleton) ois.readObject();

    }
}
