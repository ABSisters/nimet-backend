CREATE TABLE usuarios (
    usuario_id char(32) NOT NULL,
    nome varchar2(100) NOT NULL,
    username varchar2(20) NOT NULL,
    email varchar2(256) NOT NULL,
    email_valido number(1) NOT NULL,
    data_nascimento date NOT NULL,
    senha varchar2(64) NOT NULL,
    curso varchar2(20) NOT NULL CHECK( curso IN ('ELETRONICA','INFORMATICA','MECANICA')),
    tipo_usuario varchar2(20) NOT NULL CHECK( tipo_usuario IN ('ESTUDANTE','MODERADOR')),
    data_criado date NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY (usuario_id)
);

CREATE TABLE emailtoken (
    token_id char(32) NOT NULL,
    usuario_id char(32) NOT NULL,
    token number(6) NOT NULL,
    data_expirado date NOT NULL,
    data_criado date NOT NULL,
    CONSTRAINT token_pk PRIMARY KEY (token_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);

CREATE TABLE perguntas (
    pergunta_id char(32) NOT NULL,
    curso varchar2(20) NOT NULL,
    usuario_id char(32) NOT NULL,
    titulo varchar2(20) NOT NULL,
    detalhes varchar2(200) NOT NULL,
    tags varchar2(30) NOT NULL,
    status number(1) NOT NULL,
    data_criado date NOT NULL,
    CONSTRAINT pergunta_pk PRIMARY KEY (pergunta_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);