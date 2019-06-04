import java.util.*;
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    text = text.toLowerCase();
    
    ArrayList duplicates = new ArrayList();
    
    for (int i = 0; i < text.length(); i++)
    {
        for(int j = i+1; j<text.length(); j++)
        {
           if (text.charAt(i) == text.charAt(j))
           {
               if (!duplicates.contains(text.charAt(i)))
               {
                  duplicates.add(text.charAt(i));
               }
           }
        }    
    }
    return duplicates.size();
    
  }
}