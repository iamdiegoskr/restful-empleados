package com.sofka.restfulempleados.repositories;

import com.sofka.restfulempleados.collections.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
