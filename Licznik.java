import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Licznik extends Actor
{
    int zlowioneRybki = 0;
    
    public Licznik(){
        setImage(new GreenfootImage("Wynik+ "+zlowioneRybki,16,Color.RED,null));
    }    
    
    public void wynik() 
    {
        zlowioneRybki += 1;
        setImage(new GreenfootImage(""+zlowioneRybki,50,Color.RED,null));
    }    
}
