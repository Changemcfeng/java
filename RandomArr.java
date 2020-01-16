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
        Collections.shuffle(list);//打乱顺序
       int[] ab = list.stream().mapToInt(Integer::valueOf).toArray();//list转化成数组
        return ab;
    }

    private boolean notEmpty(Object object) {//判断输入是否越界
        int aa;
        if (object instanceof Integer) {//判断是否是int类型
            aa = (int) object;
            if (aa <= 0) {
                return false;
            }
        }
        return true;
    }
}
