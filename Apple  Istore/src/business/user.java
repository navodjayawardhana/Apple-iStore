package business;

public class user {
    private String userID;
    private String password;
    private String type;

    public user() {
    }

    public user(String userID, String password,String type) {
        this.userID = userID;
        this.password = password;
        this.type=type;
    }



    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String Print(){
        String line = String.valueOf(getUserID())+","+getPassword()+","+getType();

        return line;
    }
    
}
