import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: dimka
 * Date: 9/9/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tree {

    enum Status {NEW, FLOWERS, APPLES, OLD};

    private ArrayList<Apple> apples;
    private int flowersCount;
    private Status status;

    public Tree ()
    {
        apples = new ArrayList<Apple>();
        flowersCount = 0;
        status = Status.NEW;
    }

    public void grow()
    {
        if (!checkStatus(status, Status.FLOWERS, "'grow'"))
        {
            return;
        }
        System.out.println("The tree grew " + flowersCount + " apples.");
        int seedsCount = 0;
        for (int i = 0; i < flowersCount; i++)
        {
            apples.add(new Apple());
            seedsCount += apples.get(i).getSeedCount();
        }
        System.out.println("Seeds count: " + seedsCount);
        status = Status.APPLES;

    }

    public void shake()
    {
        if (!checkStatus(status, Status.APPLES, "'shake'"))
        {
            return;
        }
        int applesCount = (int)((Math.random() * apples.size()) + 1);
        System.out.println("The tree fell " + applesCount + " apples.");
        int seedsCount = 0;
        for (int i = 0; i < applesCount; i++)
        {
            seedsCount += apples.get(0).getSeedCount();
            apples.remove(0);
        }
        System.out.println("Seeds count: " + seedsCount);
        if (apples.size() == 0)
        {
            status = Status.OLD;
        }
    }

    public void flowering()
    {
        if (!checkStatus(status, Status.NEW, "'flowering'"))
        {
            return;
        }
        flowersCount = (int)((Math.random() * 10) + 1);
        print("The tree grew " + flowersCount + " flowers.");
        status = Status.FLOWERS;
    }

    public void reset()
    {
        print("Reseting tree.");
        flowersCount = 0;
        apples.clear();
        status = Status.NEW;
    }

    private void print(String s)
    {
        System.out.println(s);
    }

    private boolean checkStatus(Status current, Status required, String action)
    {
        if (current != required)
        {
            print("You can't perform " + action + ". Current status: " + current + ". Required: " + required + ".");
            return false;
        }
        return true;
    }
}
