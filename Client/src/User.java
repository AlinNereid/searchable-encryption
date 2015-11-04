/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tudor
 */
public class User {
    private EnumUserType Type;
    private String username,password;
    
    public User(String username, String password, EnumUserType Type)
    {
        this.username = username;
        this.password = password;
        this.Type = Type;
    }
    
    public String GetName()
    {
        return this.username;
    }
    
    public String GetPassword()
    {
        return this.password;
    }
    
    public boolean IsAdministrator()
    {
        return Type.equals(EnumUserType.Administrator);
    }
    
    public User(){}
    
    
}
