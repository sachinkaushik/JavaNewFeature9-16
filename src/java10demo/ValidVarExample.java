package java10demo;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidVarExample {
    public static void main(String[] args) {
        //1. With initialization variable
        var j=9;

        //2. Can use in for each loop
        var dataList = new ArrayList<String>();
        for(var data: dataList){
            System.out.println(data);
        }

        //3. Can use in for loop as variable
        for (var i=0; i<dataList.size();i++){
            System.out.println(dataList.get(i));
        }


        var map = new HashMap<String, Integer>();

        for(var entry: map.entrySet()){

        }
    }
}
