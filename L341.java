 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    Stack<NestedInteger> s = new Stack<NestedInteger>();
    public NestedIterator(List<NestedInteger> nestedList) {
        for(int i = nestedList.size() -1; i >= 0;i--){
            s.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return s.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!s.empty()){
            NestedInteger n = s.peek();
            if(n.isInteger()) return true;
            s.pop();
            for(int i = n.getList().size() - 1;i >= 0;i--){
                s.push(n.getList().get(i));
            }
        }
        return false;
    }
}

