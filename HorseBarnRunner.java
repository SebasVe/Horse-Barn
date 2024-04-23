/*
 * Activity 3.7.3
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HorseBarnRunner
{
  public static void main(String[] args)
  {
    /* your code here */
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> barnSpaces = barn.getSpaces();
    for (Horse h: barnSpaces)
    {
        System.out.println(h.getName());
    }
    int i = 0;
    while (i < barnSpaces.size())    
    {
        Horse h = barnSpaces.get(i);
        if (h.getName().equals("Patches")) 
        {
            System.out.println("Bye bye " +  barnSpaces.remove(i));
            i--; // Adjust the loop counter after removal
        }
        else if (h.getName().equals("Lady")) 
        {
            System.out.println("Bye bye " + barnSpaces.remove(i));
            i--;
        }
        else 
        {
            i++;
        }
    }
    System.out.println("Remaining horses in the barn:");
    for (Horse h : barnSpaces) 
    {
        System.out.println(h.getName());
    }


  }
} 