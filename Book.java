package INTERFACE;

interface BookAttribut { //interface Superclass
    
    void Title();
    void Halaman();
    void Cover();
    void DaftarPustaka();
}

class BookA implements BookAttribut { //implements Subclass

    public void Title(){
        System.out.println(" ");
    }
    public void Halaman(){
        System.out.println(" ");
    }
    public void Cover(){
        System.out.println(" ");
    }
    public void DaftarPustaka(){

        int A[] = new int[20];
        double phi = 3.14;
        double time;

        for(int i = 0;i <= A.length;i++){
            int array = i;
            

            if(array == 3){
                System.out.println("Num 3");
            }else{
                time = phi * array;
                System.out.println(time);
                
            }
        }
    }

}

public class Book {

    public static void main(String[] args) {

        BookA obj = new BookA();
        obj.Cover();
        obj.DaftarPustaka();
        
    }
    
}







