// Import the JNDI classes
import javax.naming.NamingException;
import javax.naming.InitialContext;

public class UserDaoFactory {

  private static User dao = null;
  
  public static User getDAO() throws UserDaoException 
  {
    // If we already have loaded the BookDAO, return it
    if ( dao != null ) {
      return dao;
    }
    
    try {
      InitialContext ic = new InitialContext();
      String className = ( String )ic.lookup( "USERDAO.Impl" );
      dao = ( User )Class.forName( className ).newInstance();
    } 
    catch( NamingException ne ) {
      throw new UserDaoException( ne.getMessage() );
    } 
    catch( Exception se ) {
      throw new UserDaoException( se.getMessage() );
    }
    return dao;
  } 
}
