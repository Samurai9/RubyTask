package main.ru.kpfu.itis.Generator;

import java.util.Scanner;

public class App {
    //Порядковый номер, т.е. n-ный член последовательности
    int serialNumber;

    public static void main(String[] args) {
        App app = new App();
        app.initialization();
        app.start();
    }

    //Инициализация порядкового номера
    public void initialization(){
        Scanner scan = new Scanner(System.in);
        boolean correctData = false;
        serialNumber = -1;
        while (!correctData) {
            System.out.println("Enter sequence number");
            serialNumber = scan.nextInt();
            if(serialNumber < 0){
                System.out.println("The sequence number cannot be negative");
            } else{
                correctData = true;
            }
        }
    }

    //Вывод сгенерированной строчки
    public void start(){
        System.out.println(Generator.generate(serialNumber));
    }
}
