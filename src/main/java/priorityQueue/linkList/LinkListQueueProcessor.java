package priorityQueue.linkList;

import linkedList.Link;

public class LinkListQueueProcessor implements LinkListQueue {
    private Link first;
    private Link last;
    private int size;
    public LinkListQueueProcessor(){
        first = null;
        last = null;
        size = 0;
    }
    public boolean isEmpty() { return first == null; }
    @Override
    public void add(int element){
        Link node = new Link(element, null, null);
        if (size == 0){
            first = node;
            last = node;
        }else {
            Link p = first;
            while (p.getData() > element){
                p = p.getNext();
                if (p==null) break;
            }
            if (p == null){
                last.setNext(node);
                node.setPrev(last);
                last = node;
            } else {
                node.setPrev(p.getPrev());
                node.setNext(p);
                if (p.getPrev() == null) first = node;
                else p.getPrev().setNext(node);
                p.setPrev(node);
            }
        }
        size++;
    }
    @Override
    public int remove() {
        if (isEmpty()) return 0;
        Link temp = first;
        first = first.getNext();
        if (first != null) first.setPrev(null);
        else last = null;
        size--;
        return temp.getData();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Link temp = first;
        while (temp != null) {
            int data = temp.getData();
            sb.append(data);
            if (temp!=last) sb.append(", ");
            temp = temp.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
