package absisters.nimet.controller;

import absisters.nimet.dto.Request.UsuarioPostRequest;
import absisters.nimet.dto.Request.UsuarioPutSenhaRequest;
import absisters.nimet.dto.Response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

	@PutMapping("/mudar")
	public UsuarioResponse put(@RequestBody @Valid @NotNull UsuarioResponse usuario) {
		return usuarioService.update(usuario);
	}

	@PutMapping("/mudar/senha")
	public UsuarioResponse putSenha(@RequestBody @Valid @NotNull UsuarioPutSenhaRequest usuario) throws Exception {
		return usuarioService.updateSenha(usuario);
	}

	@DeleteMapping("/deletar/{usuarioId}")
	public void delete(@PathVariable String usuarioId) {
		usuarioService.delete(usuarioId);
	}
}