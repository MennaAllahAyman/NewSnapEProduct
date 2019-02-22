
package Admin;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@SessionScoped
@ManagedBean


public class Complain_Details  implements Serializable  {
    
    private String username;
    private String complain_date;
    private String complain_text;

    public void replay()
    {
        
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComplain_date() {
        return complain_date;
    }

    public void setComplain_date(String complain_date) {
        this.complain_date = complain_date;
    }

    public String getComplain_text() {
        return complain_text;
    }

    public void setComplain_text(String complain_text) {
        this.complain_text = complain_text;
    }
    
    
    
}
