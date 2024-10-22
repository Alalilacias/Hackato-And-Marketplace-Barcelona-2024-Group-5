# Hackato-And-Marketplace-Barcelona-2024-Group-5
Github for the submission of the Group 5 of the Hackaton and Marketplace, Salo d'Ocupacio 2024. 


Descripció

Aquest projecte és una API desenvolupada amb Spring Boot en Java. Permet la comunicó amb les dades a través d'operacions HTTP.

Requisits previs

Abans d'executar el projecte localment, assegura't de tenir instal·lats els següents components:

Java 21 o superior
Gradle
Un IDE compatible amb projectes Spring Boot (com IntelliJ IDEA o Eclipse)
Un cluster de MongoDBCompass

Requisits opcionals

Configuració del projecte

Clona el repositori al teu ordinador:

git clone https://github.com/AriRuizMartinez/Hackaton-Group-5.git
Despres obre el teu IDE:

Importa el projecte.
Executa la classe principal del projecte, que és VisualizerApplication.java.
L'aplicació s'executarà en http://localhost:9000. (El port també es pot cambiar a l'application.properties en cas de que el 9000 estigues ocupat)

Endpoints:


GET-http://localhost:9000/barrisVius/businessStatistics/{id}

    Per mitja de d'una petició GET retorna l'informació d'un business statistic, el de l'id especificada. Per fer aquesta peticio ha de ser un id valid i sense {}. Ex: http://localhost:9000/barrisVius/businessStatistics/1

GET-http://localhost:9000/barrisVius/businessStatistics

    Per mitja de d'una petició GET retorna l'informació de tots els business statistic.

GET-http://localhost:9000/barrisVius/neighborhoodsAndActivities

    Per mitja de d'una petició GET retorna l'informació dels barris i les activitats.


Amb els endpoints es compleixen els requisits tecnics i funcionals esmentats. La resta de requisits també es compleixen:

El projecte segueix un patró estructural

El projecte està basat en l'arquitectura MVC (Model-View-Controller), que és un patró arquitectònic molt utilitzat en aplicacions Spring Boot. Aquesta estructura separa clarament les responsabilitats de cada component:

Model: Representa les dades i les regles de negoci de l'aplicació. Les entitats com BusinessStatistic s'encarreguen d'emmagatzemar la informació. Controller: Gestiona les sol·licituds HTTP, connectant els models amb les vistes. View: En aquest repositori no tenim la vista pero així es veu clarament que estan separats, a l'altre repositori, el de front, es on mostren les dades que reben dels controladors.

El codi és escalable i reutilitzable

El codi està dissenyat per ser escalable gràcies a l'ús de Spring Boot, que permet modularitzar funcionalitats. El fet de tenir components desacoblats, com els controladors i els serveis, facilita que es puguin afegir noves funcionalitats o escalar l'aplicació sense haver de modificar la major part del codi existent.

El codi està optimitzat i el seu rendiment és eficient

L'aplicació està optimitzada per manejar arxius JSON grans i múltiples sol·licituds simultànies gràcies a les següents característiques:

Spring Boot utilitza mecanismes interns de gestió de recursos, com la gestió de sessions i connexions a la base de dades, que milloren l'eficiència i el rendiment. El disseny de l'API assegura que cada sol·licitud sigui manejada de manera independent, la qual cosa facilita la seva escalabilitat en entorns distribuïts.

El codi segueix bones pràctiques de programació:

Neteja i llegibilitat: El codi està ben estructurat amb noms de mètodes i variables descriptius, cosa que facilita la seva comprensió per altres desenvolupadors. Gestió d'errors: L'aplicació gestiona correctament els errors. Això ajuda a evitar excepcions no controlades durant l'execució. Modularitat: Les diferents funcionalitats es divideixen en components separats (models, controladors, serveis), seguint el principi de separació de responsabilitats.

Les funcions tenen una única responsabilitat

Cada funció dins del projecte segueix el principi de responsabilitat única (Single Responsibility Principle), que és un dels pilars dels principis SOLID:

Els controladors tenen la responsabilitat de gestionar les sol·licituds HTTP. Les classes model, com BusinessStatistic, només tenen la responsabilitat de representar les dades i no contenen lògica de negoci. Aquest enfocament permet un codi més fàcil de mantenir i modificar, ja que cada funció o classe té una única responsabilitat clarament definida. Això també redueix el risc d'introduir errors quan s'afegeixen noves funcionalitats.