# nimet backend

> [!NOTE]
> Cada pessoa tem uma forma diferente de realizar a instalação do projeto, eu estou colocando os passos que fiz para adicionar o projeto na minha máquina (que tem o sistema operacional Windows), porém se sinta livre para mudar esse documento se tiver um jeito mais fácil 😁.

### Para clonar o repositório:
> [!IMPORTANT]
> É necessário que sua máquina possua o Git: https://git-scm.com/downloads
* Primeiro abra seu explorador de arquivos, ache o local que quer adicionar o repositório nimet-backend (eu coloquei em dowloads, por exemplo) e clique no botão direito do seu mouse
* Depois de clicar no botão direito, ache o `Git Bash Here` para abrir o Git
* No Git cole o comando: `git clone https://github.com/ABSisters/nimet-backend.git`
* Agora é possível abrir o projeto na IDE que irá utilizar 

### Para adicionar o SQL Developer:
* Primeiro instale a Oracle Database Express Edition (XE): https://www.oracle.com/database/technologies/xe-downloads.html
* Depois instale o SQL Developer: https://www.oracle.com/database/sqldeveloper/technologies/download/
> [!NOTE]
> Vídeo tutorial para a instalação do Oracle Database XE e SQL Developer: https://www.youtube.com/watch?v=0POvGPBz_Xg
* Abra o SQL Developer (está na pasta baixada, sendo que o aplicativo tem como nome sqldeveloper) e crie uma conexão em Oracle Conexões com o nome `nimet`, nome de usuário `system` e senha `password`
> [!WARNING]
> As tabelas necessárias para o projeto serão criadas ao rodar o projeto na IDE. O esquema das tabelas podem ser achados no repositório em: src/main/resources/db/migration

### Lembrete:
> [!CAUTION]
> Não esqueça: nunca mude algo diretamente na main branch. Sempre crie uma branch diferente na IDE, adicione suas mudanças na IDE, crie um pull request no GitHub (que avisa quando a branch tem conflitos) e realize o merge pelo GitHub.
> ```
> Se a branch possuir conflitos, entre na IDE com a sua branch e realize um merge com a main (git merge main).
> Depois concerte os códigos que possuírem conflitos e faça um commit.
> Veja se o GitHub ainda aponta que a branch tem conflitos.
> ```

> [!CAUTION]
> Também não se esqueça de avisar para as pessoas relevantes quando realizar um merge na main, para que elas possam realizar um `git pull` (atualizar a branch) na main branch da máquina delas 
