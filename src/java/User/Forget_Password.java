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
public class Forget_Password implements Serializable {
    public String userEmail;
    public String userCode;
    
    public void sendVerificationCode(){
         userEmail=this.userEmail;
        System.out.println("user name :"+userEmail);
    }
    
    public void Verify(){


        userCode=this.userCode;
        System.out.println("user name :"+userCode);
        
    
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    
}
