# design-pattern-singleton
singleton limite l'instansation d'une classe et garantit q'une seule instance d'une classe existe dans la machine virtuelle java (jvm)
connexion de la base de donnée, utiliser dans les classes java de base comme le java.lang.runtime , ou java.awt.desktop.
pas de diagramme de classe pour le singleton , puisque une seule classe qui fait appel à elle meme.

1ere implemntation: eager inisialization
2eme impl : Static Block Initialization
3éme impl : Lazy Initialization
4éme impl : Thread safe (il y a deux méthodes thread safe et threadsafe double check)

![image](https://user-images.githubusercontent.com/36199753/151403549-d875ad5b-80e2-4e20-8d73-606b02271676.png)
