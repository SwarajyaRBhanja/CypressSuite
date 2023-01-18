package Prep;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ust {

    public static void main(String[] args) {

        String name= "swarajya ranjan bhanja";
        char []eachletter= name.replaceAll(" ","").toCharArray();
        HashMap<Character, Integer> m= new HashMap<Character, Integer>();

        for(char c:eachletter){

            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else {
                m.put(c,1);
            }
        }
        System.out.println(m);
        Set<Map.Entry<Character, Integer>> s= m.entrySet();
        for(Map.Entry<Character, Integer> t:s){

            if(t.getValue()>=2){
                System.out.println(t.getKey()+": "+t.getValue());
            }
        }
    }

}
