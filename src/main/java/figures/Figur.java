package figures;

import javax.swing.JPanel;

import Maps.MapKachel;
import Maps.Position;

import java.awt.*;
import java.io.Console;

public class Figur extends MapItems{
    private Color m_color = null;

    private int strengh, dexterity, vitality, intelligence, wisdom, charisma, level = 1, experience, armorClass,
            maxLife, currentLife;

    private String name;

    public Figur() {

    }

    public Figur(Color color) {
        m_color = color;
        repaint();
    }

    public void setColor(Color color) {
        m_color = color;
        repaint();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(m_color);
        g.fillOval(0, 0, getHeight(), getWidth());
        g.setColor(Color.black);
        g.drawOval(0, 0, getHeight(), getWidth());
        System.out.println("Paint");
    }

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
