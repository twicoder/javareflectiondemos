package com.chinwe.basic;

import com.chinwe.basic.demos.Father;
import com.chinwe.basic.demos.Sun;
import com.chinwe.basic.utils.MethodTool;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo1 {

    public static void main(String[] args) {

        Class fatherClass = Father.class;
        println(fatherClass.getPackage());

        Package myPackage = fatherClass.getPackage();




    }

    private static void demo3() {
        Class fatherClass = Father.class;
        Field[] fields = fatherClass.getFields();
        for(Field field : fields){
            System.out.println(field.toGenericString());
            System.out.println(field.getDeclaringClass());
        }

        printOneLine();


        System.out.println(fatherClass.getName());
        System.out.println(fatherClass.getSimpleName());

        printOneLine();

        int modifiers = fatherClass.getModifiers();

        println(modifiers);
        printModifiersStatus(modifiers);
    }

    public static void printModifiersStatus(int modifiers){

        printKeyValue("isAbstract:", Modifier.isAbstract(modifiers));
        printKeyValue("isFinal:", Modifier.isFinal(modifiers));
        printKeyValue("isInterface:", Modifier.isInterface(modifiers));
        printKeyValue("isNative:", Modifier.isNative(modifiers));
        printKeyValue("isPrivate:", Modifier.isPrivate(modifiers));
        printKeyValue("isProtected:", Modifier.isProtected(modifiers));
        printKeyValue("isPublic:", Modifier.isPublic(modifiers));
        printKeyValue("isStatic:", Modifier.isStatic(modifiers));
        printKeyValue("isStrict:",  Modifier.isStrict(modifiers));
        printKeyValue("isSynchronized:", Modifier.isSynchronized(modifiers));
        printKeyValue("isTransient:", Modifier.isTransient(modifiers));
        printKeyValue("isVolatile:", Modifier.isVolatile(modifiers));
    }

    public static void printKeyValue(Object key, boolean value){
        int lenghtOfKey = 40;
        StringBuilder sb = new StringBuilder(key.toString());
        for(int i=key.toString().length();i<lenghtOfKey;i++){
            sb.append(' ');
        }
        println(sb.toString() + value);
    }

    public static void println(Object obj){
        System.out.println(obj.toString());
    }

    public static void printOneLine(){
        int size=50;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<size;i++){
            sb.append('*');
        }
        System.out.println(sb.toString());
    }

    public static void demo2(){
        Father father = new Father();
        Sun sun = new Sun();
        MethodTool.printUniqeMethods(father,sun);
    }

    public static void demo1(){
        String str = "Hello";
//        MethodTool.printObjMethods(str);

        Object baseObj = new Object();

        MethodTool.printUniqeMethods(baseObj,str);
    }
}
