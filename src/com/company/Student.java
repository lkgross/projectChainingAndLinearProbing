package com.company;

public class Student{
    String username;
    String firstname;
    String lastname;
    String major;
    String college;
    String maininterest;

    Student(String u, String f, String l, String mj, String c, String mi){
        this.username = u;
    	this.firstname = f;
        this.lastname = l;
        this.major = mj;
        this.college= c;
        this.maininterest = mi;
    }
    
    public void print(){
    	System.out.println(this.firstname);
    	System.out.println(this.lastname);
    	System.out.println(this.major);
    	System.out.println(this.college);
    	System.out.println(this.maininterest);
    
    }
    

}


