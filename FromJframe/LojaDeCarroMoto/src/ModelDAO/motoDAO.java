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
import model.Motos;

/**
 *
 * @author Erick
 */
public class motoDAO {
    //Adicionando Veiculos
    public Motos getSalve(Motos Motos) {
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
        return Motos;
    }
    //Buscar o nome do carro com o Id Carro
    public Motos getBuscarId(String id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Motos idMotos = null;
        
        try {
           idMotos = em.find(Motos.class, id);
            
        } catch (Exception e) {
            em.getTransaction().rollback();
             JOptionPane.showMessageDialog(null, "Erro IdCarro Não Encontrado ","Erro Id ", JOptionPane.ERROR_MESSAGE);
            
        }finally {
            em.close();
        }
        return idMotos;
    }
    //Buscando toda a lista da Tabela ('Eu Acho que vai busca toda a lista da tabela');
    public List<Motos> getBuscarTodos() {
         EntityManager em = new ConnectionFactory().getConnection();
         List<Motos> tabelaMotos = null;
         
         try {
            tabelaMotos = em.createQuery("from Motos c").getResultList();
            
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Erro Tabela Não Encontrada "," ERRO Na Tabela", JOptionPane.ERROR_MESSAGE);
          
        }finally{
             em.close();
         }
        return tabelaMotos;
    }
   
}
