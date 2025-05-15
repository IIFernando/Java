package Herança.packege;

public non-sealed class Manager extends Employer{
    
    private String login;
    private String password;
    private double comission;
    
    //
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setComission(double comission) {
        this.comission = comission;
    }
    //
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public double getComission() {
        return comission;
    }

}
