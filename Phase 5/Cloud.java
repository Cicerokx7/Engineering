import java.util.*;

public class Cloud{
    LinkedList<LinkedList> accounts = new LinkedList<>();
    // LinkedList<String> userNames = new LinkedList<>();
    // LinkedList<String> emails = new LinkedList<>();
    // LinkedList<String> passwords = new LinkedList<>();
    // LinkedList<Long> holds = new LinkedList<>();
    int userName = 0;
    int email = 1;
    int password = 2;
    int holds = 3;
    int tickets = 4;
    int color = 5;
    public boolean createAccount(String userName, String email, String password){
        if(findUserName(userName) == -1 && find(email) == -1){
            LinkedList newAccount = new LinkedList<>();
            accounts.add(newAccount);
            accounts.get(accounts.size()-1).add(userName);
            accounts.get(accounts.size()-1).add(email);
            accounts.get(accounts.size()-1).add(password);
            accounts.get(accounts.size()-1).add((long) 0);
            LinkedList tickets = new LinkedList<>();
            accounts.get(accounts.size()-1).add(tickets);
            accounts.get(accounts.size()-1).add("dark");
            // userNames.add(userName);
            // emails.add(email);
            // passwords.add(password);
            // holds.add((long) 0);
            return true;
        }
        else{
            return false;
        }
    }
    public int findUserName(String userName){
        for(int i = 0; i < accounts.size(); i ++){
            if(accounts.get(i).get(this.userName).equals(userName) == true){
                System.err.println(i);
                System.err.println(accounts.get(i).get(this.userName));
                System.err.println(accounts.get(i).get(password));
                return i;
            }
        }
        // for(int i = 0; i < userNames.size(); i++){
        //     if(userNames.get(i).equals(userName) == true){
        //         return i;
        //     }
        // }
        return -1;
    }
    public int find(String email){
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).get(this.email).equals(email) == true){
                return i;
            }
        }
        return -1;
    //     for(int i = 0; i < emails.size(); i++){
    //         if(emails.get(i).equals(email) == true){
    //             return i;
    //         }
    //     }
    //     return -1;
    }
    public LinkedList getTickets(int index, String password){
        if(accounts.get(index).get(this.password).equals(password)){
            return ((LinkedList) accounts.get(index).get(tickets));
        }
        else{
            return null;
        }
    }
    public String getColor(int index, String password){
        if(accounts.get(index).get(this.password).equals(password)){
            return ((String) accounts.get(index).get(color));
        }
        else{
            return null;
        }
    }
}