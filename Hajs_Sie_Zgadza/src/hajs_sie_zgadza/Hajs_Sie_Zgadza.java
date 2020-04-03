/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajs_sie_zgadza;

/**
 *
 * @author Arkadiusz
 */
public class Hajs_Sie_Zgadza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GUI gui = new GUI();
        gui.mainWindow.setVisible(true);       
        
        String select = "APPDATA";
                String que4 = "SELECT * FROM APPDATA";
                dataBase.connection(que4, select);
                String selectCause;
                double selectHowM;
           
                for(int i = 0; i<dataBase.appData.size(); i++) {
                    selectCause = dataBase.appData.get(i).getCause();
                    selectHowM = dataBase.appData.get(i).getHowMuch();
                    System.out.println(" "+selectCause+" "+selectHowM+"\n ");
                }
    }
    
}
