public class User {
    private String userName;
    private String password;
    private long registrationTime;

    public String getUseName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
        System.out.println("New user registration.");
        registrationTime = System.currentTimeMillis();
        userName = System.currentTimeMillis() + "";
        password = "123456";
    }

    public User(String userName, String password) {
        System.out.println("New user registration.");
        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;

    }
    public String getInfo(){
        return userName + password + registrationTime;
    }
}
