import java.util.Scanner;

/**
 * 小程序
 */
public class Demo2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串：");

        while(true) {

            String lin = s.nextLine();
            if(lin.equals("星期一")){
                System.out.println("一");
            }else if(lin.equals("星期二")){
                System.out.println("二");
            }else if(lin.equals("星期三")){
                System.out.println("三");
            }else if(lin.equals("星期四")){
                System.out.println("四");
            }else if(lin.equals("星期五")){
                System.out.println("五");
            }else if(lin.equals("星期六")){
                System.out.println("六");
            }else if(lin.equals("星期日")){
                System.out.println("七");
            }else {
                System.out.println("无效的字符串");
            }
            if(lin.equals("exit")) break;
        }

    }

}
