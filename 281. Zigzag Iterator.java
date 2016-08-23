public class ZigzagIterator {
    Queue<Iterator> q;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        q = new LinkedList<>();
        if(!v1.isEmpty()) q.add(v1.iterator());
        if(!v2.isEmpty()) q.add(v2.iterator());
    }

    public int next() {
        Iterator i = q.poll();
        int res = (int)(i.next());
        if(i.hasNext()){
            q.add(i);
        }
        return res;
    }

    public boolean hasNext() {
        return q.peek()!=null;
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
