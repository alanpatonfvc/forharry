import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
        // prevX holds the current value of the X coordinate before moving
        // prevY hold the Y coordinate
        private int prevX;
        private int prevY;
        
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    
    public void act() 
    {
        // Add your action code here.

        // get position of the person before moving
        getCurrentPosition();
        // check for a key press and move
        checkKeyPress();
        
        checkCollision();
    } 
    
  /*
    public void checkCollision()
    {
        
        Actor treeHit = getOneIntersectingObject(Tree.class);
        
        if(treeHit!=null)
        {
            setLocation(prevX,prevY);
        }
    }
    */
   
   
   public void checkCollision()
   {
       if(isTouching(Tree.class)){
           setLocation(prevX,prevY);
        }
    }
    
    
    
    public void getCurrentPosition()
    {
        // save the current position of the person before moving
        prevX = getX();
        prevY = getY(); 
    }
    
    
    public void checkKeyPress(){
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        
        
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
        }
         
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
    
    }
}
