
package CrudHandler;

import java.io.Serializable;


public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer productID;

    private String productName;
    private double productPrice;
    private String productDetailes;

    private int productModel;

    private String productColor;
    private byte[] productImage;

    private int productState;


    private Brand brandid;

    private Merchant merchantid;

    private Offer offerid;

    public Product() {
    }

    public Product(Integer productID) {
        this.productID = productID;
    }

    public Product(Integer productID, String productName, double productPrice, String productDetailes, int productModel, String productColor, byte[] productImage, int productState) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDetailes = productDetailes;
        this.productModel = productModel;
        this.productColor = productColor;
        this.productImage = productImage;
        this.productState = productState;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDetailes() {
        return productDetailes;
    }

    public void setProductDetailes(String productDetailes) {
        this.productDetailes = productDetailes;
    }

    public int getProductModel() {
        return productModel;
    }

    public void setProductModel(int productModel) {
        this.productModel = productModel;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public int getProductState() {
        return productState;
    }

    public void setProductState(int productState) {
        this.productState = productState;
    }







    public Brand getBrandid() {
        return brandid;
    }

    public void setBrandid(Brand brandid) {
        this.brandid = brandid;
    }

    public Merchant getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Merchant merchantid) {
        this.merchantid = merchantid;
    }

    public Offer getOfferid() {
        return offerid;
    }

    public void setOfferid(Offer offerid) {
        this.offerid = offerid;
    }



    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productID != null ? productID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productID == null && other.productID != null) || (this.productID != null && !this.productID.equals(other.productID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Product[ productID=" + productID + " ]";
    }
    
}
