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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idpregunta")
    private Integer idpregunta;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "preguntaIdpregunta")
    private List<Alternativa> alternativaList;
    @JsonIgnore
    @JoinColumn(name = "cuestionario_idcuestionario", referencedColumnName = "idcuestionario")
    @ManyToOne(optional = false)
    private Cuestionario cuestionarioIdcuestionario;
    @JsonIgnore
    @JoinColumn(name = "tipopregunta_idtipoalternativa", referencedColumnName = "idtipoalternativa")
    @ManyToOne(optional = false)
    private Tipopregunta tipopreguntaIdtipoalternativa;

    public Pregunta() {
    }

    public Pregunta(Integer idpregunta) {
        this.idpregunta = idpregunta;
    }

    public Integer getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(Integer idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Alternativa> getAlternativaList() {
        return alternativaList;
    }

    public void setAlternativaList(List<Alternativa> alternativaList) {
        this.alternativaList = alternativaList;
    }

    public Cuestionario getCuestionarioIdcuestionario() {
        return cuestionarioIdcuestionario;
    }

    public void setCuestionarioIdcuestionario(Cuestionario cuestionarioIdcuestionario) {
        this.cuestionarioIdcuestionario = cuestionarioIdcuestionario;
    }

    public Tipopregunta getTipopreguntaIdtipoalternativa() {
        return tipopreguntaIdtipoalternativa;
    }

    public void setTipopreguntaIdtipoalternativa(Tipopregunta tipopreguntaIdtipoalternativa) {
        this.tipopreguntaIdtipoalternativa = tipopreguntaIdtipoalternativa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpregunta != null ? idpregunta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pregunta)) {
            return false;
        }
        Pregunta other = (Pregunta) object;
        if ((this.idpregunta == null && other.idpregunta != null) || (this.idpregunta != null && !this.idpregunta.equals(other.idpregunta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades3.Pregunta[ idpregunta=" + idpregunta + " ]";
    }
    
}
