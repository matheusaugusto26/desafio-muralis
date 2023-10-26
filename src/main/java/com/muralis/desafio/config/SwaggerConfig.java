package com.muralis.desafio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
        .info(new Info().title("Portal de Clientes")
        .description("Essa API foi construída "
        + "como Desafio para o Processo Seletivo "
        + "da Muralis Tecnologia."
        
        +"<br><br>Desenvolvi métodos "
        + "para atender todas as operações fundamentais "
        + "relacionadas aos clientes, contatos e telefones. "
        + "A estrutura implementada proporciona eficiência e "
        + "escalabilidade para futuras expansões."
        
        +"<br><br>Realizei a criação dos DTOs e Mappers, no entanto,"
        + "reconheço que há espaço para otimização e continuarei"
        + "a construção desse projeto posteriormente, como "
        + "comprometimento e desafio pessoal."
        
        +"<br><br>Foi realizada uma tentativa de implementar a "
        + "integração com a API ViaCep para verificação dos CEPs inseridos. "
        + "Contudo, enfrentei desafios técnicos específicos. "
        + "Estou também focado em superar essas barreiras e "
        + "otimizar a funcionalidade de busca de CEPs.")
        
        .version("1.0"));
    }
}