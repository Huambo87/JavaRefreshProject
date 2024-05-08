package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Lesson4Assignment {

    public String getDay(int day){
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String myDay = days[day -1];

        return myDay;
    }

    public String getToyById(int id){

        HashMap<Integer, String> getToy = new HashMap<Integer, String>();

        getToy.put(12, "Batmobile");
        getToy.put(45, "Light Saber");
        getToy.put(6, "Wonder Woman");
        getToy.put(201, "Hello Kitty Bag");
        getToy.put(56, "QA Analyst Doll");

        String resultByDefault = "No Such Toy in Catalog";
        String result = getToy.get(id);

        if (id != 12 && id != 45 && id != 6 && id != 201 && id !=56) {
            return resultByDefault;
        }

        else {
            return result;
        }
    }

    public void removeDuplicates(){

        ArrayList<String> names = new ArrayList<>();

        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

        System.out.println("List before sorting: " +names);

        Collections.sort(names);

        System.out.println("List after sorting: " + names);

        HashSet<String> namesSet = new HashSet<>(names);

        Collections.sort(names);

        System.out.println("List after removing duplicates: " + namesSet);

    }

}
