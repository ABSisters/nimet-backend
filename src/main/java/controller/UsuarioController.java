package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ABSisters.nimet.cadastro.UsuarioPostRequest;
import ABSisters.nimet.cadastro.UsuarioResponse;
import domain.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import service.UsuarioService;

@RestController
@RequestMapping("api/usuarios")
@AllArgsConstructor
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioResponse post(@RequestBody @Valid @NotNull UsuarioPostRequest usuario) {
        return usuarioService.create(usuario);
    }
    
    @GetMapping ("/login")
    public String login() {
    	return "login";
    }
    
    @PostMapping ("/logar")
    public Usuario logar (@RequestParam ("email") String email,
    					 @RequestParam ("senha") String senha,
    					 UsuarioPostRequest request) {
		return usuarioService.login(email, senha, request);
    }
}
