package model.interfaces;

public interface User {
    public String cpf = null;
    public String name = null;
    public String adress = null;
    public String phoneNumber = null;
    public String password = null;
    public String email = null;

    public User[] selectAll();
}
