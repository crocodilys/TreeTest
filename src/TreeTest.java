import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: dimka
 * Date: 9/9/13
 * Time: 5:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeTest {

    public static void print(String s)
    {
        System.out.println(s);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        int code = -1;
        while (code != 0)
        {
            print("************************");
            print("Press 1 to reset tree.");
            print("Press 2 to flower tree.");
            print("Press 3 to grow apples.");
            print("Press 4 to shake tree.");
            print("Press 0 to exit.");
            print("************************");
            code = sc.nextInt();
            switch (code)
            {
                case 1:
                    tree.reset();
                    break;
                case 2:
                    tree.flowering();
                    break;
                case 3:
                    tree.grow();
                    break;
                case 4:
                    tree.shake();
                    break;
            }
        }
    }
}
