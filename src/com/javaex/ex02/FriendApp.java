package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Friend> flist = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	for(int i=0; i<3; i++) {
    		flist.add(new Friend(sc.next(), sc.next(), sc.next()));
    	}
    	
    	for(Friend f : flist) {
    		System.out.println(f.toString());
    	}
    	
    	
    	
    	
    	sc.close();

    	
    	
    }

}
