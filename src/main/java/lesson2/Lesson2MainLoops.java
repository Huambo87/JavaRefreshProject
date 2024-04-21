package lesson2;

public class Lesson2MainLoops {
    public static void main(String[] args) {
        Lesson2MainLoops lesson2MainLoops = new Lesson2MainLoops();
//        lesson2MainLoops.countNumbers();
        lesson2MainLoops.numbersTree(9);
        lesson2MainLoops.reversePyramid(9);
        lesson2MainLoops.nineStars();

    }

//    public void countNumbers(int i) {
//
////        System.out.println(i);
////        System.out.println(i + 1);
////        System.out.println(i + 2);
//
//        while (i <= 10) {
//            System.out.println(i);
//            i = i + 1;
//        }
//    }

//    public void countNumbers() {
//
//        for (int i = 1; i <=20; i++) {
//            System.out.println(i);
//        }
//    }

    public void numbersTree(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public void reversePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void nineStars() {

        for (int i = 9; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}

