CREATE TABLE IF NOT EXISTS usuarios (
    usuario_id char(32) NOT NULL,
    nome varchar(100) NOT NULL,
    username varchar(20) NOT NULL,
    email varchar(256) NOT NULL,
    email_valido boolean NOT NULL,
    senha varchar(64) NOT NULL,
    curso varchar(20) NOT NULL CHECK( curso IN ('ELETRONICA','INFORMATICA','MECANICA')),
    tipo_usuario varchar(20) NOT NULL CHECK( tipo_usuario IN ('ESTUDANTE','MODERADOR')),
    data_criado timestamp NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (usuario_id)
);

CREATE TABLE IF NOT EXISTS emailtoken (
    token_id char(32) NOT NULL,
    usuario_id char(32) NOT NULL,
    token integer NOT NULL,
    data_expirado timestamp NOT NULL,
    data_criado timestamp NOT NULL,
    CONSTRAINT token_pk PRIMARY KEY (token_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);

CREATE TABLE IF NOT EXISTS perguntas (
    pergunta_id char(32) NOT NULL,
    curso varchar(20) NOT NULL,
    usuario_id char(32) NOT NULL,
    titulo varchar(300) NOT NULL,
    detalhes varchar(600) NOT NULL,
    status boolean NOT NULL,
    data_criado timestamp NOT NULL,
    CONSTRAINT pergunta_pk PRIMARY KEY (pergunta_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);

CREATE TABLE IF NOT EXISTS respostas (
    resposta_id char(32) NOT NULL,
    usuario_id char(32) NOT NULL,
    pergunta_id char(32) NOT NULL,
    resposta varchar(600) NOT NULL,
    data_criado timestamp NOT NULL,
    CONSTRAINT resposta_pk PRIMARY KEY (resposta_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id),
    CONSTRAINT pergunta_fk FOREIGN KEY (pergunta_id) REFERENCES perguntas(pergunta_id)
);

CREATE TABLE IF NOT EXISTS questoes (
    questao_id char(32) NOT NULL,
    curso varchar(20) NOT NULL CHECK( curso IN ('ELETRONICA','INFORMATICA','MECANICA')),
    nivel varchar(20) NOT NULL CHECK( nivel IN ('BASICO','INTERMEDIARIO','AVANCADO')),
    questao varchar(400) NOT NULL,
    CONSTRAINT questao_pk PRIMARY KEY (questao_id)
);

CREATE TABLE IF NOT EXISTS opcoes (
    opcao_id char(32) NOT NULL,
    questao_id char(32) NOT NULL,
    opcao varchar(600) NOT NULL,
    correta boolean NOT NULL,
    CONSTRAINT opcao_pk PRIMARY KEY (opcao_id),
    CONSTRAINT questao_fk FOREIGN KEY (questao_id) REFERENCES questoes(questao_id)
);

CREATE TABLE IF NOT EXISTS quiz (
    quiz_id char(32) NOT NULL,
    usuario_id char(32) NOT NULL,
    curso varchar(20) NOT NULL CHECK( curso IN ('ELETRONICA','INFORMATICA','MECANICA')),
    nivel varchar(20) NOT NULL CHECK( nivel IN ('BASICO','INTERMEDIARIO','AVANCADO')),
    acertos integer NOT NULL,
    erros integer NOT NULL,
    data_criado timestamp NOT NULL,
    CONSTRAINT quiz_pk PRIMARY KEY (quiz_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);