/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.cognos.java.proyecto.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="FORMULARIO")
@Getter
@Setter
@NamedQueries({
    @NamedQuery(name="Formulario.buscar", 
query = "select u from  Formulario u")
,@NamedQuery(name="Formulario.buscarPorRangoFecha", 
query = "select u from Formulario u ")
})
/**
 *
 * @author KAREN
 */
public class Formulario extends XXXModel <Short>{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDFORMULARIO")
    private Short id;
    
    @Column(name="MOTIVO_VIAJE",length=255)
    private String motivoViaje;
    @Column(name="JUSTIFICACION",length=255)
    private String justificacion;
    @Column(name="ID_ESTADO",length=25, nullable=false)
    private Integer idEstado;
    @Column(name="GESTION",length=4, nullable=false)
    private Integer gestion;
    
    
            
    
    
    
}
