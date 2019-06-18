package com.afrah.modules.main;

import com.afrah.modules.hello.HelloModules;

public class MainApp{
public static void main(String args[]){
HelloModules.doSomething();
HelloModules module = new HelloModules();
module.sayHello();
}
}