
package Merchent;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@SessionScoped
@ManagedBean

public class Login implements Serializable {
    private String email;
    private String password;
    private String remember_me;
    private String forget_pass;
    
    
    public void login()
    {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemember_me() {
        return remember_me;
    }

    public void setRemember_me(String remember_me) {
        this.remember_me = remember_me;
    }

    public String getForget_pass() {
        return forget_pass;
    }

    public void setForget_pass(String forget_pass) {
        this.forget_pass = forget_pass;
    }
    
    
    
}
