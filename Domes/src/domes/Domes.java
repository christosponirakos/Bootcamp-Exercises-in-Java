package domes;

import java.util.ArrayList;

/**@author emergon */
public class Domes {

    public static void main(String[] args) {
        int a = 10;
        int [] array = {2, 6, 10, 0};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        
        a = 75;
        array[1] = a;
        //what is the largest number in the array
        //System.out.println(array);
        int max = Math.max(array[0], Math.max(array[1], Math.max(array[2], array[3])));
        System.out.println("The max number is "+ max);
        
        double [] array2 = {43.2, 23.7, 12.9};
        int length = array2.length;
        System.out.println("Length of array:"+length);
        
        
        String [] names = {"Peter", "Jack", "Mary"};
        
        System.out.println("------------------ArrayList------------------------");
        ArrayList<String> listOfNames = new ArrayList();
        listOfNames.add("Nick");
        listOfNames.add(1, "Peter");
        listOfNames.add("Mary");
        listOfNames.add("Jack");
        listOfNames.add("Andy");
        
        int sizeOfList = listOfNames.size();
        System.out.println("Size of list is:"+sizeOfList);
        
        String name = "Jonathan";
        boolean find = listOfNames.contains(name);
        if(find == true){
            System.out.println("Jonathan exists");
        }else{
            listOfNames.add(name);
        }
        
        String nameInPosition3 = listOfNames.get(3);
        System.out.println("The name at index 3 is:"+nameInPosition3);
        
        String removedElement = listOfNames.remove(2);
        System.out.println("The element removed index 2 was:"+removedElement);
        
        if(!listOfNames.isEmpty()){
            listOfNames.clear();
        }
        //String name = listOfNames.get(0);
        //System.out.println("name in index 0 is :"+name);
        
       
    }

}
