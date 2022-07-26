package section2.unitDataStructure.chapterTree;
import java.util.*;

public class TreeExample {
    private String value;
    private ArrayList<TreeExample> children;

    // Node 생성자(매개변수 없음)
    public TreeExample() {	//전달인자가 없을 경우의 생성자
        this.value = null;
        this.children = null;
    }

    // Node 생성자(매개변수 존재)
    public TreeExample(String data) {	//전달인자가 존재할 경우의 생성자
        this.value = data;
        this.children = null;
    }

    public void setValue(String data) {
        this.value = data;
    }

    // 현재 노드의 데이터 반환
    public String getValue() {
        return value;
    }

    // 자식 노드 추가
    public void addChildNode(TreeExample node) {
        if(children == null)
            children = new ArrayList<>();
        children.add(node);
    }

    // 자식노드 제거
    public void removeChildNode(TreeExample node) {
        if(children != null)
            children.remove(node);
    }

    // 자식 노드 리턴
    public ArrayList<TreeExample> getChildrenNode() {
        return children;
    }

    // 값 검색
    public boolean contains(String data) {      //재귀 사용
        if(value.equals(data))
            return true;

        if(children != null) {
            for(int i = 0; i < children.size(); i++) {
                return children.get(i).contains(data);
            }
        }
        return false;
    }
}
