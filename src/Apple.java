/**
 * Created with IntelliJ IDEA.
 * User: dimka
 * Date: 9/9/13
 * Time: 5:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Apple {
    public int getSeedCount()
    {
        return seedCount;
    }

    public void setSeedCount(int seedCount)
    {
        this.seedCount = seedCount;
    }

    private int seedCount;

    public Apple()
    {
        seedCount = (int)((Math.random() * 10) + 1);
        System.out.println("Rose apple with " + seedCount + " seeds.");
    }

}
