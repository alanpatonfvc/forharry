import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    //Declare a constant in Apple class with the length of the timer acts?
    private final int LIFETIME=260;
    private int timer;
    
    public Apple()
    {
        timer= LIFETIME; // to initialise
    }
    
    
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        timer--;
        if(timer<=0)
        {       
            getWorld().removeObject(this);
        }
    }    
}
