package Lap2.view;

import Common.Library;
import Lap2.controller.Search;
import model.Element;



public class Main {
    public static void main(String[] args) {
    Library library = new Library();
    Element element = new Element();
    element.setSize_arr(library.getInt("Enter number of array", 1, 100));
    element.setArr(library.createArray(element.size_arr));
    Search search = new Search(element);
    search.run(); 
    }
      
}
