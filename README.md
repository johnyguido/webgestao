# Projeto Webgestao


Modulos implementados:

Cadastro e listagem de clientes

Cadastro e listagem de produtos

Foi utilizado o banco de dados em memória H2 com uma seed inicial populada contendo clientes e produtos para teste via Postman utilizando os seguintes end point´s para consulta:

[GET]
http://localhost:8080/produtos/

[GET]
http://localhost:8080/clientes

[POST]
End point de cadastro de cliente no Postman:

Exemplo:
   
   {   
        
        "nome": "Paulo",
        "cpf": "12314654",
        "nascimento": "26071984"
    }
    
    [POST]
    End point de cadastro de produto no Postman:
    
    Exemplo:
    
    {      
        "sku": "AB58Z4X",
        "nome": "Novo Produto",
        "descricao": "Descricao do produto",
        "preco": 10.90,
        "quantidade": 50
 }     
 
 [PUT]
 End point de update de cliente por ID:
 
 Exemplo:
 
    {
        "nome": "NOVO NOME",
        "cpf": 12345,
        "nascimento": "20/10/2020"
    }
 
 [PUT]
 End point de update de produto por ID:
 
  {      
        "sku": "ZA3DC",
        "nome": "NOVO PRODUTO",
        "descricao": "Nova descrição",
        "preco": 10,
        "quantidade": 11
 }    
    
    [DEL]
    End point de exclusão de produto por ID:
    
    Exemplo: http://localhost:8080/produtos/2
    
    [DEL]
    End point de exclusão de cliente por ID:
    
    Exemplo http://localhost:8080/clientes/2
    
    ITEMS PARA IMPLEMENTAÇÃO FUTURA
    MODULO PEDIDO:
    Incluir, excluir, atualizar e listar.
     Vincular cliente a um pedido.
     Remover cliente de um pedido.
     Vincular produto(s) a um pedido.
     Remover produto(s) de um pedido.
     
     Front-end a ser implementado em ReactJS.
    
    
    
