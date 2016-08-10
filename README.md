# Java FFNEX Parser ![Fédération Française de natation](./ffn-logo.png)
Simple parser permettant de convertir un fichier XML de la norme FFNEX en objets manipulables en Java.

## Qu’est ce que la norme FFNex?

La norme FFNex est le format des résultats de natation définit et utilisé par la FFN. Cette norme succède à la norme PCE depuis le 16 septembre 2012.

Un fichier FFNex est un fichier d’échange au format XML qui regroupe soit l’ensemble des informations d’une compétition de Natation Course : programme, engagements et résultats, soit une collection de compétiteurs à jours de leurs licences à l'instant "T" et de clubs (en remplacement de l'extraction PCE-3 des compétiteurs). 

Le parser proposé ici ne gère que le premier cas : l’ensemble des informations d’une compétition de Natation Course.

## Contexte

Module développé dans le cadre d'une application interne à un club de natation. L'objectif étant de gérer les fichiers FFNEX afin de traiter les performances des nageurs lors de leurs différentes compétitions.

Ce programme ne gère qu'un seul cas de fichier FFNEX : l’ensemble des informations d’une compétition de Natation Course.
Il permet également de restreindre le contenu d'un fichier à un club spécific, en fournissant son ID. Il est possible de retrouver l'ID de votre club dans le fichier FFNEX par exemple.

## Utilisation

+ Cloner le projet et le builder à l'aide Maven : `mvn clean install` afin de résoudre les dépendances

Exemple d'utilisation :

```java
public void example(){
        try {
            // Read a file from the project resource folder
            File xml = new File(BasicExecutionTest.class.getClassLoader().getResource("interclubs2015-ffnex.xml").getFile());

            // Parse the XML file
            FFNEXFile result = FFNEXParser.parseFile(xml);
            
            // Get only the data of the "Lannion Natation" french swimming club
            FFNEXFile restrictedResult = FFNEXParser.restrictContent(result, 1160);
            
        } catch (FNNEXFileParsingException e) {
            // Do something if an error occurs... Should not happen with a well formated FFNEX file :)
        }
    }
```
