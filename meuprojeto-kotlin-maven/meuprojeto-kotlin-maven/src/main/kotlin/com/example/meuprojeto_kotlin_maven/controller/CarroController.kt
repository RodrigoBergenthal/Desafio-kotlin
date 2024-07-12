package com.example.meuprojetokotlinmaven.controller

import com.example.meuprojetokotlinmaven.model.Carro
import com.example.meuprojetokotlinmaven.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/carro")
class CarroController(
    @Autowired private val carroRepository: CarroRepository
) {

    @GetMapping
    fun getAllCarros(): List<Carro> = carroRepository.findAll()

    @PostMapping
    fun createCarro(@RequestBody carro: Carro): Carro = carroRepository.save(carro)
}
