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
        String strFootballerArray[] = footballer.split(" ");

        String footballerName = "";

        if (strFootballerArray.length == 1) {
            footballerName = strFootballerArray[0];
        }else if (strFootballerArray.length == 2) {
            footballerName = strFootballerArray[0] + "+" + strFootballerArray[1];
        } else {
            System.out.println("This mini project only takes the <First/Last> name or <First and Last> name of the footballer, not more.");
            System.exit(0);
        }

        URL soccerway = new URL("https://us.soccerway.com/search/?q=" + footballerName + "&module=all");
        BufferedReader in = new BufferedReader(new InputStreamReader(soccerway.openStream()));

            String inputline;
            while ((inputline = in.readLine()) != null)
                System.out.println(inputline);
            in.close();

        // Debug prints
        System.out.println("Footballername " + footballerName);
        System.out.println(Arrays.toString(strFootballerArray));
        System.out.println("Input length: " + strFootballerArray.length);
        System.out.println("Final soccer URL: " + soccerway);
    }

}

// Notes/Tasks:
// DONE - Fixa så att scriptet kollar ifall input blir Namn och efternamn eller bara ett namn/efternamn.
//




