package CodingPractise;

import java.util.ArrayList;

public class PrintAllSubstring {

    public static void main(String[] args) {

        String s= "swarajya";

        ArrayList<String> a= new ArrayList<String>();

        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<=s.length();j++){
                String temp= "";
                temp= temp.concat(s.substring(i,j));
                a.add(temp);
            }
        }
        System.out.println(a);
    }
}
