package ro.mycode.controller;

import ro.mycode.model.Bracelet;
import ro.mycode.model.Jewelry;
import ro.mycode.model.Necklace;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JewelryController {
    private Scanner scanner;
    private ArrayList<Jewelry> jewelryList;
    private ArrayList<Bracelet> bracelets;
    private ArrayList<Necklace> necklaces;

    public JewelryController(ArrayList<Jewelry> jewelryList) {
        this.jewelryList = jewelryList;
    }

    public JewelryController() {
        this.jewelryList = new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\jewelry\\src\\ro\\mycode\\data\\jewelry.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (text.split(",")[0]) {
                    case "Bracelet":
                        this.jewelryList.add(new Bracelet(text));
                        break;
                    case "Necklace":
                        this.jewelryList.add(new Necklace(text));
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void afisareJewelry() {
        for (int i = 0; i < jewelryList.size(); i++) {
            System.out.println(this.jewelryList.get(i));
            System.out.println("\n");
        }
    }

    public void addJewelry(Jewelry jewelry){
        this.jewelryList.add(jewelry);
    }

    public void removeJewelry(Jewelry jewelry){
        this.jewelryList.remove(jewelry);
    }

    public Jewelry findById(int id){
        for(int i=0; i<jewelryList.size();i++){
            if(jewelryList.get(i).getId()==id){
                return jewelryList.get(i);
            }
        }
        return null;
    }
    public String toSave(){
        String text="";
        for(int i=0; i<jewelryList.size();i++) {
            Jewelry jewelry=(Jewelry) jewelryList.get(i);
            text+=jewelry.toSave()+"\n";
        }
        return text;

    }


    public void save(){
        try {
            File file = new File("C:\\mycode\\OOP\\jewelry\\src\\ro\\mycode\\data\\jewelry.txt");
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
