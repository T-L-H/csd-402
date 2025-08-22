//Tevyah Hanley 08/21/2025 M3 Programming Assignment
//This program makes a really cool pyramid of numbers

public class Main {
  public static void main(String[] args) {
    int n = 7;

    
    StringBuilder last = new StringBuilder();
    for (int i = 0; i < n; i++) { if (i > 0) last.append(" "); last.append(1 << i); }
    for (int i = n - 2; i >= 0; i--) { last.append(" ").append(1 << i); }
    int maxWidth = last.length();
    for (int r = 1; r <= n; r++) {
      StringBuilder line = new StringBuilder();

      for (int s = 0; s < (n - r) * 2; s++) line.append(" ");

      for (int i = 0; i < r; i++) {
        if (i > 0) line.append(" ");
        line.append(1 << i);
      }

      for (int i = r - 2; i >= 0; i--) {
        line.append(" ").append(1 << i);
      }

      System.out.print(line.toString());
      int pad = (maxWidth - line.length()) + 3; 
      for (int p = 0; p < pad; p++) System.out.print(" ");
      System.out.println("@");
    }
  }
}

