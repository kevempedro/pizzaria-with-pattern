# Cenário

É um exemplo de um cenário de uma pizzaria, onde é utilizado os design patterns (Abstract Factory, State and Builder)

# Design Patterns

## Builder

O Builder foi utilizado para fazer a pré-montagem das pizzas para facilitar na hora da criação das mesmo, pois com ele não tem
se a necessidade de passar todos os parâmetros necessários no construtor para criar uma pizza, deixando o mesmo muito grande e
de difícil leitura. Com o Builder você consegue criar as pizzas de forma muito melhor e de fácil entendimento.

## State

O State foi utilizado para alterar o status do pedido. Quando uma pizza é criada ela começa com o seu status em espera, ai quando
se quiser alterar o status da pizza para fazendo, pronto ou cancelada é só passar o status para o State e ele vai alterar o status
da pizza para o status desejado.

## Abstract Factory

O Abstract Factory foi utilizado para instanciar as pizzas, você passa um sabor de pizza para o Abstract Factory que fica
responsável por instanciar a pizza de acordo com o sabor facilitando a manutençãoe ou inserção de um novo sabor de pizza no sistema.

# English

# Scenario

It is an example of a senary at a pizzeria where it encompasses design patterns (Abstract Factory, State and Builder)

# Design Patterns

## Builder

The Builder was used to pre-assemble the pizzas to make it easier to create, because with it there is no
if the need to pass all the necessary parameters in the builder to create a pizza, making it very large and
hard to read. With Builder you can create pizzas much better and easier to understand.

## State

State was used to change the order status. When a pizza is created it starts with its waiting status, then when
if you want to change the pizza's status to making ready or canceled just pass the status to the state and it will change the status
of the pizza to the desired status.

## Abstract Factory

The Abstract Factory was used to instantiate the pizzas, you pass a pizza flavor to the Abstract Factory that is
responsible for instantiating the pizza according to taste facilitating the maintenance and insertion of a new pizza flavor in the system.
