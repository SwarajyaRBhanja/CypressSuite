package CodingPractise;

public class SquareOfanSortedArray {

    public static void main(String[] args) {

        int x[]= {-9,-4,-2,1,3,5};
        int squared_sorted[]= new int[x.length];

        for(int i=0;i<x.length;i++){
            squared_sorted[i]= x[i]*x[i];
        }
        int min;
        for(int i=0;i<squared_sorted.length;i++){
            min= squared_sorted[i];
            for(int j=i+1;j<squared_sorted.length;j++){

                if(squared_sorted[j]<min){
                    min= squared_sorted[j];
                    squared_sorted[j]= squared_sorted[i];
                    squared_sorted[i]= min;

                }squared_sorted[i]= squared_sorted[i];
            }
        }
        for(int i=0;i<squared_sorted.length;i++){

            System.out.print(squared_sorted[i]+ " ");
        }
    }
}
