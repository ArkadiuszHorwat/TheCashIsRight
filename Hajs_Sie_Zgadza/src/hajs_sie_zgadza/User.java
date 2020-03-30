/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hajs_sie_zgadza;

public class User {
    
    private int idUser;
    private String name;
    private String surname;
    private int cash;
    
    public User(int idUser, String name, String surname, int cash) {
        
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.cash = cash;
        
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public int getCash() {
        return cash;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setCash(int cash) {
        this.cash = cash;
    }
    
}
