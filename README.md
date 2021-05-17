
# DSClient
Trabalho final do Capítulo 1 do Bootcamp Spring React 3.0

## Enunciado do trabalho
Você deverá entregar um projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas aprendidas no capítulo: <br/>
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

O projeto deverá estar com um ambiente de testes configurado acessando o banco de dados H2, deverá usar Maven como gerenciador de dependência, e Java 11 como linguagem. <br/>

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir (você deve seguir à risca os nomes de classe e atributos mostrados no diagrama): <br/>

![Client Class Model](https://user-images.githubusercontent.com/50798315/118418571-44748e80-b68f-11eb-86d1-d7b86eda27ad.png)


Seu projeto deverá fazer um seed de pelo menos 10 clientes com dados SIGNIFICATIVOS (não é para usar dados sem significado como “Nome 1”, “Nome 2”, etc.). <br/>

 
<em><strong>Atenção: </strong> lembre-se de que por padrão a JPA transforma nomes de atributos em camel case para snake case, como foi o caso do campo imgUrl do DSCatalog, que no banco de dados tinha o nome img_Url. Assim, o campo birthDate acima será criado no banco de dados como birth_Date, então seu script SQL deverá seguir este padrão.</em>

## Como o trabalho será corrigido?
1) Importação do projeto
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo no STS sem necessidade de qualquer configuração especial diferente daquelas das aulas.

2) Testes manuais no Postman
O professor já terá preparado em seu computador as requisições Postman abaixo. Todas elas deverão funcionar corretamente:

### Busca paginada de clientes
<strong>GET</strong> /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name

### Busca de cliente por id
<strong>GET</strong> /clients/1

### Inserção de novo cliente
<strong>POST</strong> /clients
```json
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

### Atualização de cliente
<strong>PUT</strong> /clients/1
```json
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
```

### Deleção de cliente
<strong>DELETE</<strong> /clients/1
