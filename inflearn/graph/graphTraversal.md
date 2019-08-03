# 순회(traversal)

- 그래프의 모든 노드들을 방문
- 두가지 방법
    + BFS (Breadth-First Search, 너비우선순회)
    + DFS (Depth-First Search, 깊이우선순회)
    

> BFS

- 동심원 형태로 탐색 (출발 노드로부터 인접한 노드부터 탐색) 
- 일반적으로 큐를 이용함
    1) 시작 노드 체크(방문했다).
    2) 큐에 넣는다.
    3) 반복문을 돌면서 큐를 돌면서 꺼낸 노드의 체크(방문)되지 않은 인접 노드를 체크하고 큐에 다시 넣는다.
    4) 같은 과정을 계속 반복(모든 노드를 순회할 때 까지)

- 주로 최단 경로 혹은 임의의 경로를 탐색하고자 할 때 이 알고리즘을 사용    
- BFS tree
    : 각 노드 v와 다른 노드로 가는 경로를 연결하는 에지들로 구성된 트리    
    : 그래프가 disconnected 거나 방향 그래프면 모든 노드가 방문되지 않을 수 있다.
    : 재귀적으로 동작하지 않는다.
    
    
> DFS

- 깊이 우선 탐색

1) 출발점 S를 선택
2) 현재 노드를 visited로 mark하고 인접 노드 중 unvisited 노드가 있으면 해당 노드 탐색
3) 2번 반복
4) unvisited의 이웃노드가 존재하지 않으면 이전 노드로 되돌아간다.
5) 2번 반복

```
DFS(G, V)
    visited[V] <- yes;
    for each node adjacent to x do
        if visited[x] = no then
            DFS(G, x);
    end
end
```

- stack or recursion
- DFS를 반복하여 모든 노드를 반복
- 그래프가 disconnected면 모든 노드를 탐색하지 못할 수 있음
