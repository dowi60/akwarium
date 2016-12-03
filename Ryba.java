import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ryba extends Actor
{
    boolean czyZlapana = false;
    int szybkosc;
    Licznik licznik = new Licznik();
   
    public void act() 
    {
        // Add your action code here.
        //move(4);
        if(!czyZlapana){  
            move(szybkosc);

            if(isAtEdge()){
                if(getX() > 795 || getX() <5){
                    setRotation(180-getRotation());
                    getImage().mirrorVertically();
                }else{
                    setRotation(-getRotation());
                }
            }
        }else{
            setLocation(getX(), getY()-5);
            this.szybkosc=0;
            if(isAtEdge()){
                MyWorld swiat = (MyWorld) getWorld();
                Licznik licznik = swiat.zwrocLicznik();
                licznik.wynik();
                getWorld().removeObject(this);
            }
        }
        if(Greenfoot.mousePressed(this)){
            getWorld().addObject(new Haczyk(), getX(), getY());
            czyZlapana=true;
        }
    }    
}
