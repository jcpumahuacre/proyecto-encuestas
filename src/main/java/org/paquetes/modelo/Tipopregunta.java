/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.paquetes.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipopregunta")
public class Tipopregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoalternativa")
    private Integer idtipoalternativa;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipopreguntaIdtipoalternativa")
    private List<Pregunta> preguntaList;

    public Tipopregunta() {
    }

    public Tipopregunta(Integer idtipoalternativa) {
        this.idtipoalternativa = idtipoalternativa;
    }

    public Integer getIdtipoalternativa() {
        return idtipoalternativa;
    }

    public void setIdtipoalternativa(Integer idtipoalternativa) {
        this.idtipoalternativa = idtipoalternativa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoalternativa != null ? idtipoalternativa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopregunta)) {
            return false;
        }
        Tipopregunta other = (Tipopregunta) object;
        if ((this.idtipoalternativa == null && other.idtipoalternativa != null) || (this.idtipoalternativa != null && !this.idtipoalternativa.equals(other.idtipoalternativa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades3.Tipopregunta[ idtipoalternativa=" + idtipoalternativa + " ]";
    }
    
}
