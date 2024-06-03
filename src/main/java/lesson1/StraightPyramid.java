package lesson1;

public class StraightPyramid {
    public static void main(String[] args) {
        StraightPyramid straightPyramid = new StraightPyramid();
        straightPyramid.pyramid(9);
        straightPyramid.reversePyramid(9);

    }


    public void pyramid(int rows){
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public void reversePyramid(int rows){
        for (int i = 9; i >0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

}
