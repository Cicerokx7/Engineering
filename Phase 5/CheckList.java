public class CheckList {
    boolean checked;
    String title;
    String details;
    public CheckList(String title, String details){
        checked = false;
        this.title = title;
        this.details = details;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public boolean checked(){
        return checked;
    }
    public String getTitle() {
        return title;
    }
    public String getDetails() {
        return details;
    }
}
