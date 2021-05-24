public abstract class  Player {
    private int PA;
    private int armor;
    private int HP;
    private String nom;
    Player(String nom,int PA,int armor,int HP) {

    }

    @Override
    public String toString() {
        return getNom() +
                "PA:" + getPA() +
                "/PD=" + getPD() +
                "/PV=" + getHP();
    }

    public void attack(Player p)
    {
        System.out.println("Atacant: ");
        toString();
        System.out.println("Atacat: ");
        toString();
        this.hit(p.getPA());
        if (p.getHP()>0){
            p.hit(this.getPA());
        }
    }
    protected void hit(int PA){
     this.setHP( -PA+getPD()+getHP());
        System.out.println(this.getNom() + " és colpejat amb" + PA + " i es defen amb " +this.getPD()+" Vides:"+this.getHP()+"-"+(PA-this.getPD())+"="+(this.getHP()-this.getPA()+this.getPD()));

    }

    public int getPA() {
        return PA;
    }

    public void setPA(int PA) {
        this.PA = PA;
    }

    public int getPD() {
        return getArmor();
    }

    public void setPD(int PD) {
        this.setArmor(PD);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int PV) {
        this.HP = HP;
    }


    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}

