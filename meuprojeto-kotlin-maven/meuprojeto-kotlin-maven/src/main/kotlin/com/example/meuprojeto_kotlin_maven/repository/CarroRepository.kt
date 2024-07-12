

package com.example.meuprojetokotlinmaven.repository

import com.example.meuprojetokotlinmaven.model.Carro
import org.springframework.data.jpa.repository.JpaRepository

interface CarroRepository : JpaRepository<Carro, Long>
