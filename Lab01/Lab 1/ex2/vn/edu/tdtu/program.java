package vn.edu.tdtu;
import vn.edu.tdtu.ArrayOutput;
import vn.edu.tdtu.ArrayHandler;
public class program {
    public static void main(String[] args){

        int[] a = {2, 7, 3, 78, 34, 0, 2};
        int[] b = {3, 34, 44, 49, 53, 2, 23};

        ArrayOutput.print(a); //in mang a, b
        ArrayOutput.print(b);

        int[] c = ArrayHandler.merge(a, b); //gop 2 mang a, b vao mang c
        ArrayOutput.print(c);//in mang c da duoc gop

        ArrayHandler.sort(c); //sap xep vao mang c
        ArrayOutput.print(c);//in mang c sau khi sap xep

        ArrayOutput.write(c, "output.txt");//truyen du lieu mang vao file output.txt
    }
}
