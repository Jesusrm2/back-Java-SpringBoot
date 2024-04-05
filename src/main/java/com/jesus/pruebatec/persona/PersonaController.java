package com.jesus.pruebatec.persona;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/persona")
@RequiredArgsConstructor
@CrossOrigin(origins = {"http://localhost:4200"})
public class PersonaController {
    private final PersonaService personaService;
    @GetMapping(value = "{id}")
    public ResponseEntity<PersonaDTO> getPersona(@Validated  @PathVariable Integer id)
    {
        PersonaDTO personaDTO = personaService.getPersona(id);
        if (personaDTO==null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personaDTO);
    }

    @PutMapping()
    public ResponseEntity<PersonaResponse> updatePersona(@Validated @RequestBody PersonaRequest personaRequest)
    {
        return ResponseEntity.ok(personaService.updatePersona(personaRequest));
    }
}
