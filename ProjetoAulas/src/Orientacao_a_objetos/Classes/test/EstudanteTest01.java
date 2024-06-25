package Orientacao_a_objetos.Classes.test;

import Orientacao_a_objetos.Classes.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        // Referência, váriavel = objeto da referência();
        Estudante estudante = new Estudante();
        estudante.nome = "Ariel";
        estudante.idade = 27;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
