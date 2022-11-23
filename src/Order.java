import java.util.ArrayList;
import java.util.List;

public class Order {

    public static void main(String[] args) {
        // Print the welcome message
        System.out.println(Questions.welcomeMessage);

        //Create items list
        List<Item> items = new ArrayList<>();

        //create a loop and create and store items in the list until user says no
        do {

            String response = ScannerHelper.getString(
                    items.isEmpty() ? Questions.askItem : Questions.askContinue
            );

            if (response.toUpperCase().startsWith("N")) break;

            items.add(Item.createItem());
        }while (true);

        // if there is no item print out you exited application


        /*
        print every item
        print the total
        print address
         */

    }
}
