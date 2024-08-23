<h2> Levando em consideração o conceito de abstração: “abstração em orientação a objetos é usado para representar e modelar diferentes aspectos e funcionalidades do sistema de uma forma simplificada e compreensível.”, as classes de objetos presentes numa plataforma de streaming que seriam relevantes ao algoritmo seriam:</h2>
<hr>

**•	Usuário:**<br>
<p>Com atributos sendo: <i>ID do usuário, Senha, Nome, e-mail, Data de nascimento, Plano de Assinatura;</i></p>
<p>E métodos possíveis: <i>Registrar, Fazer Login, Atualizar Senha, Editar Perfil, e Editar Assinatura.</i></p>
<br>

**•	Perfil:**<br>
<p>Com atributos sendo: <i>ID do Perfil, Nome do Perfil, Preferência de idioma, Configurações de Privacidade;</i></p>
<p>E métodos possíveis: <i>Criar perfil, Editar Perfil, Deletar perfil.</i></p>
<br>

**•	Conteúdo:**<br>
<p>Com atributos sendo: <i>ID do conteúdo, Título, Genero, Ano de Lançamento, Classificação indicativa, Duração;</i></p>
<p>E métodos possíveis: <i>Buscar, Filtrar, Detalhes.</i></p>
<br>

**•	Filme (herda de conteúdo):**<br>
<p>Com atributos sendo: <i>Diretor, Elenco, Sinopse;</i></p>
<p>E métodos: <i>Assistir, Adicionar aos favoritos.</i></p>
<br>

**•	Serie (herda de conteúdo):**<br>
<p>Com atributos sendo: <i>Temporadas, nº Episodios, Elenco;</i></p>
<p>E métodos: <i>Selecionar temporada, Assistir, Adicionar aos favoritos.</i></p>
<br>

**•	Episódio (herda de conteúdo):**<br>
<p>Com atributos sendo: <i>Temporada, nº Episodio, Duração;</i></p>
E métodos: <i>Assistir.</i></p>
<br>

**•	Categoria:**<br>
<p>Com atributos sendo: <i>ID da categoria, Nome, Descrição;</i></p>
<p>E métodos: <i>Filtrar por categoria.</i></p>
<br>

**•	Avaliação:**<br>
<p>Com atributos sendo: <i>Notas, Comentários de Usuários, ID da avaliação, Usuário;</i></p>
<p>E métodos: <i>Fazer avaliação, Visualizar Avaliações.</i></p>
<br>

**•	Assinatura:**<br>
<p>Com atributos sendo: <i>ID da assinatura, Tipo de plano, Método de Cobrança, Status de Pagamento, Data de início, Data de término;</i></p>
<p>E métodos: <i>Gerenciar Assinatura, Verificar Status de Pagamento.</i></p>
<br>

**•	Notificação:**<br>
<p>Com atributos sendo: <i>Permissão de notificações, Tipo de notificação;</i></p>
<p>E métodos: <i>Marcar como lida, Gerenciar permissões de notificação.</i></p>
<br>

**•	Recomendação:**<br>
<p>Com atributos sendo: <i>Conteúdo Recomendado;</i></p>
<p>E métodos: <i>Gerar recomendações, Visualizar recomendações.</i></p>
<br>

<h3> Tendo em vista tudo isso, o código no arquivo Main.java utiliza a classe de usuário e o método fazer login para exemplificar a ideia </h3>