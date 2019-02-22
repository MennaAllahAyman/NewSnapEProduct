
package CrudHandler;

import java.io.Serializable;



public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer categoryID;
    private int categoryType;

    private byte[] categoryLogo;
 private Users userid;

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    public Category() {
    }

    public Category(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Category(Integer categoryID, int categoryType, byte[] categoryLogo) {
        this.categoryID = categoryID;
        this.categoryType = categoryType;
        this.categoryLogo = categoryLogo;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public int getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(int categoryType) {
        this.categoryType = categoryType;
    }

    public byte[] getCategoryLogo() {
        return categoryLogo;
    }

    public void setCategoryLogo(byte[] categoryLogo) {
        this.categoryLogo = categoryLogo;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoryID != null ? categoryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Category)) {
            return false;
        }
        Category other = (Category) object;
        if ((this.categoryID == null && other.categoryID != null) || (this.categoryID != null && !this.categoryID.equals(other.categoryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Category[ categoryID=" + categoryID + " ]";
    }
    
}
