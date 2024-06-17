import java.util.Arrays;

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
       
        System.out.println(" ");
        //Array Filling
        int[] b = new int[10];

        for(int i= 0 ; i<b.length ; i++){
            b[i] = 9 ;
            System.out.print(b[i] + " ");

        }
        System.out.println(" ");

        //Java Function
        
        Arrays.fill(b,9);
        for (int value: b){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        
        //Array Copy : Solution
        //Original
        int[] c = {1,2,3};
        int[] d ;

        d = new int[c.length];
/*/
        for(int i= 0 ; i< c.length ; i++ ){
            d[i] = c[i];

        }
/*/ 
        //Java Function
        d = Arrays.copyOf(c,c.length);
 
        System.out.println("Original arrays");
        for(int value:c){
            System.out.print(value + " ");
        }
        System.out.println(" ");
        System.out.println("Copy arrays");
        for(int value:d){
            System.out.print(value + " ");

        }
        System.out.println(" ");

        //Array Comparing: Solution
        int[] e = {1,2,3,4};
        int[] f = {1,2,3,4,5};
/*/ 
        boolean equal = true;

        if (e.length != f.length){
            equal = false;
        }
        else{
            for(int i = 0 ;i<e.length ;i++){
                if(e[i] != f[i]){
                    equal = false;
                    break;

                }
            }
        }

       if(equal){
        System.out.println("Arrays are equal");
       }
       else{
        System.out.println("Arrays are not equal");
       }

       
       //Java Function

       if(Arrays.equals(e, f)){
        System.out.println("Arrays are equal");
       }
       else{
        System.out.println("Arrays are not equal");
       }
/*/
       //Array Max-Min and Average
       int[] g = {1,2,3};
/* /
       //Max
       int max = g[0];
       for (int i = 1 ;i < g.length ;i++){
        if(max < g[i]){
            max = g[i];
        }
       }
       System.out.println("Max = "+ max);

       //Min
       int min = g[0];//1
       for (int i = 1 ;i < g.length ;i++){
        if(min > g[i]){
            min = g[i];
        }
       }
       System.out.println("Min = "+ min);

       //Average
       double avg = 0.0;
       for(int value:g){
        avg += value;

       }
       avg = avg / g.length;
       System.out.println("Average = "+ avg);
       
/*/ 
       //Array 2D
       //implicit
       int[] [] score = new int[3] [2];

       //explicit
       int[] [] scores ={
        {30,20},
        {50,60},
        {60,20}

       };

       //2D Array Walk
       for(int r = 0; r<scores.length ;r++){
        System.out.print(scores[r] [0]+ " ");
        System.out.print(scores[r] [1]);
        System.out.println(" ");

       }

       //Or use

       //for each row
       for(int r = 0 ; r<scores.length ;r++){
           //for each column
           for(int y = 0 ;y<scores[0].length ;y++){
            System.out.print(scores[r] [y]+ " ");
            
           }
       }
       







    



    }
}