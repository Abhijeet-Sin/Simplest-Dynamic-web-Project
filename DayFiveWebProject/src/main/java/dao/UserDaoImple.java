package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import second.User;
import util.MyUtility;

public class UserDaoImple implements UserDao{



   @Override
    public User findUser(User user) {



       User uu = null;
        try {
            Statement stmt = MyUtility.getCon().createStatement();
            String sql  ="select * from myuser where username= '"+user.getUserName()+"'and password = '"+user.getPassword()+"'";
            ResultSet set = stmt.executeQuery(sql);
            
            while(set.next()) {
            	if(uu==null)uu = new User();
                uu.setUserName(set.getString("username"));
                uu.setPassword(set.getString("password"));
                uu.setRole(set.getString("role"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return uu;
    }



}