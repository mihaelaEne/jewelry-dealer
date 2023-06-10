package ro.mycode.model;

public class Necklace extends Jewelry{
    private String material;
    private String name;

    public Necklace(String material, String name) {
        this.material = material;
        this.name = name;
    }

    public Necklace(String type, String producer, int id, String material, String name) {
        super(type, producer, id);
        this.material = material;
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString(){
        String text="";
        text+="I am a necklace!"+"\n";
        text+="id: "+super.getId()+"\n";
        text+="proucer: "+super.getProducer()+"\n";
        text+="material: "+this.material+"\n";
        text+="name: "+this.name;
        return text;
    }

    public Necklace(String prop){
        super(prop);
        String [] split=prop.split(",");
        this.material=split[3];
        this.name=split[4];

    }

    @Override
    public String toSave(){
        return super.toSave()+","+material+","+name;
    }

}
