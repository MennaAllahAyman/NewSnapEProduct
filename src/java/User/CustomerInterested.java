/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author mostafa
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author mostafa
 */
@ManagedBean
public class CustomerInterested  implements Serializable{
    
    public void delectIntersted(){
         System.out.println("Delete Succ : !");
    }
    
}
