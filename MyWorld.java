import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    Ryba rybka;
    Licznik licznik;
    
    public Licznik zwrocLicznik(){
        return licznik;
    }
    
    public MyWorld()
    {    
        super(800, 600, 1);
   //     System.out.println("Hello ŁÓDŹ");
        licznik = new Licznik();
        addObject(licznik, 25, 5);
    }
    
    public void pokazWynik(){
    }
    public void dodajRybke(){
            switch(Greenfoot.getRandomNumber(3))
            {
                case 0: {rybka = new Zielona();
                        break;}
                case 1: {rybka = new Zlota();
                         break;}
                case 2: {rybka = new Paskowana();
                         break;}
            }
            addObject(rybka,400,Greenfoot.getRandomNumber(400)+100);
    }
    
    public void act(){
        if(Greenfoot.mousePressed(this)){
            dodajRybke();
        }
        if (numberOfObjects()==1) {
            for(int i=0;i<3;i++) dodajRybke();
        }
    }
}
