/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author mostafa
 */
@ManagedBean
public class Add_Complain implements Serializable {
    private String userName;
    private String userEmail;
    private String Msg;
    
     public void addComplain(){
        userName=this.userName;
        userEmail=this.userEmail;
        Msg=this.Msg;
        System.out.println("user name :"+userName);
        System.out.println("user password :"+userEmail);
        System.out.println("user email :"+Msg);
        
    }
     
    
    

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
   
    
}
