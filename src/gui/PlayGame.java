/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import auxiliar.LogicaJuego;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Eliana Velasquez
 */
public class PlayGame extends javax.swing.JFrame {

    /**
     * Creates new form PlayGame
     */
    private VFondo fondo;
    private LogicaJuego log = new LogicaJuego();
    private boolean caraUp = false;
    private ImageIcon Im1;
     private ImageIcon Im2;
     private JButton[] pbtn= new JButton [2];
     private boolean primerc= false;
     private int puntaje= 0;
    
    public PlayGame() {
        initComponents();
        fondo = new VFondo(getWidth(), getHeight());
         add(fondo, BorderLayout.CENTER);
        setCards();
    }

    private void setCards(){
       
        int[] numbers = log.getCardNumbers();
     
         btnB1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[0]+".png")));
         btnB2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[1]+".png")));
         btnB3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[2]+".png")));
         btnB4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[3]+".png")));
         btnB5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[4]+".png")));
         btnB6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[5]+".png")));
         btnB7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[6]+".png")));
         btnB8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[7]+".png")));
         btnB9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[8]+".png")));
         btnB10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[9]+".png")));
         btnB11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[10]+".png")));
         btnB12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[11]+".png")));
         btnB13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[12]+".png")));
         btnB14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[13]+".png")));
         btnB15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[14]+".png")));
         btnB16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes/b"+numbers[15]+".png")));
             
    }
    
    private void btnEnabled (JButton btn){
        if (!caraUp){
            btn.setEnabled(false);
            Im1=(ImageIcon) btn.getDisabledIcon();
            pbtn[0]=btn;
            caraUp= true;
            primerc= false;
            
        } else{
            btn.setEnabled(false);
             Im2= (ImageIcon) btn.getDisabledIcon();
             pbtn[1]=btn;
            primerc= true;
           puntaje += 20;
           pregwin();
           
            
        }
    }
    
    private void compare (){
        if (caraUp && primerc) {
            
            if(Im1.getDescription().compareTo(Im2.getDescription()) !=0){
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
               if (puntaje > 10) puntaje -= 10;
                
            }
             caraUp= false;
        }
    }
    
    private void reiniciar(){
        btnB1.setEnabled(true);
        btnB2.setEnabled(true);
        btnB3.setEnabled(true);
        btnB4.setEnabled(true);
        btnB5.setEnabled(true);
        btnB6.setEnabled(true);
        btnB7.setEnabled(true);
        btnB8.setEnabled(true);
        btnB9.setEnabled(true);
        btnB10.setEnabled(true);
        btnB11.setEnabled(true);
        btnB12.setEnabled(true);
        btnB13.setEnabled(true);
        btnB14.setEnabled(true);
        btnB15.setEnabled(true);
        btnB16.setEnabled(true);
        
        primerc= false;
        caraUp= false;
        puntaje =0;
    }
    
    private void pregwin (){
        if (!btnB1.isEnabled()&&!btnB2.isEnabled()&&!btnB3.isEnabled()&&!btnB4.isEnabled()&&!btnB5.isEnabled()&&!btnB6.isEnabled()&&
                !btnB7.isEnabled()&&!btnB8.isEnabled()&&!btnB9.isEnabled()&&!btnB10.isEnabled()&&!btnB11.isEnabled()&&
                !btnB12.isEnabled()&&!btnB13.isEnabled()&&!btnB14.isEnabled()&&!btnB15.isEnabled()&&!btnB16.isEnabled()){
            JOptionPane.showMessageDialog(this, "¡Felicidades, ARMY ganaste el juego! Tu puntaje es:"+puntaje,"I purple U",JOptionPane.INFORMATION_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnB6 = new javax.swing.JButton();
        btnB7 = new javax.swing.JButton();
        btnB8 = new javax.swing.JButton();
        btnB9 = new javax.swing.JButton();
        btnB10 = new javax.swing.JButton();
        btnB11 = new javax.swing.JButton();
        btnB12 = new javax.swing.JButton();
        btnB13 = new javax.swing.JButton();
        btnB14 = new javax.swing.JButton();
        btnB15 = new javax.swing.JButton();
        btnB16 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Dos Caras");

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Bienvenid@s!");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB1.setBorder(null);
        btnB1.setBorderPainted(false);
        btnB1.setContentAreaFilled(false);
        btnB1.setFocusable(false);
        btnB1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB1MouseExited(evt);
            }
        });
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });

        btnB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB2.setBorder(null);
        btnB2.setBorderPainted(false);
        btnB2.setContentAreaFilled(false);
        btnB2.setFocusable(false);
        btnB2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB2MouseExited(evt);
            }
        });
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });

        btnB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB3.setBorder(null);
        btnB3.setBorderPainted(false);
        btnB3.setContentAreaFilled(false);
        btnB3.setFocusable(false);
        btnB3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB3MouseExited(evt);
            }
        });
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });

        btnB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB4.setBorder(null);
        btnB4.setBorderPainted(false);
        btnB4.setContentAreaFilled(false);
        btnB4.setFocusable(false);
        btnB4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB4MouseExited(evt);
            }
        });
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });

        btnB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB5.setBorder(null);
        btnB5.setBorderPainted(false);
        btnB5.setContentAreaFilled(false);
        btnB5.setFocusable(false);
        btnB5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB5MouseExited(evt);
            }
        });
        btnB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB5ActionPerformed(evt);
            }
        });

        btnB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB6.setBorder(null);
        btnB6.setBorderPainted(false);
        btnB6.setContentAreaFilled(false);
        btnB6.setFocusable(false);
        btnB6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB6MouseExited(evt);
            }
        });
        btnB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB6ActionPerformed(evt);
            }
        });

        btnB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB7.setBorder(null);
        btnB7.setBorderPainted(false);
        btnB7.setContentAreaFilled(false);
        btnB7.setFocusable(false);
        btnB7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB7MouseExited(evt);
            }
        });
        btnB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB7ActionPerformed(evt);
            }
        });

        btnB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB8.setBorder(null);
        btnB8.setBorderPainted(false);
        btnB8.setContentAreaFilled(false);
        btnB8.setFocusable(false);
        btnB8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB8MouseExited(evt);
            }
        });
        btnB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB8ActionPerformed(evt);
            }
        });

        btnB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB9.setBorder(null);
        btnB9.setBorderPainted(false);
        btnB9.setContentAreaFilled(false);
        btnB9.setFocusable(false);
        btnB9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB9MouseExited(evt);
            }
        });
        btnB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB9ActionPerformed(evt);
            }
        });

        btnB10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB10.setBorder(null);
        btnB10.setBorderPainted(false);
        btnB10.setContentAreaFilled(false);
        btnB10.setFocusable(false);
        btnB10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB10MouseExited(evt);
            }
        });
        btnB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB10ActionPerformed(evt);
            }
        });

        btnB11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB11.setBorder(null);
        btnB11.setBorderPainted(false);
        btnB11.setContentAreaFilled(false);
        btnB11.setFocusable(false);
        btnB11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB11MouseExited(evt);
            }
        });
        btnB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB11ActionPerformed(evt);
            }
        });

        btnB12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB12.setBorder(null);
        btnB12.setBorderPainted(false);
        btnB12.setContentAreaFilled(false);
        btnB12.setFocusable(false);
        btnB12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB12MouseExited(evt);
            }
        });
        btnB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB12ActionPerformed(evt);
            }
        });

        btnB13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB13.setBorder(null);
        btnB13.setBorderPainted(false);
        btnB13.setContentAreaFilled(false);
        btnB13.setFocusable(false);
        btnB13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB13MouseExited(evt);
            }
        });
        btnB13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB13ActionPerformed(evt);
            }
        });

        btnB14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB14.setBorder(null);
        btnB14.setBorderPainted(false);
        btnB14.setContentAreaFilled(false);
        btnB14.setFocusable(false);
        btnB14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB14MouseExited(evt);
            }
        });
        btnB14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB14ActionPerformed(evt);
            }
        });

        btnB15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB15.setBorder(null);
        btnB15.setBorderPainted(false);
        btnB15.setContentAreaFilled(false);
        btnB15.setFocusable(false);
        btnB15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB15MouseExited(evt);
            }
        });
        btnB15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB15ActionPerformed(evt);
            }
        });

        btnB16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/b0.png"))); // NOI18N
        btnB16.setBorder(null);
        btnB16.setBorderPainted(false);
        btnB16.setContentAreaFilled(false);
        btnB16.setFocusable(false);
        btnB16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bb.png"))); // NOI18N
        btnB16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnB16MouseExited(evt);
            }
        });
        btnB16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnB1)
                    .addComponent(btnB5)
                    .addComponent(btnB9)
                    .addComponent(btnB13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnB14)
                    .addComponent(btnB10)
                    .addComponent(btnB6)
                    .addComponent(btnB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnB7)
                        .addGap(21, 21, 21)
                        .addComponent(btnB8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnB3)
                        .addGap(21, 21, 21)
                        .addComponent(btnB4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnB15)
                        .addGap(18, 18, 18)
                        .addComponent(btnB16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnB11)
                        .addGap(18, 18, 18)
                        .addComponent(btnB12)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB1)
                    .addComponent(btnB2)
                    .addComponent(btnB3)
                    .addComponent(btnB4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnB6)
                    .addComponent(btnB5)
                    .addComponent(btnB7)
                    .addComponent(btnB8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnB10)
                    .addComponent(btnB9)
                    .addComponent(btnB11)
                    .addComponent(btnB12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnB14)
                    .addComponent(btnB13)
                    .addComponent(btnB15)
                    .addComponent(btnB16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReiniciar.setBackground(new java.awt.Color(255, 153, 153));
        btnReiniciar.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 11)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95)))
                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 647, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        btnEnabled ( btnB1);
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
         btnEnabled ( btnB2);
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        btnEnabled ( btnB3);
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
         btnEnabled ( btnB4);
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
         btnEnabled ( btnB5);
    }//GEN-LAST:event_btnB5ActionPerformed

    private void btnB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB6ActionPerformed
         btnEnabled ( btnB6);
    }//GEN-LAST:event_btnB6ActionPerformed

    private void btnB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB7ActionPerformed
        btnEnabled ( btnB7);
    }//GEN-LAST:event_btnB7ActionPerformed

    private void btnB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB8ActionPerformed
         btnEnabled ( btnB8);
    }//GEN-LAST:event_btnB8ActionPerformed

    private void btnB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB9ActionPerformed
          btnEnabled ( btnB9);
    }//GEN-LAST:event_btnB9ActionPerformed

    private void btnB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB10ActionPerformed
         btnEnabled ( btnB10);
    }//GEN-LAST:event_btnB10ActionPerformed

    private void btnB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB11ActionPerformed
         btnEnabled ( btnB11);
    }//GEN-LAST:event_btnB11ActionPerformed

    private void btnB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB12ActionPerformed
        btnEnabled ( btnB12);
    }//GEN-LAST:event_btnB12ActionPerformed

    private void btnB13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB13ActionPerformed
        btnEnabled ( btnB13);
    }//GEN-LAST:event_btnB13ActionPerformed

    private void btnB14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB14ActionPerformed
          btnEnabled ( btnB14);
    }//GEN-LAST:event_btnB14ActionPerformed

    private void btnB15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB15ActionPerformed
          btnEnabled ( btnB15);
    }//GEN-LAST:event_btnB15ActionPerformed

    private void btnB16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB16ActionPerformed
          btnEnabled ( btnB16);
    }//GEN-LAST:event_btnB16ActionPerformed

    private void btnB1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB1MouseExited
         compare ();
    }//GEN-LAST:event_btnB1MouseExited

    private void btnB2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB2MouseExited
        compare ();
    }//GEN-LAST:event_btnB2MouseExited

    private void btnB3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB3MouseExited
        compare ();
    }//GEN-LAST:event_btnB3MouseExited

    private void btnB4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB4MouseExited
       compare ();
    }//GEN-LAST:event_btnB4MouseExited

    private void btnB5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB5MouseExited
       compare ();
    }//GEN-LAST:event_btnB5MouseExited

    private void btnB6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB6MouseExited
        compare ();
    }//GEN-LAST:event_btnB6MouseExited

    private void btnB7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB7MouseExited
     compare ();
    }//GEN-LAST:event_btnB7MouseExited

    private void btnB8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB8MouseExited
       compare ();
    }//GEN-LAST:event_btnB8MouseExited

    private void btnB9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB9MouseExited
        compare ();
    }//GEN-LAST:event_btnB9MouseExited

    private void btnB10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB10MouseExited
        compare ();
    }//GEN-LAST:event_btnB10MouseExited

    private void btnB11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB11MouseExited
        compare ();
    }//GEN-LAST:event_btnB11MouseExited

    private void btnB12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB12MouseExited
        compare ();
    }//GEN-LAST:event_btnB12MouseExited

    private void btnB13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB13MouseExited
      compare ();
    }//GEN-LAST:event_btnB13MouseExited

    private void btnB14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB14MouseExited
        compare ();
    }//GEN-LAST:event_btnB14MouseExited

    private void btnB15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB15MouseExited
       compare ();
    }//GEN-LAST:event_btnB15MouseExited

    private void btnB16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnB16MouseExited
        compare ();
    }//GEN-LAST:event_btnB16MouseExited

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
         reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB10;
    private javax.swing.JButton btnB11;
    private javax.swing.JButton btnB12;
    private javax.swing.JButton btnB13;
    private javax.swing.JButton btnB14;
    private javax.swing.JButton btnB15;
    private javax.swing.JButton btnB16;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnB5;
    private javax.swing.JButton btnB6;
    private javax.swing.JButton btnB7;
    private javax.swing.JButton btnB8;
    private javax.swing.JButton btnB9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
