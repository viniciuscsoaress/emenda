
package com.emendas.controller;
import com.emendas.model.*;
import com.emendas.repository.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/emendas")
@CrossOrigin(origins = "*")
public class EmendaController {
    private final EmendaRepository repo;
    public EmendaController(EmendaRepository repo) { this.repo = repo; }

    @GetMapping public List<Emenda> listar() { return repo.findAll(); }
    @PostMapping public Emenda criar(@RequestBody Emenda emenda) { return repo.save(emenda); }
    @PostMapping("/{id}/uso") public Emenda registrarUso(@PathVariable Long id,@RequestBody Uso uso){
        Emenda e = repo.findById(id).orElseThrow();
        e.getUsos().add(uso);
        return repo.save(e);
    }
}
