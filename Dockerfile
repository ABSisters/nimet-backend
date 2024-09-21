# Usar uma imagem base com o Java
FROM openjdk:17-oracle

# Definir o diretório de trabalho
#WORKDIR /app

# Copiar o JAR da sua aplicação para o contêiner
COPY target/nimet-0.0.1-SNAPSHOT.jar app.jar

# Expor a porta que a aplicação irá usar
EXPOSE 80

# Comando para rodar a aplicação
CMD ["java", "-jar", "app.jar"]
