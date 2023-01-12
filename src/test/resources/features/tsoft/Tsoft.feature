Feature: probar las funcionabilidades de la pagina de tsoft

  Background:
    Given Ingresar a la pagina de tsoft


  Scenario: Consultar ADNTsoft
    When Visualizo el home e ingreso a el apartado de "ADNTsoft"
    Then Visualizo la pagina "https://www.tsoftglobal.com/adn-tsoft/"
    When Navego hasta el apartado de "#VALORESTSOFT"
    Then Visualizamos los cinco valores de tsoft





  Scenario: Rellenar fomulario de contacto

