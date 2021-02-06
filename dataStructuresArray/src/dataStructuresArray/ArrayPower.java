package dataStructuresArray;

import java.util.ArrayList;
import java.lang.Math;

public class ArrayPower {
	public ArrayList<Integer> toPower(int size, int power) {

        ArrayList<Integer> array = new ArrayList<>();
        
        int i;
        
        for (i = 0; i < size; i++)
        {
            int x = (int) Math.pow(i,power);
            System.out.println(x);
            array.add(x);
        }
        
        return array;

    }

}
