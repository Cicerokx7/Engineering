import java.util.LinkedList;

import javax.swing.CellRendererPane;

public class HomePageUI {
    String email;
    int index;
    String password;
    String color;
    LinkedList<Ticket> tickets;
    Cloud cloud;
    public void begin(Cloud cloud, String email, String password){
        this.email = email;
        this.password = password;
        index = cloud.find(email);
        color = cloud.getColor(index, password);
        tickets = cloud.getTickets(index, password);
        display();
    }
    public void display(){
        System.err.println(color);
        for(int i = 0; i < tickets.size(); i++){
            System.err.println(((Ticket) tickets.get(i)).getColor());
            System.err.println(((Ticket) tickets.get(i)).getTitle());
            System.err.print(((Ticket) tickets.get(i)).getStartYear()+":");
            System.err.print(((Ticket) tickets.get(i)).getStartMonth()+":");
            System.err.print(((Ticket) tickets.get(i)).getStartDay()+":");
            System.err.println(((Ticket) tickets.get(i)).getStartTime());
            System.err.print(((Ticket) tickets.get(i)).getEndYear()+":");
            System.err.print(((Ticket) tickets.get(i)).getEndMonth()+":");
            System.err.print(((Ticket) tickets.get(i)).getEndDay()+":");
            System.err.println(((Ticket) tickets.get(i)).getEndTime());
            System.err.println("_");
        }
        System.err.println("_");
    }

    public void addTicket(String color, String title, String details, int startYear, int startMonth, int startDay, int startTime, int endYear, int endMonth, int endDay, int endTime){
        Ticket ticket = new Ticket(color, title, details, startYear, startMonth, startDay, startTime, endYear, endMonth, endDay, endTime);
        tickets.add(ticket);
        display();
    }

    public void addCheckList(String ticket, String title, String details){
        CheckList newCheckList = new CheckList(title, details);
        for(int i = 0; i < tickets.size(); i++){
            if(((Ticket) tickets.get(i)).getTitle().equals(tickets)){
                ((Ticket) tickets.get(i)).addCheckList(newCheckList);
                return;
            }
        }
    }
    
    public CheckList removeCheckList(String ticket, String title){
        for(int i = 0; i < tickets.size(); i++){
            if(((Ticket) tickets.get(i)).getTitle().equals(ticket)){
                return ((Ticket) tickets.get(i)).removeCheckList(title);
            }
        }
        return null;
    }

    public void openTicket(String ticket){
        for(int i = 0; i < tickets.size(); i++){
            if(((Ticket) tickets.get(i)).getTitle().equals(ticket)){
                tickets.get(i).openTicket();
            }
        }
    }
}
