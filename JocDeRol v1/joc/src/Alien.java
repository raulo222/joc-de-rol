public class Alien extends Player {


    Alien() {
        super();
    }

    @Override
    public void pegar(Player coco) {
        if (-coco.getPD() + this.getPA() > 0) {
            System.out.println("ha pegat");
            coco.setPV(coco.getPV() + coco.getPD() - this.getPA());
        }
    }
}
