/**
 * 测试idea 的git 提交
 *
 * @author liming
 * @create 2017-07-20 11:34
 */

public class Test {
    public static void main(String[] args) {
        System.out.println("git commit,commit and push");

        String str = "abc de    fgh";
        System.out.println(str);
        String strnew = str.replaceAll("\\s+"," ");

        StringBuffer sball=new StringBuffer(strnew);

        sball.reverse();
        System.out.println(sball.toString());

    }
}
