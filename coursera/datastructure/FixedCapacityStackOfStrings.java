package datastructure;

/**
 * 고려해야 할 사항
 *
 * 1. null 허용여부
 * 2. Overflow(resizing)
 * 3. Underflow(throw exception)
 * 4. loitering - 더이상 사용되지 않는 객체의 참조를 내부에 남겨둠.
 */
public class FixedCapacityStackOfStrings {
    private String[] s;
    private int N = 0;


    public FixedCapacityStackOfStrings(int capacity){
        s = new String[capacity];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void push(String item){
        s[N++] = item;
    }

    public String pop(){
        return s[--N];
    }
}
