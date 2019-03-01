# language: pt

Funcionalidade: Cadastrar um proponente no digitizacao
  Cenario: Cadastrar um proponente no digitizacao sem informar um cpf
  Dado que acesso o digitizaco
  Quando eu cadastro um proponente
  E nao informo o cpf 
  Entao a seguinte mensagem devera ser exibida: "CPF obrigatorio"
