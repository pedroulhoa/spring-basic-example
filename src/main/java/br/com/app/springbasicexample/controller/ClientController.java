package br.com.app.springbasicexample.controller;

import br.com.app.springbasicexample.entity.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/10")
    public Client getClient() {
        return new Client(10, "Pedro", "078.569.854-76");
    }

    @GetMapping("/{id}")
    public Client getByIdUriParam(@PathVariable int id) {
        return new Client(id, "João", "000.000.000-01");
    }

    @GetMapping
    public Client getByIdQueryParam(@RequestParam(name = "id", required = true) int id) {
        return new Client(id, "Maria", "000.000.000-01");
    }
}
