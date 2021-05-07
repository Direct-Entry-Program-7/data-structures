import ds.DynamicArray;

import java.util.ArrayList;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(10);
        da.remove(0);
        da.print();
        System.out.println(da.empty());
    }
}
