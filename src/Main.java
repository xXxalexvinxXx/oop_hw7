import Controller.Calculator;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class Main {


    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        try {
            FileHandler fh = new FileHandler("MyLog.log", true);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите оператор: ");
        var operator = in.nextLine();
        System.out.println("Введите операнд 1: ");
        float operand1 = in.nextFloat();
        System.out.println("Введите операнд 2: ");
        float operand2 = in.nextFloat();
        in.close();

        double answer = calculator.calculate(operator, operand1, operand2);

        String text = String.valueOf(operand1)+operator+String.valueOf(operand2) +"="+ String.valueOf(answer);

        logger.log(Level.INFO, text);


        System.out.println("Результат: " + answer);
    }
}

//public class Log {
//    private static final Logger logger = Logger.getLogger("MyLog");
//
//    public static void iniciarLog() throws IOException {
//        FileHandler fh;
//
//        try {
////          fh = new FileHandler(System.getProperty("user.home")+System.getProperty("file.separator")+"TorrentDownloader.log");
//            fh = new FileHandler("%h/TorrentDownloader.log");
//            logger.addHandler(fh);
//            SimpleFormatter formatter = new SimpleFormatter();
//            fh.setFormatter(formatter);
//
//            logger.info("Se inició el log");
//        } catch (SecurityException | IOException e) {
//            logger.severe("Error al crear el log");
//        }
//    }
//
//    public static Logger getLogger() {
//        return logger;
//    }
//}