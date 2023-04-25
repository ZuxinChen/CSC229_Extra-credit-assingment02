/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
/*
    Develop an algorithm (Java or C++) that can find the ratio of the sum 
    of the largest two numbers divided by the sum of the smallest two numbers 
    in an array. The solution should be linear or better. 

    For example:
    If the input is 
    int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};

    The ratio is (450+321) / (1+1) = 385.5. 
*/
public class RatioSum {
    public static void main(String[] args) {
        int[] a={3,11,12,454,1,44,5,667,23,6,8,456,321,2,5};
        int size = a.length;
        
        sortArray(a,size);
  
        double sum = (double)(a[size-1]+a[size-2])/(a[0]+a[1]);
        System.out.println("The ratio is "
                + "("+ a[size-1] +"+"+ a[size-2] +")"+
                 "/("+ a[0]+ "+" +a[1]+ ") = " + sum);
        
    }
    
    public static int[] sortArray(int[] array , int size){
        int temp;
        for(int outer = size-1; outer>0;outer--){
            for(int inner = 0; inner < outer; inner++){
                if(array[inner]>array[inner+1]){
                    temp = array[inner];
                    array[inner] = array[inner+1];
                    array[inner+1]= temp;
                }
            }
        }
        return array;
    }
}
/*
    The ratio is (667+456)/(1+2) = 374.3333333333333
*/
