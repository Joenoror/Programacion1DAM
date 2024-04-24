import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExplicacionMapas {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        System.out.println("Si introduzco un elemento nuevo: " + map.put("Jose", 1.70));
        map.put("Antonio", 1.88);
        map.put("Luis", 1.10);
        map.put("Maria", 1.90);
        map.put("Pedro", 1.80);
        System.out.println("Si introduzco un elemento que ya existe: " + map.put("Pedro", 1.70));
        System.out.println(map);

        map.remove("Pedro");
        System.out.println(map);
//        map.clear();
//        System.out.println(map);
        System.out.println(map.get("Maria"));
        System.out.println(map.get("Ricardo"));

        System.out.println(map.containsKey("Maria"));
        System.out.println(map.containsValue(1.10));

        Set<String> keys = map.keySet();
        System.out.println(keys);


    }
}
