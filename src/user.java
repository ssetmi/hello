import java.util.Date;

public class user {

    private String email;
    private String login;
    private int ID;
    int number_of_messages = 0;
    private Date date;
    public String message;

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumber_of_messages() {
        return number_of_messages;
    }

    public void setNumber_of_messages(int number_of_messages) {
        this.number_of_messages = number_of_messages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void delete(){
        return number_of_messages--;
    }
    public void add(){
        return number_of_messages++;
    }
}