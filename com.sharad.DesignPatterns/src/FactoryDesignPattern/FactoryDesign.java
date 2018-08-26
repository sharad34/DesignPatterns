/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPattern;

import FactoryDesignPattern.phone.*;

/**
 *
 * @author sharad
 */
public class FactoryDesign {
    
    public static void main(String[] args) {
    
//    OS obj1 = new Android();
//    OS obj2 = new IOS();
//    OS obj3 = new Windows();
//    obj1.spec();
//    obj2.spec();
//    obj3.spec();
    
    OSFactory obj   = new OSFactory();
    OS obj1         = obj.getInstance("Open");
    OS obj2         = obj.getInstance("Closed");
    OS obj3         = obj.getInstance("");
    obj1.spec();
    obj2.spec();
    obj3.spec();
    
    }
}
