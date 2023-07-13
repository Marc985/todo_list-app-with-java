package Todo;

import java.util.Scanner;

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
        return "\ntodo:" + description + '\'' +
                ",deadline:" + date + '\'';
    }





}
