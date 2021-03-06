/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatGUI;
import java.awt.event.ActionListener;
/**
 *
 * @author Guntur
 */
public class ChatView extends javax.swing.JFrame {

    /**
     * Creates new form ChatView
     */
    public ChatView() {
        initComponents();
    }

    public void setTxAreaChat(String message) {
        txAreaChat.append(message + "\n");
    }
    
    public Object getTxFieldChat() {
        return txFieldChat;
    }
    
    public String getStringChat() {
        return txFieldChat.getText();
    }
    
    public void setTxFieldChat(String message) {
        this.txFieldChat.setText(message);
    }
    
    public void addListener(ActionListener e) {
        txFieldChat.addActionListener(e);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaChat = new javax.swing.JTextArea();
        txFieldChat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaChat.setEditable(false);
        txAreaChat.setColumns(20);
        txAreaChat.setRows(5);
        txAreaChat.setText("Input Server IP Adress : ");
        jScrollPane1.setViewportView(txAreaChat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txFieldChat)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txFieldChat, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txFieldChatActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaChat;
    private javax.swing.JTextField txFieldChat;
    // End of variables declaration//GEN-END:variables
}
