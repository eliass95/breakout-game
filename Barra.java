import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barra extends Actor
{
    /**
     * Act - do whatever the Barra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }
    
    public void movement() {
        if(Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + 10, this.getY());
        }
        
        if(Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - 10, this.getY());
        }
    }
}
