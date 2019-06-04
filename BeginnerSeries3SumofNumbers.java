public class Sum
  {
     public int GetSum(int a, int b)
     {
     if (b < a ){
       int temp = a;
       a = b;
       b = temp;
}  
      int sum = 0;
      for (int i = a; i<=b; i++){
          sum += i;  
}
      return sum;
     }
  }