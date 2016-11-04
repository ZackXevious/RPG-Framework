/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

/**
 *
 * @author Zachary Kirchens
 */
public class GameItem 
        extends GameObject
{
    //Variables
    String description;
    String type;
    String effect;
    //Constructors
    public GameItem()
    {
        super("Default Item");
        this.setType("Default");
        this.setDescription("This is a default");
        
    }
    public GameItem(String sName, String sType, String sDescrip)
    {
        super(sName);
        this.setType(sType);
        this.setDescription(sDescrip);
        
    }
    public GameItem(String sName, String sType,
            String sDescrip, 
            double locX, double locY)
    {
        super(sName, locX, locY);
        this.setType(sType);
        this.setDescription(sDescrip);
        
    }
    //Mutators------------------------------------------------------------------
    public void setDescription(String sDescrib)
    {
        description = sDescrib;
    }
    public void setType(String sType)
    {
        type=sType;
    }
    
    //Accessors-----------------------------------------------------------------
    public String getDescription()
    {/*Returns the value in the description variable*/
        return description;
    }
    public String getType()
    {
        return type;
    }
    
}
