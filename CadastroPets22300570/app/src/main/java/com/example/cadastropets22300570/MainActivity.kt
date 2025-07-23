package com.example.cadastropets22300570

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.cadastropets22300570.model.PetModel
import com.example.cadastropets22300570.repository.PetDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    //Aqui estamos instanciando a classe do Room, ao mesmo tempo que estamos retornando a classe de usuarioDao
    val usuarioDatabase = PetDatabase.getDataBase(this).usuarioDAO()

    //Observe como fazemos o insert, passando uma instância de UsuarioModel, modificando os atributos:
    val retornoInsert = PetDatabase.insertUser(PetModel().apply {
        this.nome = "Daniel Paiva"
        this.idade = 32
        this.cor = "Daniel Paiva"
    })

    val retornoSelectMultiplo = PetDatabase.getAll()//Retorna todos os registros

    for(item in retornoSelectMultiplo){
        Log.d("Retorno Múltiplo", "id_pet: ${item.id_usuario}, nome: ${item.nome}, idade: ${item.idade}, cor: ${item.cor}, tipo: ${item.tipo}, peso_kg: ${item.peso_kg}")
    }
}