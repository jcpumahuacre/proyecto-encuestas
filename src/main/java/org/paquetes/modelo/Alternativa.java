/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.paquetes.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "alternativa")
public class Alternativa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idalternativa")
    private Integer idalternativa;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valor")
    private Boolean valor;
    
    @JsonIgnore
    @JoinColumn(name = "pregunta_idpregunta", referencedColumnName = "idpregunta")
    @ManyToOne(optional = false)
    private Pregunta preguntaIdpregunta;

    public Alternativa() {
    }

    public Alternativa(Integer idalternativa) {
        this.idalternativa = idalternativa;
    }

    public Integer getIdalternativa() {
        return idalternativa;
    }

    public void setIdalternativa(Integer idalternativa) {
        this.idalternativa = idalternativa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

    public Pregunta getPreguntaIdpregunta() {
        return preguntaIdpregunta;
    }

    public void setPreguntaIdpregunta(Pregunta preguntaIdpregunta) {
        this.preguntaIdpregunta = preguntaIdpregunta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalternativa != null ? idalternativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alternativa)) {
            return false;
        }
        Alternativa other = (Alternativa) object;
        if ((this.idalternativa == null && other.idalternativa != null) || (this.idalternativa != null && !this.idalternativa.equals(other.idalternativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades3.Alternativa[ idalternativa=" + idalternativa + " ]";
    }
    
}
