package com.sofka.restfulempleados.mappers;

import com.sofka.restfulempleados.collections.Empleado;
import com.sofka.restfulempleados.dtos.EmpleadoDTO;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoMapper {

    public Empleado fromDTO(EmpleadoDTO dto) {
        Empleado empleado = new Empleado();
        empleado.setId(dto.getId());
        empleado.setNombre(dto.getNombre());
        empleado.setRol(dto.getRol());
        return empleado;
    }

    public EmpleadoDTO fromCollection(Empleado collection) {
        EmpleadoDTO empleadoDTO = new EmpleadoDTO();
        empleadoDTO.setId(collection.getId());
        empleadoDTO.setNombre(collection.getNombre());
        empleadoDTO.setRol(collection.getRol());
        return empleadoDTO;
    }

    public List<EmpleadoDTO> fromCollectionList(List<Empleado> collection) {
        if (collection == null) {
            return null;

        }
        List<EmpleadoDTO> list = new ArrayList(collection.size());

        for (Empleado empleado : collection) {
            list.add(fromCollection(empleado));
        }

        return list;
    }
}