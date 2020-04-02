/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajs_sie_zgadza;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Arkadiusz
 */
public class GUI extends JFrame implements ActionListener {
    
    public JFrame mainWindow;
    public JPanel pLogin, pRegister, pApp;
    public JTextField tfLog, tfUserName, tfLogin, tfCash;
    public JPasswordField pfPass, pfPassword;
    public JButton bLog, bNuser, bCreuser, bApply, bLogout, bReturnLog;
    public JLabel lLoginLog, lPassword, lName, lCash, lLogin, lPass, lAppName, lAppCash, lAppBorder;
    
    static final Color color = new Color(45, 70, 70);
    
    final Font font1 = new Font("myFont1",Font.PLAIN,16);
    final Font font2 = new Font("myFont2",Font.PLAIN,22);
    
    public GUI() {
        
        //OKNO APLIKACJI
        mainWindow = new JFrame("HAJS SIE ZGADZA");
        mainWindow.setSize(500,400);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.getContentPane().setLayout(new CardLayout(0,0));
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setResizable(false);
        
        //PANEL LOGOWANIA
        pLogin = new JPanel();
        pLogin.setBackground(color);
        pLogin.setLayout(null);
        
  
        mainWindow.getContentPane().add(pLogin, BorderLayout.CENTER);
        pLogin.setVisible(true);
        
        lLoginLog = new JLabel("USERNAME: ");
        lLoginLog.setFont(font2);
        lLoginLog.setBounds(100,90,150,30);
        lLoginLog.setForeground(Color.WHITE);
        pLogin.add(lLoginLog);
        
        lPassword = new JLabel("PASSWORD: ");
        lPassword.setFont(font2);
        lPassword.setBounds(100,150,150,30);
        lPassword.setForeground(Color.WHITE);
        pLogin.add(lPassword);
        
        bLog = new JButton("Sign In");
        bLog.setBounds(85,220,160,30);
        bLog.addActionListener(this);
        pLogin.add(bLog);
        
        bCreuser = new JButton("Create a new account");
        bCreuser.setBounds(260,220,160,30);
        bCreuser.addActionListener(this);
        pLogin.add(bCreuser);
        
        tfLog = new JTextField("");
        tfLog.setBounds(250,90,150,30);
        pLogin.add(tfLog);
        
        pfPass = new JPasswordField("");
        pfPass.setBounds(250,150,150,30);
        pLogin.add(pfPass);
        
        //PANEL REJESTROWANIA
        pRegister = new JPanel();
        pRegister.setBackground(color);
        pRegister.setLayout(null);
        
        mainWindow.getContentPane().add(pRegister, BorderLayout.CENTER);
        pRegister.setVisible(false);
        
        lName = new JLabel("NAME: ");
        lName.setFont(font1);
        lName.setBounds(100,50,100,30);
        lName.setForeground(Color.WHITE);
        pRegister.add(lName);      
        
        lLogin = new JLabel("USERNAME: ");
        lLogin.setFont(font1);
        lLogin.setBounds(100,100,150,30);
        lLogin.setForeground(Color.WHITE);
        pRegister.add(lLogin);
        
        lPass = new JLabel("PASSWORD: ");
        lPass.setFont(font1);
        lPass.setBounds(100,150,150,30);
        lPass.setForeground(Color.WHITE);
        pRegister.add(lPass);
        
        lCash = new JLabel("YOUR MONEY: ");
        lCash.setFont(font1);
        lCash.setBounds(100,200,200,30);
        lCash.setForeground(Color.WHITE);
        pRegister.add(lCash);

        
        tfUserName = new JTextField("");
        tfUserName.setBounds(230,50,150,30);
        pRegister.add(tfUserName);
        
        tfLogin = new JTextField("");
        tfLogin.setBounds(230,100,150,30);
        pRegister.add(tfLogin);
        
        tfCash = new JTextField("");
        tfCash.setBounds(230,200,150,30);
        pRegister.add(tfCash);
        
        pfPassword = new JPasswordField("");
        pfPassword.setBounds(230,150,150,30);
        pRegister.add(pfPassword);
        
        bNuser = new JButton("Sign Up");
        bNuser.setBounds(70,300,160,30);
        bNuser.addActionListener(this);
        pRegister.add(bNuser);
        
        bReturnLog = new JButton("Return");
        bReturnLog.setBounds(250,300,160,30);
        bReturnLog.addActionListener(this);
        pRegister.add(bReturnLog);
        
        //PANEL APLIKACJI
        pApp = new JPanel();
        pApp.setBackground(color);
        pApp.setLayout(null);
        
        mainWindow.getContentPane().add(pApp, BorderLayout.CENTER);
        pApp.setVisible(false);
        
        lAppName = new JLabel("");
        lAppName.setFont(font1);
        lAppName.setBounds(20,10,200,30);
        lAppName.setForeground(Color.WHITE);
        pApp.add(lAppName);
        
        lAppCash = new JLabel("");
        lAppCash.setFont(font1);
        lAppCash.setBounds(20,35,200,30);
        lAppCash.setForeground(Color.WHITE);
        pApp.add(lAppCash);  
                                 
        lAppBorder = new JLabel("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        lAppBorder.setFont(font1);
        lAppBorder.setBounds(10,65,500,30);
        lAppBorder.setForeground(Color.WHITE);
        pApp.add(lAppBorder); 
        
        bApply = new JButton("APPLY");
        bApply.setBounds(220,30,120,30);
        bApply.addActionListener(this);
        pApp.add(bApply);
        
        bLogout = new JButton("SIGN OUT");
        bLogout.setBounds(350,30,120,30);
        bLogout.addActionListener(this);
        pApp.add(bLogout);
       
    }
    
    private boolean isNumeric(String c) {
        try {
            Double.parseDouble(c);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }  
    }
  
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        
        if (src == bCreuser){
            pLogin.setVisible(false);
            pRegister.setVisible(true);
        } 
        
        if (src == bLog) {
            String getLog = tfLog.getText();
            
            boolean check = dataBase.checkUser(getLog, pfPass.getText());
           
            if(check) {
                String idUSER = "idUSER";
                String Q = "SELECT id_O_user FROM LOGINDATA WHERE login = '" + getLog + "'";
                dataBase.connection(Q, idUSER);
                int idUser = dataBase.idUser.get(0);
               
                String User = "USER";
                String Q1 = "SELECT * FROM USER WHERE id_user = '" + idUser + "'";
                dataBase.connection(Q1, User);
                
                lAppName.setText(dataBase.user.get(0).getUserName());
                lAppCash.setText(String.valueOf(dataBase.user.get(0).getCash()));
                
                dataBase.user.clear();
                dataBase.idUser.clear();
                
                pLogin.setVisible(false);
                pApp.setVisible(true);
                
                tfLog.setText("");
                pfPass.setText("");
             
            } else {
                JOptionPane.showMessageDialog(null, "Coś poszło nie tak. Spróbuj ponownie.");
                tfLog.setText("");
                pfPass.setText("");
            }
            
            
        }
        
        if (src == bNuser) {
            
            String n = tfUserName.getText();
            String l = tfLogin.getText();
            String c = tfCash.getText();
            
            
            if(!n.isEmpty() && !l.isEmpty() && !c.isEmpty() && !pfPassword.getText().isEmpty()){
                
                boolean checkUserName = dataBase.chechUserName(n);
                boolean checkUserLog = dataBase.chechUserLog(l);
                
                if(checkUserName || checkUserLog) {
                    
                    JOptionPane.showMessageDialog(null, "Nazwa użytkownika lub/i login są już zajęte.");
                    
                } else if(!isNumeric(c)){
                    JOptionPane.showMessageDialog(null, "Hajs się nie zgadza.");
                } else{
                    
                    String Q = "INSERT INTO USER (user_name, cash) VALUES ('" + n + "', '" + c + "')";
                    dataBase.addUser(Q);
                    
                    String idUser = "idUSER";
                    String Q1 = "SELECT id_user FROM USER WHERE user_name = '" + n + "'";
                    dataBase.connection(Q1, idUser);
                    
                    int idUs = dataBase.idUser.get(0);
                    String Q2 = "INSERT INTO LOGINDATA (login, password, id_O_user) VALUES ('" + l + "', '" + pfPassword.getText() + "', '" + idUs + "')";
                    dataBase.addUser(Q2);
                    
                    JOptionPane.showMessageDialog(null, "Konto użytkownika zostało stworzone poprawnie.");
                    
                    dataBase.idUser.clear();
                    
                    pRegister.setVisible(false);
                    pLogin.setVisible(true);
                
                    tfUserName.setText("");
                    tfLogin.setText("");
                    tfCash.setText("");
                    pfPassword.setText("");
                }
                 
            }else {
                
                JOptionPane.showMessageDialog(null, "Sprawdź czy wszystkie pola są wypełnione.");
                
            }
            
        }
        
        if (src == bReturnLog) {
            
            pLogin.setVisible(true);
            pRegister.setVisible(false);
            
            tfUserName.setText("");          
            tfLogin.setText("");            
            tfCash.setText("");            
            pfPassword.setText("");
           
        }
        
        if (src == bLogout) {
            pApp.setVisible(false);
            pLogin.setVisible(true);
        }
        
        if (src == bApply) {
            
        }
        
    }

}
