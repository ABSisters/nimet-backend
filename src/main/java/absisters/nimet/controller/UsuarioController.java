package absisters.nimet.controller;

import absisters.nimet.dto.Request.UsuarioPutRequest;
import absisters.nimet.dto.Request.UsuarioPutSenhaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import absisters.nimet.dto.Request.UsuarioPostRequest;
import absisters.nimet.dto.Response.UsuarioResponse;
import absisters.nimet.service.UsuarioService;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/usuarios")
@AllArgsConstructor
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/cadastrar")
	public UsuarioResponse post(@RequestBody @NotNull UsuarioPostRequest usuario) {
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

	@PutMapping("/mudar/{usuarioId}")
	public UsuarioResponse put(@PathVariable String usuarioId, @RequestBody @NotNull UsuarioPutRequest usuario) {
		return usuarioService.update(usuarioId, usuario);
	}

	@PutMapping("/mudar/senha/{usuarioId}")
	public UsuarioResponse putSenha(@PathVariable String usuarioId, @RequestBody @NotNull UsuarioPutSenhaRequest usuario) {
		return usuarioService.updateSenha(usuarioId, usuario);
	}

	@DeleteMapping("/deletar/{usuarioId}")
	public void delete(@PathVariable String usuarioId) {
		usuarioService.delete(usuarioId);
	}
}
