import java.util.*;

public class Cloud{
    LinkedList<Account> accounts = new LinkedList<>();
    // LinkedList<String> userNames = new LinkedList<>();
    // LinkedList<String> emails = new LinkedList<>();
    // LinkedList<String> passwords = new LinkedList<>();
    // LinkedList<Long> holds = new LinkedList<>();
    // int userName = 0;
    // int email = 1;
    // int password = 2;
    // int holds = 3;
    // int tickets = 4;
    // int color = 5;
    public boolean createAccount(String userName, String email, String password){
        if(findUserName(userName) == -1 && find(email) == -1){
            // LinkedList newAccount = new LinkedList<>();
            LinkedList<Ticket> tickets = new LinkedList<>();
            Account newAccount = new Account(userName, email, password, (long) 0, tickets, "dark");
            accounts.add(newAccount);
            // accounts.get(accounts.size()-1).add(userName);
            // accounts.get(accounts.size()-1).add(email);
            // accounts.get(accounts.size()-1).add(password);
            // accounts.get(accounts.size()-1).add((long) 0);
            // LinkedList tickets = new LinkedList<>();
            // accounts.get(accounts.size()-1).add(tickets);
            // accounts.get(accounts.size()-1).add("dark");
            return true;
        }
        else{
            return false;
        }
    }
    public int findUserName(String userName){
        //This finds the account using the user name and returns the index;
        for(int i = 0; i < accounts.size(); i ++){
            if(accounts.get(i).getUserName().equals(userName) == true){
                return i;
            }
        }
        return -1;
    }
    public int find(String email){
        //This finds the account using the email and returns the index;
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getEmail().equals(email) == true){
                return i;
            }
        }
        return -1;
    }
    public LinkedList<Ticket> getTickets(int index, String password){
        if(accounts.get(index).getPassword().equals(password)){
            return ((LinkedList<Ticket>) accounts.get(index).getTickets());
        }
        else{
            return null;
        }
    }
    public String getColor(int index, String password){
        if(accounts.get(index).getPassword().equals(password)){
            return ((String) accounts.get(index).getColor());
        }
        else{
            return null;
        }
    }
    public String getUserName(int index, String password){
        if(accounts.get(index).getPassword().equals(password)){
            return ((String) accounts.get(index).getUserName());
        }
        return null;
    }
    
    public void setUserName(int index, String password, String userName){
        if(accounts.get(index).getPassword().equals(password)){
            accounts.get(index).setUserName(userName);
        }
    }

    public void setEmail(int index, String password, String email){
        if(accounts.get(index).getPassword().equals(password)){
            accounts.get(index).setEmail(email);;
        }
    }

    public void setPassword(int index, String password, String newPassword){
        if(accounts.get(index).getPassword().equals(password)){
            accounts.get(index).setPassword(newPassword);
        }
    }

    public void setColor(int index, String password, String color){
        if(accounts.get(index).getPassword().equals(password)){
            accounts.get(index).setColor(color);
        }
    }
}