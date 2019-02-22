
package CrudHandler;

import java.io.Serializable;



public class UserInteract implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UserInteractPK userInteractPK;

    private int emotionType;

    private Product product;

    private Users user;

    public UserInteract() {
    }

    public UserInteract(UserInteractPK userInteractPK) {
        this.userInteractPK = userInteractPK;
    }

    public UserInteract(UserInteractPK userInteractPK, int emotionType) {
        this.userInteractPK = userInteractPK;
        this.emotionType = emotionType;
    }

    public UserInteract(int userid, int productid) {
        this.userInteractPK = new UserInteractPK(userid, productid);
    }

    public UserInteractPK getUserInteractPK() {
        return userInteractPK;
    }

    public void setUserInteractPK(UserInteractPK userInteractPK) {
        this.userInteractPK = userInteractPK;
    }

    public int getEmotionType() {
        return emotionType;
    }

    public void setEmotionType(int emotionType) {
        this.emotionType = emotionType;
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
        hash += (userInteractPK != null ? userInteractPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserInteract)) {
            return false;
        }
        UserInteract other = (UserInteract) object;
        if ((this.userInteractPK == null && other.userInteractPK != null) || (this.userInteractPK != null && !this.userInteractPK.equals(other.userInteractPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.UserInteract[ userInteractPK=" + userInteractPK + " ]";
    }
    
}
