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
@Table(name = "bmw")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bmw.findAll", query = "SELECT b FROM Bmw b")
    , @NamedQuery(name = "Bmw.findByIdfinalplaca", query = "SELECT b FROM Bmw b WHERE b.idfinalplaca = :idfinalplaca")
    , @NamedQuery(name = "Bmw.findByNomecarro", query = "SELECT b FROM Bmw b WHERE b.nomecarro = :nomecarro")
    , @NamedQuery(name = "Bmw.findByAno", query = "SELECT b FROM Bmw b WHERE b.ano = :ano")
    , @NamedQuery(name = "Bmw.findByQuantidadecarros", query = "SELECT b FROM Bmw b WHERE b.quantidadecarros = :quantidadecarros")
    , @NamedQuery(name = "Bmw.findByCor", query = "SELECT b FROM Bmw b WHERE b.cor = :cor")
    , @NamedQuery(name = "Bmw.findByPortas", query = "SELECT b FROM Bmw b WHERE b.portas = :portas")
    , @NamedQuery(name = "Bmw.findByCambio", query = "SELECT b FROM Bmw b WHERE b.cambio = :cambio")
    , @NamedQuery(name = "Bmw.findByValor", query = "SELECT b FROM Bmw b WHERE b.valor = :valor")})
public class Bmw implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "quantidadecarros")
    private int quantidadecarros;
    @Column(name = "cor")
    private String cor;
    @Column(name = "portas")
    private Integer portas;
    @Column(name = "cambio")
    private String cambio;
    @Column(name = "valor")
    private String valor;

    public Bmw() {
    }

    public Bmw(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public Bmw(Integer idfinalplaca, String ano, int quantidadecarros) {
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

    public int getQuantidadecarros() {
        return quantidadecarros;
    }

    public void setQuantidadecarros(int quantidadecarros) {
        this.quantidadecarros = quantidadecarros;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        if (!(object instanceof Bmw)) {
            return false;
        }
        Bmw other = (Bmw) object;
        if ((this.idfinalplaca == null && other.idfinalplaca != null) || (this.idfinalplaca != null && !this.idfinalplaca.equals(other.idfinalplaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Bmw[ idfinalplaca=" + idfinalplaca + " ]";
    }
    
}
