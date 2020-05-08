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
@Table(name = "chevrolet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chevrolet.findAll", query = "SELECT c FROM Chevrolet c")
    , @NamedQuery(name = "Chevrolet.findByIdfinalplaca", query = "SELECT c FROM Chevrolet c WHERE c.idfinalplaca = :idfinalplaca")
    , @NamedQuery(name = "Chevrolet.findByNomecarro", query = "SELECT c FROM Chevrolet c WHERE c.nomecarro = :nomecarro")
    , @NamedQuery(name = "Chevrolet.findByAno", query = "SELECT c FROM Chevrolet c WHERE c.ano = :ano")
    , @NamedQuery(name = "Chevrolet.findByCor", query = "SELECT c FROM Chevrolet c WHERE c.cor = :cor")
    , @NamedQuery(name = "Chevrolet.findByQuantidadecarros", query = "SELECT c FROM Chevrolet c WHERE c.quantidadecarros = :quantidadecarros")
    , @NamedQuery(name = "Chevrolet.findByPortas", query = "SELECT c FROM Chevrolet c WHERE c.portas = :portas")
    , @NamedQuery(name = "Chevrolet.findByCambio", query = "SELECT c FROM Chevrolet c WHERE c.cambio = :cambio")
    , @NamedQuery(name = "Chevrolet.findByValor", query = "SELECT c FROM Chevrolet c WHERE c.valor = :valor")})
public class Chevrolet implements Serializable {

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

    public Chevrolet() {
    }

    public Chevrolet(Integer idfinalplaca) {
        this.idfinalplaca = idfinalplaca;
    }

    public Chevrolet(Integer idfinalplaca, String ano, int quantidadecarros) {
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
        if (!(object instanceof Chevrolet)) {
            return false;
        }
        Chevrolet other = (Chevrolet) object;
        if ((this.idfinalplaca == null && other.idfinalplaca != null) || (this.idfinalplaca != null && !this.idfinalplaca.equals(other.idfinalplaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Chevrolet[ idfinalplaca=" + idfinalplaca + " ]";
    }
    
}
