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
        if (status != Status.FLOWERS)
        {
            System.out.println("You can't do 'grow', because tree status is: " + status);
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
        if (status != Status.APPLES)
        {
            System.out.println("You can't do 'shake', because tree status is: " + status);
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
        if (status != Status.NEW)
        {
            System.out.println("You can't do 'flowering', because tree status is: " + status);
            return;
        }
        flowersCount = (int)((Math.random() * 10) + 1);
        System.out.println("The tree grew " + flowersCount + " flowers.");
        status = Status.FLOWERS;
    }

    public void reset()
    {
        flowersCount = 0;
        apples.clear();
        status = Status.NEW;
    }
}
