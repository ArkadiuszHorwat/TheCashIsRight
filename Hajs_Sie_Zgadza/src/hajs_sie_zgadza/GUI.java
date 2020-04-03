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
import javax.swing.JComboBox;
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
    public JTextField tfLog, tfUserName, tfLogin, tfCash, tfCause, tfHowM, tfCauseDes;
    public JPasswordField pfPass, pfPassword;
    public JButton bLog, bNuser, bCreuser, bApply, bLogout, bReturnLog;
    public JLabel lLoginLog, lPassword, lName, lCash, lLogin, lPass, lAppName, lAppCash, lAppBorder, lAppCause, lAppHowM, lAppSign;
    public JComboBox cbSign;
    
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
        bLog.setBounds(100,220,140,30);
        bLog.addActionListener(this);
        pLogin.add(bLog);
        
        bCreuser = new JButton("New account");
        bCreuser.setBounds(260,220,140,30);
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
        bNuser.setBounds(90,300,140,30);
        bNuser.addActionListener(this);
        pRegister.add(bNuser);
        
        bReturnLog = new JButton("Return");
        bReturnLog.setBounds(240,300,140,30);
        bReturnLog.addActionListener(this);
        pRegister.add(bReturnLog);
        
        //PANEL APLIKACJI
        pApp = new JPanel();
        pApp.setBackground(color);
        pApp.setLayout(null);
        
        mainWindow.getContentPane().add(pApp, BorderLayout.CENTER);
        pApp.setVisible(false);
        
        lAppName = new JLabel("",JLabel.CENTER);
        lAppName.setFont(font2);
        lAppName.setBounds(150,10,200,30);
        lAppName.setForeground(Color.WHITE);
        pApp.add(lAppName);
        
        lAppCash = new JLabel("",JLabel.CENTER);
        lAppCash.setFont(font2);
        lAppCash.setBounds(150,35,200,30);
        lAppCash.setForeground(Color.WHITE);
        pApp.add(lAppCash);  
                                 
        lAppBorder = new JLabel("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        lAppBorder.setFont(font2);
        lAppBorder.setBounds(7,65,500,30);
        lAppBorder.setForeground(Color.WHITE);
        pApp.add(lAppBorder); 
        
        lAppCause = new JLabel("Cause: ");
        lAppCause.setFont(font1);
        lAppCause.setBounds(20,140,100,30);
        lAppCause.setForeground(Color.WHITE);
        pApp.add(lAppCause);
        
        lAppHowM = new JLabel("How much: ");
        lAppHowM.setFont(font1);
        lAppHowM.setBounds(20,180,100,30);
        lAppHowM.setForeground(Color.WHITE);
        pApp.add(lAppHowM);
        
        lAppSign = new JLabel("+/-: ");
        lAppSign.setFont(font1);
        lAppSign.setBounds(150,210,40,30);
        lAppSign.setForeground(Color.WHITE);
        pApp.add(lAppSign);
        
        JLabel lCauseDes = new JLabel("Cause designation: ");
        lCauseDes.setFont(font1);
        lCauseDes.setBounds(20,110,150,30);
        lCauseDes.setForeground(Color.WHITE);
        pApp.add(lCauseDes);
        
        tfCauseDes  = new JTextField("");
        tfCauseDes.setBounds(170,110,50,30);
        pApp.add(tfCauseDes);
        
        tfCause = new JTextField("");
        tfCause.setBounds(100,140,120,30);
        pApp.add(tfCause);
        
        tfHowM = new JTextField("");
        tfHowM.setBounds(100,180,120,30);
        pApp.add(tfHowM);
        
        Character[] sign = { '+','-',' ' };
        cbSign = new JComboBox(sign);
        cbSign.setFont(font1);
        cbSign.setSelectedIndex(2);
        cbSign.setBounds(181,210,40,30);
        pApp.add(cbSign);
        
        bApply = new JButton("APPLY");
        bApply.setBounds(20,285,120,30);
        bApply.addActionListener(this);
        pApp.add(bApply);
        
        bLogout = new JButton("SIGN OUT");
        bLogout.setBounds(20,320,120,30);
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
                String idUSER = "id";
                String Q = "SELECT id_O_user FROM LOGINDATA WHERE login = '" + getLog + "'";
                dataBase.connection(Q, idUSER);
                int idUser = dataBase.id.get(0);
               
                String User = "USER";
                String Q1 = "SELECT * FROM USER WHERE id_user = '" + idUser + "'";
                dataBase.connection(Q1, User);
                
                lAppName.setText(dataBase.user.get(0).getUserName());
                lAppCash.setText(String.valueOf(dataBase.user.get(0).getCash()));
                
                dataBase.user.clear();
                dataBase.id.clear();
                
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
                
                String queryLog = "SELECT login FROM LOGINDATA WHERE login=?";
                String queryNam = "SELECT USER_NAME FROM USER WHERE user_name=?";
                boolean checkUserName = dataBase.checkUserData(n, queryNam);
                boolean checkUserLog = dataBase.checkUserData(l, queryLog);
                
                if(checkUserName || checkUserLog) {
                    
                    JOptionPane.showMessageDialog(null, "Nazwa użytkownika lub/i login są już zajęte.");
                    
                } else if(!isNumeric(c)){
                    JOptionPane.showMessageDialog(null, "Hajs się nie zgadza.");
                } else{
                    
                    String Q = "INSERT INTO USER (user_name, cash) VALUES ('" + n + "', '" + c + "')";
                    dataBase.add(Q);
                    
                    String idUser = "id";
                    String Q1 = "SELECT id_user FROM USER WHERE user_name = '" + n + "'";
                    dataBase.connection(Q1, idUser);
                    
                    int idUs = dataBase.id.get(0);
                    String Q2 = "INSERT INTO LOGINDATA (login, password, id_O_user) VALUES ('" + l + "', '" + pfPassword.getText() + "', '" + idUs + "')";
                    dataBase.add(Q2);
                    
                    JOptionPane.showMessageDialog(null, "Konto użytkownika zostało stworzone poprawnie.");
                    
                    dataBase.id.clear();
                    
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
            lAppName.setText("");
            lAppCash.setText("");
            tfCauseDes.setText("");
            tfCause.setText("");
            tfHowM.setText("");
            cbSign.setSelectedIndex(2);
            dataBase.user.clear();
            dataBase.id.clear();
            
        }
        
        if (src == bApply) {
            String cas = tfCause.getText();
            String how = tfHowM.getText();
            String casDes = tfCauseDes.getText();
            String use = lAppName.getText();
            String appC = lAppCash.getText();
            char ch = (char)cbSign.getSelectedItem();
            
            if(ch == '-'){
                how = '-'+how;
            }
            
            
            String queryDes = "SELECT cause_designation FROM APPDATA WHERE cause_designation=?";
            boolean checkCauseDesignation = dataBase.checkUserData(casDes, queryDes);
                
            if(checkCauseDesignation){
                JOptionPane.showMessageDialog(null, "Już jest w bazie powód o takim oznaczeniu.");
            }else if(!isNumeric(how) || cas.isEmpty() || casDes.isEmpty() || ch == ' '){
                    JOptionPane.showMessageDialog(null, "Wypełnij wszystkie pola poprawnie.");
            }else {
                String idUser = "id";
                String que = "SELECT id_user FROM USER WHERE user_name = '" + use + "'";
                dataBase.connection(que, idUser);
                int iduse = dataBase.id.get(0);
                
                String que1 = "INSERT INTO APPDATA (cause, how_much, sign, id_O1_user, cause_designation) VALUES ('" + cas + "', '" + how + "', '" + ch + "', '" + iduse + "', '" + casDes + "')";
                dataBase.add(que1);
                
                String apd = "APPDATA";
                String que2 = "SELECT * FROM APPDATA WHERE cause_designation = '" + casDes + "'";
                dataBase.connection(que2, apd);
                double x = dataBase.appData.get(0).getHowMuch();
                double y = Double.parseDouble(appC);
                double sum = x + y;
                String que3 = "UPDATE USER SET cash = '" + sum + "' WHERE id_user = '" + iduse + "'";
                //UPDATE `user` SET `cash` = '100' WHERE `user`.`id_user` = 13;
                dataBase.add(que3);
                lAppCash.setText(""+sum+"");
                dataBase.appData.clear();
                
                tfCauseDes.setText("");
                tfCause.setText("");
                tfHowM.setText("");
                cbSign.setSelectedIndex(2);
            }
            
        }
        
    }

}
