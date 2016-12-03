import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Zlota extends Ryba
{

    public Zlota(){
        szybkosc=1;
        setRotation(Greenfoot.getRandomNumber(45)+25);
    }
    
    public void act() 
    {
        // Add your action code here.
        super.act();
        //move(szybkosc);
    }    
}
