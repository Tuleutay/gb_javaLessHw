package org.example.hw_javaLess01;

public class Doctor extends BaseHero{
    private int mana;
    private int maxMana;

    public Doctor(){
        super(String.format("Hero_Doctor #%d", ++Doctor.number),
                Doctor.r.nextInt(100,200));
        this.maxMana=Doctor.r.nextInt(150,250);
        this.mana = maxMana;
    }

    public String getInfo(){ return String.format("%s Mana: %d", super.getInfo(), this.mana);}
    public void Heal(BaseHero target){
        int hp = BaseHero.r.nextInt(15, 25);
        target.healed(hp);
    }
}
