
package CrudHandler;

import java.io.Serializable;


public class Brand implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer brandID;

    private String brandName;

    private byte[] brandLogo;

    private int merchantid;

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

 private Users userid;

    public Brand() {
    }

    public Brand(Integer brandID) {
        this.brandID = brandID;
    }

    public Brand(Integer brandID, String brandName, byte[] brandLogo, int merchantid) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.brandLogo = brandLogo;
        this.merchantid = merchantid;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public byte[] getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(byte[] brandLogo) {
        this.brandLogo = brandLogo;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brandID != null ? brandID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brand)) {
            return false;
        }
        Brand other = (Brand) object;
        if ((this.brandID == null && other.brandID != null) || (this.brandID != null && !this.brandID.equals(other.brandID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Brand[ brandID=" + brandID + " ]";
    }
    
}
