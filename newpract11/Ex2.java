package mirea.newpract11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws ParseException {
        Scanner keyboard = new Scanner(System.in);
        String userDate = keyboard.nextLine();

        Date dateUser = new SimpleDateFormat("dd.MM.yyyy").parse(userDate);

        Date dateProgram = new Date();

        if (dateUser.compareTo(dateProgram) == 0){
            System.out.println("Пользовательское время равно системному");
        }
        else if(dateUser.compareTo(dateProgram) == 1){
            System.out.println("Пользовательское время больше системного");
        }
        else{
            System.out.println("Пользовательское время меньше системного");
        }
    }
}