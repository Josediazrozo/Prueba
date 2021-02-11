# Autor: xxxxxxxxx

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario
  Scenario: Search for a automation course

    Given than brandon wants to learn automation at the academy Choucair
    | strUser | srtPassword |
    | 1069737225 | Choucair2021* |
    When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
    | strCourse |
    | Metodologia Bancolombia |
    Then he finds the course called resources Recursos Automatizacion Bancolombia
    | strCourse |
    | Metodologia Bancolombia |