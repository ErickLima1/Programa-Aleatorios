/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Erick
 */
@Entity
@Table(name = "motos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motos.findAll", query = "SELECT m FROM Motos m")
    , @NamedQuery(name = "Motos.findByIdfinalplaca", query = "SELECT m FROM Motos m WHERE m.idfinalplaca = :idfinalplaca")
    , @NamedQuery(name = "Motos.findByNomemotos", query = "SELECT m FROM Motos m WHERE m.nomemotos = :nomemotos")
    , @NamedQuery(name = "Motos.findByAno", query = "SELECT m FROM Motos m WHERE m.ano = :ano")
    , @NamedQuery(name = "Motos.findByQuantidademoto", query = "SELECT m FROM Motos m WHERE m.quantidademoto = :quantidademoto")
    , @NamedQuery(name = "Motos.findByCor", query = "SELECT m FROM Motos m WHERE m.cor = :cor")
    , @NamedQuery(name = "Motos.findByCambio", query = "SELECT m FROM Motos m WHERE m.cambio = :cambio")
    , @NamedQuery(name = "Motos.findByValor", query = "SELECT m FROM Motos m WHERE m.valor = :valor")})
public class Motos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfinalplaca")
    private Integer idfinalplaca;
    @Column(name = "nomemotos")
    private String nomemotos;
    @Basic(optional = false)
    @Column(name = "ano")
    private String ano;
    @Basic(optional = false)
    @Column(name = "quantidademoto")
    private int quantidademoto;
    @Column(name = "cor")
    private String cor;
    @Column(name = "cambio")
    private String cambio;
    @Column(name = "valor")
    private String valor;

    public Motos() {
    }

    public Motos(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public Motos(Integer idfinalplaca, String ano, int quantidademoto) {
        this.idfinalplaca = idfinalplaca;
        this.ano = ano;
        this.quantidademoto = quantidademoto;
    }

    public Integer getIdfinalplaca() {
        return idfinalplaca;
    }

    public void setIdfinalplaca(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public String getNomemotos() {
        return nomemotos;
    }

    public void setNomemotos(String nomemotos) {
        this.nomemotos = nomemotos;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getQuantidademoto() {
        return quantidademoto;
    }

    public void setQuantidademoto(int quantidademoto) {
        this.quantidademoto = quantidademoto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfinalplaca != null ? idfinalplaca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motos)) {
            return false;
        }
        Motos other = (Motos) object;
        if ((this.idfinalplaca == null && other.idfinalplaca != null) || (this.idfinalplaca != null && !this.idfinalplaca.equals(other.idfinalplaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Motos[ idfinalplaca=" + idfinalplaca + " ]";
    }
    
}
