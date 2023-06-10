package ro.mycode.model;

public class Bracelet extends Jewelry {
    private int size;
    private String name;
    private String store;

    public Bracelet(String type, String producer, int id, int size, String name, String store) {
        super(type, producer, id);
        this.size = size;
        this.name = name;
        this.store = store;
    }

    public Bracelet(int size, String name, String store) {
        this.size = size;
        this.name = name;
        this.store = store;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    @Override
    public String toString(){
        String text="";
        text+="I am a bracelet!"+"\n";
        text+="id: "+super.getProducer()+"\n";
        text+="proucer: "+super.getProducer()+"\n";
        text+="size: "+this.size+"\n";
        text+="name: "+this.name+"\n";
        text+="store: "+this.store;
        return text;
    }
    public Bracelet(String prop){
        String [] split=prop.split(",");
        this.size=Integer.parseInt(split[3]);
        this.name=split[4];
        this.store=split[5];
    }

    @Override
    public String toSave(){
        return super.toSave()+","+size+","+name+","+store;
    }
}
