1º-Documento de Levantamento de Requisitos
Projeto: Gerenciador de Hardware para Laboratórios

Data: 24/10/2024

Responsável: Rafael Moraes e Junior Lima

1. Introdução
1.1. Objetivo 🎯
Este documento detalha os requisitos funcionais e não funcionais do sistema "Gerenciador de Hardware para Laboratórios", que permitirá o controle e monitoramento de máquinas, consertos, peças trocadas e inventário de componentes em um ou mais laboratórios.


1.2. Escopo 📚
O sistema gerenciará:
🔧 Cadastro e controle de máquinas de diversos laboratórios.
🛠️ Registro de manutenções, consertos e peças trocadas.
📦 Inventário de peças e componentes de hardware.
📊 Geração de relatórios de desempenho e uso.


1.3. Definições, Acrônimos e Abreviações 📖
Máquina: Equipamento de hardware utilizado nos laboratórios.
Peça: Componente de hardware que pode ser substituído ou reparado.
Conserto: Ação de reparar ou restaurar uma máquina.
Inventário: Lista de todos os componentes de hardware disponíveis.


2. Requisitos Funcionais
2.1. Cadastro de Máquinas 🖥️
RF-01: Permitir o cadastro de máquinas com especificações de hardware (CPU, RAM, armazenamento).
RF-02: Associar cada máquina a um laboratório específico.
RF-03: Exibir o status atual da máquina (funcionando, em manutenção, fora de uso).


2.2. Controle de Consertos e Manutenções 🔧
RF-04: Registrar manutenções corretivas e preventivas realizadas em uma máquina.
RF-05: Associar peças utilizadas no conserto à respectiva manutenção.
RF-06: Armazenar um histórico completo de manutenções realizadas em cada máquina.
RF-07: Criar agendamentos de manutenções preventivas.
RF-08: Notificar usuários sobre manutenções agendadas via e-mail ou mensagem.


2.3. Controle de Peças e Inventário 📦
RF-09: Permitir o cadastro de peças de hardware no inventário (tipo, fabricante, quantidade).
RF-10: Registrar peças retiradas do estoque para consertos.
RF-11: Emitir alertas quando uma peça estiver com baixa quantidade no estoque.
RF-12: Permitir a importação e exportação de inventários em formatos CSV e Excel.


2.4. Gerenciamento de Laboratórios 🏢
RF-13: Gerenciar múltiplos laboratórios, associando máquinas e peças a seus respectivos locais.
RF-14: Exibir um painel geral com o status das máquinas em todos os laboratórios.
RF-15: Permitir a personalização do layout e categorias dos laboratórios.


2.5. Relatórios e Auditorias 📊
RF-16: Gerar relatórios de consertos e manutenções realizados em um período definido.
RF-17: Gerar relatórios sobre o uso e troca de peças ao longo do tempo.
RF-18: Permitir a exportação de relatórios em formatos como PDF ou Excel.
RF-19: Incluir gráficos e visualizações interativas nos relatórios.


2.6. Controle de Acesso e Usuários 🔑
RF-20: Criar perfis de usuário com diferentes níveis de acesso (técnicos, administradores).
RF-21: Manter logs de todas as ações realizadas pelos usuários.
RF-22: Implementar recuperação de senha via e-mail.


3. Requisitos Não Funcionais
3.1. Desempenho ⚡
RNF-01: Processar e exibir informações de até 1000 máquinas e peças de hardware sem perda significativa de desempenho.


3.2. Usabilidade 💡
RNF-02: Interface intuitiva para facilitar o registro de manutenções e gerenciamento de inventário.
RNF-03: Disponibilizar tutoriais e documentação online para usuários.


3.3. Confiabilidade 🔒
RNF-04: Manter backup automático dos dados a cada 24 horas.
RNF-05: Garantir a integridade dos dados por meio de validações.


3.4. Portabilidade 🌍
RNF-06: Funcionamento multiplataforma (Windows, Linux e macOS).


3.5. Segurança 🔐
RNF-07: Garantir controle de acesso através de autenticação de usuário.
RNF-08: Registrar todas as ações dos usuários para auditoria futura.
RNF-09: Implementar criptografia para dados sensíveis.


4. Requisitos de Interface
4.1. Interface Gráfica 🎨
RI-01: Interface gráfica baseada em JavaFX ou Swing.
RI-02: Exibir gráficos de desempenho de máquinas e peças com bibliotecas como JFreeChart.


4.2. Relatórios 📑
RI-03: Permitir a geração de relatórios em tempo real, com filtros de data, laboratório ou máquina específica.
RI-04: Fornecer a opção de agendar a geração automática de relatórios.


5. Considerações Finais 📝
O sistema "Gerenciador de Hardware para Laboratórios" deve facilitar o controle e monitoramento das máquinas e peças de hardware, proporcionando maior eficiência na gestão de manutenção e inventário dos laboratórios. Este documento deverá ser revisado periodicamente conforme novas funcionalidades e necessidades sejam identificadas.


6. Requisitos de Integração
6.1. Integração com Sistemas Externos 🌐
RI-01: Possibilitar integração com sistemas de gestão de laboratórios existentes.
RI-02: Permitir importação e exportação de dados via APIs.
