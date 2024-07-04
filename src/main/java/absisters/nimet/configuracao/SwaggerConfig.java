package absisters.nimet.configuracao;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    //Para acessar o swagger, primeiro execute o back-end e depois entre em seu navagador e acesse o link http://localhost:8080/swagger-ui/index.html

    @Bean
    public OpenAPI defineOpenApi() {
        io.swagger.v3.oas.models.servers.Server server = new Server();
        server.setUrl("http://localhost:8080");
        server.setDescription("Nimet");

        Info information = new Info()
                .title("Swagger - Nimet")
                .description("Essa API possui os endpoints de Nimet, facilitando a visualização e entendimento da aplicação.");
        return new OpenAPI().info(information).servers(List.of(server));
    }
}
