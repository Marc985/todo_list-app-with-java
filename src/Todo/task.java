package Todo;

public class task {
    //COnnection to postgresql


String description;
String date;

    public task(String description, String date) {
        this.description = description;
        this.date = date;

    }

    @Override
    public String toString() {
        return "todo'" + description + '\'' +
                ",deadline'" + date + '\'';
    }


}
