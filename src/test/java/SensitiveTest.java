import shuaiys.sensitive.SensitiveFilter;

/**
 * @author shuaiys
 * @Package ${package_name}
 * @Description: 测试类
 * @date 2018/7/7  10:19
 */
public class SensitiveTest {

    public static void main(String[] args) {
        SensitiveFilter sf = SensitiveFilter.DEFAULT;
        String text = "加我微信1234568";
        String filter = sf.filter(text);
        System.err.println(filter);
    }
}
