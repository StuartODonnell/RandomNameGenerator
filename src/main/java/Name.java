import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static spark.Spark.get;

public class Name {

    private ArrayList<String> names;

    public Name() {
        this.names = new ArrayList<>();
        names.add("The Hound");
        names.add("The Mountain");
        names.add("Victarion");
        names.add("Mance Rayder");
        names.add("Hot Pie");
        names.add("Areo Hotah");
        names.add("Khal Jhaqo");
        names.add("Moqorro The Red Priest");
        names.add("Reek");
        names.add("Ramsay Bolton");
        names.add("Ser Arys Oakheart");
        names.add("Lady Stoneheart");
        names.add("Brienne of Tarth");
        names.add("Ser Davos Seaworth");
        names.add("Strong Belwas");
        names.add("Ser Barristan Selmy");
        names.add("Willem Darry");
        names.add("Jon Connington");
        names.add("Young Griff");
        names.add("Rhllor");
        names.add("Hodor");

    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String returnName() {
        Collections.shuffle(names);
        return names.get(0);

    }

    public String returnNamePair(){
        Collections.shuffle(names);
        String name1 = names.get(0);
        String name2 = names.get(1);
        return name1 + " and " + name2;

    }

//    public String returnNamePair() {
//        Collections.shuffle(names);
//        return Arrays.copyOfRange(this.names, 0, 1);
//    }
}

