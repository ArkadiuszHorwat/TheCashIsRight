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
    public JLabel lLoginLog, lPassword, lName, lCash, lLogin, lPass, lAppName,lAppSurname, lAppCash, lAppBorder;
    
    public JLabel lTestBazy;
    
    public static String getLog;
    
    
    static final Color color = new Color(45, 70, 70);
    
    final Font font1 = new Font("System",Font.BOLD,16);
    final Font font2 = new Font("System",Font.BOLD,22);
    
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
        
        lLoginLog = new JLabel("LOGIN: ",JLabel.CENTER);
        lLoginLog.setFont(font2);
        lLoginLog.setBounds(76,90,150,30);
        lLoginLog.setForeground(Color.WHITE);
        pLogin.add(lLoginLog);
        
        lPassword = new JLabel("PASSWORD: ",JLabel.CENTER);
        lPassword.setFont(font2);
        lPassword.setBounds(74,150,150,30);
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
        tfLog.setBounds(230,90,200,30);
        pLogin.add(tfLog);
        
        pfPass = new JPasswordField("");
        pfPass.setBounds(230,150,200,30);
        pLogin.add(pfPass);
        
        //PANEL REJESTROWANIA
        pRegister = new JPanel();
        pRegister.setBackground(color);
        pRegister.setLayout(null);
        
        mainWindow.getContentPane().add(pRegister, BorderLayout.CENTER);
        pRegister.setVisible(false);
        
        lName = new JLabel("NAME: ",JLabel.CENTER);
        lName.setFont(font1);
        lName.setBounds(117,50,100,30);
        lName.setForeground(Color.WHITE);
        pRegister.add(lName);      
        
        lLogin = new JLabel("LOGIN: ",JLabel.CENTER);
        lLogin.setFont(font1);
        lLogin.setBounds(70,150,150,30);
        lLogin.setForeground(Color.WHITE);
        pRegister.add(lLogin);
        
        lPass = new JLabel("PASSWORD: ",JLabel.CENTER);
        lPass.setFont(font1);
        lPass.setBounds(69,200,150,30);
        lPass.setForeground(Color.WHITE);
        pRegister.add(lPass);
        
        lCash = new JLabel("Amount of your money: ",JLabel.CENTER);
        lCash.setFont(font1);
        lCash.setBounds(6,250,200,30);
        lCash.setForeground(Color.WHITE);
        pRegister.add(lCash);

        
        tfUserName = new JTextField("");
        tfUserName.setBounds(200,50,200,30);
        pRegister.add(tfUserName);
        
        tfLogin = new JTextField("");
        tfLogin.setBounds(200,150,200,30);
        pRegister.add(tfLogin);
        
        tfCash = new JTextField("");
        tfCash.setBounds(200,250,200,30);
        pRegister.add(tfCash);
        
        pfPassword = new JPasswordField("");
        pfPassword.setBounds(200,200,200,30);
        pRegister.add(pfPassword);
        
        bNuser = new JButton("Sign Up");
        bNuser.setBounds(250,300,160,30);
        bNuser.addActionListener(this);
        pRegister.add(bNuser);
        
        bReturnLog = new JButton("Return");
        bReturnLog.setBounds(70,300,160,30);
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
        lAppName.setBounds(20,5,200,30);
        lAppName.setForeground(Color.WHITE);
        pApp.add(lAppName);
        
        lAppSurname = new JLabel("");
        lAppSurname.setFont(font1);
        lAppSurname.setBounds(20,25,200,30);
        lAppSurname.setForeground(Color.WHITE);
        pApp.add(lAppSurname);
        
        lAppCash = new JLabel("");
        lAppCash.setFont(font1);
        lAppCash.setBounds(20,50,200,30);
        lAppCash.setForeground(Color.WHITE);
        pApp.add(lAppCash);  
                                 
        lAppBorder = new JLabel("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        lAppBorder.setFont(font1);
        lAppBorder.setBounds(10,75,500,30);
        lAppBorder.setForeground(Color.WHITE);
        pApp.add(lAppBorder); 
        
        lTestBazy = new JLabel("");
        lTestBazy.setFont(font1);
        lTestBazy.setBounds(100,100,150,100);   
        lTestBazy.setForeground(Color.WHITE);
        pApp.add(lTestBazy);
        
        bApply = new JButton("APPLY");
        bApply.setBounds(300,5,160,30);
        bApply.addActionListener(this);
        pApp.add(bApply);
        
        bLogout = new JButton("SIGN OUT");
        bLogout.setBounds(300,45,160,30);
        bLogout.addActionListener(this);
        pApp.add(bLogout);
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        
        
        if (src == bCreuser){
            pLogin.setVisible(false);
            pRegister.setVisible(true);
        } 
        
        if (src == bLog) {
             
            getLog = tfLog.getText();
            
            boolean check = dataBase.checkUser(getLog, pfPass.getText());
           
            if(check) {
                
                tfLog.setText("");
                pfPass.setText("");
                pLogin.setVisible(false);
                pApp.setVisible(true);
                            

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
                
                if(checkUserName) {
                    
                    JOptionPane.showMessageDialog(null, "Nazwa użytkownika jest już zajęta.");
                    
                } else {
                    
                    String Q = "INSERT INTO USER (user_name, cash) VALUES ('" + n + "', '" + c + "')";
                    dataBase.addUser(Q);
                    
                    String table = "idUSER";
                    String Q1 = "SELECT id_user FROM USER WHERE user_name = '" + n + "'";
                    dataBase.connection(Q1, table);
                    
                    int idUs = dataBase.idUser.get(0);
                    String Q2 = "INSERT INTO LOGINDATA (login, password, id_O_user) VALUES ('" + l + "', '" + pfPassword.getText() + "', '" + idUs + "')";
                    dataBase.addUser(Q2);
                    
                    JOptionPane.showMessageDialog(null, "Konto użytkownika zostało stworzone poprawnie.");
                    
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
