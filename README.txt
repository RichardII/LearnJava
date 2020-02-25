Méthodologie :  manipuler --> nommer ---> comprendre et on recommence

Questions (Hypothèses) ---> Actions ( modifications, Tasks, Operations, Tests...) ----> Validation (Compilation, Run)

1- Parcourir un tableau de type entiers ?



2- comment réaliser une CLI (Interface en ligne de commande ) ?

   Ajouter : A- cmdaddcmd : Cette commande permet d'ajouter dynamiquement, à chaud une nouvelle commande
                            Usage :  cmdaddcmd  NomDeLaClasse

             B- cmdexec : Cette commande permet de lancer les commandes dans l'ordre définit dans un fichier de configuration JSON ou XML
                          Usage :  cmdexec  fichierConfig.json   et   cmdexec  fichierConfig.xml

                          Exemple de fichierConfig.json :   { cmdbey :param, cmdhello :param2}
                          Format JSON :   https://www.json.org/json-fr.html


3- Comment gerer les Events d'un JButton ?



4- gestion des Threads : développer un plateau labirynthe  de jeux en Swing avec 5 personnages qui se déplace sur ce plateau
   Une sorte de Pacman  JAVA mais en plus simple http://zetcode.com/tutorials/javagamestutorial/pacman/
   L'objectif c'est de comprendre les Threads , chaque personnage aura son propre Thread et pourra évoluer indépendament des autresQ


5- utiliser ElectronJS  interface graphique d'une application JAVA en utilisant les technos web (HTML/CSS/JS/TS) coté front et Java du coté Backend.

   L'idée c'est que l'affichage se fait avec ElectronJS et les traitements se font dans un Backend  JAVA l'ensemble sur la même machine et sous forme d'appliation Desktop







  Quelques idées :

    Bridge API to connect with existing Java APIs.
    https://github.com/joeferner/node-java

    Electron Java application - What if you could build Desktop applications on Java with HTML 5 UI
    https://github.com/jreznot/electron-java-app

    https://discuss.atom.io/u/jreznot

     Java, Vaadin and Electron
    How to build Java Desktop applications with Electron
    https://github.com/cuba-labs/java-electron-tutorial


    Electron-Vue-Spring
    An opinionated desktop application with web front-end and Java backend.
    https://github.com/wuruoyun/electron-vue-spring

    CUBA Studio SE: a desktop application based on Electron
      https://www.cuba-platform.com/discuss/t/cuba-studio-se-a-desktop-application-based-on-electron/2914/7

   WebEngine is a non-visual object capable of managing one Web page at a time.
   It loads Web pages, creates their document models, applies styles as necessary, and runs JavaScript on pages.
   It provides access to the document model of the current page, and enables two-way communication between a Java application and JavaScript code of the page.
      https://docs.oracle.com/javase/8/javafx/api/javafx/scene/web/WebEngine.html



      6- Py4J - A Bridge between Python and Java
          https://www.py4j.org/index.html







