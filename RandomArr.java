import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RandomArr {
    public int[] randomint(int aa) {
        List<Integer> list = new ArrayList();
        if (!notEmpty(aa)) {
            System.out.println("数字范围越界");
            return new int[0];
        }
        for (int i = 1; i < aa + 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
       int[] ab = list.stream().mapToInt(Integer::valueOf).toArray();
        return ab;
    }

    private boolean notEmpty(Object object) {
        int aa;
        if (object instanceof Integer) {
            aa = (int) object;
            if (aa <= 0) {
                return false;
            }
        }
        return true;
    }
}
