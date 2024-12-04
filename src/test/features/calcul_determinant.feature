Feature: Calcul du déterminant d'une matrice 3x3
  Scenario: Calculer le déterminant d'une matrice 3x3
    Given une matrice 3x3 avec les valeurs suivantes
      | 1 | 2 | 3 |
      | 4 | 5 | 6 |
      | 7 | 8 | 9 |
    When je calcule le déterminant
    Then le déterminant devrait être 0
