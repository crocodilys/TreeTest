/**
 * Created with IntelliJ IDEA.
 * User: dimka
 * Date: 9/9/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeTest {
    public static void main(String args[]) {
        Tree tree = new Tree();
        for (int i = 0; i < 10; i++) {
            tree.Grow();
            tree.Shake();
        }
    }
}
