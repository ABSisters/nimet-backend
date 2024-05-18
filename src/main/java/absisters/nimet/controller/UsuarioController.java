package absisters.nimet.controller;

import absisters.nimet.dto.UsuarioPutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import absisters.nimet.dto.UsuarioPostRequest;
import absisters.nimet.dto.UsuarioResponse;
import absisters.nimet.service.UsuarioService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/usuarios")
@AllArgsConstructor
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/cadastrar")
	public UsuarioResponse post(@RequestBody @Valid @NotNull UsuarioPostRequest usuario) {
		return usuarioService.create(usuario);
	}

	@GetMapping ("/teste")
	public String login() {
		return "login";
	}

	@PostMapping ("/logar")
	public UsuarioResponse logar (@RequestParam (value = "login") String login,
			@RequestParam ("senha") String senha) throws Exception {
		return usuarioService.login(login, senha);
	}

	@PutMapping("/mudar/{id}")
	public UsuarioResponse put(@PathVariable String id, @RequestBody @Valid @NotNull UsuarioPutRequest usuario) {
		return usuarioService.update(id, usuario);
	}
}
