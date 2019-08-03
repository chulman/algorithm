# tree
 
- 계층 구조 표현
- 노드와 노드를 연결하는 링크들로 구성
- root: 가장 상위 노드
- link, edge, branch : 노드를 연결하는 선 
- 부모 자식 관계 , 형제 관계, 조상 자손 관계
- 리프 노드 : 자식이 없는 노드
- 서브 트리 : 어떤 한노드와 그노드의 자손으로 이루어진 트리


# binary tree

- 각 노드가 최대 2개의 노드를 갖는 트리
- ex) expression tree, huffman code

- full binary tree : 모든 레벨에 노드들이 구성된 트리
    + 높이가 h이면 2^h - 1개의 노
- complete binary tree : 마지막 레벨의 노드들 의 오른쪽 노드가 비어있을 수 있음


# expression

- root 주소의 노드는 따로 저장
- linked list : 왼쪽 자식(left), 부모 노드(p), 오른쪽 노드(right) 
    + ---left---data---p---right---
    