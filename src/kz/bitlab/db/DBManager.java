package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Footballer> footballers = new ArrayList<>();

    static {
        footballers.add(new Footballer("Raheem", "Sterling", 350000, "Chelsea", 45000000));
        footballers.add(new Footballer("Erling", "Haaland", 400000, "Manchester City", 60000000));
        footballers.add(new Footballer("Kalidou", "Koulibaly", 200000, "Chelsea", 40000000));
        footballers.add(new Footballer("Pereira", "Raphinha", 180000, "Barcelona", 70000000));
        footballers.add(new Footballer("Gabriel", "Jesus", 200000, "Arsenal", 54000000));
        footballers.add(new Footballer("Darwin", "Nunez", 190000, "Liverpool", 96000000));
        footballers.add(new Footballer("Sadio", "Mane", 400000, "Bayern Munchen", 70000000));
        footballers.add(new Footballer("Aurelien", "Tchouameni", 200000, "Real Madrid", 100000000));
        footballers.add(new Footballer("Paul", "Pogba", 400000, "Juventus", 50000000));
        footballers.add(new Footballer("Phelipe", "Coutinho", 150000, "Aston Villa", 20000000));
    }

    public static void addFootballer(Footballer footballer){
        footballers.add(footballer);
    }

    public static ArrayList<Footballer> getAllFootballers(){
        return footballers;
    }

}
