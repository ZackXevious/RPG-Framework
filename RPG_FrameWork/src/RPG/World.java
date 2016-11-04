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
public class World
        implements Serializable
{
    //Variables-----------------------------------------------------------------
    private Area[][] world;
    //Constructors--------------------------------------------------------------
    public World()
    {
        world=new Area[10][10];
    }
    public World(int iSizeX, int iSizeY)
    {
        world=new Area[iSizeX][iSizeY];
    }
    
}
