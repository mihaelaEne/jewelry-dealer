package ro.mycode.view;

import ro.mycode.controller.JewelryController;
import ro.mycode.model.Jewelry;

import java.util.Scanner;

public class ViewJewelry {
    private Scanner scanner;
    private JewelryController jewelryController;

    public ViewJewelry(){
        jewelryController=new JewelryController();
        scanner=new Scanner(System.in);
        play();
    }
    public void meniu() {
        System.out.println("Hello!");
        System.out.println("Press 1 to view all the jewelry");
        System.out.println("Press 2 to add a jewelry");
        System.out.println("Press 3 to remove a jewelry");
        System.out.println("Press 4 to save and exit");
    }

    public void play(){
        int alegere = 0;
        boolean running = true;

        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    jewelryController.afisareJewelry();
                    break;
                case 2:
                    addJewelry();
                    break;
                case 3:
                    removeJewelry();
                    break;
                case 4:
                    running=false;
                    jewelryController.toSave();
                    break;

                default:
                    System.out.println("Incorrect choice");
                    break;
            }
        }
    }

    private void addJewelry() {
        System.out.println("Type:");
        String type = scanner.nextLine();
        System.out.println("Producer:");
        String producer = scanner.nextLine();
        System.out.println("Id:");
        int id = Integer.parseInt(scanner.nextLine());




        Jewelry jewelry = jewelryController.findById(id);
        if (jewelry == null) {
            Jewelry jewelry1 = new Jewelry(type,producer,id);
            jewelryController.addJewelry(jewelry1);

        } else {
            System.out.println("Error-jewelry add");
        }

    }

    private void removeJewelry(){
        System.out.println("Id:");
        int id=Integer.parseInt(scanner.nextLine());
        Jewelry jewelry =jewelryController.findById(id);
        if(jewelry ==null){
            System.out.println("there is no jewelry with the entered id");
        }else {
            jewelryController.removeJewelry(jewelry);
            System.out.println("The jewelry was remove ");
        }
    }


}
