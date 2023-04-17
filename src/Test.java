import javax.imageio.stream.IIOByteBuffer;
import java.io.File;

public class Test {
    public static void main(String[] args) {
        /* *//* *//**//* String str1 = new String("Avatar");
       String str2 = new String(str1);
       System.out.println(str1 == str2);*//**//*

        String str1 = "hello";
        int y = 9;
        System.out.println(str1 += y);*//*


        File obj = new File("src/java/control/system");
        System.out.print(obj.getName());*/


        boolean settingEnabled = true;
        boolean reCal = true;
        String resetAction = "";


        if ((!settingEnabled && !reCal) || (!settingEnabled && reCal)) {

            if (resetAction.equals("reset")) {
                System.out.println("Reset");
            } else {
                System.out.println("Begin");
            }

        } else if (settingEnabled && !reCal) {
            System.out.println("Setting");
        } else {
            System.out.println("Cal");
        }
    }
}

