package com.technocart.ds.datastructures.implementation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UndirectedGraph {
    private Map<String, Set<String>> adj;

    UndirectedGraph(int v) {
        adj = new HashMap<>();
    }

    void addEdge(String source, String dest) {
        Set<String> target = adj.get(source) != null ? adj.get(source) : new HashSet<>();
        target.add(dest);
        adj.put(source, target);
        target = adj.get(dest) != null ? adj.get(dest) : new HashSet<>();
        target.add(source);
        adj.put(dest, target);
    }

    void printGraph()
    {
        System.out.println(adj);
    }

    public static void main(String[] args) {
        UndirectedGraph undirectedGraph = new UndirectedGraph(10);
        undirectedGraph.addEdge("A","B");
        undirectedGraph.addEdge("C", "D");
        undirectedGraph.addEdge("D", "A");
        undirectedGraph.addEdge("P", "B");
        undirectedGraph.addEdge("Q", "C");
        undirectedGraph.printGraph();

    }

}
