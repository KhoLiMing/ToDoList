package sg.edu.rp.c346.todolist;

public class Date {
    String name;
    String date;

    public Date(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AndroidVersion{" +
                name + ": "+'\'' +
                date + '\''+
                '}';
    }
}

