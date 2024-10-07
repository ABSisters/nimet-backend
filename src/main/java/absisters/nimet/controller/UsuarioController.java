package absisters.nimet.controller;

import absisters.nimet.dto.Request.DenunciaPostRequest;
import absisters.nimet.dto.Request.LoginRequest;
import absisters.nimet.dto.Request.UsuarioPostRequest;
import absisters.nimet.dto.Request.UsuarioPutSenhaRequest;
import absisters.nimet.dto.Response.UsuarioResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public UsuarioResponse logar (@RequestBody @Valid @NotNull LoginRequest login) throws Exception {
		return usuarioService.login(login);
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

	@PostMapping ("/denunciar")
	public ResponseEntity denunciar (@RequestBody @Valid @NotNull DenunciaPostRequest denuncia) {
		return usuarioService.denuncia(denuncia);
	}
}