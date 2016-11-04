/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

import java.io.Serializable;

/**
 *
 * @author Zachary Kirchens
 */
public abstract class GameObject 
        implements Serializable
{
    //Variables-----------------------------------------------------------------
    private double LocationX;
    private double LocationY;
    private String name;
    
    
    //Constructors--------------------------------------------------------------
    public GameObject()
    {
        this.setName("Default");
        this.setLocationX(0.0);
        this.setLocationY(0.0);
    }
    public GameObject(String sName)
    {
        this.setName(sName);
        this.setLocationX(0.0);
        this.setLocationY(0.0);
    }
    public GameObject(String sName, double dLocX, double sLocY)
    {
        this.setName(sName);
        this.setLocationX(dLocX);
        this.setLocationY(sLocY);
    }
    //Mutators------------------------------------------------------------------
    public void setName(String sName)
    {
        name=sName;
    }
    public void setLocationX(double dLocX)
    {
        LocationX=dLocX;
    }
    public void setLocationY(double dLocY)
    {
        LocationY=dLocY;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    public double getLocX()
    {
        return LocationX;
    }
    public double getLocY()
    {
        return LocationY;
    }
    
}
