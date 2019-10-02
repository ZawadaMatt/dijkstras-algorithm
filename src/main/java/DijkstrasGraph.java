import java.util.*;

public class DijkstrasGraph {
    static Map<String, Map<String, Integer>> graph = new HashMap<String, Map<String, Integer>>();
    Map<String, Integer> costs = new HashMap<String, Integer>();
    static Map<String, String> parents = new HashMap<String, String>();

    public void setGraph() {
        graph.put("Start", new HashMap<String, Integer>());
        graph.get("Start").put("A", 5);
        graph.get("Start").put("B", 2);

        graph.put("A", new HashMap<String, Integer>());
        graph.get("A").put("D", 2);
        graph.get("A").put("C", 4);

        graph.put("B", new HashMap<String, Integer>());
        graph.get("B").put("D", 7);
        graph.get("B").put("A", 8);

        graph.put("C", new HashMap<String, Integer>());
        graph.get("C").put("D", 6);
        graph.get("C").put("Finish", 3);

        graph.put("D", new HashMap<String, Integer>());
        graph.get("D").put("Finish", 1);

        System.out.println(graph.get("Start").keySet());
    }

}
