package com.portfolio.yon.Interface;

import com.portfolio.yon.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto
    public void savePersona(Persona persona);
    
    //Eliminar un objeto
    public void deletePersona(Long id);
    
    //Buscar Persona
    public Persona findPersona(Long id);
}
