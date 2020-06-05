/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo1;

import java.util.Arrays;

/**
 *
 * @author HEMA KHAFAGY
 */
public class run1 {
   int []b={1,5,2,1,4,0};
   public run1(){
     
       intersections(b);
   }
//==============================================================
//function itersections to get numbers of itersections in array
//==============================================================
   public int intersections(int[]a){
       //===========================================
       //intialize variables
       //===========================================
       int i=a.length;
       int max=10000000;
       int []startpoint=new int[i];
       int []endpoint=new int[i];
       //===========================================
       //get disc start point and dics end point
       //===========================================
       for(int p=0;p<i;p++){
           startpoint[p]=p-a[p];
           endpoint[p]=p+a[p];
       }
       //============================================
       //sort two arrays disc start and disc end
       //============================================
       Arrays.sort(startpoint);
       Arrays.sort(endpoint);
       //sort1 s=new sort1();
       //s.sortt(startpoint);
       //s.sortt(endpoint);
       int SPI=0;
       int EPI=0;
       int opendiscs=0;
       int intersection=0;
       //============================================
       //counting the intersections
       //============================================

  
       while(SPI<i){
           if(startpoint[SPI]<=endpoint[EPI]){
               intersection=intersection+opendiscs;
               
           opendiscs++;
            SPI++;
           }else{
               opendiscs--;
               EPI++;
           }
           if(intersection>max){
                return -1;
                }
       }
       System.out.println("number of intersections \n"+intersection);
       return intersection;
   }
}
