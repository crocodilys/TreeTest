import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: dimka
 * Date: 9/9/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tree {
    private ArrayList<Apple> apples;

    public Tree () {
        apples = new ArrayList<Apple>();
    }

    public void Grow() {
        int count = (int)((Math.random() * 10) + 1);
        for (int i = 0; i < count; i++) {
            apples.add(new Apple());
        }
        System.out.println("The tree grew " + count + " apples.");
    }

    /*public void Shake() {
        int count = (int)(Math.random() * apples.size());
        for (int i = 0; i < count; i++) {
            apples.remove(0);
        }
    }*/
}
