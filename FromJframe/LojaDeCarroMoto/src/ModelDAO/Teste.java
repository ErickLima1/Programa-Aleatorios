/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import Connection.ConnectionFactory;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;
import model.Bmw;

/**
 *
 * @author Erick
 */
public class Teste {
    public static void main(String[] args) {
        EntityManager em = new ConnectionFactory().getConnection();
                
        bmwDAO dao = new bmwDAO();
        DefaultTableModel tabela = new DefaultTableModel();
        for(Bmw c: dao.getTodosTabelaBmw()) {
            tabela.addRow(
            new Object[] {
                c.getNomecarro(),
            }
            );
        }
    }
}
