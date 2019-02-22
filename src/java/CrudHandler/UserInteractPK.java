
package CrudHandler;

import java.io.Serializable;



public class UserInteractPK implements Serializable {

    private int userid;

    private int productid;

    public UserInteractPK() {
    }

    public UserInteractPK(int userid, int productid) {
        this.userid = userid;
        this.productid = productid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userid;
        hash += (int) productid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInteractPK)) {
            return false;
        }
        UserInteractPK other = (UserInteractPK) object;
        if (this.userid != other.userid) {
            return false;
        }
        if (this.productid != other.productid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UserInteractPK[ userid=" + userid + ", productid=" + productid + " ]";
    }
    
}
