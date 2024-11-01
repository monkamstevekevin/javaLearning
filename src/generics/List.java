package generics;

public class List {
    private int[] items =  new int[10];
    private int count;



    public void add(int item ){
        if(count == items.length){
            int[] newItems = new int[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[count] = item;
        count++;
    }
    public int get (int index){
        return items[index];   // not validating the index;
    }
}
