package com.example.cadastropets22300570.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//Notacao que vai dizer ao Room que essa classe é uma representação de uma tabela do banco
// de dados, uma tabela chamada "Pet"
@Entity(tableName = "Pet")
class PetModel {
    @PrimaryKey(autoGenerate = true)//O id é a chave primaria com auto incremento (autoGenerate) ativado
    @ColumnInfo(name = "id_pet")//O atributo é uma coluna, e que o nome dessa coluna será "id_usuario"
    var id_pet: Int = 0//Esse atributo representa uma coluna do tipo Int

    @ColumnInfo(name = "nome")//O nome dessa coluna será "nome"
    var nome: String = ""//Esse atributo representa uma coluna do tipo String

    @ColumnInfo(name = "idade")//Diz ao Room que o atributo abaixo é uma coluna, e que o nome dessa coluna será "idade"
    var idade: Int = 0

    @ColumnInfo(name = "cor")//O nome dessa coluna será "nome"
    var cor: String = ""//Esse atributo representa uma coluna do tipo String

    @ColumnInfo(name = "tipo")//O nome dessa coluna será "nome"
    var tipo: String = ""//Esse atributo representa uma coluna do tipo String

    @ColumnInfo(name = "peso_kg")//O nome dessa coluna será "nome"
    var peso_kg: Double = 0.0 //Esse atributo representa uma coluna do tipo String
}