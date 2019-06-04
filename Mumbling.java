public class Accumul {
    
    public static String accum(String s) {
     // your code
     s = s.toLowerCase();
     String[] splitted = s.split("");
     String partString = "";
     String outputString = "";
     
     for(int i = 0; i < s.length(); i++)
     {
       partString = "";
       
       if ( i > 0)
         outputString += "-";
       
       for(int j = 0; j < i + 1; j++)
      {
        if (j == 0)
        {
          partString += "" + splitted[i].toUpperCase();
        }else
        {
          partString += "" + splitted[i];
        }
      }
      outputString += partString;
     }
     
     return outputString;
    }
}