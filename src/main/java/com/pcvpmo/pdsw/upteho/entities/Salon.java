package com.pcvpmo.pdsw.upteho.entities;

import java.io.Serializable;

/**
 *
 * @author andres
 */
public class Salon implements Serializable{
    private String idSalon;
    private String tipoSalon;
    
    public String getIdSalon(){
        return idSalon;
    }
    
    public void setIdSalon(String newId){
         idSalon = newId;
    }
    
    public String getTipoSalon(){
        return tipoSalon;
    }
    
    public void setTipoSalon(String nTipo){
        tipoSalon=nTipo;
    }
}
