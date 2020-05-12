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
import model.Cliente;

/**
 *
 * @author Erick
 */
public class ClienteDAO {
    String validacaoDAO;
    //Adicionando Dados Na Tabela;
    public Cliente getSalva(Cliente Cliente) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
          em.getTransaction().begin();
          em.persist(Cliente);
          em.getTransaction().commit();
          JOptionPane.showMessageDialog(null, "Dados Adicionado");
        } catch (Exception e) {
          em.getTransaction().rollback();
          JOptionPane.showMessageDialog(null, "Erro Dados Não Adicionado o","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            em.close();
        }
        return Cliente;
    }
    
    public Cliente getBuscar(String cpf) {
         EntityManager em = new ConnectionFactory().getConnection();
         Cliente cliente = null;
         
         try {
            cliente = em.find(Cliente.class, cpf);
        } catch (Exception e) {
            em.getTransaction().rollback();
             JOptionPane.showMessageDialog(null, "Erro Não Cadastrado","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
             em.close();
        }
            return cliente;
        }
    
    //Buscando Toda Lista De Cliente Adicionado;
    public List<Cliente> getTodasTabelaCliente() {
        EntityManager em = new ConnectionFactory().getConnection();
        List<Cliente> tabelaCliente = null;
        
        try {
            tabelaCliente = em.createQuery("From Cliente c").getResultList();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro Na Tabela","ERRO", JOptionPane.ERROR_MESSAGE);
        }finally{
            em.close();
        }
        return tabelaCliente;
    }
}
