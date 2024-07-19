# Projet de Compilation avec ANTLR et Java

Ce projet implémente un compilateur en Java utilisant ANTLR pour analyser et traduire des programmes écrits dans un langage spécifique. Le projet est composé d'un analyseur lexical et syntaxique, d'un assembleur et d'une machine virtuelle pour exécuter le code compilé.

## Table des Matières

1. [Présentation](#présentation)
2. [Prérequis](#prérequis)
3. [Compilation](#compilation)
4. [Exécution](#exécution)
5. [Utilisation du JAR](#utilisation-du-jar)
   

## Présentation

Ce projet utilise ANTLR pour définir la grammaire d'un langage, générer les fichiers d'analyse et traduire le code source en code binaire. Le code binaire est ensuite exécuté par une machine virtuelle spécialement conçue pour ce langage.

### Contenu du Projet

| Fichier                        | Description                                                                 |
|--------------------------------|-----------------------------------------------------------------------------|
| `Langage.g4`                   | Grammaire du langage pour ANTLR                                              |
| `LangageLexer.java`            | Analyseur lexical généré par ANTLR                                           |
| `LangageParser.java`           | Analyseur syntaxique généré par ANTLR                                        |
| `Assembleur.java`              | Assembleur qui traduit le code source en code binaire                        |
| `MachineVirtuelle.java`        | Machine virtuelle pour exécuter le code binaire                             |
| `Exemples/`                    | Dossier contenant des exemples de programmes à compiler et exécuter           |
| `README.md`                    | Ce fichier, contenant les instructions du projet                             |

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés :

- **Java Development Kit (JDK) :** Assurez-vous d'avoir JDK 8 ou une version plus récente.
- **ANTLR :** Téléchargez ANTLR 4 et ajoutez-le à votre CLASSPATH.

## Compilation

Pour compiler le projet, suivez ces étapes :

1. **Configurer ANTLR :**
   - Téléchargez `antlr4-complete.jar` et ajoutez-le à votre CLASSPATH.

   ```sh
   export CLASSPATH=.:"/path/to/antlr4-complete.jar"
