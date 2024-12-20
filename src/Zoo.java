public class Zoo {
    public static void main(String[]args){
        Pesce pesce=new Pesce("Glug glug gurgle gurgle");
        Uccello uccello=new Uccello("Tweet tweet flap flap");
        Cane cane=new Cane("Sniff sniff wolf wolf");
        Animali[]animali={pesce,uccello,cane};
        for(int i=0;i< animali.length;i++){
            System.out.println(animali[i].getVerso());
            if(animali[i] instanceof Cane){
                ((Cane) animali[i]).ringhiare();
            }
        }
    }
}
