# catalogueWEBSpringBoot
projet ING3 EILCO E-Service

Ce projet Est Réalisé en utilisant le Framework SpringBoot 
Les parties réalisé jusqu'à l'instant de l'écriture de ce README sont: 
  1-JPA: La partie base de données (Entity + Repository + Service) est bien réalisée. Il s'ajit d'une base de 
         données H2 embarquée
  2-La partie Controlleur: 
    2-1:Rest Controller : Cette partie est bien réalisée, le résultat des traitement est sous format JSON
    2-1:Controlleur : Cette partie necessite d'être réalisée. C'est ce qui permmet de retourner des objets 
                      ModelAndView et les diriger à l'aide du ViewResolver vers une page JSP
  3-La partie View: Les vues disponibles sont sous format d'un web service. l'Avantage de cette structure et de pouvoir 
    isoler la partie business de l'application de la partie présentation. Ce qui donne la possibilité d'utiliser le même 
    webservice par plusieurs applications. 
#Pour Test Le projet : 
Utiliser un outil comme POSTMAN et tapez les URL notés en amont des méthodes declarés dans les controlleurs 
