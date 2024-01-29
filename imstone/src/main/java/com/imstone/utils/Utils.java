package com.imstone.utils;
import java.util.List;

import com.imstone.monster.Monster;
public class Utils{
public static void printCard(List <Monster> l){
    for (int i = 0; i < l.size(); i++){
        //to String avec id id carte 
        System.out.println(i+" - "+l.get(i));
    }
}
}