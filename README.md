# Taller_Rendimiento
ACTIVIDAD PRÁCTICA – RENDIMIENTO EN APLICACIONES WEB - Sophyfarm

1. Instalación del entorno

  1.1 Instalar Java JDK 17

    Descargar desde: https://adoptium.net/es/temurin/releases?version=17

    Instalar con las opciones por defecto.

    Verificar instalación desde el cmd: java -version

  1.2 Instalar Maven

    Descargar desde (Binary zip archive): https://maven.apache.org/download.cgi

    Extraer el ZIP en la carpeta C:\

    Correcta configuración: https://www.youtube.com/watch?v=rl5-yyrmp-0

    Validar correcta instalación: mvn -version

  1.3 Instalar PostgreSQL 18

    Descargar instalador desde: https://www.postgresql.org/download/windows/

    Durante la instalación:

      Usuario: postgres

      Puerto: 5432

    Crear una contraseña segura que recuerdes

  1.4 Restaurar la base de datos desde el backup

    Descargar el archivo sophyfarm del enlace: https://unbosqueeduco-my.sharepoint.com/:f:/g/personal/sradah_unbosque_edu_co/Eu_XZrCmH9dBuX6k_BYsJHIBaP16SUfdDYe6Pq3nV3qS6g?e=B3vmrh

    Abre pgAdmin 4 y conéctate al servidor (localhost).
    En el panel izquierdo haz clic derecho sobre Databases → Create → Database…

    Name: sophyfarm
    Owner: postgres 
    Click Save.

    Clic derecho sobre la base recién creada sophyfarm → Restore
    En la ventana Restore:

    Filename: busca y selecciona el archivo descargado de sophyfarm.backup

    Format: selecciona Custom

    Haz click en Restore y observa el panel de mensajes; al finalizar debe indicar que se completó sin errores.

  1.5 Instalar extensiones de Visual Studio Code

    Java (De Oracle)
    Extension Pack for Java (de Microsoft)
    Spring Boot Extension Pack	(de VMware)
    Maven for Java	(de Microsoft)
    REST Client	(de Huachao Mao)
    PostgreSQL (de Chris Kolkman) 

  2. Clonar repositorio en Visual Studio Code

    Instalar Git en Windows en el sitio oficial: https://git-scm.com/download/win

    Esto descargará automáticamente el instalador Git-2.xx.x-64-bit.exe.

    Ejecuta el instalador.

    Deja las opciones por defecto, excepto estas dos (márcalas):

    “Add Git Bash to PATH”

    “Git from the command line and also from 3rd-party software”

    Finaliza la instalación.
    Abre una nueva ventana de tu consola de comandos y escribe: git --version

    Debe mostrar algo como: git version 2.45.1.windows.1

  3. Configurar aplicación

    Abre VSCode.

    En la barra de busqueda escribe ">Git: Clone" 

    Pega esta URL:

    https://github.com/XxTheRada35HD/Taller_Rendimiento.git

Elige una carpeta donde guardar el proyecto.

Cuando termine, haz clic en “Open” para abrirlo.
