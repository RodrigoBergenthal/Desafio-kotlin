

package com.example.meuprojetokotlinmaven.model


import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Carro(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val modeloId: Long,
    val ano: Int,
    val combustivel: String,
    val numPortas: Int,
    val cor: String
)
