# ROADMAP 

Champions:
-> Définir un objet champion -> ID ; NOM; HP ; ATTACK SPE ; DECK -> INT ; STRING ; INT ; VOID ; OBJET DECK
-> un champion ne peut attaquer sauf si son attack spe le permet
-> on associe au champion un ensemble de carte/monstre -> builder de deck ? 

Monstre :
-> Encapsuler dans carte ? 
-> Définir un objet monstre -> ID ; NOM ; HP ; AD -> INT ; STRING ; INT ; INT 
-> Type : CLASSIC, PROTECTEUR,SOIGNEURS, MASCOTTES -> ENUM 
-> Action une fois en jeux / tour de jeu du monstre 

Deck :
-> Ensemble de cartes du joueur
-> Buildable -> Fonction construire deck 
-> 10 cartes max ? 

Plato : (?)
-> Objet qui accueille les monstre / qui gère le bon déroulement du jeu 

Action du joueur : 
-> Poser une carte 
-> Utiliser sa spe 
-> Chacune des cartes peu attaquer 
-> Passer le tour 

LOGGER AU FUR ET A MESURE LES ACTIONS IMPORTANTES 

5 TEST UNITAIRE  DONT 2 OBLIGATOIRES

Simuler l’attaque d’un monstre sur un autre avec des points d’attaque égaux aux points de vie du monstre attaqué. Vérifier que ce dernier ait bien 0 points de vie et disparait du plateau.
Créez un test qui instancie un combat entre 2 Champions, un des deux met KO l’autre.
Vérifiez que le combat s’arrête avec le bon vainqueur. 
Faites 3 autres tests sur les fonctionnalités principales de votre application ou sur ce qu’il vous semble important, les TU sur les getters et setters ne sont pas toujours très utiles… 


