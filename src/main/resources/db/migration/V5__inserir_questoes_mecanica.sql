-- Adicionando as perguntas do quiz

-- Mecanica

-- Basico
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('91', 'MECANICA', 'BASICO', 'Qual é a unidade de medida de força no Sistema Internacional de Unidades (SI)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('361', '91', 'Joule', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('362', '91', 'Watt', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('363', '91', 'Newton', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('364', '91', 'Pascal', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('92', 'MECANICA', 'BASICO', 'Qual é a fórmula da segunda lei de Newton?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('365', '92', 'F=m.a', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('366', '92', 'F=m.g', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('367', '92', 'F=m.v', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('368', '92', 'F=m.t', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('93', 'MECANICA', 'BASICO', 'Qual é a definição de trabalho na física?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('369', '93', 'Força aplicada em uma direção perpendicular ao movimento', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('370', '93', 'Força aplicada sobre um objeto em movimento', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('371', '93', 'Força aplicada sobre um objeto que não se move', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('372', '93', 'Produto da força aplicada sobre um objeto e a distância que ele se move na direção da força', true);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('94', 'MECANICA', 'BASICO', 'Qual é a unidade de medida de energia no Sistema Internacional de Unidades (SI)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('373', '94', 'Watt', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('374', '94', 'Joule', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('375', '94', 'Newton', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('376', '94', 'Pascal', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('95', 'MECANICA', 'BASICO', 'Qual é a fórmula para calcular a energia cinética de um objeto?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('377', '95', 'Ek=(m.v²)/2', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('378', '95', 'Ek=m.g.h', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('379', '95', 'Ek=m.a', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('380', '95', 'Ek=F.d', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('96', 'MECANICA', 'BASICO', 'O que é a força centrípeta?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('381', '96', 'A força que puxa um objeto para fora de uma curva', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('382', '96', 'A força que mantém um objeto em movimento retilíneo uniforme', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('383', '96', 'A força que atrai um objeto em direção ao centro de uma trajetória circular', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('384', '96', 'A força que resiste ao movimento de um objeto', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('97', 'MECANICA', 'BASICO', 'Qual é a definição de momento (ou quantidade de movimento)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('385', '97', 'Produto da massa e da aceleração de um objeto', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('386', '97', 'Produto da massa e da velocidade de um objeto', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('387', '97', 'Produto da força e da distância de um objeto', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('388', '97', 'Produto da energia e da distância de um objeto', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('98', 'MECANICA', 'BASICO', 'Qual é a terceira lei de Newton?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('389', '98', 'A força é igual à massa vezes a aceleração', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('390', '98', 'Para cada ação, há uma reação igual e oposta', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('391', '98', 'A aceleração de um objeto é diretamente proporcional à força líquida aplicada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('392', '98', 'Um objeto em repouso permanece em repouso, e um objeto em movimento permanece em movimento', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('99', 'MECANICA', 'BASICO', 'Qual é a definição de potência na física?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('393', '99', 'A quantidade de energia transferida ou convertida por unidade de tempo', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('394', '99', 'A quantidade de trabalho realizado por unidade de tempo', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('395', '99', 'A quantidade de força aplicada por unidade de tempo', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('396', '99', 'A quantidade de movimento de um objeto', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('100', 'MECANICA', 'BASICO', 'Qual é a fórmula para calcular a potência?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('397', '100', 'P=F.d', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('398', '100', 'P=m.a', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('399', '100', 'P=W/t', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('400', '100', 'P=F/d', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('101', 'MECANICA', 'BASICO', 'Qual é a unidade de medida de pressão no Sistema Internacional de Unidades (SI)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('401', '101', 'Newton', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('402', '101', 'Pascal', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('403', '101', 'Joule', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('404', '101', 'Watt', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('102', 'MECANICA', 'BASICO', 'O que é um torque?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('405', '102', 'A força que resiste ao movimento de um objeto', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('406', '102', 'A força que atrai um objeto em direção ao centro de uma trajetória circular', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('407', '102', 'Uma medida da força que pode causar um objeto a girar em torno de um eixo', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('408', '102', 'A força aplicada em uma direção perpendicular ao movimento', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('103', 'MECANICA', 'BASICO', 'Qual é a fórmula para calcular o torque?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('409', '103', 'T=F.d', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('410', '103', 'T=m.aT', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('411', '103', 'T=W/tT', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('412', '103', 'T=m⋅g.hT', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('104', 'MECANICA', 'BASICO', 'Qual é a diferença entre energia potencial e energia cinética?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('413', '104', 'Energia potencial é a energia devido ao movimento, enquanto energia cinética é a energia armazenada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('414', '104', 'Energia potencial é a energia armazenada, enquanto energia cinética é a energia devido ao movimento', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('415', '104', 'Não há diferença entre energia potencial e energia cinética', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('416', '104', 'Energia potencial é a energia gerada pela força, enquanto energia cinética é a energia gerada pela pressão', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('105', 'MECANICA', 'BASICO', 'O que é a lei da conservação da energia?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('417', '105', 'A energia pode ser criada e destruída', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('418', '105', 'A energia não pode ser criada ou destruída, apenas transformada de uma forma para outra', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('419', '105', 'A energia pode ser destruída, mas não pode ser criada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('420', '105', 'A energia pode ser criada, mas não pode ser destruída', false);


-- Intermediario
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('106', 'MECANICA', 'INTERMEDIARIO', 'Qual é a definição de momento angular?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('421', '106', 'Produto da massa e da velocidade linear', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('422', '106', 'Produto da força e da distância', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('423', '106', 'Produto do momento de inércia e da velocidade angular', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('424', '106', 'Produto da energia cinética e da altura', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('107', 'MECANICA', 'INTERMEDIARIO', 'Qual é a unidade de medida de momento de inércia no Sistema Internacional de Unidades (SI)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('425', '107', 'kg.m', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('426', '107', 'kg.m²', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('427', '107', 'N.m', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('428', '107', 'J.s', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('108', 'MECANICA', 'INTERMEDIARIO', 'Qual é a fórmula para a energia potencial gravitacional?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('429', '108', 'Ep=(m.v²)/2', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('430', '108', 'Ep=m.g.h', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('431', '108', 'Ep=(k.x²)/2', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('432', '108', 'Ep=p²/2m', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('109', 'MECANICA', 'INTERMEDIARIO', 'O que é um sistema conservativo?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('433', '109', 'Um sistema onde a energia mecânica total é constante', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('434', '109', 'Um sistema onde a energia cinética é constante', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('435', '109', 'Um sistema onde a energia potencial é constante', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('436', '109', 'Um sistema onde a energia térmica é constante', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('110', 'MECANICA', 'INTERMEDIARIO', 'Qual é a equação do movimento harmônico simples?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('437', '110', 'a=(d.v)/(d.t)', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('438', '110', 'F=−k.x', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('439', '110', 'Ek=(m.v²)/2', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('440', '110', 'p=m⋅v', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('111', 'MECANICA', 'INTERMEDIARIO', 'Qual é a relação entre força e aceleração angular em um objeto rotacional?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('441', '111', 'τ=I.α', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('442', '111', 'F=m.a', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('443', '111', 'W=F.d', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('444', '111', 'Ek=(I.ω²)/2', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('112', 'MECANICA', 'INTERMEDIARIO', 'O que é o coeficiente de atrito?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('445', '112', 'A razão entre a força de atrito e a força normal', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('446', '112', 'A razão entre a força de atrito e a massa', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('447', '112', 'A razão entre a força de atrito e a velocidade', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('448', '112', 'A razão entre a força de atrito e a aceleração', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('113', 'MECANICA', 'INTERMEDIARIO', 'Qual é a definição de eficiência de uma máquina?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('449', '113', 'A razão entre a energia de saída útil e a energia de entrada total', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('450', '113', 'A razão entre a força de saída e a força de entrada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('451', '113', 'A razão entre a potência de saída e a potência de entrada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('452', '113', 'A razão entre o trabalho de saída e o trabalho de entrada', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('114', 'MECANICA', 'INTERMEDIARIO', 'Qual é a diferença entre uma alavanca de primeira classe e uma alavanca de segunda classe?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('453', '114', 'Em uma alavanca de primeira classe, o fulcro está entre a carga e a força aplicada, enquanto em uma alavanca de segunda classe, a carga está entre o fulcro e a força aplicada', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('454', '114', 'Em uma alavanca de primeira classe, o fulcro está entre a carga e a força aplicada, enquanto em uma alavanca de segunda classe, a carga está entre o fulcro e a força aplicada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('455', '114', 'Em uma alavanca de primeira classe, a carga está entre o fulcro e a força aplicada, enquanto em uma alavanca de segunda classe, o fulcro está entre a força aplicada e a carga', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('456', '114', 'Não há diferença entre as duas', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('115', 'MECANICA', 'INTERMEDIARIO', 'Qual é a fórmula da energia cinética rotacional?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('457', '115', 'Ek=(m.v²)/2', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('458', '115', 'Ek=(I.ω²)/2', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('459', '115', 'Ek=m.g.h', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('460', '115', 'Ek=(k.x²)/2', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('116', 'MECANICA', 'INTERMEDIARIO', 'O que é a frequência natural de um sistema oscilante?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('461', '116', 'O que é a frequência natural de um sistema oscilante?', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('462', '116', 'A frequência com que um sistema oscila sob a ação de uma força externa periódica', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('463', '116', 'A frequência com que um sistema oscila sob a ação de uma força externa constante', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('464', '116', ') A frequência com que um sistema oscila sob a ação de uma força externa constante', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('117', 'MECANICA', 'INTERMEDIARIO', 'Qual é a definição de impulso?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('465', '117', 'Produto da força e da distância', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('466', '117', 'Produto da força e do tempo durante o qual a força é aplicada', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('467', '117', 'Produto da massa e da aceleração', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('468', '117', 'Produto da massa e da velocidade', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('118', 'MECANICA', 'INTERMEDIARIO', 'Qual é a fórmula para a aceleração centrípeta?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('469', '118', 'ac=v²/r', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('470', '118', 'ac=r.ω²', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('471', '118', 'ac=F/m', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('472', '118', 'ac=g.h', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('119', 'MECANICA', 'INTERMEDIARIO', 'Qual é a diferença entre colisão elástica e inelástica?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('473', '119', 'Em uma colisão elástica, a energia cinética total é conservada, enquanto em uma colisão inelástica, a energia cinética não é conservada', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('474', '119', 'Em uma colisão elástica, a energia potencial é conservada, enquanto em uma colisão inelástica, a energia potencial não é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('475', '119', 'Em uma colisão elástica, a quantidade de movimento não é conservada, enquanto em uma colisão inelástica, a quantidade de movimento é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('476', '119', 'Não há diferença entre as duas', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('120', 'MECANICA', 'INTERMEDIARIO', 'Qual é a definição de centro de massa de um sistema de partículas?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('477', '120', 'O ponto onde a massa total do sistema está concentrada', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('478', '120', 'O ponto onde a energia cinética total do sistema está concentrada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('479', '120', 'O ponto onde a energia potencial total do sistema está concentrada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('480', '120', 'O ponto onde a força total do sistema está concentrada', false);


-- Avancado
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('121', 'MECANICA', 'AVANCADO', 'O que é um tensor de inércia?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('481', '121', 'Um vetor que descreve a inércia rotacional de um corpo em relação a um eixo específico', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('482', '121', 'Um escalar que mede a resistência de um objeto a mudanças em seu movimento rotacional', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('483', '121', 'Uma matriz que representa a distribuição de massa de um objeto e sua resistência à rotação em diferentes eixos', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('484', '121', 'Uma constante que relaciona o torque aplicado a um objeto com sua aceleração angular', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('122', 'MECANICA', 'AVANCADO', 'Qual é a definição de um sistema de coordenadas inerciais?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('485', '122', 'Um sistema de coordenadas que se move com aceleração constante', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('486', '122', 'Um sistema de coordenadas onde a lei da inércia (primeira lei de Newton) é válida', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('487', '122', 'Um sistema de coordenadas que está sempre em repouso', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('488', '122', 'Um sistema de coordenadas que se move com velocidade constante', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('123', 'MECANICA', 'AVANCADO', 'Terceira pergunta de mecanica avançado?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('489', '123', 'Primeira opcao da terceira pergunta de mecanica avançado', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('490', '123', 'Segunda opcao da terceira pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('491', '123', 'Terceira opcao da terceira pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('492', '123', 'Quarta opcao da terceira pergunta de mecanica avançado', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('124', 'MECANICA', 'AVANCADO', 'Qual é a definição de Hamiltoniana em mecânica clássica?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('493', '124', 'A energia cinética total do sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('494', '124', 'A energia potencial total do sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('495', '124', 'A função que representa a energia total (cinética + potencial) de um sistema em termos de coordenadas generalizadas e momenta conjugados', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('496', '124', 'A função que descreve a força total atuando sobre um sistema', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('125', 'MECANICA', 'AVANCADO', 'O que é o princípio de Hamilton?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('497', '125', 'A afirmação de que a energia total de um sistema isolado é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('498', '125', 'A afirmação de que a trajetória real de um sistema entre dois pontos no tempo é aquela que minimiza a ação', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('499', '125', 'A afirmação de que a quantidade de movimento linear de um sistema é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('500', '125', 'A afirmação de que a quantidade de movimento angular de um sistema é conservada', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('126', 'MECANICA', 'AVANCADO', 'Primeira pergunta de mecanica avançado?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('501', '126', 'Primeira opcao da primeira pergunta de mecanica avançado', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('502', '126', 'Segunda opcao da primeira pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('503', '126', 'Terceira opcao da primeira pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('504', '126', 'Quarta opcao da primeira pergunta de mecanica avançado', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('127', 'MECANICA', 'AVANCADO', 'Segunda pergunta de mecanica avançado?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('505', '127', 'Primeira opcao da segunda pergunta de mecanica avançado', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('506', '127', 'Segunda opcao da segunda pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('507', '127', 'Terceira opcao da segunda pergunta de mecanica avançado', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('508', '127', 'Quarta opcao da segunda pergunta de mecanica avançado', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('128', 'MECANICA', 'AVANCADO', 'O que é uma coordenada generalizada?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('509', '128', 'Uma coordenada que descreve apenas o movimento translacional de um sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('510', '128', 'Uma coordenada que descreve apenas o movimento rotacional de um sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('511', '128', 'Uma coordenada que pode ser usada para descrever qualquer tipo de movimento em um sistema, tanto translacional quanto rotacional', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('512', '128', 'Uma coordenada que é restrita a sistemas bidimensionais', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('129', 'MECANICA', 'AVANCADO', 'Qual é a definição de momento conjugado em mecânica clássica?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('513', '129', 'O produto da massa e da velocidade de uma partícula', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('514', '129', 'A derivada da Lagrangiana em relação à velocidade generalizada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('515', '129', 'A derivada parcial da Lagrangiana em relação à coordenada generalizada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('516', '129', 'A derivada parcial da Lagrangiana em relação à velocidade generalizada', true);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('130', 'MECANICA', 'AVANCADO', 'O que é a equação de Euler-Lagrange?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('517', '130', 'Uma equação que descreve a conservação da energia em um sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('518', '130', 'Uma equação que descreve a trajetória de uma partícula em um campo gravitacional', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('519', '130', 'Uma equação diferencial usada para encontrar as equações de movimento de um sistema em coordenadas generalizadas', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('520', '130', 'Uma equação diferencial usada para encontrar as equações de movimento de um sistema em coordenadas generalizadas', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('131', 'MECANICA', 'AVANCADO', 'O que é uma transformação canônica em mecânica hamiltoniana?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('521', '131', 'Uma transformação que altera a energia total de um sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('522', '131', 'Uma transformação que altera as coordenadas e momenta de um sistema, preservando a forma das equações de Hamilton', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('523', '131', 'Uma transformação que altera apenas as coordenadas de um sistema', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('524', '131', 'Uma transformação que altera apenas os momenta de um sistema', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('132', 'MECANICA', 'AVANCADO', 'Qual é a definição de frequência angular?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('525', '132', 'A taxa de variação do ângulo de rotação por unidade de tempo', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('526', '132', 'A taxa de variação da velocidade angular por unidade de tempo', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('527', '132', 'A taxa de variação da aceleração angular por unidade de tempo', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('528', '132', 'A taxa de variação da energia cinética por unidade de tempo', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('133', 'MECANICA', 'AVANCADO', 'O que é o teorema de Noether?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('529', '133', 'Um teorema que afirma que a energia total de um sistema é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('530', '133', 'Um teorema que relaciona simetrias contínuas de um sistema com leis de conservação', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('531', '133', 'Um teorema que afirma que a quantidade de movimento linear de um sistema é conservada', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('532', '133', 'Um teorema que relaciona forças conservativas com energia potencial', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('134', 'MECANICA', 'AVANCADO', 'O que é a precessão de um giroscópio?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('533', '134', 'O movimento oscilatório de um giroscópio em torno de seu eixo principal', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('534', '134', 'A mudança gradual na orientação do eixo de rotação de um giroscópio devido a um torque externo', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('535', '134', 'O aumento da velocidade angular de um giroscópio devido a um torque externo', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('536', '134', 'A diminuição da velocidade angular de um giroscópio devido à resistência do ar', false);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('135', 'MECANICA', 'AVANCADO', 'Qual é a função de partição em mecânica estatística?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('537', '135', 'Uma função que descreve a distribuição de velocidades das partículas em um gás', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('538', '135', 'Uma função que relaciona a energia total de um sistema com sua temperatura', false);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('539', '135', 'Uma função que encapsula todas as informações termodinâmicas de um sistema em equilíbrio', true);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('540', '135', 'Uma função que descreve a trajetória das partículas em um sistema', false);
