# HaddoucheRymEcf-back
#  

## Description
ce projet est un projet pour l'entreprise Localib. Il a pour but de faciliter la location de voiture par des particulieres.


## Prérequis
- Java 11+
- [docker](https://www.docker.com/products/docker-desktop)
- [docker-compose](https://docs.docker.com/compose/install/)
- Un IDE Java ([Eclipse](https://www.eclipse.org/downloads/), [IntelliJ](https://www.jetbrains.com/fr-fr/idea/))

## Instalation
### Base de données

pour lancer la base de données, il faut se placer dans le dossier docker et lancer la commande suivante:
- docker-compose up -d

### Lancement de l'application sans IDE
Pour lancer l'application, il faut se placer dans le dossier racine et lancer la commande suivante:
- ./gradlew spring-boot:run

### Lancement de l'application avec IntelliJ
pour lancer l'application avec un IDE, lancer la class MycomApplication