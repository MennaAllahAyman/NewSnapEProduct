
package Admin;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Add_admin  implements Serializable  {
    private String adminName;
    private String adminEmail;
    private String adminAddress;
    private String adminPassword;
    private String adminConfirmPass;
    private int adminAge;
    private int adminNumber;

      
     public void addAdmin(){
        adminName=this.adminName;
        adminEmail=this.adminEmail;
        adminAddress=this.adminAddress;
        adminPassword=this.adminPassword;
        adminConfirmPass=this.adminConfirmPass;
        adminAge=this.adminAge;
        adminNumber=this.adminNumber;
        System.out.println("user name :"+adminName);
        System.out.println("user password :"+adminEmail);
        System.out.println("user email :"+adminPassword);
        System.out.println("user name :"+adminConfirmPass);
        System.out.println("user password :"+adminAge);
        System.out.println("user email :"+adminNumber);
        
    }
     
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminConfirmPass() {
        return adminConfirmPass;
    }

    public void setAdminConfirmPass(String adminConfirmPass) {
        this.adminConfirmPass = adminConfirmPass;
    }

    public int getAdminAge() {
        return adminAge;
    }

    public void setAdminAge(int adminAge) {
        this.adminAge = adminAge;
    }

    public int getAdminNumber() {
        return adminNumber;
    }

    public void setAdminNumber(int adminNumber) {
        this.adminNumber = adminNumber;
    }
    
}
