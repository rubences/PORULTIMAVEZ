# PORULTIMAVEZ

https://github.com/rubences/PORULTIMAVEZ.git


Desarrollo de aplicaciones en Java con VsCode
https://www.aluracursos.com/blog/desarrollando-aplicaciones-java-code

Pues tienes una nueva opción que se vuelve muy atractiva para los desarrolladores, que es el Microsoft Visual Studio Code, el VS Code, como se le conoce popularmente.

VS Code es un editor de código fuente independiente y multiplataforma que se puede usar en Windows, MacOS y Linux. La gran ventaja de este editor es que viene de tener el concepto "lightweight", el mar, al ser un entorno ligero en comparación con otros IDEs, además es altamente personalizable, con muchas extensiones existentes para ser utilizadas.

¿Vamos a conocer?
Instalación
Si su sistema operativo es Windows o macOS, el VS Code tiene un paquete de instalación que proporcionará los principales recursos para la configuración inicial del entorno, que es el Code Pack para Java. (https://code.visualstudio.com/docs/java/java-tutorial#_coding-pack-for-java). Este paquete de instalación incluye los siguientes elementos:

JDK (Kit de desarrollo de Java: puede cambiar la versión, según el cierre que puede descargar, pero generalmente es una versión LTS, o sea, con soporte a largo plazo);
Código VS
Extensión esencial de Java (el paquete de extensión de Java)
Si está utilizando Linux, será necesario descargar e instalar estos tres elementos por separado.

¿ Qué es extensión Java?
El Java Extension Pack es un pacote que contempla seis extensión esenciales para facilitar el desarrollo, build, debug y teste de aplicación Java. Son estas:

Language Support for Java
Esta extension (https://marketplace.visualstudio.com/items?itemName=redhat.java) es fornecida por Red Hat y es responsable por diversos recursos que otimizan el desarrollo, como: code completion, as-you-type reporting(que se detecta y destaca errores de sintaxis y compilación en lo momento de digitación) organización de los imports, acción de codigo (como gerar getters y setters, constructores, toString), fragmentos de codigo listos(code snippets), soporte para archivos individuales con extensión java, para que puedan ser ejecutados en la terminal de VS Code y muchos otros recursos conocidos por quienes usan otros IDEs.

Debugger for Java
Extensión de Microsoft(https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug) que permitirá la depuración del código, incluyendo breakpoints(puntos de interrupción) para evaluar valores de variables y lo que está pasando en la aplicación, teniendo la posibilidad de reemplazar 'a caliente' en el código (hot code replaces ). Tiene una característica de step in/out/overp ara navegar a través de los métodos, pausar y continuar, además de otras instalaciones que ayudan en la investigación de problemas y comportamientos inesperados en la aplicación.

Test Runner for Java
Extensión (https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test), permite la depuración y ejecución de casos de pruebas escritas en Java, utilizando los frameworks JUnit o TestNG. Esta extención tiene como requisito la instalación de los dos primeros mencionados.

Maven for Java
Extensión Maven(https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven) proporciona soporte para la creación de proyectos siguiendo algún arquetipo Maven, así como accesos directos para la inclusión y el control de dependencias en POM (Project Object Model) además de personalizar comandos.

Project Manager for Java
Esta extensión atua como un gerenciador de proyectos(https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-dependency), ofreciendo algunas facilidades al visualizar las principales configuraciones y estructura del proyecto abierto en el VS Code.

Visual Studio IntelliCode
Por fin, la extensión Intellicode(https://visualstudio.microsoft.com/pt-br/services/intellicode/) que es una especie de vigilancia intellisense, que se coloca en la parte superior de la lista de finalización de código, los comandos que tienen pero la posibilidad de ser utilizados, de acuerdo con el ejemplo a continuación, donde después de escribir las palabras System.out ello ya sugiere los comandos más utilizados, como println, printf y luego sucesivamente:

img2
¿Vamonos abrir el VS Code y comenzar a desarrollar?
Para ejecutar la mayoría de los comandos, usamos la tecla Ctrl+ Shift + P o a través del menú Ver → Paleta de comandos. El nombre del menú puede cambiar si se utiliza en otro idioma. Mantendremos las propinas usando el ingles por padron.

Para iniciar un nuevo proyecto Java, abramos la paleta de comandos y elijamos la opción Java: Create Java Project.

img3
Vea que abre una nueva pantalla con varias opciones de proyectos Java. El Código VS tiene una extensión para facilitar la creación con cualquier opción elegida: Maven, Gradle, Spring Boot, Quarkus o MicroProfile.

img4
Elijamos la opción "No build tools" solo para ver algunas opciones básicas del VS Cd.

La carpeta debe ser informada cuando se generará el proyecto y el nombre del mismo. Al proceder, se creará una estructura de paquete, con las carpetas .vscode (que contiene el archivo settings.json), la carpetabin (que contendrá los archivos con extensión .class), la carpeta lib( donde se encuentran los recursos o bibliotecas que se utilizan en la aplicación) y la carpeta src (donde se encuentra el código fuente, en nuestro caso, las clases).

Se crea la primera clase, la App.java, con el método main es nuestro famoso ¡Hello, World!

img5
Para crear una nueva clase, podemos usar nuevamente la paleta de comandos y buscar la opción Java: New Java Class. Daré el nombre Articulo para proceder con la creación de la clase Articulo.java.

img6
Agreguemos algunos atributos y usemos los recursos del IDE para finalizar las implementaciones de getters, setters, constructores y toString.

Vea que aquí en la imagen de abajo, después de concluir algunos atributos, algunos han aparecido en rojo.

img7
También vea que para el tipo LocalDate se importó automáticamente en la línea, indicando el nombre completo (paquete + clase), que es java.time.LocalDate.

Para los tipos que están sublimados en rojo, haga clic en el ícono de la lámpara o haga clic en el botón derecho en el tener, o luego use el atajo Ctrl +, y tiene algunas sugerencias, sobre cómo crear una nueva clase, interfaz, enum o incluso usar como referencia la clase Category del paquete java.util.Locale, así como la imagen a continuación:

img8
Podemos elegir crear un enum para Categoría y una nueva clase para Autor y continuar codificando nuestras aplicaciones. Una vez que se conocen los tipos, comienza a mostrar un subrayado amarillo, lo que indica que el valor de nuestro atributo no se está utilizando en ningún otro lugar.

img9
Para eso, usaremos los atajos del editor para crear automáticamente los getters y setters. Para eso, haga clic en el botón derecho en la pantalla del editor, donde abre su clase y navega a la opción Source Action.

img10
Aparecerán algunas opciones, como generar pruebas, organizar importaciones (incluyendo referencias o eliminando referencias no utilizadas), generar solo getters, solo setters, generarlos juntos, constructores y otras opciones, como en la imagen:

img11
Solo generemos los getters y setters:
img12
Es posible elegir todos o solo algunos atributos. Además de elegirlos todos, podemos observar que creará los métodos correctamente de forma automática.

img13
Podemos hacer el mismo procedimiento para crear constructores con todos los atributos y también un override del metodo toString.

Haga clic en el botón derecho en la pantalla >> Source Action >> Generate Constructors…

img14
La misma cosa para toString. Botón derecho en la pantalla >> Source Action >> Generate toString()...

img15
Finalmente, vamos a crear un objeto de la clase Articulo en nuestra clase App y verlo en nuestra Terminal. En la clase App.java, haré la siguiente implementación:

img16
Si hace clic en el atajo Run, arriba del método principal, tengamos el siguiente resultado en la terminal:

img17
El artículo fue impreso de acuerdo con el código generado en llo toString de la clase Articulo.

¿Qué tal, te gustó?

Como puedes ver, VS Code está preparado para ofrecer varias facilidades y recursos para que puedas desarrollar aplicaciones Java de manera rápida y confiable, sin dejar nada que desear frente a los IDE más conocidos y robustos.

La infinidad de extensiones disponibles para personalizar tu entorno y realizar rápidamente el setup inicial de un proyecto del framework o de la herramienta de build tenga ganado el corazon de muchos dev. Entonces, ¿damos una oportunidad a VS Code y exploramos sus características y recursos?
