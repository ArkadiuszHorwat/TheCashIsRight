package hajs_sie_zgadza;

public class User {
    
    private int idUser;
    private String userName;
    private double cash;
    
    public User(int idUser, String userName,double cash) {
        
        this.idUser = idUser;
        this.userName = userName;
        this.cash = cash;
        
    }
    
    public String getUserName() {
        return userName;
    }
    
    public double getCash() {
        return cash;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setCash(double cash) {
        this.cash = cash;
    }
    
}
