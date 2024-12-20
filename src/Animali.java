public class Animali {
    private String verso;

    public Animali(String verso) {
        this.verso=verso;
    }

    public void setVerso(String verso){
        this.verso=verso;
    }
    public String getVerso(){
        return verso;
    }
    public void verso(){
        System.out.println("Io sono un animale e faccio versi");
    }
}