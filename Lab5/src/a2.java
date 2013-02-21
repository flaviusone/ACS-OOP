import java.util.*;

class Node{
  Object value;
  Node next;
  public Node (Object x) {
      value=x;
      next=null;
  }

}

class SLinkedList extends AbstractList{
    public Node first = new Node(null);

    public int size(){
        Node iter = first;
        int i=0;
        while(iter.next != null){
            i++;
            iter = iter.next;
        }
        return i;
    };

    public Object get(int index){
        if(first.next == null)
            return null;

        Node iter = first.next;
        for(int i=0; i< index; i++)
            iter = iter.next;
        return iter.value;
    }

    public boolean add(Object o){
        Node iter= first;
        Node added= new Node(o);
        while(iter.next != null){
                iter = iter.next;
        }
        iter.next = added;
        return true;
    }

    public Object set(int index, Object o){
        if(first.next == null)
            return null;

        Node iter = first.next;

        for(int i=0; i< index; i++)
            iter = iter.next;

        Object extracted;
        extracted = get(index);

        iter.value = o;

        return extracted;
    }
}

class main{
    public static void main (String a[]) {
        String d[] ={"3","1","4","2","3","2","4","1"};
        List lst = new SLinkedList();
        for (int i=0;i<d.length;i++)
            lst.add (d[i]);
        System.out.println(lst.size());
        System.out.println(lst);
        Collections.sort(lst);
        for (Iterator i= lst.iterator(); i.hasNext(); )
            System.out.print ( i.next()+ " ");
  }
}