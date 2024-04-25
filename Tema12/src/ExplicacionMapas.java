import java.util.*;

public class ExplicacionMapas {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        System.out.println("Si introduzco un elemento nuevo: " + map.put("Jose", 1.70));
        map.put("Antonio", 1.88);
        map.put("Luis", 1.10);
        map.put("Maria", 1.90);
        map.put("Pedro", 1.80);
        map.put("Ricardo", 1.90);
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

        Collection<Double> estaturas = map.values();
        System.out.println(estaturas);

        Set<Map.Entry<String, Double>> entrySet = map.entrySet();
        System.out.println(entrySet);
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map);
//        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, Double> entry = iterator.next();
//            if(entry.getValue() >= 1.60){
//                iterator.remove();
//            }
//        }
//        System.out.println(map);
//        Iterator<Double> iteratorValues = estaturas.iterator();
//        while (iteratorValues.hasNext()) {
//            Double value = iteratorValues.next();
//            if(value>= 1.60){
//                iteratorValues.remove();
//            }
//        }
//        System.out.println(map);

        TreeMap<String, Double> treeMap = new TreeMap<>(map);
        System.out.println(treeMap);


    }
}
