package Lap2.controller;



import Common.Library;
import Lap2.common.Algorithmm;
import model.Element;
import view.Menu;

/**
 *
 * @author vothi
 */
public class Search extends Menu<String> {


    protected Library library;
    protected Algorithmm algorithm;
    protected int  size_arr;
    protected int[] arr;
    static String[] opsList = {"Search", "Exit"};

    public Search(Element element) {
        super("Search Menu", opsList);
        library = new Library();
        algorithm = new Algorithmm();
        size_arr= element.getSize_arr();
        arr = element.getArr();
    }

   

    public void execute(int n) {
        switch (n) {
            case 1: {
                search();
                break;
            }
            case 2:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }
    public void search() {
        final String[] mcSearch = {"Linear Search", "Binary Search", "Exit"};
        class SearchMenu extends Menu<String> {

            public SearchMenu() {
                super("Search Option", mcSearch);
            }
            @Override
            public synchronized void execute(int n) {
                library.display(arr);
                int value = library.getInt("\nEnter number to find: ", 1, 100);
                switch (n) {
                    case 1:
                    library.display(arr);
                    algorithm.linearSearch(arr, value);
                    break;
                       
                    case 2:
                    algorithm.bubbleSort(arr);
                    library.display(arr);                       
                    algorithm.binarySearch(arr, value);
                    break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }
        }
        SearchMenu sm = new SearchMenu();
        sm.run();
    }
  

}
