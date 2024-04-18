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
    CONSTRAINT usuario_pk PRIMARY KEY (usuario_id)
);