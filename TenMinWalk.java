public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int Horizontal = 0, Vertical = 0;
        if (walk.length != 10)
            return false;

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 's')
                Vertical = Vertical - 1;
            if (walk[i] == 'n')
                Vertical = Vertical + 1;
            if (walk[i] == 'e')
                Horizontal = Horizontal + 1;
            if (walk[i] == 'w')
                Horizontal = Horizontal - 1;
        }
        if (Horizontal == 0 && Vertical == 0)
            return true;
        return false;
  }
}