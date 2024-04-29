package TimoGraphTree;

import java.util.*;

public class HTWUndirectedGraph {
    private Map<Integer,Integer>[] edges;
    //          key     weight

    public HTWUndirectedGraph(int size){
        edges = new HashMap[size];
    }

    public void addVertex(int src,int tgt, int wgt){
        edges[src].put(tgt,wgt);
    }

    public boolean breadthFirstSearch(int src, int tgt){
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> visited = new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(visited.contains(current)) continue;
            if(edges[current].containsKey(current))return true;
            visited.add(current);
            queue.addAll(edges[current].keySet());
        }
        return false;
    }

    public boolean depthFirstSearch(int src, int tgt){
        return false;
    }
}
