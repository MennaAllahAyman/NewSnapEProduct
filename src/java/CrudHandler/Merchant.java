
package CrudHandler;

import java.io.Serializable;



public class Merchant implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer merchantID;
 
    private String companyName;

    private String companyAddress;

    private Integer userid;


    public Merchant() {
    }

    public Merchant(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public Integer getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(Integer merchantID) {
        this.merchantID = merchantID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (merchantID != null ? merchantID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Merchant)) {
            return false;
        }
        Merchant other = (Merchant) object;
        if ((this.merchantID == null && other.merchantID != null) || (this.merchantID != null && !this.merchantID.equals(other.merchantID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Merchant[ merchantID=" + merchantID + " ]";
    }
    
}
