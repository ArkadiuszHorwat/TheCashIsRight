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
public class AppData {
    
    private int idAppData;
    private String cause;
    private double howMuch;
    private int idO1user;
    
    public AppData(int idAppData, String cause, double howMuch, int idO1user) {
        
        this.idAppData = idAppData;
        this.cause = cause;
        this.howMuch = howMuch;
        this.idO1user = idO1user;
        
    }
    
    public String getCause() {
        return cause;
    }
    
    public double getHowMuch() {
        return howMuch;
    }
    
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    public void setHowMuch(double howMuch) {
        this.howMuch = howMuch;
    }
    
}
