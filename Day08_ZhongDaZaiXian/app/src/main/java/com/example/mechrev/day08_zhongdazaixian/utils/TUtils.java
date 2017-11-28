package com.example.mechrev.day08_zhongdazaixian.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/**
 * Created by MECHREV on 2017/11/27.
 */

public class TUtils {

    private static Class<?> aClass;
    private static Type genericSuperclass;
    private static Type[] arguments;
    private static Type type;

    public static <T>T getT(Object o, int i){

        try {
            aClass = o.getClass();
            genericSuperclass = aClass.getGenericSuperclass();
            arguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            type = arguments[i];
            return ((Class<T>)type).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
