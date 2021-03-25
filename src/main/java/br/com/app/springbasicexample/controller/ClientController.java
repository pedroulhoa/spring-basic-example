package br.com.app.springbasicexample.controller;

import br.com.app.springbasicexample.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

    @GetMapping(path = "/10")
    public Client getClient() {
        return new Client(10, "Pedro", "078.569.854-76");
    }
}
