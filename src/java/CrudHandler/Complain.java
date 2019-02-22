
package CrudHandler;

import java.io.Serializable;
import java.util.Date;



public class Complain implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer complainID;

    private String complainText;

    private Date complainDate;

    private String respondName;

    private Date respondDate;

    private String respondText;
 
    private Users userid;

    public Complain() {
    }

    public Complain(Integer complainID) {
        this.complainID = complainID;
    }

    public Complain(Integer complainID, String complainText, Date complainDate) {
        this.complainID = complainID;
        this.complainText = complainText;
        this.complainDate = complainDate;
    }

    public Integer getComplainID() {
        return complainID;
    }

    public void setComplainID(Integer complainID) {
        this.complainID = complainID;
    }

    public String getComplainText() {
        return complainText;
    }

    public void setComplainText(String complainText) {
        this.complainText = complainText;
    }

    public Date getComplainDate() {
        return complainDate;
    }

    public void setComplainDate(Date complainDate) {
        this.complainDate = complainDate;
    }

    public String getRespondName() {
        return respondName;
    }

    public void setRespondName(String respondName) {
        this.respondName = respondName;
    }

    public Date getRespondDate() {
        return respondDate;
    }

    public void setRespondDate(Date respondDate) {
        this.respondDate = respondDate;
    }

    public String getRespondText() {
        return respondText;
    }

    public void setRespondText(String respondText) {
        this.respondText = respondText;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (complainID != null ? complainID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Complain)) {
            return false;
        }
        Complain other = (Complain) object;
        if ((this.complainID == null && other.complainID != null) || (this.complainID != null && !this.complainID.equals(other.complainID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Complain[ complainID=" + complainID + " ]";
    }
    
}
