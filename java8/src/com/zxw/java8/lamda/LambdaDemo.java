package com.zxw.java8.lamda;

public class LambdaDemo {
    public static void main(String[] args) {
        LambdaInterface li = (v1,v2) -> { return v1+v2;};
        System.out.println(li.getData(1,2));
    }



}
@FunctionalInterface
interface  LambdaInterface{
    int getData(int v1,int v2);
}
