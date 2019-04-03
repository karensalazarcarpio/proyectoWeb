/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.cognos.java.proyecto.services.impl;

import bo.com.cognos.java.proyecto.model.FormDetalle;
import bo.com.cognos.java.proyecto.model.ProyectoException;
import bo.com.cognos.java.proyecto.repositories.XXXRepository;
import bo.com.cognos.java.proyecto.services.FormDetalleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author KAREN
 */
@Service
@Transactional(readOnly=true)
public class FormDetalleImpl 
extends XXXServiceImpl<FormDetalle, Short>
	implements FormDetalleService{

    @Override
    XXXRepository<FormDetalle, Short> getRepository() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validarAlta(FormDetalle obj) throws ProyectoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validarModificacion(FormDetalle objAnterior, FormDetalle objNuevo) throws ProyectoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void validarBorrado(FormDetalle obj) throws ProyectoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
