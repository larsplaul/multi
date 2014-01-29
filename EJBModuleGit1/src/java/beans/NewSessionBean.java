/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import javax.ejb.Stateless;

/**
 *
 * @author plaul1
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public String test() {
        return "Hello World";
    }

    
}
