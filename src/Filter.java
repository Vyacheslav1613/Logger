import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer num : source) {
            if (num > treshold) {
                result.add(num);
                logger.log("Число " + num + " поподает в фильтр");
            } else {
                logger.log("Число " + num + " не попадает в фильтр");
            }
        }
        return result;
    }
}