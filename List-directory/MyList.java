public  class MyList<T> {
    private T[] mylist;
   private int capacity,size;


    MyList() {
        mylist = (T[]) new Object[10];
        capacity = 10;
    }

    MyList(int capacity) {
        this.capacity = capacity;
        mylist = (T[]) new Object[capacity];
    }

    public void add(T data) {
    if (size>=capacity) {
       resize();
    }

    mylist[size++] = data;
    }

    public void resize() {
        capacity *= 2;
        T[] tempArray = (T[]) new Object[capacity];
        for (int i = 0; i < mylist.length; i++) {
            tempArray[i] = mylist[i];
        }
        mylist = tempArray;
    }
    public int size() {
    return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public T get(int index)
    {
        if (index<0 || index>=size){
            return null;
        }

        return mylist[index];
    }

    public void remove(int index)
    {
        if (index<0 || index>=size){
            System.out.println("invalid index");
        }
        for(int i=index; i<size-1;i++){
            mylist[i]=mylist[i+1];
        }
    }
    public T set(int index,T data ){
        if (index<0 || index>=size){
            return null;
        }
        mylist[index]=data;
        return mylist[index];
    }

    public  String toString() {
    return"["+mylist[0]+","+mylist[1]+"]";
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (mylist[i].equals(data)) {
                return i;
            }

        }
        return -1;
   }
public int lastIndexOf(T data) {
        for(int i=size-1;i>=0;i--){
            if (mylist[i].equals(data)) {
                return i;
            }
        }
        return -1;
}
public boolean isEmpty(){
        if (size==0){
            return true;
        }

    return false;
}
public int[] toArray(){
       int[] newarray=new int[size];
        for(int i=0;i<size;i++){
            newarray[i]= (int) mylist[i];
        }
    return newarray;
    }

        public void clear() {
            for (int i = 0 ; i<size;i++ ) {
                 remove(i);
            }
            this.capacity =10;
            this.size = 0;
            System.out.println("list cleared"+mylist.length);
        }
boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (mylist[i].equals(data)) {
                return true;
            }

        } return false;
}
    MyList<T> sublist(int start,int finish){
        if (start < 0 || finish > mylist.length || start >= finish) {
            throw new IndexOutOfBoundsException("Invalid start or finish indices.");
        }
        MyList<T> sublist = new MyList<>(); // Create a new MyList for the sublist
        for (int i = start; i < finish; i++) {
            sublist.add(mylist[i]); // Assuming you have an add method
        }
        return sublist;
    }
    }
