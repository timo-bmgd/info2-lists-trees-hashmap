package TimoGraphTree;

import java.util.*;

public class HTWDirectedGraph {

   // private final List<Integer>[] edges;

    private List<Integer> visited;

    /*
    public HTWDirectedGraph(int n){
        edges = new List<>[n];
        for(int i = 0; i<n; i++){
            edges[i] = new LinkedList<Integer>();
        }
    }

*/

    public void addEdge(int source, int target){
        //edges[source].add(target);
    }
    /*

    //returns true if there is a path from src to get
    public boolean breadthFirstSearch(int src, int tgt){
        Objects.checkIndex(src,edges.length);
        Objects.checkIndex(tgt,edges.length);
        List<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(src);
        //visited.add(src);
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(current==tgt) return true;
            if(visited.contains(tgt)) continue;
            visited.add(current);
            queue.addAll(edges[current]);
        }
        return false;

    }

    public boolean DepthFirstSearch(int src, int tgt){
        if(edges[src].contains(tgt)) return true;
        List<Integer> visited = new ArrayList<>();
        for(ArrayList)
    }




    public boolean breadthFirstSearch(int src, int tgt){
        if(edges[src].contains(tgt)) return true;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> visited = new LinkedList<>();
        queue.add(src);
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(visited.contains(current))continue;
            if(edges[current].contains(tgt)) return true;
            visited.add(current);
            queue.addAll(edges[current]);
        }
        return false;
    }

    public boolean depthFirstSearch(int src, int tgt){
        visited = new ArrayList<>();
        return dfsRecursive(src,tgt);
    }
    public boolean dfsRecursive(int src, int tgt){
        if(src==tgt)return true;
        for(int child : edges[src]){
            if(visited.contains(child)) continue;
            visited.add(child);
            if(dfsRecursive(child, tgt)) return true;
        }
        return false;
    }

*/

}