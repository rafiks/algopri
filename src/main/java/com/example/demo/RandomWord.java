import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(final String[] args) {
    String champ = "";
    double i = 1;
    while (!StdIn.isEmpty()) {
      String curword = StdIn.readString();
      double p = 1.0 / i;
      if (StdRandom.bernoulli(p)) {
        champ = curword;
      }
      i++;

    }
    System.out.println(champ);
  }
}
