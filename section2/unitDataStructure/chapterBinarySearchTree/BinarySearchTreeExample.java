package section2.unitDataStructure.chapterBinarySearchTree;

import java.util.*;

public class BinarySearchTreeExample {
    public static class Node {
        private int data;
        private Node left;      // 노드를 왼쪽에 저장
        private Node right;     // 노드를 오른쪽에 저장

        // 생성자
        public Node(int data) {
            this.setData(data);
            setLeft(null);
            setRight(null);
        }

        public int getData() {
            return data;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


    //이진 탐색 트리 클래스
    public static class binarySearchTree {
        public Node root;

        // 이진 탐색 트리 생성
        public binarySearchTree(){
            // 비어있는 이진 탐색트리
            root = null;        // root 초기화
        }

        // tree에 value추가
        public void insert(int data) {
            // 왼쪽, 오른쪽 자식 노드가 null,  data 값이 저장된 새 노드 생성
            Node newNode = new Node(data);
            // 루트 노드가 없을때 (트리가 비어있는 상태일 때)
            if (root == null) {
                root = newNode;
                return;
            }
            if(root.data == data)
                return;   //중복일때 정지

            Node currentNode = root;
            Node parentNode = null;

            while (true) {
                parentNode = currentNode;

                // 해당 노드보다 작을 경우
                if (data < currentNode.getData()) {
                    currentNode = currentNode.getLeft();
                    if (currentNode == null) {
                        parentNode.setLeft(newNode);
                        return;
                    }else if(currentNode.data == newNode.data) return;
                } else { // 해당 노드보다 클 경우
                    currentNode = currentNode.getRight();
                    if (currentNode == null) {
                        parentNode.setRight(newNode);
                        return;
                    }else if(currentNode.data == newNode.data) return;
                }
            }
        }

        // tree에서 value 탐색
        public boolean contains(int data) {
            Node currentNode = root;
            while (currentNode != null) {
                // 찾는 value가 노드의 value와 일치시
                if (currentNode.data == data) {
                    return true;        // true 리턴
                }

                if (currentNode.data > data) {
                    // 찾는 value가 노드의 value 보다 작다면
                    currentNode = currentNode.left;     // 현재 노드를 left로 변경후 다시 반복합
                }else {
                    // 찾는 value가 노드의 value 보다 크다면
                    currentNode = currentNode.right;    // 현재 노드를 right로 변경후 다시 반복
                }
            }
            return false;
        }

        // 트리 순회
        // 함수를 매개변수로 받아 콜백 함수에 값을 적용시킨 것을 순회

        // 이진 탐색 트리를 전위 순회 메서드
        public ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list) {
            if (root != null) {
                list.add(root.getData());
                preorderTree(root.getLeft(), depth + 1, list);
                preorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        // 중위 순회
        public ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list) {
            if(root != null) {
                inorderTree(root.getLeft(), depth + 1, list);
                list.add(root.getData());
                inorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        // 후위 순회
        public ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list) {
            if (root != null) {
                postorderTree(root.getLeft(), depth + 1, list);
                postorderTree(root.getRight(), depth + 1, list);
                list.add(root.getData());
            }
            return list;
        }
    }
}
