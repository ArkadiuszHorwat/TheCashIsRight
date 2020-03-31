package hajs_sie_zgadza;

public class User {
    
    private int idUser;
    private String userName;
    private int cash;
    
    public User(int idUser, String userName,int cash) {
        
        this.idUser = idUser;
        this.userName = userName;
        this.cash = cash;
        
    }
    
    public String getUserName() {
        return userName;
    }
    
    public int getCash() {
        return cash;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setCash(int cash) {
        this.cash = cash;
    }
    
}
