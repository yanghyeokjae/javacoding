package examp_array_copy;

public class ArrayCopyExample {
    static void main(String[] args){
        // 1. 예제
        String[] oldStrArray= {"java", "array", "copy"};
        String[] newstrArray= new String[5];

        System.arraycopy(oldStrArray, 0, newstrArray, 0, oldStrArray.length);

        for(int i=0; i< newstrArray.length; i++){
            System.out.print(newstrArray[i]);
            if(i< newstrArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }
}
