/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srcEJB;

import javax.ejb.Remote;

/**
 *
 * @author Student
 */
@Remote
public interface NameBeanRemote {

    public String setMessage(String name);
    
}
