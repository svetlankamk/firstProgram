import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String [] args){
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(is);

        try {
            System.out.println("Введите ваше имя и нажмите клавишу ЕНТЕР =---");
            String name = bis.readLine();
            System.out.println("Привет, уважаемый гость - "+name);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
