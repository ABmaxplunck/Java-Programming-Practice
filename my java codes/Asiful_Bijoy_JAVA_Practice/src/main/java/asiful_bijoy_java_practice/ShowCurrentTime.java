/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asiful_bijoy_java_practice;

/**
 *
 * @author User
 */
public class ShowCurrentTime {
        public static void main(String[] args){
        
        long totalTimeInSec = System.currentTimeMillis()/1000;
        long todayTimeInSec = totalTimeInSec % (24*60*60);
        long hour = todayTimeInSec / (60*60);
        long totalSec =  todayTimeInSec % (60*60);
        long min = totalSec / 60;
        long sec = totalSec % 60; 
        
        System.out.println(hour +":" + min + ":" + sec + ":" + "GMT");
        
        System.out.println((hour+6)%24 +":" + min + ":" + sec + ":" + "BD Time GMT");
        
        
        
    
    }
    
}
