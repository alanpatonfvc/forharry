import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orchard extends World
{
    
    // act method
    public void act()
    {
     addApple();     
    }
    
    private void addApple()
    {
        if(Greenfoot.getRandomNumber(1000)<10)
            addObject(new Apple(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));   
    }
    
    
    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Orchard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tree tree = new Tree();
        addObject(tree,152,136);
        Tree tree2 = new Tree();
        addObject(tree2,244,273);
        Tree tree3 = new Tree();
        addObject(tree3,166,464);
        Tree tree4 = new Tree();
        addObject(tree4,436,199);
        Tree tree5 = new Tree();
        addObject(tree5,486,452);
        Tree tree6 = new Tree();
        addObject(tree6,565,84);
        Tree tree7 = new Tree();
        addObject(tree7,540,222);
        Tree tree8 = new Tree();
        addObject(tree8,700,384);
        tree5.setLocation(439,541);
        tree3.setLocation(179,453);
        tree6.setLocation(615,33);
        Person person = new Person();
        addObject(person,414,353);
    }
}
