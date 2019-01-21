package com.cqkj.entity;

/**
 * 
 * @author dieflag
 * @createDate 2019-01-21
 * @lastUpDate 2019-01-21
 * @version 1.0
 */
public class HelloSpring
{
    private String who;

    public String getWho()
    {
        return who;
    }

    public void setWho(String who)
    {
        this.who = who;
    }
    
    public void say()
    {
        System.out.println("Hello " + who + " !");
    }

}
