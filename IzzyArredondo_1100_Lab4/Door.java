

public class Door
{   private String state;
    private String name;
    
    public void open()
    {   
        state = "open";
    }
    
    public void close()
    {   
        state = "close";
    }
    
    public Door (String n, String s)
    {
        state = s;
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getState()
    {
        return state;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setState(String newState)
    {
        state = newState;
    }
    
   
}
    

  
