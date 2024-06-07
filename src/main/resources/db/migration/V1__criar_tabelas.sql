CREATE TABLE usuarios (
    usuario_id varchar2(32) NOT NULL,
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
    token_id varchar2(32) NOT NULL,
    usuario_id varchar2(32) NOT NULL,
    token number(6) NOT NULL,
    data_criado date NOT NULL,
    CONSTRAINT token_pk PRIMARY KEY (token_id),
    CONSTRAINT usuario_fk FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id)
);