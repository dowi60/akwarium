import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pirania here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pirania extends Ryba
{
    public Pirania(){
       szybkosc=4;
    }
    public void act() 
    {
         super.act();
         move(szybkosc);
    }    
}
