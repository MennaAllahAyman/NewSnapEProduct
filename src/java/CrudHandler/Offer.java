
package CrudHandler;

import java.io.Serializable;
import java.util.Date;

public class Offer implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer offerID;

    private int offerdiscount;

    private Date offerstartDate;

    private Date offerendDate;

    private String offerDescription;
   

    public Offer() {
    }

    public Offer(Integer offerID) {
        this.offerID = offerID;
    }

    public Offer(Integer offerID, int offerdiscount, Date offerstartDate, Date offerendDate, String offerDescription) {
        this.offerID = offerID;
        this.offerdiscount = offerdiscount;
        this.offerstartDate = offerstartDate;
        this.offerendDate = offerendDate;
        this.offerDescription = offerDescription;
    }

    public Integer getOfferID() {
        return offerID;
    }

    public void setOfferID(Integer offerID) {
        this.offerID = offerID;
    }

    public int getOfferdiscount() {
        return offerdiscount;
    }

    public void setOfferdiscount(int offerdiscount) {
        this.offerdiscount = offerdiscount;
    }

    public Date getOfferstartDate() {
        return offerstartDate;
    }

    public void setOfferstartDate(Date offerstartDate) {
        this.offerstartDate = offerstartDate;
    }

    public Date getOfferendDate() {
        return offerendDate;
    }

    public void setOfferendDate(Date offerendDate) {
        this.offerendDate = offerendDate;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (offerID != null ? offerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offer)) {
            return false;
        }
        Offer other = (Offer) object;
        if ((this.offerID == null && other.offerID != null) || (this.offerID != null && !this.offerID.equals(other.offerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Offer[ offerID=" + offerID + " ]";
    }
    
}
