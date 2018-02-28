/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author super
 */
@WebService
@Stateless
public class CalcuIva implements CalcuIvaLocal {

    @Override
    public float calcuIva(float porcentaje) {
        
        return (porcentaje / 100);
    }

    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    
}
