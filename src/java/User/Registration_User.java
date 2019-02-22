package User;

import CrudHandler.CRUHandler;
import CrudHandler.Users;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean

public class Registration_User implements Serializable {
    Users user=new Users();

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    public void adduser()
    {
        try {
          
         CRUHandler handler=new CRUHandler();
              handler.setUrl("http://18.191.198.28:8080/SnapWservice/webresources/");
         System.err.printf("enter fun."+user.getUserAddress());
//               Users us=new Users();
//               
//        us.setUserID(666);
//        us.setUserName("ahmed");
//        us.setUserAddress("Giza");
//        us.setUserAge(12);
//        us.setUserEmail("abdalla");
//        us.setUserPassword("123");
//        us.setUserPhone(01000);
//        us.setUserState(1);
//        us.setUserType(1);
       // us.setUserlastLog(new Date());
        user.setUserImage(new byte[10]);
              user.setUserState(1);
  user.setUserType(1);
  user.setUserID(1000);
               //insert new 
            System.err.println(handler.InsertNew("com.entity.user/",user));
              
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    

    
    
}
