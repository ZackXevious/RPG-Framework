/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

import java.util.ArrayList;

/**
 *
 * @author Zachary Kirchens
 */
public class Actor
        extends GameObject
{
    //Variables-----------------------------------------------------------------
    double health;
    double healthMax;
    String bio;
    ArrayList<GameItem> inventory;
    int xp;
    int level;
    boolean isAlive;
    
    
    //Constructors--------------------------------------------------------------
    public Actor()
    {
        super();
    }
    public Actor(String sName)
    {
        super(sName);
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setHealth(double iHealth)
    {
        health=iHealth;
        if(health<=0)
        {
            this.die();
        }
    }
    public void setHealthMax(double iMaxHealth)
    {
        health=iMaxHealth;
    }
    public void setBio(String sBio)
    {
        bio=sBio;
    }
    public void setXP(int iXP)
    {
        xp=iXP;
    }
    public void setLevel(int iLevel)
    {
        level=iLevel;
    }
    public void setIsAlive(boolean bIsAlive)
    {
        isAlive=bIsAlive;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public double getHealth()
    {
        return health;
    }
    public double getHealthMax()
    {
        return healthMax;
    }
    public String getBio()
    {
        return bio;
    }
    public int getXP()
    {
        return xp;
    }
    public int getLevel()
    {
        return level;
    }
    public boolean getIsAlive()
    {
        return isAlive;
    }
    
    
    //Game-Related Methods
    public void die()
    {
        this.setIsAlive(false);
    }
    public void getObject()
    {
        //for(GameObject:Area.getObjects())
    }
    public String Affect(String sType, double dStrength)
    {
        switch(sType)
        {
            case("heal"):
            {
                if((this.getHealth()+dStrength)> this.getHealthMax())
                {
                    this.setHealth(this.getHealthMax());
                    return "Health set to max!";
                }
                else
                {
                    this.setHealth(this.getHealth()+dStrength);
                    return "You gained "+dStrength+" health.";
                }
            }
            case("harm"):
            {
                if(this.getHealth()<dStrength)
                {
                    this.setHealth(0.0);
                    return "You lost all HP and DIED";
                }
                else
                {
                    this.setHealth((double)this.getHealth()-dStrength);
                    return "You lost "+dStrength+" health";
                }
            }
            case("xp"):
            {
                this.setXP(this.getXP()+(int)dStrength);
                return "You gained "+(int)dStrength+" experience points";
            }
            case("hpmax"):
            {
                this.setHealth(this.getHealthMax());
                break;
            }
            case("levelup"):
            {
                this.setLevel(this.getLevel()+1);
                break;
            }
            case("hpmaxup"):
            {
                this.setHealthMax(this.getHealthMax()+dStrength);
                break;
            }
            default:
            {
                System.out.println("This tried.... something. It didnt work.");
            }
        }
    }
}
