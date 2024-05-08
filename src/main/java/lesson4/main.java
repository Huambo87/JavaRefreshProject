package lesson4;

import java.util.List;

import static lesson4.Lesson4Practice.square;

public class main {
    public static void main(String[] args) {
        ArrayExamples arrayExamples = new ArrayExamples();
//        arrayExamples.stringsArray();
//        arrayExamples.integerArray();
//        arrayExamples.stringsArrayWithSize();
//        arrayExamples.arrayListExample();
//        arrayExamples.arrayListSorting();
//        arrayExamples.arrayListReverseSorting();
//        arrayExamples.hashMapExample();
        arrayExamples.hashSetExample();


        Lesson4Assignment lesson4Assignment = new Lesson4Assignment();
//        String myDay = lesson3Assignment.getDay(2);
//        String getToy = lesson4Assignment.getToyById(56);
//            System.out.println(getToy);
        lesson4Assignment.removeDuplicates();

        Lesson4Practice lesson4Practice = new Lesson4Practice();
        boolean has22 = lesson4Practice.has22(new Integer[] {4, 2, 2, 7});
        System.out.println(has22);

        boolean lucky = lesson4Practice.lucky13(new Integer[] {0, 7, 6});
        System.out.println(lucky);

        int maxTriple = lesson4Practice.maxTriple(new Integer[] {500, 10, 3});
        System.out.println(maxTriple);

        boolean front9 = lesson4Practice.front9(new Integer[] {1, 3, 8, 7, 9, 9});
        System.out.println(front9);



        List<Integer> numbers = List.of(7, 2, 3); 
        List<Integer> squaredNumbers = square(numbers);
        System.out.println(squaredNumbers);

    }
}
