package com.chinwe.basic.utils;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class MethodTool {
    public static void printObjMethods(Object obj){
        Method[] methods = obj.getClass().getMethods();

        for(Method method : methods){
            System.out.println("method = " + method.getName());
        }
    }

    public static Set<String> getMethodsOfObject(Object obj){
        Set<String> methodsSet = new HashSet<String>();

        Method[] methods = obj.getClass().getMethods();

        for(Method method : methods){
            methodsSet.add(method.getName());
        }

        return methodsSet;
    }

    public static void printUniqeMethods(Object baseClass, Object targetClass){
        Set<String> baseClassMethodsSet = getMethodsOfObject(baseClass);
        Set<String> targetClassMethodsSet = getMethodsOfObject(targetClass);
        targetClassMethodsSet.removeAll(baseClassMethodsSet);
        for(String oneMethod : targetClassMethodsSet){
            System.out.println(oneMethod);
        }

    }
}
