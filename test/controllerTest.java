import org.junit.Test;
import ro.mycode.controller.JewelryController;
import ro.mycode.model.Bracelet;
import ro.mycode.model.Jewelry;
import ro.mycode.model.Necklace;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class controllerTest {

    @Test
    public void findById(){
        ArrayList<Jewelry> jewelryArrayList=new ArrayList<>();
        Jewelry j1=new Jewelry("Bracelet1","Pandora1",1);
        jewelryArrayList.add(j1);
        Jewelry j2=new Jewelry("Bracelet2","Pandora2",2);
        jewelryArrayList.add(j1);
        Jewelry j3=new Jewelry("Bracelet3","Pandora3",3);
        jewelryArrayList.add(j1);

        JewelryController jewelryController=new JewelryController(jewelryArrayList);
        assertEquals("Pandora1",jewelryController.findById(1).getProducer());
    }

    @Test
    public void findByIdNull() {
        ArrayList<Jewelry> jewelryArrayList = new ArrayList<>();
        Jewelry j1 = new Jewelry("Bracelet1", "Pandora1", 1);
        jewelryArrayList.add(j1);
        Jewelry j2 = new Jewelry("Bracelet2", "Pandora2", 2);
        jewelryArrayList.add(j1);
        Jewelry j3 = new Jewelry("Bracelet3", "Pandora3", 3);
        jewelryArrayList.add(j1);

        JewelryController jewelryController = new JewelryController(jewelryArrayList);
        assertNull(jewelryController.findById(5));
    }

    @Test
    public void testAdd(){
        ArrayList<Jewelry> jewelryArrayList=new ArrayList<>();
        Jewelry j1=new Jewelry("Bracelet1","Pandora1",1);
        jewelryArrayList.add(j1);
        Jewelry j2=new Jewelry("Bracelet2","Pandora2",2);
        jewelryArrayList.add(j1);
        Jewelry j3=new Jewelry("Bracelet3","Pandora3",3);
        jewelryArrayList.add(j1);

        JewelryController jewelryController=new JewelryController(jewelryArrayList);
        assertNotNull(jewelryController.findById(1));
    }

    @Test
    public void testRemove(){
        ArrayList<Jewelry> jewelryArrayList=new ArrayList<>();
        Jewelry j1=new Jewelry("Bracelet1","Pandora1",1);
        jewelryArrayList.add(j1);
        Jewelry j2=new Jewelry("Bracelet2","Pandora2",2);
        jewelryArrayList.add(j2);
        Jewelry j3=new Jewelry("Bracelet3","Pandora3",3);
        jewelryArrayList.add(j3);

        JewelryController jewelryController=new JewelryController(jewelryArrayList);
        jewelryController.removeJewelry(j2);
        assertEquals(null,jewelryController.findById(2));
    }


    @Test

    public void afisareJ(){
        ArrayList<Jewelry> jewelryArrayList=new ArrayList<>();

        Bracelet b1=new Bracelet("Bracelet","Producer1",1,21,"Name1","Store1");
        jewelryArrayList.add(b1);
        Bracelet b2=new Bracelet("Bracelet", "Producer2",2,22,"name2","store2");
        jewelryArrayList.add(b2);
        Bracelet b3=new Bracelet("Bracelet", "Producer3",3,23,"name3","store3");
        jewelryArrayList.add(b3);

        Necklace n1=new Necklace("Necklace","Producer1",1,"silver","name1");
        jewelryArrayList.add(n1);
        Necklace n2=new Necklace("Necklace", "Producer2",2,"gold","name2");
        jewelryArrayList.add(n2);
        Necklace n3=new Necklace("Necklace", "Producer3",3,"silver","name3");
        jewelryArrayList.add(n3);

        JewelryController jewelryController=new JewelryController(jewelryArrayList);



        jewelryController.afisareJewelry();





    }
}
