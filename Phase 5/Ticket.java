import java.util.LinkedList;

public class Ticket {
    String color;
    String title;
    String details;
    LinkedList<CheckList> checkLists;
    int startYear;
    int startMonth;
    int startDay;
    int startTime;
    int endYear;
    int endMonth;
    int endDay;
    int endTime;

    public Ticket(String color, String title, String details, int startYear, int startMonth, int startDay, int startTime, int endYear, int endMonth, int endDay, int endTime){
        this.color = color;
        this.title = title;
        this.details = details;
        this.startYear = startYear;
        this.startMonth = startMonth;
        this.startDay = startDay;
        this.startTime = startTime;
        this.endYear = endYear;
        this.endMonth = endMonth;
        this.endDay = endDay;
        this.endTime = endTime;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }
    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }
    public void setEndMonth(int endMonth) {
        this.endMonth = endMonth;
    }
    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
    public void setCheckLists(LinkedList checkLists){
        this.checkLists = checkLists;
    }
    public void addCheckList(CheckList checkList){
        checkLists.add(checkList);
    }
    public CheckList removeCheckList(String title){
        for(int i = 0; i < checkLists.size(); i++){
            if(checkLists.get(i).getTitle().equals(title)){
                return checkLists.get(i);
            }
        }
        return null;
    }
    public void openTicket(){
        for(int i = 0; i < checkLists.size(); i++){
            System.err.println(checkLists.get(i).getTitle());
            if(checkLists.get(i).getDetails() != null){
                System.err.println(checkLists.get(i).getDetails());
            }
        }
    }
    public String getColor() {
        return color;
    }
    public String getTitle() {
        return title;
    }
    public String getDetails() {
        return details;
    }
    public int getStartYear() {
        return startYear;
    }
    public int getStartMonth() {
        return startMonth;
    }
    public int getStartDay() {
        return startDay;
    }
    public int getStartTime() {
        return startTime;
    }
    public int getEndYear() {
        return endYear;
    }
    public int getEndMonth() {
        return endMonth;
    }
    public int getEndDay(){
        return endDay;
    }
    public int getEndTime() {
        return endTime;
    }
    public LinkedList getCheckLists(){
        return checkLists;
    }
}
