# OneBasketball

## Endpoints

- [Cadastro de partida](#cadastro-de-partida)
- [Visualizar tabela](#visualizar-tabela)
- [Cadastro de equipe](#cadastro-de-equipe)
- [Listar partidas](#listar-partidas)

---

### Cadastro de partida

`POST` oneBasketball/api/v1/partida

**Exemplo de Entrada**

```js
{
    "pontuacao_equipe1": 93,
    "pontuacao_equipe2": 105,
    "partida_id": 111111,
    "data": '24-02-2023',
    "equipe1_id": 112233,
    "equipe2_id": 332211,
    "3pontos_equipe1": 23,
    "3pontos_equipe2": 19,
    "2pontos_equipe1": 29,
    "2pontos_equipe2": 33,
    "lance_livre_equipe1": 5,
    "lance_livre_equipe2": 6,
    "lance_livre_convertido_equipe1": 4,
    "lance_livre_convertido_equipe2": 6,
    "faltas_equipe1": 4,
    "faltas_equipe2": 6
}
```

**Campos de Requisição**

| Campo | Obrigatório | Tipo  | Descrição |
|-------|:-------------:|-------|-----------|
| pontuacao_equipe1 | não | int | Registra a pontuação do equipe1, podendo ser editada manualmente ou atualizada automaticamente com a inserção de valores nas variáveis referentes à: bolas de 3 e 2 pontos e lances livres convertidos. |
| pontuacao_equipe2 | não | int | Registra a pontuação do equipe2, podendo ser editada manualmente ou atualizada automaticamente com a inserção de valores nas variáveis referentes à: bolas de 3 e 2 pontos e lances livres convertidos. |
| equipe1_id | sim | int | O id do equipe1. |
| equipe2_id | sim | int | O id do equipe2. |
| partida_id | sim | int | O id da partida. |
| data | sim | data | A data de realização da partida. |
| 3pontos_equipe1 | não | int | A quantidade de bolas de três pontos convertidas pelo equipe1. | 
| 3pontos_equipe2 | não | int | A quantidade de bolas de três pontos convertidas pelo equipe2. | 
| 2pontos_equipe1 | não | int | A quantidade de bolas de dois pontos convertidas pelo equipe1. |
| 2pontos_equipe2 | não | int | A quantidade de bolas de três pontos convertidas pelo equipe2. |
| lance_livre_equipe1 | não | int | A quantidade de lances livres da partida por parte do equipe1, se refere também a lances livres não convertidos. |
| lance_livre_equipe2 | não | int | A quantidade de lances livres da partida por parte do equipe2, se refere também a lances livres não convertidos. |
| lance_livre_convertido_equipe1 | não | int | A quantidade de lances livres convertidos pelo equipe1. |
| lance_livre_convertido_equipe2 | não | int | A quantidade de lances livres convertidos pelo equipe2. |
| faltas_equipe1 | não | int | A quantidade de faltas por parte do equipe1. |
| faltas_equipe2 | não | int | A quantidade de faltas por parte do equipe2. |

**Códigos da Resposta**

|código|descrição
|-|-
201 | a partida foi cadastrada com sucesso
400 | os dados enviados são inválidos

---

### Visualizar tabela

`GET` oneBasketball/api/v1/tabela

**Exemplo de entrada**

```js
{
    "tabela_id": 777777,
    "data_inicio_torneio": '20-02-2023',
    "data_termino_torneio": '03-03-2023',
    "estatisticas": {
        "colocação": {1,2,3,4},
        "equipe": {'MIL', 'BOS', 'DEN', 'LAL'},
        "jogos_disputados": {30, 30, 30, 29},
        "vitorias": {28, 22, 15, 8},
        "derrotas": {2, 8, 15, 22},
        "maior_seq_vitorias": {10, 5, 2, 0},
        "pontos": {56, 44, 30, 16}
    }
}
```

**Campos de requisição**

| Campo | Obrigatório | Tipo  | Descrição |
|-------|:-------------:|-------|-----------|
| tabela_id | sim | int | O id da tabela do torneio. |
| data_inicio_torneio | sim | data | A data de início do torneio. |
| data_termino_torneio | não | data | A data do término do torneio. |
| estatisticas | não | lista | Armazena todas as informações que compõem a tabela, sendo eles: colocação dos equipes, equipes participantes, quantidade de jogos disputados, quantidade de vitórias, quantidade de derrotas, maior sequência de vitórias, quantidade de pontos. |

**Códigos de resposta**

|código|descrição
|-|-
201 | a tabela foi cadastrada com sucesso
204 | não existe informação alguma na tabela

---

### Cadastro de equipe

`POST` oneBasketball/api/v1/equipe

**Exemplo de entrada**

```js
{
    "equipe_id": 223344,
    "nome_equipe": 'Los Angels Lakers',
    "sigla_equipe": 'LAL',
    "jogadores": {'Lebron James', 'Scotty Pippen Jr.', 'Davon Reed', 'Mo Bamba'}
}
```
**Campos de requisição**

| Campo | Obrigatório | Tipo  | Descrição |
|-------|:-------------:|-------|-----------|
| equipe_id | sim | int | O id da partida. |
| nome_equipe | sim | String | O nome da equipe. |
| sigla_equipe | sim | String | A sigla da equipe. |
| jogadores | sim | Lista | Lista contendo os jogadores que compõem a equipe. |

**Códigos de resposta**

|código|descrição
|-|-
201 | a equipe foi cadastrada com sucesso
400 | os dados enviados são inválidos

---

### Listar partidas

`GET` oneBasketball/api/v1/partida

**Exemplo de entrada**

```js
{
    "partida_id": 445566,
    "sigla_equipe1": 'LAL',
    "sigla_equipe2": 'MIL', 
    "pontuacao_equipe1": 105,
    "pontuacao_equipe2": 98,
}
```

**Campos de requisição**

| Campo | Obrigatório | Tipo  | Descrição |
|-------|:-------------:|-------|-----------|
| partida_id | sim | int | O id da partida. |
| sigla_equipe1 | sim | String | A sigla da equipe1. |
| sigla_equipe2 | sim | String | A sigla da equipe2. |
| pontuacao_equipe1 | sim | int | A pontuação da equipe1. |
| pontuacao_equipe2 | sim | int | A pontuação da equipe2. |

**Códigos de resposta**

|código|descrição
|-|-
201 | as partidas foram requeridas com sucesso
204 | Não existem partidas cadastradas no sistema.