/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Connection.ConnectionFactory;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Volkswagen;

/**
 *
 * @author Erick
 */
public class volkswagenDAO {
    //Adicionando veiculos;
    public Volkswagen getSalve(Volkswagen Volkswagen) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(em);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Dados Adicionado");
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro Dados Não Adicionado ","Erro ", JOptionPane.ERROR_MESSAGE);
        }finally{
            em.close();
    }
        return Volkswagen;
 }
    //Buscando o Nome Carro com Id;
    public Volkswagen getBuscar(String id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Volkswagen idVolkswagen = null;
        
        try {
            idVolkswagen = em.find(Volkswagen.class, id);
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro IdCarro Não Encontrado ","Erro Id ", JOptionPane.ERROR_MESSAGE);
            
        }finally{
            em.close();
        }
        return idVolkswagen;
    }
    //Buscando toda a lista da Tabela ('Eu Acho que vai busca toda a lista da tabela');
    public List<Volkswagen> getBuscarCarros() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Volkswagen> tabelaVolkswagen = null;
        
        try {
            tabelaVolkswagen = em.createQuery("From Volkswagen c").getResultList();
            
        } catch (Exception e) {
             
           JOptionPane.showMessageDialog(null, "Erro Tabela Não Encontrada "," ERRO Na Tabela", JOptionPane.ERROR_MESSAGE);
        }finally{
            em.close();
        }
        return tabelaVolkswagen;
    }
}