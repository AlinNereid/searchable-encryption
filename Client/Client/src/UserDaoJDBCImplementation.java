import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tudor
 */
public class UserDaoJDBCImplementation implements UserDao  {
    
    @Override
    public User GetUser(String username) throws UserDaoException
    {
        try
        {
            Connection conn = getConnection();
            String selectSQL = "SELECT PASSWORD, TYPE FROM sample WHERE USERNAME = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
            preparedStatement.setString( 1, username );
            ResultSet rs = preparedStatement.executeQuery(selectSQL );
            String password = null;
            EnumUserType Type = null;
            while (rs.next()) {
                password = rs.getString("PASSWORD");
                Type = EnumUserType.valueOf(rs.getString("TYPE"));	
            }
            if(password != null && Type != null)
                return new User(username, password, Type);
            return null;
        }
        catch( SQLException e ) {
            throw new UserDaoException(e.getMessage());
        }
    }
    
    //similar for IsExist, IsPasswordCorrect, Add, Delete
 @Override   
public boolean IsExist( User user ) throws UserDaoException {
    // Similar: SELECT FROM sample WHERE name = ?
    return true;
 }


@Override
 public boolean IsPasswordCorrect( User user, String password ) throws UserDaoException {
    // Similar: SELECT FROM sample WHERE name = ?"
     return true;
 }
 
 
@Override
 public void Add( User user ) throws UserDaoException {
    // Similar: "INSERT INTO sample VALUES( ?, ?, ? )" 
     
 }
 
 
@Override
 public void Delete( User user ) throws UserDaoException {
    // Similar: "DELETE FROM sample WHERE NAME = ?"
     
 }
    
   
}
