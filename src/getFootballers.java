import java.net.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class getFootballers {
    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in); // (Took this from internet') - Reading from System.in
        System.out.println("Enter football player: ");
        String footballer = reader.nextLine(); // Scans the next token of the input.
        reader.close();
        String strarray[] = footballer.split(" ");



        URL soccerway = new URL("https://us.soccerway.com/search/?q=zlatan+ibrahimovic&module=all");
        BufferedReader in = new BufferedReader(new InputStreamReader(soccerway.openStream()));

        String inputline;
        while ((inputline = in.readLine()) != null)
            System.out.println(inputline);
        in.close();



        System.out.println(Arrays.toString(strarray));
    }

}

// Notes: Fixa så att scriptet kollar ifall input blir Namn och efternamn eller bara ett namn/efternamn.




