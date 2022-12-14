/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab12_ejercicio_2;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Alumno
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        Mostrar("");
    }

    private javax.swing.JTable Agenda = new JTable();
    Boolean Primer= true;
    int Posicion=0;
    int IndicePosi=1;      
    int VerificarApellido=0;
    public static int UltimaPosicion=0;
    
    public void Mostrar(String Buscar) {

        DefaultTableModel modelo;
        ConexionAgenda func = new ConexionAgenda(); // aqui tenemos que revisar que podemos importar correctamente
        modelo = (DefaultTableModel) func.mostrar(Buscar);//ya que esta funcin requiere de esa base para funcinar

        Agenda.setModel(modelo);

        
        UltimaPosicion = func.totalregistros;
        
        Indice.setText(Integer.toString(IndicePosi)); 
        Ultimo.setText(Integer.toString(UltimaPosicion));
        
        while(Primer){
        for (int i = 0; i < 1; i++) {
            Variable_ID.setText(Agenda.getValueAt(i, 0).toString());
            Variable_FirstName.setText(Agenda.getValueAt(i, 1).toString());
            Variable_LastName.setText(Agenda.getValueAt(i, 2).toString());
            Variable_Email.setText(Agenda.getValueAt(i, 3).toString());
            Variable_Phone.setText(Agenda.getValueAt(i, 4).toString());
            Primer=false;
            }
       }
        
        
        if (VerificarApellido>0){
            
        String[] ArregloPorApellido = func.MostrarPorApellido(Buscar);
        
        for (int i = 0; i < ArregloPorApellido.length; i++) {
            Variable_ID.setText(Agenda.getValueAt(i, 0).toString());
            Variable_FirstName.setText(Agenda.getValueAt(i, 1).toString());
            Variable_LastName.setText(Agenda.getValueAt(i, 2).toString());
            Variable_Email.setText(Agenda.getValueAt(i, 3).toString());
            Variable_Phone.setText(Agenda.getValueAt(i, 4).toString());
            
            }
        }
         
    }

     
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Previous = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Variable_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Variable_Phone = new javax.swing.JTextField();
        Variable_Email = new javax.swing.JTextField();
        Variable_LastName = new javax.swing.JTextField();
        Filter_LastName = new javax.swing.JTextField();
        Variable_FirstName = new javax.swing.JTextField();
        BuscarApellido = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        InsertarDatos = new javax.swing.JButton();
        TodosDatos = new javax.swing.JButton();
        Indice = new javax.swing.JTextField();
        Ultimo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Previous.setText("Previous");
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jLabel1.setText("Address ID:");

        Variable_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_IDActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Email:");

        jLabel5.setText("Phone Number:");

        Variable_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_PhoneActionPerformed(evt);
            }
        });

        Variable_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_EmailActionPerformed(evt);
            }
        });

        Variable_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_LastNameActionPerformed(evt);
            }
        });

        Filter_LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filter_LastNameActionPerformed(evt);
            }
        });

        Variable_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Variable_FirstNameActionPerformed(evt);
            }
        });

        BuscarApellido.setText("Find");
        BuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarApellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name:");

        InsertarDatos.setText("Insert New Entry");
        InsertarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarDatosActionPerformed(evt);
            }
        });

        TodosDatos.setText("Browse All Entries");
        TodosDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosDatosActionPerformed(evt);
            }
        });

        Indice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IndiceActionPerformed(evt);
            }
        });

        Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoActionPerformed(evt);
            }
        });

        jLabel7.setText("of");

        jLabel8.setText("Flind an entry by last name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(47, 47, 47)
                                .addComponent(Variable_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Previous)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Indice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Next))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Filter_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(BuscarApellido)))))
                        .addGap(156, 156, 156))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Variable_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Variable_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Variable_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Variable_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TodosDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(InsertarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Previous)
                    .addComponent(Next)
                    .addComponent(Indice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Variable_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Variable_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Variable_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Variable_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Variable_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Filter_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarApellido))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TodosDatos)
                    .addComponent(InsertarDatos))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousActionPerformed
        // TODO add your handling code here:
        
        Posicion --;
        IndicePosi--;
        
        Variable_ID.setText(Agenda.getValueAt( Posicion, 0).toString());
        Variable_FirstName.setText(Agenda.getValueAt( Posicion, 1).toString());
        Variable_LastName.setText(Agenda.getValueAt( Posicion, 2).toString());
        Variable_Email.setText(Agenda.getValueAt( Posicion, 3).toString());
        Variable_Phone.setText(Agenda.getValueAt( Posicion, 4).toString());
        
        Indice.setText(Integer.toString(IndicePosi));
        
        
    }//GEN-LAST:event_PreviousActionPerformed

    private void Variable_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Variable_IDActionPerformed

    private void Variable_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Variable_PhoneActionPerformed

    private void Variable_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Variable_EmailActionPerformed

    private void Variable_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Variable_LastNameActionPerformed

    private void Filter_LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filter_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Filter_LastNameActionPerformed

    private void Variable_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Variable_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Variable_FirstNameActionPerformed

    private void BuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarApellidoActionPerformed
        // TODO add your handling code here:
         if (Filter_LastName.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "INGRESA UN APELLIDO A BUSCAR");
            Filter_LastName.requestFocus();
        } else {
            VerificarApellido++;
            Mostrar(Filter_LastName.getText());
        }
        
       
        
    }//GEN-LAST:event_BuscarApellidoActionPerformed

    private void UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UltimoActionPerformed

    private void TodosDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosDatosActionPerformed
        // TODO add your handling code here:

        TablaAgenda TablaDatos = new TablaAgenda();
        TablaDatos.toFront();
        TablaDatos.setVisible(true);
        TablaDatos.setDefaultCloseOperation(TablaDatos.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_TodosDatosActionPerformed

    private void InsertarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarDatosActionPerformed
        // TODO add your handling code here:

        InsertarTablaAgenda InserDatos = new InsertarTablaAgenda();
        InserDatos.toFront();
        InserDatos.setVisible(true);
        InserDatos.setDefaultCloseOperation(InserDatos.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_InsertarDatosActionPerformed

    private void IndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IndiceActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_IndiceActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        
        Posicion ++;
        IndicePosi++;
        
        Variable_ID.setText(Agenda.getValueAt( Posicion, 0).toString());
        Variable_FirstName.setText(Agenda.getValueAt( Posicion, 1).toString());
        Variable_LastName.setText(Agenda.getValueAt( Posicion, 2).toString());
        Variable_Email.setText(Agenda.getValueAt( Posicion, 3).toString());
        Variable_Phone.setText(Agenda.getValueAt( Posicion, 4).toString());
        
        Indice.setText(Integer.toString(IndicePosi));
        
    }//GEN-LAST:event_NextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarApellido;
    private javax.swing.JTextField Filter_LastName;
    private javax.swing.JTextField Indice;
    private javax.swing.JButton InsertarDatos;
    private javax.swing.JButton Next;
    private javax.swing.JButton Previous;
    private javax.swing.JButton TodosDatos;
    public javax.swing.JTextField Ultimo;
    private javax.swing.JTextField Variable_Email;
    private javax.swing.JTextField Variable_FirstName;
    private javax.swing.JTextField Variable_ID;
    private javax.swing.JTextField Variable_LastName;
    private javax.swing.JTextField Variable_Phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
