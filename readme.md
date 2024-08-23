<h2> Levando em consideração o conceito de abstração: “abstração em orientação a objetos é usado para representar e modelar diferentes aspectos e funcionalidades do sistema de uma forma simplificada e compreensível.”, as classes de objetos presentes numa plataforma de streaming que seriam relevantes ao algoritmo seriam:</h2>

**•	Usuário:**<br>
<p>Com atributos sendo: *ID do usuário, Senha, Nome, e-mail, Data de nascimento, Plano de Assinatura;*</p>
<p>E métodos possíveis: *Registrar, Fazer Login, Atualizar Senha, Editar Perfil, e Editar Assinatura.*</p>

**•	Perfil:**<br>
<p>Com atributos sendo: *ID do Perfil, Nome do Perfil, Preferência de idioma, Configurações de Privacidade;*</p>
<p>E métodos possíveis: *Criar perfil, Editar Perfil, Deletar perfil.*</p>

**•	Conteúdo:**<br>
<p>Com atributos sendo: *ID do conteúdo, Título, Genero, Ano de Lançamento, Classificação indicativa, Duração;*</p>
<p>E métodos possíveis: *Buscar, Filtrar, Detalhes.*</p>

**•	Filme (herda de conteúdo):**<br>
<p>Com atributos sendo: *Diretor, Elenco, Sinopse;*</p>
<p>E métodos: *Assistir, Adicionar aos favoritos.*</p>

**•	Serie (herda de conteúdo):**<br>
<p>Com atributos sendo: *Temporadas, nº Episodios, Elenco;*</p>
<p>E métodos: *Selecionar temporada, Assistir, Adicionar aos favoritos.*</p>

**•	Episódio (herda de conteúdo):**<br>
<p>Com atributos sendo: *Temporada, nº Episodio, Duração;*</p>
E métodos: *Assistir.*</p>

**•	Categoria:**<br>
<p>Com atributos sendo: *ID da categoria, Nome, Descrição;*</p>
<p>E métodos: *Filtrar por categoria.*</p>

**•	Avaliação:**<br>
<p>Com atributos sendo: *Notas, Comentários de Usuários, ID da avaliação, Usuário;*</p>
<p>E métodos: *Fazer avaliação, Visualizar Avaliações.*</p>

**•	Assinatura:**<br>
<p>Com atributos sendo: *ID da assinatura, Tipo de plano, Método de Cobrança, Status de Pagamento, Data de início, Data de término;</p>
<p>E métodos: *Gerenciar Assinatura, Verificar Status de Pagamento.*</p>

**•	Notificação:**<br>
<p>Com atributos sendo: *Permissão de notificações, Tipo de notificação;*</p>
<p>E métodos: *Marcar como lida, Gerenciar permissões de notificação.*</p>

**•	Recomendação:**<br>
<p>Com atributos sendo: *Conteúdo Recomendado;*</p>
<p>E métodos: *Gerar recomendações, Visualizar recomendações.*</p>

<h4> Tendo em vista tudo isso, o código no arquivo Main.java utiliza a classe de usuário e o método fazer login para exemplificar a ideia </h4>