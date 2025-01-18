package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap();
        map.put("Name","Sumit");
        map.put("Address","Vastraur");
        map.put("Phone","+919601344335");

        System.out.println(map);

        map.put("Address","Maninagar");
        System.out.println(map);

        map.remove("Phone");
        System.out.println(map);

        for(String data :map.values()){
            System.out.println(data);
        }

        for(String data:map.keySet()){
            System.out.println(data);
        }

        for(Map.Entry<String,String> data : map.entrySet()){
            System.out.println("Key is : "+data.getKey());
            System.out.println("Value is :"+data.getValue());
        }

        System.out.println(map.get("Name"));

    }
}
