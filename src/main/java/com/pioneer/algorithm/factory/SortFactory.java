package com.pioneer.algorithm.factory;

import com.pioneer.algorithm.sort.QuickSort;
import com.pioneer.algorithm.sort.SortAlgorithm;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by daydayup on 2018/3/31.
 */
public class SortFactory {

    private static Map<Class, SortAlgorithm> sortMap = new ConcurrentHashMap<>();

    public static <T> SortAlgorithm create(Integer[] array, Class<T> clazz) {
        SortAlgorithm instance = sortMap.get(clazz);
        if (instance != null) {
            return instance;
        }

        Object obj;
        try {
            Constructor constructor = clazz.getConstructor(Integer[].class);
            obj = constructor.newInstance(array);
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }

        SortAlgorithm algorithm = (SortAlgorithm) obj;
        sortMap.put(clazz, algorithm);
        return algorithm;
    }
}
