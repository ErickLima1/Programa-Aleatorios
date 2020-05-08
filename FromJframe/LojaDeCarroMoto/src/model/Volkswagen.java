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
@Table(name = "volkswagen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Volkswagen.findAll", query = "SELECT v FROM Volkswagen v")
    , @NamedQuery(name = "Volkswagen.findByIdfinalplaca", query = "SELECT v FROM Volkswagen v WHERE v.idfinalplaca = :idfinalplaca")
    , @NamedQuery(name = "Volkswagen.findByNomecarro", query = "SELECT v FROM Volkswagen v WHERE v.nomecarro = :nomecarro")
    , @NamedQuery(name = "Volkswagen.findByAno", query = "SELECT v FROM Volkswagen v WHERE v.ano = :ano")
    , @NamedQuery(name = "Volkswagen.findByCor", query = "SELECT v FROM Volkswagen v WHERE v.cor = :cor")
    , @NamedQuery(name = "Volkswagen.findByQuantidadecarros", query = "SELECT v FROM Volkswagen v WHERE v.quantidadecarros = :quantidadecarros")
    , @NamedQuery(name = "Volkswagen.findByPortas", query = "SELECT v FROM Volkswagen v WHERE v.portas = :portas")
    , @NamedQuery(name = "Volkswagen.findByCambio", query = "SELECT v FROM Volkswagen v WHERE v.cambio = :cambio")
    , @NamedQuery(name = "Volkswagen.findByValor", query = "SELECT v FROM Volkswagen v WHERE v.valor = :valor")})
public class Volkswagen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfinalplaca")
    private Integer idfinalplaca;
    @Column(name = "nomecarro")
    private String nomecarro;
    @Basic(optional = false)
    @Column(name = "ano")
    private String ano;
    @Column(name = "cor")
    private String cor;
    @Basic(optional = false)
    @Column(name = "quantidadecarros")
    private int quantidadecarros;
    @Column(name = "portas")
    private Integer portas;
    @Column(name = "cambio")
    private String cambio;
    @Column(name = "valor")
    private String valor;

    public Volkswagen() {
    }

    public Volkswagen(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public Volkswagen(Integer idfinalplaca, String ano, int quantidadecarros) {
        this.idfinalplaca = idfinalplaca;
        this.ano = ano;
        this.quantidadecarros = quantidadecarros;
    }

    public Integer getIdfinalplaca() {
        return idfinalplaca;
    }

    public void setIdfinalplaca(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public String getNomecarro() {
        return nomecarro;
    }

    public void setNomecarro(String nomecarro) {
        this.nomecarro = nomecarro;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadecarros() {
        return quantidadecarros;
    }

    public void setQuantidadecarros(int quantidadecarros) {
        this.quantidadecarros = quantidadecarros;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
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
        if (!(object instanceof Volkswagen)) {
            return false;
        }
        Volkswagen other = (Volkswagen) object;
        if ((this.idfinalplaca == null && other.idfinalplaca != null) || (this.idfinalplaca != null && !this.idfinalplaca.equals(other.idfinalplaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Volkswagen[ idfinalplaca=" + idfinalplaca + " ]";
    }
    
}
