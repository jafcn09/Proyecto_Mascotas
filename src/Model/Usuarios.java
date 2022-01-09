package Model;

public class Usuarios {
    //Declarando variables
    int id;
    String user;

    int password;
    //Constructor

    public Usuarios(int id, String user,  int password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }
    //SUPER CONSTRUCTOR
    public Usuarios(){
        this.id = 1;
        this.user ="";
        this.password=298391831;
    }
    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
