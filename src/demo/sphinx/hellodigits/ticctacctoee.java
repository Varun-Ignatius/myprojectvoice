
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.sphinx.hellodigits;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */

public class ticctacctoee extends javax.swing.JFrame{
     private String startgame="x";
       private int pivote=0;
      static String x1,x2;
      String str;

     
      

    /**
     * Creates new form ticctacctoee
     */
    public ticctacctoee() {
        initComponents();
    }
    public void speechrec()
    {
     HelloDigits kk =new HelloDigits(); 
     str = kk.speechrecord();
    
     
    
    }
  
    private void chooseplayer()
    {
        if(startgame.equalsIgnoreCase("x"))
        {
            startgame="o";
        }
        else
        {
            startgame="x";
        }
    }
    private void check()
    {
        if(str.equals("one")||str.equals("two")||str.equals("three")||str.equals("four")||str.equals("five")||str.equals("six")||str.equals("seven")||str.equals("eight")||str.equals("nine"))
        {
            x1=str;
        }
        else
        {
           System.out.println("invalid position"); 
        }
    }
    private void win()
    {
        String b1=jLabel1.getText();
        String b2=jLabel2.getText();
        String b3=jLabel3.getText();
        String b4=jLabel5.getText();
        String b5=jLabel6.getText();
        String b6=jLabel7.getText();
        String b7=jLabel9.getText();
        String b8=jLabel10.getText();
        String b9=jLabel11.getText();
        if(b1=="x" && b2=="x" && b3=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
         
            pivote=1;
              jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
            
        }
         if(b4=="x" && b5=="x" && b6=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
        
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
          
        }
          if(b7=="x" && b8=="x" && b9=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
     
             pivote=1;
                jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
        }
           if(b1=="x" && b4=="x" && b7=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
       
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
        }
            if(b2=="x" && b5=="x" && b8=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
         
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
            
        }
             if(b3=="x" && b6=="x" && b9=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
    
             pivote=1;
                jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
        }
              if(b1=="x" && b5=="x" && b9=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
     
            
        }
               if(b3=="x" && b5=="x" && b7=="x")
        {
            JOptionPane.showMessageDialog(this,"player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
          
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
      
        }
               if(b1=="o" && b2=="o" && b3=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
         
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
            
        }
         if(b4=="o" && b5=="o" && b6=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           

             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
           
            
        }
          if(b7=="o" && b8=="o" && b9=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
      
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
             
            
        }
           if(b1=="o" && b4=="o" && b7=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
        
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
              
        }
            if(b2=="o" && b5=="o" && b8=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
             pivote=1;
            jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
          
            
               
           
        }
             if(b3=="o" && b6=="o" && b9=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
        
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
            
            
        }
              if(b1=="o" && b5=="o" && b9=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
           
         
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
             
        }
               if(b3=="o" && b5=="o" && b7=="o")
        {
            JOptionPane.showMessageDialog(this,"player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             pivote=1;
               jLabel1.setEnabled(false);
               jLabel2.setEnabled(false);
               jLabel3.setEnabled(false);
               jLabel5.setEnabled(false); 
               jLabel6.setEnabled(false);
               
               jLabel7.setEnabled(false);
               jLabel9.setEnabled(false);
               jLabel10.setEnabled(false);
               jLabel11.setEnabled(false);
             
        }
             
            
              
    }
    private void draw()
    {
        String b1=jLabel1.getText();
        String b2=jLabel2.getText();
        String b3=jLabel3.getText();
        String b4=jLabel5.getText();
        String b5=jLabel6.getText();
        String b6=jLabel7.getText();
        String b7=jLabel9.getText();
        String b8=jLabel10.getText();
        String b9=jLabel11.getText();
        if((b1 != null && !b1.isEmpty()) && (b2 != null && !b2.isEmpty()) && (b3 != null && !b3.isEmpty()) && 
                (b4 != null && !b4.isEmpty()) &&(b5 != null && !b5.isEmpty()) && (b6 != null && !b6.isEmpty())&&
                (b7 != null && !b7.isEmpty()) && (b8 != null && !b8.isEmpty()) && (b9 != null && !b9.isEmpty()))
        {
            if(pivote==0)
            {
                 JOptionPane.showMessageDialog(this,"its a draw","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 4, 1, 1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel3);

        jButton1.setText("Listen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel6);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7);

        jButton2.setText("Play Again");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel9);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel11);

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
               jLabel1.setEnabled(true);
               jLabel2.setEnabled(true);
               jLabel3.setEnabled(true);
               jLabel5.setEnabled(true); 
               jLabel6.setEnabled(true);
               
               jLabel7.setEnabled(true);
               jLabel9.setEnabled(true);
               jLabel10.setEnabled(true);
               jLabel11.setEnabled(true);
       jLabel1.setText(null);
       jLabel2.setText(null);
       jLabel3.setText(null);
       jLabel5.setText(null);
       jLabel6.setText(null);
       jLabel7.setText(null);
       jLabel9.setText(null);
       jLabel10.setText(null);
       jLabel11.setText(null);
     
    }//GEN-LAST:event_jButton2ActionPerformed
//exit
     private JFrame frame;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
      if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","tic tac toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
      {
          System.exit(0);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println("Enter the position");
       // Scanner s=new Scanner(System.in);
       // int x1=s.nextInt();
       // int x2=s.nextInt();
      // String x[]=new String[2];
       speechrec();
       check();
        if(x1.equals("one") )
        {
            jLabel1.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel1.setEnabled(false);
        }
         if( x1.equals("two"))
        {
            jLabel2.setText(startgame);
             chooseplayer();
            win();
            draw();
            jLabel2.setEnabled(false);
        }
          if(x1.equals("three"))
        {
            jLabel3.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel3.setEnabled(false);
        }
           if(x1.equals("four"))
        {
            jLabel5.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel5.setEnabled(false);
        }
            if(x1.equals("five"))
        {
            jLabel6.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel6.setEnabled(false);
        }
             if(x1.equals("six"))
        {
            jLabel7.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel7.setEnabled(false);
        }
              if(x1.equals("seven"))
        {
            jLabel9.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel9.setEnabled(false);
        }
               if(x1.equals("eight"))
        {
            jLabel10.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel10.setEnabled(false);
        }
                if(x1.equals("nine"))
        {
            jLabel11.setText(startgame);
            chooseplayer();
            win();
            draw();
            jLabel11.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ticctacctoee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticctacctoee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticctacctoee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticctacctoee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticctacctoee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
