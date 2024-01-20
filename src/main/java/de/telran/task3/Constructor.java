package de.telran.task3;

public class Constructor extends Production{

    boolean readDraw; // умение читать чертежи
    boolean сreativeThinking; // наличие нестандартного подхода

    public Constructor(java.lang.String name, int age, java.lang.String education, char married, char sex, int children, boolean safetyPrecautions, boolean readDraw, boolean сreativeThinking) {
        super(name, age, education, married, sex, children, safetyPrecautions);
        this.readDraw = readDraw;
        this.сreativeThinking = сreativeThinking;
    }
}
