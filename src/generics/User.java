package generics;

public class User implements  Comparable<User> {
     private int points;
     public User(int points) {
         this.points = points;
     }

    @Override
    public int compareTo(User o) {
      if (this.points > o.points) {
          return 1;
      } else if (this.points < o.points) {
          return -1;
      } else {
          return 0;
      }
    }
}
