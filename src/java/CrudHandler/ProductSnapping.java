
package CrudHandler;

import java.io.Serializable;
import java.util.Date;


public class ProductSnapping implements Serializable {
    private static final long serialVersionUID = 1L;

    protected ProductSnappingPK productSnappingPK;

    private Date snapDate;

    private byte[] snapImage;

    private Product product;

    private Users user;

    public ProductSnapping() {
    }

    public ProductSnapping(ProductSnappingPK productSnappingPK) {
        this.productSnappingPK = productSnappingPK;
    }

    public ProductSnapping(ProductSnappingPK productSnappingPK, Date snapDate, byte[] snapImage) {
        this.productSnappingPK = productSnappingPK;
        this.snapDate = snapDate;
        this.snapImage = snapImage;
    }

    public ProductSnapping(int userid, int productid) {
        this.productSnappingPK = new ProductSnappingPK(userid, productid);
    }

    public ProductSnappingPK getProductSnappingPK() {
        return productSnappingPK;
    }

    public void setProductSnappingPK(ProductSnappingPK productSnappingPK) {
        this.productSnappingPK = productSnappingPK;
    }

    public Date getSnapDate() {
        return snapDate;
    }

    public void setSnapDate(Date snapDate) {
        this.snapDate = snapDate;
    }

    public byte[] getSnapImage() {
        return snapImage;
    }

    public void setSnapImage(byte[] snapImage) {
        this.snapImage = snapImage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSnappingPK != null ? productSnappingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSnapping)) {
            return false;
        }
        ProductSnapping other = (ProductSnapping) object;
        if ((this.productSnappingPK == null && other.productSnappingPK != null) || (this.productSnappingPK != null && !this.productSnappingPK.equals(other.productSnappingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ProductSnapping[ productSnappingPK=" + productSnappingPK + " ]";
    }
    
}
