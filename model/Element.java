package Lap2.model;

import java.util.Arrays;

public class Element {
    private int size_arr;//kich co mang
    private int[] arr;//mang
    
    public Element(int size_arr, int[] arr) {
        this.size_arr = size_arr;
        this.arr = arr;
    }
    public int getSize_arr() {
        return size_arr;
    }
    public void setSize_arr(int size_arr) {
        this.size_arr = size_arr;
    }
    public int[] getArr() {
        return arr;
    }
    public void setArr(int[] arr) {
        this.arr = arr;
    }
    

}
