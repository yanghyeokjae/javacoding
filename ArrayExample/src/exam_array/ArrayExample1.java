package exam_array;

public class ArrayExample1 {
    static void main(String[] args){
        int[] numbers= {10, 20, 30};
        /*
        int[] numbers= nuw int[3];
        number[0]= 10;
        number[1]= 20;
        number[2]= 30;
         */

        System.out.println("number[0]= " + numbers[0]);
        System.out.println("number[1]= " + numbers[1]);
        System.out.println("number[2]= " + numbers[2]);
        System.out.println();

        String[] arrayString= new String[3];
        arrayString[0]= "java";
        arrayString[1]= "oracle";
        arrayString[2]= "springboot";

        //String[] arrayString= new String[]{"java ", "oracle", "springboot"};

        for(int i=0; i<3; i++) {
            System.out.println("arrayString=[" + i + "]= " + arrayString[i]);
        }
    }
}
