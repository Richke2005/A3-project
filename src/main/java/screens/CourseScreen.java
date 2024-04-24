/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screens;
import java.util.List;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

import model.CourseDAO;
import model.Courses;

/**
 *
 * @author richard
 */
public class CourseScreen extends javax.swing.JFrame {
    
    DefaultTableModel table;
    Courses course = new Courses();
    /**
     * Creates new form CourseScreen
     */
    public CourseScreen() {
        initComponents();
        readTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        courseTable = new javax.swing.JTable();
        btnAddRow = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        barHome = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Cursos");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cursos");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Cadastrar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setText("Atualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Deletar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        courseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PROFESSOR", "DESCRIÇÃO"
            }
        ));
        courseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseTableMouseClicked(evt);
            }
        });
        courseTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                courseTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(courseTable);

        btnAddRow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddRow.setText("Adicionar Curso");
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });

        barHome.setText("Home");
        barHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(barHome);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnAddRow))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        TelaMenu menu = new TelaMenu();
        menu.setVisible(true);
        menu.setExtendedState(TelaMenu.MAXIMIZED_BOTH);
    }//GEN-LAST:event_barHomeMouseClicked

    private void courseTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseTableKeyReleased
        // TODO add your handling code here:
         if(courseTable.getSelectedRow() != -1){
            int rowLength = courseTable.getColumnCount();
            
            for(int i = 0; i < rowLength; i++){
            Object data = courseTable.getValueAt(courseTable.getSelectedRow(), i);
            switch(i){
                case 0:
                    if(!data.equals("")){
                      course.setCourseID(data.toString());
                    }else{
                        course.setCourseID(null);
                    }
                    break;
                    
                case 1:
                    if(!data.equals("")){
                        course.setCourseName(data.toString());
                    }else{
                        showMessageDialog(null, "Insira o nome para continuar");
                    }
                    break;
                    
                case 2: 
                    if(!data.equals("")){
                        course.setTeacher(data.toString()); 
                    }else{
                         showMessageDialog(null, "Insira o nome do professor");
                    }
                    break;
                    
                case 3: 
                    course.setDescription(data.toString());
                    break;
                
                default:
                    showMessageDialog(null,"Error dado de aluno esperado" );
                    break;
                }
            }
        }
    }//GEN-LAST:event_courseTableKeyReleased

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        // TODO add your handling code here:
        Object[] voidData = {"", "", "", "", "", ""};
        this.table.addRow(voidData);
        this.table.fireTableDataChanged();
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void courseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseTableMouseClicked
        // TODO add your handling code here:
            if(courseTable.getSelectedRow() != -1){
            Object selectedID = courseTable.getValueAt(courseTable.getSelectedRow(), 0);
            course.setCourseID(selectedID.toString());
        }
    }//GEN-LAST:event_courseTableMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(verifyVoidRows()){
           new CourseDAO().addCourse(course);
           readTable();
        }else{
           readTable();
        }
       
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(verifyVoidRows()){
            new CourseDAO().updateCourse(course);
            readTable();
        }else{
            readTable();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(verifyVoidRows()){
            new CourseDAO().deleteCourse(course);
            readTable();
        }else{
            readTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(CourseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseScreen().setVisible(true);
            }
        });
    }
    
    public void readTable(){
        this.table = (DefaultTableModel) courseTable.getModel();
        table.setNumRows(0);
        CourseDAO course = new CourseDAO();
        List<Courses> courseList = course.readCourses();
        for(Courses element : courseList){
            table.addRow( new Object[]{
                element.getCourseID(),
                element.getNameCourse(),
                element.getTeacher(),
                element.getDescription()
            });
        }
    }
    
     public boolean verifyVoidRows(){
        boolean teste = true;
        int rowLength = courseTable.getColumnCount();
            
            for(int i = 0; i < rowLength; i++){
            Object collum = courseTable.getValueAt(courseTable.getSelectedRow(), i);
            switch(i){
                case 1:
                    if(collum.equals("")){
                       showMessageDialog(null, "Insira o nome para continuar");
                       teste = false;
                    }
                    break;
                    
                case 2: 
                    if(collum.equals("")){
                       showMessageDialog(null, "Insira o nome do professor para continuar");
                       teste = false;
                    }
                    break;
                }
            }
            return teste;
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu barHome;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable courseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
