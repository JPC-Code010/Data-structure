
public class Array{
    public static void main (String[] arg){
      
        ///Array walking 
        //Forward
        int [] a = {2,4,6,8,10};

        for (int i= 0; i< a.length;i++){
             System.out.print(a[i] + " ");
        }
        
        System.out.println(" ");

        //Forward, using enhanced for
        for (int value:a){
            System.out.print(value + " ");
        }

        System.out.println(" ");
        
        //Backward
        for(int i = a.length-1; i>= 0 ;i--){
            System.out.print(a[i] + " ");

        }

    }
}