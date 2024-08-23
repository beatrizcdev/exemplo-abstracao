# Levando em consideração o conceito de abstração: “abstração em orientação a objetos é usado para representar e modelar diferentes aspectos e funcionalidades do sistema de uma forma simplificada e compreensível.”, as classes de objetos presentes numa plataforma de streaming que seriam relevantes ao algoritmo seriam:

**•	Usuário:**
Com atributos sendo: *ID do usuário, Senha, Nome, e-mail, Data de nascimento, Plano de Assinatura;*
E métodos possíveis: *Registrar, Fazer Login, Atualizar Senha, Editar Perfil, e Editar Assinatura.*

**•	Perfil:**
Com atributos sendo: *ID do Perfil, Nome do Perfil, Preferência de idioma, Configurações de Privacidade;*
E métodos possíveis: *Criar perfil, Editar Perfil, Deletar perfil.*

**•	Conteúdo:**
Com atributos sendo: *ID do conteúdo, Título, Genero, Ano de Lançamento, Classificação indicativa, Duração;*
E métodos possíveis: *Buscar, Filtrar, Detalhes.*

**•	Filme (herda de conteúdo):**
Com atributos sendo: *Diretor, Elenco, Sinopse;*
E métodos: *Assistir, Adicionar aos favoritos.*

**•	Serie (herda de conteúdo):**
Com atributos sendo: *Temporadas, nº Episodios, Elenco;*
E métodos: *Selecionar temporada, Assistir, Adicionar aos favoritos.*

**•	Episódio (herda de conteúdo):**
Com atributos sendo: *Temporada, nº Episodio, Duração;*
E métodos: *Assistir.*

**•	Categoria:**
Com atributos sendo: *ID da categoria, Nome, Descrição;*
E métodos: *Filtrar por categoria.*

**•	Avaliação:**
Com atributos sendo: *Notas, Comentários de Usuários, ID da avaliação, Usuário;*
E métodos: *Fazer avaliação, Visualizar Avaliações.*

**•	Assinatura:**
Com atributos sendo: *ID da assinatura, Tipo de plano, Método de Cobrança, Status de Pagamento, Data de início, Data de término;
E métodos: *Gerenciar Assinatura, Verificar Status de Pagamento.*

**•	Notificação:**
Com atributos sendo: *Permissão de notificações, Tipo de notificação;*
E métodos: *Marcar como lida, Gerenciar permissões de notificação.*

**•	Recomendação:**
Com atributos sendo: *Conteúdo Recomendado;*
E métodos: *Gerar recomendações, Visualizar recomendações.*

# Tendo em vista tudo isso, o código no arquivo index.java utiliza a classe de usuário e o método fazer login para exemplificar a ideia