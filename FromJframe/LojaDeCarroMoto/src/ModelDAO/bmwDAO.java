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
import model.Bmw;

/**
 *
 * @author Erick
 */
public class bmwDAO {
    public Bmw getSave(Bmw Bmw) {
         EntityManager em = new ConnectionFactory().getConnection();
         
        try {
            em.getTransaction().begin();
            em.persist(em);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Dados Adicionado");
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
            
        }finally{
            em.close();
        }
             
         return Bmw;
    }
    //Buscar o nome do carro com o Id Carro
    public Bmw getBuscar(String id) {
         EntityManager em = new ConnectionFactory().getConnection();
         Bmw idBmw = null;
         try {
            idBmw = em.find(Bmw.class, id);
            
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
             em.close();
         }
         return idBmw;
    }
    //Buscando toda a lista da Tabela ('Eu Acho que vai busca toda a lista da tabela');
    public  List<Bmw> getTodosTabelaBmw() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Bmw> tabelaBmw = null;
        
        try{
            tabelaBmw = em.createQuery("from Bmw c").getResultList();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            em.close();
        }
        return tabelaBmw;
    }
    
}
