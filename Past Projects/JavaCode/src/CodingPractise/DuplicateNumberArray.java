package CodingPractise;

public class DuplicateNumberArray {

    public static void main(String[] args) {

        int x[]= {2,3,4,5,4,6};

        for(int i=0;i<x.length;i++){

            for(int j=i+1;j<x.length;j++){

                if(x[i]==x[j]){

                    System.out.println(x[i]);
                }
            }
        }
    }
}
