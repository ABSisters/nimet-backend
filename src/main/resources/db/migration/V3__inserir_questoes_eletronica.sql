-- Adicionando as perguntas do quiz

-- Eletronica

-- Basico
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('1', 'ELETRONICA', 'BASICO', 'Qual é a unidade de medida da resistência elétrica?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('1', '1', 'Volt', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('2', '1', 'Ampere', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('3', '1', 'Ohm', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('4', '1', 'Watt', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('2', 'ELETRONICA', 'BASICO', 'Qual é a lei de Ohm?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('5', '2', 'V=I.R', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('6', '2', 'V=I.P', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('7', '2', 'V=I.C', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('8', '2', 'V=I.L', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('3', 'ELETRONICA', 'BASICO', 'Qual componente é utilizado para armazenar energia em um campo elétrico?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('9', '3', 'Resistor', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('10', '3', 'Capacitor', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('11', '3', 'Indutor', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('12', '3', 'Diodo', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('4', 'ELETRONICA', 'BASICO', 'Qual é a unidade de medida da capacitância?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('13', '4', 'Ohm', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('14', '4', 'Farad', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('15', '4', 'Henry', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('16', '4', 'Volt', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('5', 'ELETRONICA', 'BASICO', 'Qual componente é utilizado para permitir a passagem de corrente em apenas uma direção?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('17', '5', 'Transistor', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('18', '5', 'Resistor', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('19', '5', 'Diodo', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('20', '5', 'Capacitor', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('6', 'ELETRONICA', 'BASICO', 'Qual é a unidade de medida da indutância?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('21', '6', 'Volt', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('22', '6', 'Farad', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('23', '6', 'Henry', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('24', '6', 'Ohm', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('7', 'ELETRONICA', 'BASICO', 'Qual é a principal função de um transistor?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('25', '7', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('26', '7', 'Permitir a passagem de corrente em uma direção', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('27', '7', 'Amplificar sinais elétricos', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('28', '7', 'Regular a tensão', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('8', 'ELETRONICA', 'BASICO', 'Qual é a função de um resistor em um circuito?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('29', '8', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('30', '8', 'Resistir ao fluxo de corrente', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('31', '8', 'Permitir a passagem de corrente em uma direção', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('32', '8', 'Amplificar sinais', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('9', 'ELETRONICA', 'BASICO', 'O que é um circuito em série?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('33', '9', 'Um circuito onde os componentes estão conectados em ramos separados', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('34', '9', 'Um circuito onde os componentes estão conectados lado a lado', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('35', '9', 'Um circuito onde os componentes estão conectados em uma única linha contínua ', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('36', '9', 'Um circuito onde os componentes estão conectados ao acaso', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('10', 'ELETRONICA', 'BASICO', 'O que é um circuito em paralelo?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('37', '10', 'Um circuito onde os componentes estão conectados em ramos separados', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('38', '10', 'Um circuito onde os componentes estão conectados em uma única linha contínua', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('39', '10', 'Um circuito onde os componentes estão conectados ao acaso', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('40', '10', 'Um circuito onde os componentes estão conectados em um ponto central', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('11', 'ELETRONICA', 'BASICO', 'Qual é a função de um diodo zener?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('41', '11', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('42', '11', 'Permitir a passagem de corrente em uma direção', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('43', '11', 'Regulamentar a tensão', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('44', '11', 'Amplificar sinais', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('12', 'ELETRONICA', 'BASICO', 'Qual é a principal diferença entre um capacitor e um indutor?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('45', '12', 'Capacitores armazenam energia em um campo elétrico, enquanto indutores armazenam energia em um campo magnético', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('46', '12', 'Capacitores resistem ao fluxo de corrente, enquanto indutores permitem a passagem de corrente em uma direção', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('47', '12', 'Capacitores amplificam sinais, enquanto indutores armazenam energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('48', '12', 'Capacitores regulamentam a tensão, enquanto indutores resistem ao fluxo de corrente', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('13', 'ELETRONICA', 'BASICO', 'Qual é a fórmula para calcular a energia armazenada em um capacitor?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('49', '13', 'E=(LI²)/2', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('50', '13', 'E=(CV²)/2', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('51', '13', 'E=(RI²)/2', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('52', '13', 'E=(VI²)/2', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('14', 'ELETRONICA', 'BASICO', 'O que é a frequência de ressonância em um circuito RLC?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('53', '14', 'A frequência em que a impedância do circuito é máxima', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('54', '14', 'A frequência em que a corrente no circuito é mínima', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('55', '14', 'A frequência em que a impedância do circuito é mínima e a corrente é máxima', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('56', '14', 'A frequência em que a tensão no circuito é mínima', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('15', 'ELETRONICA', 'BASICO', 'Qual é a unidade de medida da corrente elétrica?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('57', '15', 'Volt', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('58', '15', 'Ohm', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('59', '15', 'Ampere', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('60', '15', 'Watt', 0);


-- Intermediario
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('16', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a principal função de um amplificador operacional (op-amp)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('61', '16', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('62', '16', 'Amplificar sinais elétricos e realizar operações matemáticas básicas', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('63', '16', 'Regular a tensão', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('64', '16', 'Permitir a passagem de corrente em uma direção', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('17', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é o ganho de um amplificador operacional ideal em configuração de realimentação negativa??');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('65', '17', 'Zero', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('66', '17', 'Infinito', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('67', '17', 'Um', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('68', '17', 'Dez', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('18', 'ELETRONICA', 'INTERMEDIARIO', 'O que é um transistor de efeito de campo (FET)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('69', '18', 'Um dispositivo que amplifica sinais usando junções semicondutoras', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('70', '18', 'Um dispositivo que amplifica sinais usando o efeito de campo em um canal semicondutor', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('71', '18', 'Um dispositivo que armazena energia em um campo magnético', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('72', '18', 'Um dispositivo que regula a tensão', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('19', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a principal diferença entre um transistor bipolar (BJT) e um transistor de efeito de campo (FET)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('73', '19', 'O BJT usa corrente para controle, enquanto o FET usa tensão', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('74', '19', 'O BJT usa tensão para controle, enquanto o FET usa corrente', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('75', '19', 'O BJT armazena energia, enquanto o FET amplifica sinais', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('76', '19', 'O BJT regula a tensão, enquanto o FET regula a corrente', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('20', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a fórmula da tensão de polarização base-emissor (V_BE) de um transistor BJT em modo ativo?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('77', '20', 'V_BE = 0,7V para silício ', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('78', '20', 'V_BE = 1,2V para germânio', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('79', '20', 'V_BE = 0,3V para silício', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('80', '20', 'V_BE = 1,0V para germânio', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('21', 'ELETRONICA', 'INTERMEDIARIO', 'O que é a impedância de entrada de um amplificador operacional ideal?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('81', '21', 'Alta impedância', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('82', '21', 'Baixa impedância', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('83', '21', 'Impedância média', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('84', '21', 'Impedância nula', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('22', 'ELETRONICA', 'INTERMEDIARIO', 'O que é um filtro passa-baixas?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('85', '22', 'Um filtro que permite a passagem de frequências abaixo de um determinado ponto de corte e atenua frequências acima desse ponto', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('86', '22', 'Um filtro que permite a passagem de frequências acima de um determinado ponto de corte e atenua frequências abaixo desse ponto', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('87', '22', 'Um filtro que permite a passagem de todas as frequências', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('88', '22', 'Um filtro que bloqueia todas as frequências', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('23', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a função de um diodo Schottky?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('89', '23', 'Amplificar sinais', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('90', '23', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('91', '23', 'Proteger circuitos contra sobretensões', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('92', '23', 'Oferecer uma baixa tensão direta e rápida recuperação', 1);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('24', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é o propósito de um regulador de tensão?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('93', '24', 'Amplificar sinais', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('94', '24', 'Estabilizar a tensão de saída para um valor constante, independentemente das variações na tensão de entrada ou carga', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('95', '24', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('96', '24', 'Permitir a passagem de corrente em uma direção', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('25', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a diferença entre um regulador linear e um regulador de chaveamento (switching)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('97', '25', 'O regulador linear usa um transistor como chave, enquanto o regulador de chaveamento usa um transistor para amplificação', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('98', '25', 'O regulador linear é menos eficiente e dissipa energia na forma de calor, enquanto o regulador de chaveamento é mais eficiente e usa um método de chaveamento para regular a tensão', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('99', '25', 'O regulador linear tem uma resposta rápida, enquanto o regulador de chaveamento tem uma resposta lenta', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('100', '25', 'O regulador linear é mais caro, enquanto o regulador de chaveamento é mais barato', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('26', 'ELETRONICA', 'INTERMEDIARIO', 'O que é a frequência de corte de um filtro?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('101', '26', 'A frequência em que a resposta do filtro atinge seu valor máximo', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('102', '26', 'A frequência em que a resposta do filtro atinge seu valor mínimo', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('103', '26', 'A frequência na qual a potência do sinal é reduzida em 3 dB em relação ao valor máximo', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('104', '26', 'A frequência em que o filtro começa a oscilar', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('27', 'ELETRONICA', 'INTERMEDIARIO', 'O que é a resposta em frequência de um circuito?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('105', '27', 'A forma de onda gerada pelo circuito', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('106', '27', 'A variação da tensão em função do tempo', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('107', '27', 'A forma como o circuito responde a diferentes frequências de entrada', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('108', '27', 'A quantidade de corrente que passa pelo circuito', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('28', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a característica principal de um amplificador operacional em configuração de seguidor de tensão?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('109', '28', 'Amplificação de corrente', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('110', '28', 'Ganho de tensão unitário e alta impedância de entrada', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('111', '28', 'Ganho de corrente unitário e baixa impedância de entrada', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('112', '28', 'Amplificação de potência e baixa impedância de entrada', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('29', 'ELETRONICA', 'INTERMEDIARIO', 'Qual é a função de um potenciômetro em um circuito?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('113', '29', 'Armazenar energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('114', '29', 'Regular a corrente', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('115', '29', 'Ajustar a resistência para variar a tensão ou corrente no circuito', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('116', '29', 'Amplificar sinais', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('30', 'ELETRONICA', 'INTERMEDIARIO', 'O que é um amplificador inversor?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('117', '30', 'Um amplificador que aumenta a tensão e a inverte a fase do sinal de entrada', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('118', '30', 'Um amplificador que diminui a tensão e mantém a mesma fase do sinal de entrada', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('119', '30', 'Um amplificador que diminui a corrente e inverte a fase do sinal de entrada', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('120', '30', 'Um amplificador que aumenta a potência e mantém a mesma fase do sinal de entrada', 0);


-- Avancado
INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('31', 'ELETRONICA', 'AVANCADO', 'Qual é a principal função de um filtro passa-banda?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('121', '31', 'Permitir a passagem de todas as frequências', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('122', '31', 'Permitir a passagem de frequências acima de um ponto de corte e atenuar frequências abaixo desse ponto', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('123', '31', 'Permitir a passagem de frequências abaixo de um ponto de corte e atenuar frequências acima desse ponto', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('124', '31', 'Permitir a passagem de frequências dentro de uma faixa específica e atenuar frequências fora dessa faixa', 1);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('32', 'ELETRONICA', 'AVANCADO', 'Qual é a principal vantagem dos circuitos integrados (ICs) em relação aos circuitos discretos?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('125', '32', 'Maior consumo de energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('126', '32', 'Maior custo de produção', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('127', '32', 'Maior confiabilidade e menor tamanho', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('128', '32', 'Menor densidade de componentes', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('33', 'ELETRONICA', 'AVANCADO', 'Qual é a função de um conversor digital-analógico (DAC)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('129', '33', 'Converter um sinal digital em um sinal analógico', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('130', '33', 'Converter um sinal analógico em um sinal digital', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('131', '33', 'Amplificar sinais analógicos', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('132', '33', 'Filtrar sinais digitais', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('34', 'ELETRONICA', 'AVANCADO', 'Qual é a principal característica de um amplificador classe D?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('133', '34', 'Alta eficiência devido à operação em modo chaveado', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('134', '34', 'Baixa eficiência devido à operação linear', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('135', '34', 'Alta distorção harmônica', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('136', '34', 'Baixa potência de saída', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('35', 'ELETRONICA', 'AVANCADO', 'Qual é a função de um PLL (Phase-Locked Loop)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('137', '35', 'Armazenar energia em um campo magnético', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('138', '35', 'Ampliar a largura de banda de um sinal', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('139', '35', 'Sincronizar a fase de um sinal de saída com um sinal de referência', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('140', '35', 'Regular a tensão de alimentação', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('36', 'ELETRONICA', 'AVANCADO', 'Qual é a função principal de um microcontrolador?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('141', '36', 'Regular a tensão de saída', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('142', '36', 'Executar programas armazenados em sua memória para controlar dispositivos eletrônicos', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('143', '36', 'Amplificar sinais analógicos', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('144', '36', 'Converter sinais analógicos em sinais digitais', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('37', 'ELETRONICA', 'AVANCADO', 'O que é um MOSFET (Metal-Oxide-Semiconductor Field-Effect Transistor)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('145', '37', 'Um tipo de transistor que utiliza junções PN para controle', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('146', '37', 'Um tipo de transistor que utiliza a variação de campo elétrico para controle', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('147', '37', 'Um dispositivo passivo que armazena energia', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('148', '37', 'Um dispositivo que converte energia elétrica em energia térmica', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('38', 'ELETRONICA', 'AVANCADO', 'Qual é a principal vantagem de usar um MOSFET em circuitos de potência?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('149', '38', 'Baixa eficiência', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('150', '38', 'Alta resistência de condução', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('151', '38', 'Alta eficiência e baixa resistência de condução', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('152', '38', 'Alta corrente de fuga', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('39', 'ELETRONICA', 'AVANCADO', 'O que é um conversor analógico-digital (ADC)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('153', '39', 'Um dispositivo que converte sinais digitais em sinais analógicos', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('154', '39', 'Um dispositivo que armazena energia em um campo elétrico', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('155', '39', 'Um dispositivo que converte sinais analógicos em sinais digitais', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('156', '39', 'Um dispositivo que amplifica sinais analógicos', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('40', 'ELETRONICA', 'AVANCADO', 'Qual é a principal característica de um amplificador operacional em configuração de diferencial?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('157', '40', 'Amplificar a diferença entre duas tensões de entrada', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('158', '40', 'Amplificar a soma de duas tensões de entrada', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('159', '40', 'Regular a tensão de saída', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('160', '40', 'Converter uma tensão de entrada em corrente', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('41', 'ELETRONICA', 'AVANCADO', 'O que é um oscilador de cristal?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('161', '41', 'O que é um oscilador de cristal?', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('162', '41', 'Um dispositivo que converte sinais digitais em sinais analógicos', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('163', '41', 'Um dispositivo que gera sinais periódicos de alta estabilidade usando a ressonância de um cristal de quartzo', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('164', '41', 'Um dispositivo que regula a tensão de saída', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('42', 'ELETRONICA', 'AVANCADO', 'Qual é a função de um regulador de tensão linear de baixa queda (LDO)?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('165', '42', 'Converter energia térmica em energia elétrica', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('166', '42', 'Regular a tensão de saída com baixa queda de tensão entre entrada e saída', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('167', '42', 'Amplificar sinais de baixa frequência', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('168', '42', 'Armazenar energia em um campo elétrico', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('43', 'ELETRONICA', 'AVANCADO', 'O que é a largura de banda de um amplificador?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('169', '43', 'A frequência máxima que o amplificador pode operar', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('170', '43', 'A faixa de frequências sobre a qual o amplificador pode operar com ganho aceitável', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('171', '43', 'A quantidade de energia que o amplificador pode dissipar', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('172', '43', 'A impedância de entrada do amplificador', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('44', 'ELETRONICA', 'AVANCADO', 'Qual é a função de um optoacoplador?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('173', '44', 'Regular a tensão de saída', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('174', '44', 'Amplificar sinais elétricos', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('175', '44', 'Isolar eletricamente dois circuitos enquanto permite a transferência de sinal entre eles ', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('176', '44', 'Armazenar energia em um campo magnético', 0);

INSERT INTO Questoes (questao_id, curso, nivel, questao) VALUES ('45', 'ELETRONICA', 'AVANCADO', 'O que é uma rede de feedback negativo em um amplificador?');
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('177', '45', 'Uma rede que aumenta o ganho do amplificador', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('178', '45', 'Uma rede que diminui a impedância de entrada do amplificador', 0);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('179', '45', 'Uma rede que estabiliza o ganho do amplificador e melhora a linearidade, reduzindo a distorção', 1);
INSERT INTO Opcoes (opcao_id, questao_id, opcao, correta) VALUES ('180', '45', 'Uma rede que altera a frequência de operação do amplificador', 0);

commit;