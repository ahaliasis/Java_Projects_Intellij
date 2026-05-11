import java.util.Scanner;
import java.util.ArrayList;
public class ExtraMenuArray
{
    ArrayList <ExtraMenu> extraMenus = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int choice =0;

    public ExtraMenuArray(){
        extraMenus.add(new ExtraMenu("Coca-Cola",4));
        extraMenus.add(new ExtraMenu("Sparkling-Water",2));
        extraMenus.add(new ExtraMenu("Juice",3));
        extraMenus.add(new ExtraMenu("Beer",5));
        extraMenus.add(new ExtraMenu("Wine",7));
    }

    public ExtraMenu chooseExtraMenu(Scanner scanner){
        for(int i = 0; i < extraMenus.size(); i++){
            System.out.println((i+1) + " - " + extraMenus.get(i).getName() + " - " + extraMenus.get(i).getPrice());
        }

        choice = InputUtils.readInt("Choice: ");
        return extraMenus.get(choice - 1);


    }


}
