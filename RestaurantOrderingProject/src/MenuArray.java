import java.util.Scanner;
import java.util.ArrayList;
public class MenuArray {
    ArrayList <Menu> menus = new ArrayList<>();
    int choice = 0;
    Scanner scanner = new Scanner(System.in);

    public MenuArray(){
        menus.add(new Menu("Burger",12));
        menus.add(new Menu("Steak",13));
        menus.add(new Menu("Spaghetti",8));
        menus.add(new Menu("Children Menu",12));
    }

    public Menu chooseMenu(Scanner scanner){
        for(int i = 0; i < menus.size(); i++){
            System.out.println((i+1) + " - " + menus.get(i).getName() + " - " + menus.get(i).getPrice());
        }

        choice = InputUtils.readInt("Choice: ");
        return menus.get(choice - 1);
    }




}
