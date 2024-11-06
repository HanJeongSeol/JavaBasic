package week02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class week02_homework {
    public static void main(String[] args) {
        ArrayList<String> recipe = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        while(!text.equals("끝")){
            recipe.add(text);
            text = sc.nextLine();
        }

        sc.close();

        System.out.println("[ " + recipe.get(0) + "으로 저장된 " + recipe.get(1) + " ]");

        List<String> subList = recipe.subList(2, recipe.size());
        int number = 1;

        for(String tx : subList){
            System.out.println(number + ". " + tx);
            number++;
        }
    }
}
