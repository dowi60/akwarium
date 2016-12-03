import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pasek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasek extends Ryba
{
    public Pasek(){
       szybkosc=6;
    }
    public void act() 
    {
       super.act();
       move(szybkosc);
    }    
}
