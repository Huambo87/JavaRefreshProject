package lesson4;

import java.util.*;

public class ArrayExamples {

    public void stringsArray() {
        String[] buttons = {"Ok", "Cancel", "Login", "Signup"};

//        buttons[2] = "Exit";

        int stringsArrayLength = buttons.length;
        System.out.println(stringsArrayLength);
        System.out.println(buttons[2]);

//        for (int i = 0; i <= buttons.length -1; i++){
//            System.out.println(buttons[i]);
//        }

        for (String button : buttons) {

            System.out.println(button);
        }
    }

    public void stringsArrayWithSize() {
        String[] array = new String[5];
        array[0] = "Ok";
        array[1] = "Cancel";
        array[2] = "Login";
        array[03] = "Signup";

        System.out.println("Array length: " + array.length);
    }

    public void integerArray() {
        int[] ids = {12, 3, 5, 8, 11, 13};
        int integerArrayLength = ids.length;
        System.out.println(integerArrayLength);
        System.out.println(ids[3]);
    }

    public void arrayListExample() {

        ArrayList<String> buttons = new ArrayList<>();
        buttons.add("OK");
        buttons.add("Cancel");
        buttons.add("Signup");
        buttons.add("Login");
        buttons.add("Submit");
        buttons.add("Exit");
        buttons.add("Fuck off");

        System.out.println(buttons);

        for (String button : buttons) {
            System.out.println(button);
        }

        System.out.println(buttons.size());
        buttons.remove("Fuck off");

        for (String button : buttons) {
            System.out.println(button);
        }

        System.out.println("");
//        buttons.clear();
//        System.out.println(buttons.size());
        System.out.println(buttons.get(3));
    }

    public void arrayListSorting() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(-99);
        arrayList.add(345);
        arrayList.add(99);
        arrayList.add(7);

        Collections.sort(arrayList);

        for (Integer i: arrayList){
            System.out.println(i);
        }
        System.out.println("");
    }

    public void arrayListReverseSorting() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(1);
        arrayList.add(15);
        arrayList.add(-99);
        arrayList.add(345);
        arrayList.add(99);
        arrayList.add(7);

        Collections.sort(arrayList, Collections.reverseOrder());

        for (Integer i: arrayList){
            System.out.println(i);
        }
    }

    public void hashMapExample(){

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("John", "Toronto");
        hashMap.put("Peter", "New York");
        hashMap.put("Ivan", "Moscow");
        hashMap.put("Zhang", "Beijing");

        System.out.println(hashMap);

        System.out.println(hashMap.get("Zhang"));

        hashMap.remove("Ivan");
        System.out.println(hashMap.size());
        System.out.println(hashMap);

        for (String key : hashMap.keySet()) {
            System.out.println(key + " = " + hashMap.get(key));
        }

    }

    public void hashSetExample(){

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Moshe");
        hashSet.add("John");
        hashSet.add("Kate");
        hashSet.add("Moshe");
        hashSet.add("Tim");

        System.out.println(hashSet);

        for (String hash: hashSet){
            System.out.println(hash);
        }

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println(list);



    }

}
