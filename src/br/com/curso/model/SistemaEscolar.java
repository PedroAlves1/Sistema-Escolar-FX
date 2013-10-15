package br.com.curso.model;

/**
 * @author pedro
 */
public class SistemaEscolar {
     
    public static void main(String[] args) 
    {
        //Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno");
        System.out.println("Nome do Aluno: " +aluno.getNome());
        
        //---------
        Disciplina mat = new Disciplina();
        //--------
        
        //Disciplina
            //-Matemática
            mat.setNome("Matemática"); //Nome da Matéria
            mat.setNotaB1(8.0f); //Primeiro Bimestre
            mat.setNotaB2(7.2f); //Segundo Bimestre
            mat.setNotaB3(5.3f); //Terceiro Bimestre
            mat.setNotaB4(9.1f); //Quarto Bimestre
            //Mensagens a serem enviadas.
                System.out.println("\nMatéria: " +mat.getNome() +"\n\nNotas:\n"); //Nome da matéria e texto para notas
                System.out.println("Primeiro Bimestre: " +mat.getNotaB1());
                System.out.println("\nSegundo Bimestre: " +mat.getNotaB2());
                System.out.println("\nTerceiro Bimestre: " +mat.getNotaB3());
                System.out.println("\nQuarto Bimestre: " +mat.getNotaB4());
              /* Média */  System.out.println("\nMédia Final: " +mat.media()); 
              /* Média */  if(mat.media()<5){
              /* Média */  System.out.println("Reprovado!");
              /* Média */ }
              /* Média */ if((mat.media()>=5) && (mat.media()<=10)){
              /* Média */ System.out.println("Aprovado!");
              /* Média */ }
              /* Média */ else{
              /* Média */ System.out.println("Erro! Tente novamente mais tarde ou entre em contato com a escola responsável pelas notas.");
              /* Média */  }
              //----------
              System.out.println();
        //Aluno
        aluno.adicionaDisciplina(mat);
        System.out.println(aluno.getDisciplinas().get(0).getNome());
        //-------

    }
}
