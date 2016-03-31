/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.generics;

/**
 *
 * @author aniruddha
 */
public class Any {
  
    public void acceptAnything(Object anyObject){
   
        if(anyObject instanceof Car){
            
            Car car = (Car) anyObject;
        }
    }
}
