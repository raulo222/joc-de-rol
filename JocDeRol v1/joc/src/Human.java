public class Human extends Player{
    Human() {
        super();
    }

    @Override
    public void pegar(Player coco) {
        if(-coco.getPD()+this.getPA()>0){
            System.out.println("ha pegat");
            coco.setPV(coco.getPV()+coco.getPD()-this.getPA());
        }

    }
}
