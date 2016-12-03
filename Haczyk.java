import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Haczyk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Haczyk extends Actor
{
    /**
     * Act - do whatever the Haczyk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()-5);
        if(isAtEdge()){
            getWorld().removeObject(this);}
    }    
}
