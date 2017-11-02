package ContainerTest;

/**
 * Created by 10564 on 2017-10-11.
 */
public class Gerbil {
    private static int num = 0;
    public int gerbilNumber = num++;

    public void hop(){
        System.out.println("gerbil " + gerbilNumber + " is jumping……");
    }

    @Override
    public String toString() {
        return "Gerbil"+ gerbilNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gerbil gerbil = (Gerbil) o;

        return gerbilNumber == gerbil.gerbilNumber;

    }

    @Override
    public int hashCode() {
        return gerbilNumber;
    }
}
