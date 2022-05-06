package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

       ArrayList<Goods> gList = new ArrayList<Goods>();
       System.out.println("상품을 입력해주세요 (종료: q)");
       Scanner sc = new Scanner(System.in);
       
       while(true) {
    	   String str = sc.next();
    	   if(str.equals("q")) {
    		   System.out.println("[입력완료]");
    		   System.out.println("======================");
    		   break;
    	   }
    	   String[] info = str.split(",");
    	   Goods goods = new Goods(info[0], Integer.parseInt(info[1]), Integer.parseInt(info[2]));
    	   gList.add(goods);
       }
       int sum = 0;
       
       for(Goods il : gList) {
    	   il.showInfo();
    	   sum += il.getCount();
       }
       System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
       
       
       
       sc.close();
    }
    
    

}
