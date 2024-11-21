import java.util.LinkedList;
import java.util.*;

public class HashCodeCollision
{
    public static void main (String[] args)
    {
        int size = 20;
        LinkedList[] hashTable = new LinkedList[size];


        for (int i = 0; i < hashTable.length; i++)
        {
            hashTable[i] = new LinkedList();
        }

        //for loop for random ints from 0 - 100
        for (int i = 0; i < 50; i++)
        {
            int randNum = (int)(Math.random()*100);
            hashTable [randNum % size].add(randNum);
        }

        for (int i = 0; i < size; i++){
            System.out.println("Bucket "+i+": "+hashTable[i]);
        }
    }
}
