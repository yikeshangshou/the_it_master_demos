import java.util.Scanner;

/**
 * 石头剪刀布小游戏
 */
public class Demo3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    //导入  Scanner

        System.out.println("-----------------猜拳游戏-------------------");
        System.out.println("请出拳  （1.剪刀  2.石头  3.布   0.退出）");
        System.err.println("请输入数字");
        while (true) {

            int im = in.nextInt();//输入的值
            int computer = (int) (Math.random() * 3 + 1);  //随机值

            String ims = convert(im);
            String computers = convert(computer);

            if (im == computer) {
                System.out.println("  平局了！！  你出的是"+ims+   "   电脑出的是"+computers);
            } else if(im == 1 && computer == 2){
                System.out.println("  你输了！！  你出的是"+ims+   "   电脑出的是"+computers);
            } else if(im == 2 &&  computer== 3){
                System.out.println("  你输了！！  你出的是"+ims+   "   电脑出的是"+computers);
            } else if(im == 3 &&  computer== 1){
                System.out.println("  你输了！！  你出的是"+ims+   "   电脑出的是"+computers);
            }else{
                System.out.println("  你赢了！！  你出的是"+ims+   "   电脑出的是"+computers);
                break;
            }
            if (im == 0) break;
        }

        System.out.println("-----------------猜拳游戏结束-------------------");
    }



    private static String convert (int computer) {
        if(computer == 1){
            return "剪刀";
        }else if(computer == 2){
            return "石头";
        }else{
            return "布";
        }
    }
}

