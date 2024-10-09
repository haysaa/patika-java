public class Main {
    public static void main(String[] args) {
        MyList <Integer> list =new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List has "+list.size()+" elements");
        System.out.println("List has  "+list.getCapacity()+" capacity");
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println("List has "+list.size()+" elements");
        System.out.println("List has  "+list.getCapacity()+" capacity");
        list.remove(2);
        System.out.println("List has "+list.size()+" elements");
        list.get(2);
        System.out.println("List has "+list.get(3)+" index");
        MyList <Integer> list2 =new MyList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(2);
        System.out.println("Last index is "+list2.lastIndexOf(2));
       list.toArray();
    }
}
