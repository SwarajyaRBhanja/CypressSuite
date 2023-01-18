package CodingPractise;

public class SumofDigitsinString {

    public static void main(String[] args) {

        String x= "rhhfbfef50ger45gnn3f";

        char x1[]= x.toCharArray();

        for(int i=0;i<x1.length;i++){

            String m="";
            if(Character.isDigit(x1[i])){

                m.concat(String.valueOf(x1[i]));
            }else
            i= i+1;
            System.out.println(Integer.valueOf(m));
        }

    }
}
