package br.com.curso.model;

/**
 *
 * @author pedro
 * Disciplina - Nome - Dados (Professor, notas e faltas dos 4 bimestres)
 */
public class Disciplina {
private String nome;
private float nota[]; //*
private int falta[]; //*
private Professor professor;

    public Disciplina(){
        
    nota = new float[4];
    falta = new int[4];
    
    }//Construtor


    public float media(){
        float soma=0;
        
        for(int i=0; i<4; i++){
            soma+=nota[i];
        }//for media
        
    return (soma/4);
    }//Media
    
    public String getNome() {
        return nome;
    }//getter nome

    public void setNome(String nome) {
        this.nome = nome;
    }//setter nome

    public void setNotaB1(float nota){
        this.nota[0]=nota;
    }
    
    public float getNotaB1(){
        return nota[0];
    }
    
    public void setNotaB2(float nota){
        this.nota[1]=nota;
    }
    
    public float getNotaB2(){
        return nota[1];
    }

    public void setNotaB3(float nota){
        this.nota[2]=nota;
    }
    
    public float getNotaB3(){
        return nota[2];
    }
    
    public void setNotaB4(float nota){
        this.nota[3]=nota;
    }
    
    public float getNotaB4(){
        return nota[3];
    }    
    
    public int[] getFalta() {
        return falta;
    }//getter falta

    public void setFalta(int[] falta) {
        this.falta = falta;
    }//setter falta

    public Professor getProfessor() {
        return professor;
    } //getter professor

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }//setter professor


}//class
