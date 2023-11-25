# gs-heathsync

### Link Pitch
[Pitch - Digital Business](https://youtu.be/lur6HEaJTy4)

### Link Deploy em Nuvem (Vídeo) 
[Deploy - Digital Business](https://youtu.be/-6uvFp3yDv8?si=8VE1joHDtdNxjraL)

### Json para testes (Deploy/API)
#### O deploy foi realizado via Pipeline 

- URL:  https://healthsync-gs.azurewebsites.net

- POST (register)
  
URL: https://healthsync-gs.azurewebsites.net/auth/register


    "login": "NOME",
    "password": "SENHA",
    "role": "ADMIN"


- LOGIN


URL: https://healthsync-gs.azurewebsites.net/auth/login

    "login": "NOME",
    "password": "SENHA"



POST(USUARIO)


URL: https://healthsync-gs.azurewebsites.net/usuario


    "nm_usuario": "NOME",
    "ds_email": "EMAIL",
    "dt_nascimento": "DATA_NASCIMENTO",
    "ds_senha": "SENHA"


GET(USUARIO)

URL: https://healthsync-gs.azurewebsites.net/usuario


PUT(USUARIO)


URL: https://healthsync-gs.azurewebsites.net/usuario/ID


    "nm_usuario": "NOME NOVO",
    "ds_email": "EMAIL",
    "dt_nascimento": "DATA_NASCIMENTO",
    "ds_senha": "SENHA"


DELETE(USUARIO)

URL: https://healthsync-gs.azurewebsites.net/usuario/ID
