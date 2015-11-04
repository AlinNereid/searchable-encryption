
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tudor
 */
public interface UserDao {
    public boolean IsExist(User user) throws UserDaoException;
    public boolean IsPasswordCorrect(User user, String password) throws UserDaoException;
    public void Add(User user) throws UserDaoException;
    public void Delete(User user) throws UserDaoException;
    public User GetUser(String username) throws UserDaoException;
 
}
