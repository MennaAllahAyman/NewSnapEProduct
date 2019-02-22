
package Merchent;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@SessionScoped
@ManagedBean


public class Update_Product implements Serializable {
    private String Product_Group;
    private String Product_Name;
    private String Product_Code;
    private String Product_Price;   
    private String Product_Color;  
    private String Product_Description;
    

    
        public void UpdateData() {
      
    }

    public String getProduct_Group() {
        return Product_Group;
    }

    public void setProduct_Group(String Product_Group) {
        this.Product_Group = Product_Group;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public String getProduct_Code() {
        return Product_Code;
    }

    public void setProduct_Code(String Product_Code) {
        this.Product_Code = Product_Code;
    }

    public String getProduct_Price() {
        return Product_Price;
    }

    public void setProduct_Price(String Product_Price) {
        this.Product_Price = Product_Price;
    }

    public String getProduct_Color() {
        return Product_Color;
    }

    public void setProduct_Color(String Product_Color) {
        this.Product_Color = Product_Color;
    }

    public String getProduct_Description() {
        return Product_Description;
    }

    public void setProduct_Description(String Product_Description) {
        this.Product_Description = Product_Description;
    }
    
        
}
