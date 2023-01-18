package CodingPractise;

public class RemoveDuplicatesfromArray {

    public static void main(String[] args) {

        //sorted array
        int x[]= {1,2,2,3,5,7,8,8,9};
        int temp1[]= new int[x.length];
        int j=0;

        for(int i=0;i<x.length-1;i++){
            if(x[i]!=x[i+1]){

                temp1[j]= x[i];
                j++;
            }
            temp1[j]=x[x.length-1];
        }

        for(int k=0;k<temp1.length;k++){

            System.out.print(temp1[k]+ " ");
        }

    }
}
