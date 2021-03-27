package com.br.teccell;

public class funcionario {

    //ropriedades

    String nome;
    double salario;

    // metodos

    double recuperarSalario(double bonus){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario;
        //System.out.println( this.salario );
    }


}
