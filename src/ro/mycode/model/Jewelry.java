package ro.mycode.model;

public class Jewelry {

    private String type;
    private String producer;
    private int id;

    public Jewelry(){}

    public Jewelry(String type, String producer, int id) {
        this.type = type;
        this.producer = producer;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String text="";
        text+="I am a jewelry from: "+this.producer+", id: "+this.id;
        return text;
    }

    public Jewelry (String prop) {
        String[] split = prop.split(",");
        this.type = split[0];
        this.producer = split[1];
        this.id = Integer.parseInt(split[2]);
    }

    public String toSave(){
        return type+","+producer+","+id;
    }
}
