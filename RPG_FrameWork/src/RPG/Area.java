/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zachary Kirchens
 */
public class Area
        implements Serializable
{
    //Variables
    private String type;
    private ArrayList<Actor> actorList;
    private ArrayList<GameItem> itemList;
    
    
    //Constructors
    public Area()
    {
        
    }
    //Mutators
    public void setType(String areaType)
    {
        type=areaType;
    }
    //Accessors
    //Game-Related Functions
    public void Affect()
    {
        
    }
}
